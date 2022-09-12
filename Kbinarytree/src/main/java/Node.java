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
    private int value;
    private Node parent;
    private Node lchild;
    private Node rchild;
    
    /*
     *constructors
     *type: none, int (value), node (parent), int and node
     */
    public Node(){
        value = 0;
    }
    public Node(int a){
        value = a;
    }
    public Node(Node a){
        parent = a;
    }
    public Node(int a, Node b){
        value = a;
        parent = b;
    }
    
    // getters
    public int getValue(){
        return value;
    }
    public Node getParent(){
        return parent;
    }
    public Node getLeft(){
        return lchild;
    }
    public Node getRight(){
        return rchild;
    }
}
