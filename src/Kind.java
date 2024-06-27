public class Kind {
    private   String name;
    private  int alter;

    public Kind(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    //einem Kind kann ein Whiteboard übergeben werden, auf dem es schreibt
    public void benutzen(Whiteboard whiteboard){
        whiteboard.malen("hallo ich bin " + name + " ich bin " + alter + " jahre alt!");
    }



}
