public class FrogSimulation {
    private int goalDistance = 0;
    private int maxHops = 0;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public int hopDistance() {
        return (int) ((Math.random() * 40) - 15);
    }

    public boolean simulate() {
        int hops = 0;
        int j = 0;
        while (j >= 0 && j <= goalDistance) {
            hops++;
            if (hops >= maxHops) return false;
            j += hopDistance();
        }
        if (j < 0) return false;
        return true;
    }
    public double runSimulation(int num){
        for (i=0; i=num; i++){
            int count = 0;
            if (simulate() == true) count++;
        }
        return count / num;
    }
}