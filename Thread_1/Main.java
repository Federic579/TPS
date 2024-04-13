package Thread_1;

public class Main implements Runnable {
    public static  int x = 0;
    public static  int y = 0;

    public static void main(String[] args) throws Exception{
        Main code = new Main();
        Thread t1 = new Thread(code);
        t1.start();
        x = 3 - 2;
        t1.join();
        System.out.println(x + y);
    }

    public void run(){
        y = 5 + 4;
    }
}