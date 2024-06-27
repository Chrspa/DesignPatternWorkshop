
public class ZutatenDekorierer implements InterfaceZutaten {
private final InterfaceZutaten wraped;
    public ZutatenDekorierer(InterfaceZutaten wraped ) {
        this.wraped = wraped;
    }

    @Override
    public void präsentieren(String text) {
    wraped.präsentieren(text);
    }
}
