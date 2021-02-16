package qus1;

import java.util.Scanner;

public class Librarian implements Library {
    String name;
    int id;
     int bookscount=0;

    @Override
    public void issueBooks() {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Book Name : ");
        name = sc.next();
        System.out.println(" Book Id : ");
        id = sc.nextInt();
        bookscount++;
        System.out.println(" Books Issued: " + bookscount);
    }

    @Override
    public void returnBooks() {
        System.out.println("books returned successfully");
        bookscount--;
        System.out.println(" Books Issued: " + bookscount);
    }

    @Override
    public void showBooks() {
        System.out.println("Issued Book Name: " + name);
        System.out.println("Issued Book Id: " + id);
    }
}
