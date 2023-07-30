public class Main {
    public static void main(String[] args) {

            WorldState worldState = new WorldState();
            WorldState worldState2 = new WorldState();

            worldState.isWorldPositivelyGood();
            worldState2.isWorldNegativelyGood();


            System.out.println("World is Pretty Good : " + worldState.isWorldPositively);
            System.out.println();
            System.out.println();
            System.out.println("World is Very  Bad : " + worldState2.isWorldNegatively);




    }
}