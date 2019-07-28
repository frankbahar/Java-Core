package com.frankbahar;

public interface NodeList {
    MyList getRoot();
    boolean addItem(MyList item);
    boolean removeItem(MyList item);
    void traverse(MyList root);
}

