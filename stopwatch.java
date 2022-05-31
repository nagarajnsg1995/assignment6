public class Stopwatch {

    public static void main(String[] args) throws InterruptedException
        {
            long starttime = System.currentTimeMillis();
            for (int i=0; i<10; i++)
            {
                System.out.println(i);
                Thread.sleep(500);
            }
            long endtime = System.currentTimeMillis();
            long elapsetime = endtime - starttime;
            System.out.println("execution time " +elapsetime);
        }
    }



