public class Couponnum {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double random = Math.floor(Math.random() * 10) % 10;
        System.out.println("random number is :" + random);
        for (int i = 0; i < array.length; i++)
            if (array[i] != random) {
                int coupon = array[i];
                System.out.print(+coupon);

            }

    }

}

