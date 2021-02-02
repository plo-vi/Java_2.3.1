public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}