/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
     */
    public void insert(Node a){
        // if no root
        if(root==null) root=a;
        

        a.getValue() > root.getValue()
        
    }
    public void insert(int a){
        // if no root
        if(root==null) root= new Node(a);
        
        
    }
    /**
     * insert helper methods
     * append to left and append to right
    */
    public void appendRight(){
        for(Node n = root; a.getValue() > n.getValue(); n=n.getRight()){
            if(a.getValue())
        }
    }
}
