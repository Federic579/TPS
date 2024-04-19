package Equazione_1;

import java.util.*;

public class Main implements Runnable {
    static int a, b, c, x, y, z; //importante lo static

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

        Thread t1 = new Thread(new Main());
        t1.start();
        y = 2 * a + 4;
        t1.join();
        z = x * y;
        System.out.println(5 * z - 10 * c);      
    }

    @Override
    public void run() {
        x = 7 * b + 3;
    }
}
