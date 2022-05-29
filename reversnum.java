import java.util.Scanner;
public class Reversnum {

    public static void main(String[] args) {
        int num , reversed = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();
        

    while(num != 0)
    {
        int rem = num % 10;
        reversed = reversed * 10 + rem;
        num /= 10;
    }
       System.out.println("Reversed Number: " + reversed);
}
}
