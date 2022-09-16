/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Node {
    private Node prev;
    private Node next;
    private int value;
    
    public Node(){
        value = 0;
    }
    public Node(Node a, Node b, int c){
        prev = a;
        next = b;
        value = c;
    }
    public Node(int c){
        value = c;
    }
    
    
    public Node getPrev(){
        return prev;
    }
    public Node getNext(){
        return next;
    }
    public int getValue(){
        return value;
    }
    
    public void setPrev(Node a){
        prev = a;
    }
    public void setNext(Node a){
        next = a;
    }
}
