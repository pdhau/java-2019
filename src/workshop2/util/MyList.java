/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2.util;

import workshop2.entity.Book;

/**
 *
 * @author TrongDuyDao
 */
public class MyList {
    
    Node<Book> head, tail;
    
    //ctor
    public MyList() {
        head = tail = null;
    }
    //check if the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }
    //add a new Book to the end of list
    public void addLast(Book b) {
        Node<Book> node = new Node<Book>(b);
        if(null == this.head) {
            this.head = node;
        } else {
            Node<Book> tmp = this.head;
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(node);
        }
    }
    //add a new Book to the begining of list
    public void addFirst(Book b) {
        Node<Book> node = new Node<Book>(b);
        if(null == this.head) {
            this.head = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
    }
    //output information of all books in the list
    public void traverse() {
        System.out.println("Code      Title               Quanlity  Lender    Price     Value");
        if(null == this.head) {
            System.out.println("Book list is empty");
        } else {
            Node<Book> tmp = this.head;
            while(tmp != null) {
                System.out.println(tmp.getInfo());
                tmp = tmp.getNext();
            }
        }
    }
    //return number of nodes/elements in the list
    public int size() {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }
    //return a Node at position k, starting position is 0
    public Node<Book> getNode(int k) {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }
    //add a new book after a position k
    public void addAfter(Book b, int k) {
        Node<Book> node = new Node<Book>(b);
        if(null == this.head) {
            this.head = node;
        } else {
            int position = 1;
            Node<Book> tmp = this.head;
            while(tmp != null && position != k) {
                tmp = tmp.getNext();
                position++;
            }
            
            if (position != k) {
                System.out.println("Position is invalid");
            } else {
                node.setNext(tmp.getNext());
                tmp.setNext(node);
            }
        }
    }
    //delete a book at position k
    public void deleteAt(int k) {
        if(null == this.head) {
            System.out.println("Book list is empty");
        } else {
            int position = 1;
            Node<Book> tmp = this.head;
            Node<Book> priviousNode = null;
            while(tmp != null && position != k) {
                priviousNode = tmp;
                tmp = tmp.getNext();
                position++;
            }
            
            if (position != k) {
                System.out.println("Position is invalid");
            } else {
                if (tmp == this.head) {
                    this.head = tmp.getNext();
                } else {
                    priviousNode.setNext(tmp.getNext());
                }
            }
        }
    }
    //search a Node by a given book code
    public Node<Book> search(String bCode) {
        Node<Book> tmp = this.head;
        while(tmp != null) {
            if (bCode.equals(tmp.getInfo().getbCode())) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }
}
