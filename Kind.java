package com.company;

public class Kind {
    private   String name;
    private  int alter;

    public Kind(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }


    public void benutzen(Whiteboard whiteboard){
        whiteboard.malen("hallo ich bin " + name + " ich bin " + alter + " jahre alt!");
    }



}