public abstract class Stift {
    protected String schreibfarbe;
    protected boolean kaputt;

    public Stift(String schreibfarbe){
        this.schreibfarbe = schreibfarbe;
    }

    public abstract void gibSchreibfarbeAus();

    public abstract boolean istNutzbar();
}
