public class FrogSimulation {
    private int goalDistance = 0;
    private int maxHops = 0;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
        simulate();
    }

    public int hopDistance() {
        return (int) ((Math.random() * 40) - 15);
    }

    public boolean simulate() {
        int hops = 0;
        int j = 0;
        while (j >= 0 && j <= goalDistance) {
            j += hopDistance();
            hops++;
            if (hops >= maxHops) return false;
        }
        if (j < 0) return false;
        return true;
    }
}