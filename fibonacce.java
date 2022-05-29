public class Fibonacce {
    public static void main(String[] args) {

        int n = 10;
        int firstnum = 0;
        int secondnum = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstnum + ", ");

            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }
}