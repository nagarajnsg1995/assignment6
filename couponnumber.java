import java.util.Scanner;
public class Couponnum {
    static double cost;
    static double coupon = 0;
        static String x = "No coupon";

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Number of Bags Ordered: ");
            while((cost = input.nextDouble())%1 != 0)

            {
                System.out.println("Please enter a whole number.");
            }
            {
                if (cost<10) {System.out.print(x);}

                else
                if (cost>=10 && cost<=60) { coupon = .08;}
                if (cost>60 && cost<=150) { coupon = .10;}
                if (cost>150 && cost<=210) { coupon = .12;}
                if (cost>210) { coupon = .14;}

                System.out.println("You win a discount coupon of:" +" "
                        + coupon*cost + " which is equal to " + coupon*100  +"% "  + "of your purchase");
            }
        }
    } 

