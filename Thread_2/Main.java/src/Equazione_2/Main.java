package Equazione_2;

import java.util.*;

public class Main implements Runnable {
    static int a, b, c, x, y, z;

    public static void main(String[] args) throws exception{
        Scanner keyInput = new Scanner(System.in);

        System.out.print("a: ");
        a = keyInput.nextInt();
        keyInput.nextLine();

        System.out.print("b: ");
        b = keyInput.nextInt();
        keyInput.nextLine();

        System.out.print("c: ");
        c = keyInput.nextInt();
        keyInput.nextLine();
        keyInput.close();

        Thread t0 = new Thread();
        Thread t1 = new Thread1(b);
        Thread t2 = new Thread2(c);

        t0.start();
        t1.start();
        t2.start();

        t0.join();
        t1.join();
        t2.join();

        z = x * t1.getResult() + y * t2.getResult();
        System.out.println(z);
    }
    
    @override
    public void run() {
        x = 3 + 2 * a;
    }
}
