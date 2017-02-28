/**
 * Created by phts on 02/06/16.
 */
public class List<T extends Comparable<T>> {
    public List<T> node;
    public List<T> parent;
    public T value;

    public List() {}

    public List(T value) {
        this.value = value;
    }

    public void add(T value) {
        if (this.value == null)
            this.value = value;
        else if (this.node == null) {
            this.node = new List<T>(value);
            this.node.parent = this;
        } else
            this.node.add(value);
    }

	public T get(int index) {
	    if (index == 0)
			return this.value;
	    else
			return this.node.get(--index);
	}

    public void remove(T value) {
        if (this.value.equals(value)) {
            if (this.parent == null) {
                this.value = this.node.value;
                this.node = this.node.node;
            } else
                this.parent.node = this.node;
        } else
            this.node.remove(value);
    }

    public void syso() {
        if (this.node == null)
            System.out.println(this.value);
        else {
            System.out.print(this.value + " ");
            this.node.syso();
        }
    }

	public List<T> firstNode() {
        return this;
    }

    public List<T> lastNode() {
        if (this.node == null)
            return this;
        else
            return this.node.lastNode();
    }

	public int size() {
        if (this.node == null)
            return 1;
        else
            return 1 + this.node.size();
    }

    public List<T> invertedList() {
        List<T> node = this.lastNode();
        List<T> invertedList = new List<>(this.lastNode().value);
        for (int i = 0; i < this.size() - 1; i++) {
            node = node.parent;
            invertedList.add(node.value);
        }
        return invertedList;
    }

    public void invert() {
        List<T> invertedList = this.invertedList();
        this.value = invertedList.value;
        this.node = invertedList.node;
    }

    public boolean contains(T value) {
        if (this.value.equals(value))
            return true;
        else if (this.node == null)
            return false;
        else
            return this.node.contains(value);
    }

    public int indexOf(T value) {
        for (int i = 0; i < this.size(); i++)
            if (this.get(i).equals(value))
                return i;
        return -1;
    }

    public int lastIndexOf(T value) {
        List invertedList = this.invertedList();
        for (int i = 0; i < invertedList.size(); i++)
            if (invertedList.get(i).equals(value))
                return i;
        return -1;
    }

    public boolean isSorted() {
        if (this.node != null) {
            if (this.value.compareTo(this.node.value) <= 0)
                return this.node.isSorted();
            else
                return false;
        }
        return true;
    }

    public void sort() {
        if (this.node != null) {
            if (this.value.compareTo(this.node.value) > 0) {
                T value = this.value;
                this.value = this.node.value;
                this.node.value = value;
            }
            this.node.sort();
        }
        if (this.parent == null && !this.isSorted())
            this.sort();
    }
}
