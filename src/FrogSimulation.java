public class FrogSimulation {
    private int goalDistance = 0;
    private int maxHops = 0;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public int hopDistance() {
        return (int) ((Math.random() * 20) - 3);
    }

    public boolean simulate() {
        int hops = 0;
        int distance = 0;
        while (distance < goalDistance) {
            hops++;
            distance += hopDistance();
        }
        if (hops < maxHops) return false;
        return true;
    }

    public double runSimulations(int num) {
        double score = 0;
        double scoreCorrect = 0;
        double scoreTotal = 0;
        for (int i = 0; i < num; i++) {
            scoreTotal++;
            if (simulate() == true) {
                scoreCorrect++;
            }
        }
        score = scoreCorrect / scoreTotal;
        return score;
    }
}