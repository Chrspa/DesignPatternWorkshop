public class NudelDekorierer extends ZutatenDekorierer {
    public NudelDekorierer(InterfaceZutaten wraped) {
        super(wraped);
    }
    @Override
    public void präsentieren(String text){
        super.präsentieren(text + " + Nudeln");
    }
}
