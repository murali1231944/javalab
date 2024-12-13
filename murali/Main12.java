public class Main12 {
    public static void main(String[] args) {
       
        Thread t1 = new Thread(() -> {
            try {
                for(int i=0;i<3;i++){
                    System.out.println("BmSce");
                    Thread.sleep(10*1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread t1 was interrupted.");
            }
        });

        
        Thread t2 = new Thread(() -> {
            try {
                for(int i=0;i<3;i++){
                    System.out.println("cse");
                    Thread.sleep(2*1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread t2 was interrupted.");
            }
        });

        
        t1.start();
        t2.start();
    }
}
