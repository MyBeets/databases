
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class LinkedList {
    Node head;
    Node end;
    
    public LinkedList(){
    
    }
    public LinkedList(Node h){
        head = h;
        end = h;
    }
    public LinkedList(int a){
        head = new Node(a);
        end = new Node(a);
    }
    
    
    public Node getHead(){
        // so no head?
        return head;
    }
    public Node getEnd(){
        return end;
    }
    
    /**
     * params Node
     * returns void
     * inserts an element before the last element from a linked list
     */
    public void prepend(Node a){
        if(head==null){head = a; end =a;}
        else if(head.getNext()==null){ end.setPrev(a); a.setNext(end); head=a;}
        else if(head != null){ a.setNext(head); head.setPrev(a); head=a;}
    }
    /**
     * params Node
     * returns void
     * inserts an element after the last element from a linked list
     */
    public void append(Node a){
        if(head==null){head = a; end =a;}
        else if(head.getNext()==null){ head.setNext(a); a.setPrev(head); end=a;}
        else if(end != null){ a.setPrev(end); end.setNext(a); end=a;}
    }
    /**
     * params self
     * returns void
     * removes the first element from a linked list
     */
    public void deleteFront() throws RuntimeException{
        if(head==null){
            throw new RuntimeException("delete operation unsuccessful: list empty");
        }
        head = head.getNext();
        head.setPrev(null);
    }
    /**
     * params self
     * returns void
     * removes the last element from a linked list
     */
    public void deleteEnd(){
        if(end==null){throw new RuntimeException("delete operation unsuccessful: list empty");}
        end = end.getPrev();
        end.setNext(null);
    }
    
    /**
     * params Node, int
     * returns void
     * removes an element at a given index in a linked list
     */
    public void insertAtLocation(Node a, int idx) throws RuntimeException{ // stolen from stack overflow//couldnt get the stolen code working so i just wrote it myself :(
        // linked here
        // https://stackoverflow.com/questions/69624700/how-do-i-insert-an-item-at-a-certain-index-in-a-linked-list?rq=1
        int i = 0;
        for(Node b = head; b!=null; b = b.getNext()){
            if(i==idx){
                b.getPrev().setNext(a);
                a.setPrev(b.getPrev());
                b.setPrev(a);
                a.setNext(b);
            }
            i++;
        }
        if(i<=idx) throw new RuntimeException("Operation Failed: Index out of bounds");
        
        
        
        
    }
    /**
     * params int
     * returns void
     * removes the element at a given index in a linked list
     */
    public void removeAtLocation(int idx){
        int i = 0;
        for(Node b = head; b!=null; b = b.getNext()){
            if(i==idx){
                Node a = b.getPrev();
                Node c = b.getNext();
                if(a == null) head = c;
                else if(c==null) end = a;
                else{
                    a.setNext(c);
                    c.setPrev(a);
                }
            }
            i++;
        }
        if(i<=idx) throw new RuntimeException("Operation Failed: Index out of bounds");
    }
    
    /**
     * params self
     * returns void
     * prints the elements in order starting from the head of a linked list
     */
    public void printLinkedList(){
        String out = "";
        for(Node b = head; b!=null; b = b.getNext()){
            out = out + b.getValue() + ",";
        }
        System.out.println(out);
    }
}
