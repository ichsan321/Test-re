public class Methodrefrence extends Thread{


    public static void main(String[] args) {
        Thread t1 = new Thread(Methodrefrence::thread1);
        Thread t2 = new Thread(Methodrefrence::thread2);
        t1.start();
        t2.start();
    }

    public static void thread1() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " Even " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
            Long end = System.currentTimeMillis();
            System.out.println((end - start) / 1000 + "second Thread Even Number");
        }

    public static void thread2() {
        long t2 = System.currentTimeMillis();
            for(int i=1; i<10; i+=2){
                System.out.println(Thread.currentThread().getName()+" Odd "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }}
                Long t1 = System.currentTimeMillis();
                System.out.println((t1 - t2) / 1000 + "second Thread Odd Number");
        }
    }
