package Equazione_3;

public class Thread1 extends Thread{
    int result;
    int a;

    public Thread1(int a) {
        this.result = 0;
        this.a = a;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        result = 7 * a + 3;
    }
}