package com.hawkins;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    private Object value;

    public ListItem(Object object) {
        this.value = object;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
