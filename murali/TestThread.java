class ThreadDemo extends Thread {
    ThreadDemo (String name) {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: New");
    }

    public void run () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }

    public void start () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}

public class TestThread {
    public static void main(String args[]) {
        ThreadDemo thread1 = new ThreadDemo("thread1");
        ThreadDemo thread2 = new ThreadDemo("thread2");
        thread1.start();
        thread2.start();
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }
}
