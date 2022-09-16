/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author isabella
 */
public class Binarytree {
    private Node root;
    
    //constructors
    public Binarytree(){
        
    }
    public Binarytree(Node r){
        root = r;
    }
    public Binarytree(int r){
        root = new Node(r);
    }
    
    //getters
    public Node getRoot(){
        return root;
    }
    
    /**
     * params int
     * returns void
     * inserts the number into the binary tree
     * less than or equal to goes left
     * greater than goes right
     */
    public void insert(Node a){
        // if root
        if(root!=null){
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            int val = a.getValue();

            while(!q.isEmpty()){
                Node n = q.remove();
                if(n.getValue()<val){
                    if(n.getRight() == null){
                        n.setRight(a);
                        a.setParent(n);
                        break;
                    }
                    q.add(n.getRight());
                }
                else{
                    if(n.getLeft() == null){
                        n.setLeft(a);
                        a.setParent(n);
                        break;
                    }
                    q.add(n.getLeft());
                }
            }
        }
        else{
            root=a;
        }
        
        
    }
    public void insert(int a){
        insert(new Node(a));
    }
    public void insert(int[] a){
        for(int b:a) insert(new Node(b));
    }
    
    /**
     * params int
     * returns void
     * deletes a node from the tree
     */
    public void remove(Node a){
        if(a.getParent()==null)root=null;
        else{
            int val = a.getValue();
            //leaf node
            if(a.getLeft() == null && a.getRight() == null){
                if(a.getParent().getLeft()==null || a.getParent().getLeft().getValue()!=val) a.getParent().setRight(null);
                else a.getParent().setLeft(null);
            }
            
            // one child
            if(a.getLeft()!=null && a.getRight()==null){
                a.getLeft().setParent(a.getParent());
                if(a.getParent().getLeft()==null || a.getParent().getLeft().getValue()!=val) a.getParent().setRight(a.getLeft());
                else a.getParent().setLeft(a.getLeft());
            }
            if(a.getRight()!=null && a.getLeft()==null){
                a.getRight().setParent(a.getParent());
                if(a.getParent().getLeft()==null || a.getParent().getLeft().getValue()!=val) a.getParent().setRight(a.getRight());
                else a.getParent().setLeft(a.getRight());
            }
            
            //two children
            //left most child of the right tree
            if(a.getRight()!=null && a.getLeft()!=null){
                Node b = successor(a);
                remove(b);
                b.setParent(a.getParent());
                b.setLeft(a.getLeft());
                b.setRight(a.getRight());
                if(a.getParent().getLeft()==null || a.getParent().getLeft().getValue()!=val) a.getParent().setRight(b);
                else a.getParent().setLeft(b);
            }
            
        }
        
        
    }
    public void remove(int a) throws RuntimeException{
        Node n = find(a);
        if(n==null) throw new RuntimeException("Error. Can't remove this element as it is not in the tree");
        else remove(n);
    }
    
    /**
     * params int
     * returns Node
     * return the top most Node of the tree with the input as its value
     */
    public Node find(int a){
        // if root
        if(root!=null){
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                Node n = q.remove();
                if(n.getValue()<a){
                    if(n.getRight().getValue() == a){
                        return n.getRight();
                    }
                    q.add(n.getRight());
                }
                else{
                    if(n.getLeft().getValue() == a){
                        return n.getLeft();
                    }
                    q.add(n.getLeft());
                }
            }
            return null;
        }
        else return null;
    } 
    
    /**
     * params self
     * returns Node
     * returns the Node with the smallest value in the tree
     */
    public Node minimum(){
        Node min = new Node();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node n = q.remove();
            if(n.getLeft()==null) return n;
            else{
                q.add(n.getLeft());
            }
        }
        return min;
    }
    
    //public int depth -- use recursion -- implement later im tired
    

    /**
     * params self
     * returns String
     * returns the values of the Nodes in the tree from smallest to greatest
     */
    
    public String treeWalk(){
        String tree = "";
        for(Node n = minimum(); n!=null; n = successor(n)){
            tree = tree + n.getValue() + ", ";
        }
        return tree;
    }
    

    /**
     * params Node
     * returns Node
     * finds the successor or next largest node given an input node
     */
    public Node successor(Node a){
        Node b = null;
        if(a.getRight()==null){
            if(root==a) return null;
            else{
                for(Node n = a; n.getParent()!=null; n=n.getParent()){
                    if(n.getValue()<=n.getParent().getValue()) return n.getParent();
                }
                return null;
            }
        }
        if(a.getRight()!=null){
            b = a.getRight().getLeft();
            if (b == null) {
                b = a.getRight().getRight();
            }
            if(b==null) return a.getRight();

            Queue<Node> q = new LinkedList<>();
            q.add(b);

            while (!q.isEmpty()) {
                Node n = q.remove();
                if (n.getLeft() == null && n.getRight() == null) {
                    b = n;
                    break;
                }

                if (n.getLeft() != null) {
                    q.add(n.getLeft());
                } else if (n.getRight() != null) {
                    q.add(n.getRight());
                }
            }
        }
        return b;
    }
    
}
