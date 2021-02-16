package java1;

import java.util.Scanner;

public class qus2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a string to sort: ");
        char[] b = a.nextLine().toCharArray();
        int n = b.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (b[j] > b[j + 1]) {
                    char temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted string");
        System.out.println(b);

    }
}
