public class Buntstift extends Stift{
    private double restlaenge;

    public Buntstift(String schreibfarbe) {
        super(schreibfarbe);
        this.restlaenge = 100;
    }

    @Override
    public void gibSchreibfarbeAus() {
        System.out.println("Dieser Buntstift hat die Schreibfarbe " + schreibfarbe + ".");
    }

    @Override
    public boolean istNutzbar() {
        return !kaputt & restlaenge > 10;
    }
}
