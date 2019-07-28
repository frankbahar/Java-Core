package com.frankbahar;

public class Node extends MyList {
    public Node(Object value) {
        super(value);
    }

    @Override
    MyList next() {
        return this.righLink;
    }

    @Override
    MyList setNext(MyList item) {
        this.righLink= item;
        return this.righLink;
    }

    @Override
    MyList previous() {
        return this.leftLink;
    }

    @Override
    MyList setPrevious(MyList item) {
        this.leftLink= item;
        return this.leftLink;
    }

    @Override
    int compareTo(MyList item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
