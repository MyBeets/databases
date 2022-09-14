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
                        break;
                    }
                    q.add(n.getRight());
                }
                else{
                    if(n.getLeft() == null){
                        n.setLeft(a);
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
        // if no root
        insert(new Node(a));
    }
}
