public class Main {

    public static void main(String[] args) {
        Stift[] meineStifte = new Stift[6];
        meineStifte[0] = new Buntstift("blau");
        meineStifte[1] = new Buntstift("rot");
        meineStifte[2] = new Buntstift("grün");
        meineStifte[3] = new Kugelschreiber("blau");
        meineStifte[4] = new Kugelschreiber("rot");
        meineStifte[5] = new Kugelschreiber("schwarz");

        for (Stift stift : meineStifte) {
            stift.gibSchreibfarbeAus();
        }
    }

}
