package fo.tsk.scannerTemplate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hvat input vilt tú hava?");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("input var: " + s);
    }
}
