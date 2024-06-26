public class BambusDekorierer extends ZutatenDekorierer {
    public BambusDekorierer(InterfaceZutaten wraped) {
        super(wraped);
    }
    @Override
    public void präsentieren(String text){
        super.präsentieren(text + " + Bambus Sprossen");
    }
}
