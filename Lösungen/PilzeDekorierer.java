public class PilzeDekorierer extends ZutatenDekorierer {
    public PilzeDekorierer(InterfaceZutaten wraped) {
        super(wraped);
    }
    @Override
    public void präsentieren(String text){
        super.präsentieren(text + " + Pilze");
    }
}
