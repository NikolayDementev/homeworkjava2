public class Main {

    public static void main(String[] args) {
        int amount = 660;
        boolean inRegistered = true;

        int mile;
        if (inRegistered) {
            mile = 1;
        } else {
            mile = 0;
        }
        int bohus = amount / 20 * mile;

        System.out.println("итоговый бонус" + bohus);
    }
}
