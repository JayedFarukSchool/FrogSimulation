public class Main {
    public static void main(String[] args) {
    FrogSimulation f = new FrogSimulation(24, 5);
      System.out.println(f.runSimulations(400));
      System.out.println(f.simulate());
      System.out.println(f.hopDistance());

    }
}
