import java.util.Scanner;

/**
 * Created by pedro on 5/25/16.
 */
public class Problem266 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List list = new List(keyboard.nextInt());
        while (keyboard.hasNextInt())
            list.add(keyboard.nextInt());
        list.sort();
        System.out.println(list.toString());
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

        public void add(int value) {
            if (this.node == null) {
                this.node = new List(value);
                this.node.parent = this;
            } else
                this.node.add(value);
        }

        public int get(int index) {
            if (index == 0)
                return this.value;
            else
                return this.node.get(--index);
        }

        public void remove(int value) {
            if (this.value == value) {
                if (this.node == null)
                    this.parent.node = null;
                else {
                    this.value = this.node.value;
                    this.node = this.node.node;
                }
            } else
                this.node.remove(value);
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

        public int size() {
            if (this.node == null)
                return 1;
            else
                return 1 + this.node.size();
        }

        public List invertedList() {
            List node = this.lastNode();
            List invertedList = new List(this.lastNode().value);
            for (int i = 0; i < this.size() - 1; i++) {
                node = node.parent;
                invertedList.add(node.value);
            }
            return invertedList;
        }

        public void invert() {
            List invertedList = this.invertedList();
            this.value = invertedList.value;
            this.node = invertedList.node;
        }

        public boolean contains(int value) {
            if (this.value == value)
                return true;
            else if (this.node == null)
                return false;
            else
                return this.node.contains(value);
        }

        public int indexOf(int value) {
            for (int i = 0; i < this.size(); i++)
                if (this.get(i) == value)
                    return i;
            return -1;
        }

        public int lastIndexOf(int value) {
            List invertedList = this.invertedList();
            for (int i = 0; i < invertedList.size(); i++)
                if (invertedList.get(i) == value)
                    return i;
            return -1;
        }

        public boolean isSorted() {
            if (this.node != null) {
                if (this.value <= this.node.value)
                    return this.node.isSorted();
                else
                    return false;
            }
            return true;
        }

        public void sort() {
            if (this.node != null) {
                if (this.value > this.node.value) {
                    int value = this.value;
                    this.value = this.node.value;
                    this.node.value = value;
                }
                this.node.sort();
            }
            if (this.parent == null && !this.isSorted())
                this.sort();
        }
    }
}
