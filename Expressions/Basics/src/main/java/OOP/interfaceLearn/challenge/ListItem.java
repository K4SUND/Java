package OOP.interfaceLearn.challenge;

public abstract  class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;


    public ListItem(Object value) {
        this.value = value;
    }


    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    Object getValue() {
        return value;
    }

    void setValue(Object value) {
        this.value = value;
    }
}
