package workshop2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author phau
 */
public class Main {

    public static void main(String[] args) {
        boolean isExit = false;
        String option;
        Scanner in = new Scanner(System.in);
        BookList bookList = new BookList();
        while (!isExit) {
            System.out.println("Book list");
            System.out.println("1. Input Book and add to the end");
            System.out.println("2. Display books");
            System.out.println("3. Search by code");
            System.out.println("4. Input Book and add to the begin");
            System.out.println("5. Add Book after position k");
            System.out.println("6. Delete Book at position k");

            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            option = in.nextLine();

            switch (option) {
                case "1":
                    bookList.addLast();
                    break;

                case "2":
                    bookList.list();
                    break;

                case "3":
                    bookList.search();
                    break;

                case "4":
                    bookList.addFirst();
                    break;

                case "5":
                    bookList.addAfter();
                    break;

                case "6":
                    bookList.deleteAt();
                    break;

                case "0":
                    isExit = true;
                    break;
            
                default:
                    System.out.println("Your choice is not supported...!");
                    break;
            }
        }
        in.close();
    }
}
