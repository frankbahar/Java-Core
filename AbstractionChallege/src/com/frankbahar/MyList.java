package com.frankbahar;

public abstract class MyList {
    protected MyList righLink = null;
    protected MyList leftLink = null;

    protected Object value;

    public MyList(Object value){
        this.value= value;
    }

    abstract MyList next();
    abstract MyList setNext(MyList item);
    abstract MyList previous();
    abstract MyList setPrevious(MyList item);

    abstract  int compareTo(MyList item);

    public Object getValue(){
        return value;
    }
    public void  setValue(Object value){
        this.value = value;
    }

}
