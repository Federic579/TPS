package Equazione_2;

public class Thread1 extends Thread {
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
        result = 5 * a - 7;
    }
}