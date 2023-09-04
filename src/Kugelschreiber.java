public class Kugelschreiber extends Stift{
    private double fuellstandmine;

    public Kugelschreiber(String schreibfarbe) {
        super(schreibfarbe);
        fuellstandmine = 100;
    }

    @Override
    public void gibSchreibfarbeAus() {
        System.out.println("Dieser Kugelschreiber hat die Schreibfarbe " + schreibfarbe + ".");
    }

    @Override
    public boolean istNutzbar() {
        return super.istNutzbar() && fuellstandmine > 0;
    }
}
