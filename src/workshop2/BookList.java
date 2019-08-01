package workshop2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

import workshop2.entity.Book;
import workshop2.util.MyList;
import workshop2.util.Node;

/**
 *
 * @author TrongDuyDao
 */
public class BookList {

    // a list of book
    private MyList books;
    private Scanner in;

    public MyList getBooks() {
        return books;
    }

    public BookList() {
        books = new MyList();
        in = new Scanner(System.in);
    }

    // 1.0 accept information of a Book
    private Book getBook() {
        while (true) {
            System.out.println("Enter information of a Book");
            System.out.print("Code: ");
            String code = in.nextLine();
            Node<Book> result = this.getBooks().search(code);
            if (null != result) {
                System.out.println("Book code must be unique");
                continue;
            }
            System.out.print("Title: ");
            String title = in.nextLine();
            System.out.print("Quality: ");
            int quality = Integer.parseInt(in.nextLine());
            System.out.print("Lended: ");
            int lended = Integer.parseInt(in.nextLine());
            System.out.print("Price: ");
            double price = Double.parseDouble(in.nextLine());
            return new Book(code, title, quality, lended, price);
        }
    }

    // 1.1 accept and add a new Book to the end of book list
    public void addLast() {
        Book book = this.getBook();
        this.getBooks().addLast(book);
    }

    // 1.2 output information of book list
    public void list() {
        this.getBooks().traverse();
    }

    // 1.3 search book by book code
    public void search() {
        System.out.print("Enter book code: ");
        String code = in.nextLine();
        Node<Book> node = this.getBooks().search(code);
        System.out.println("Info of book code " + code);
        System.out.println(node.getInfo());
    }

    // 1.4 accept and add a new Book to the begining of book list
    public void addFirst() {
        Book book = this.getBook();
        this.getBooks().addFirst(book);
    }

    // 1.5 Add a new Book after a position k
    public void addAfter() {
        Book book = this.getBook();
        System.out.print("Enter adding position: ");
        int position = Integer.parseInt(in.nextLine());
        this.getBooks().addAfter(book, position);
    }

    // 1.6 Delete a Book at position k
    public void deleteAt() {
        System.out.print("Enter delete position: ");
        int position = Integer.parseInt(in.nextLine());
        this.getBooks().deleteAt(position);
    }
}
