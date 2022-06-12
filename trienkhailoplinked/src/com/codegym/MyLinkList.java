package com.codegym;

import javax.xml.soap.Node;

public class MyLinkList {
    private Node head;
    private int numNodes;

    public MyLinkList(Object data){
        head = new Node(data);

    }

    public void addFirst(int i) {
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Node next) {
            this.next = next;
        }

        public Node(Object data) {
            this.data = data;
        }
    }
    public void add(int index,Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next !=null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    }

