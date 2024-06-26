package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Whiteboard mrBoard=Whiteboard.getInstance("schönes Whiteboard");
        Kind tomas= new Kind("Tomas",7);
        Kind benni= new Kind("Benni",6);
        Kind julia= new Kind("Julia",8);

        tomas.benutzen(mrBoard);
        benni.benutzen(mrBoard);
        julia.benutzen(mrBoard);
        mrBoard.schauen();

    }


}

