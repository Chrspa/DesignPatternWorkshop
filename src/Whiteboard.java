import java.util.ArrayList;
import java.util.List;


public class Whiteboard {
    private static volatile Whiteboard instanz;
    private  static List<String> geschriebenes = new ArrayList();
    private  String whiteboardName;

    private Whiteboard(String whiteboardName){

        this.whiteboardName=whiteboardName;
    }

    public static void malen(String wort){
        geschriebenes.add(wort);
    }

    public void schauen(){
        for (String i : geschriebenes){
            System.out.println(i);
        }
    }
    public static Whiteboard getInstance(String whiteboardName){
        Whiteboard ausgabe = instanz;
        if(ausgabe==null) {
            synchronized (Whiteboard.class){
                ausgabe= instanz;
                if(ausgabe==null){
                    instanz = ausgabe = new Whiteboard(whiteboardName);
                }
            }
        }
        return ausgabe;
    }



}
