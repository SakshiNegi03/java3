package java1;

import java.util.Scanner;

public class qus8 {
    public static void main(String[] args) {

        System.out.println("By using while loop:- ");
        Scanner a = new Scanner(System.in);
        String s = a.next();
        while (!s.equals("done")){
            s = a.nextLine();
        }

        System.out.println("Using 'do-while' statement:- ");
        do{
            s = a.next();
        }
        while (!s.equals("done"));

    }
}