import java.util.Scanner;

/**
 * Created by phts on 25/05/16.
 */
public class Problem264 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List list = new List(keyboard.nextInt());
        while (keyboard.hasNextInt())
            list.addValue(keyboard.nextInt());
        System.out.println(list.invertedList().toString());
    }

    public static class List {
        public int value;
        public List node;
        public List parent;

        public List(int value) {
            this.value = value;
            this.node = null;
            this.parent = null;
        }

        public void addValue(int value) {
            if (this.node == null) {
                this.node = new List(value);
                this.node.parent = this;
            } else
                this.node.addValue(value);
        }

        public void removeValue(int value) {
            if (this.value == value) {
                if (this.node == null)
                    this.parent.node = null;
                else {
                    this.value = this.node.value;
                    this.node = this.node.node;
                }
            } else
                this.node.removeValue(value);
        }

        public List firstNode() {
            return this;
        }

        public List lastNode() {
            if (this.node == null)
                return this;
            else
                return this.node.lastNode();
        }

        public String toString() {
            if (this.node == null)
                return String.valueOf(this.value);
            else
                return String.format("%d %s", this.value, this.node.toString());
        }

        public int length() {
            if (this.node == null)
                return 1;
            else
                return 1 + this.node.length();
        }

        public List invertedList() {
            List node = this.lastNode();
            List invertedList = new List(this.lastNode().value);
            for (int i = 0; i < this.length() - 1; i++) {
                node = node.parent;
                invertedList.addValue(node.value);
            }
            return invertedList;
        }
    }
}
