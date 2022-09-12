/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class main {
    public static void main(String args[]){
        // setup
        int pass = 0;
        int fail = 0;
        
        /*
        Node class test cases
        constructor tests
        */
        Node n1 = new Node();
        
        /*
        test 1:4
        node constructor ()
        */
        //1
        if(n1.getValue() == 0) pass++;
        else fail++;
        //2
        if(n1.getParent()==null) pass++;
        else fail++;
        //3
        if(n1.getLeft()==null) pass++;
        else fail++;
        //4
        if(n1.getRight()==null) pass++;
        else fail++;
        
        /*
        test 5 
        node constructor (int)
        */
        Node n2 = new Node(1);
        if(n2.getValue()==1) pass++;
        else fail++;
        
        /*
        test 6:7 
        node constructor (node)
        */
        //6
        Node n3 = new Node(n2);
        if(n3.getValue()==0) pass++;
        else fail++;
        
        //7
        if(n3.getParent().getValue()==1)pass++;
        else fail++;
        
        /*
        test 8:9
        node constructor (int, node)
        */
        Node n4 = new Node(2,n2);
        //8
        if(n4.getValue()==2)pass++;
        else fail++;
        
        //9
        if(n4.getParent().getValue()==1)pass++;
        else fail++;
        
        /**
         * Binary tree constructor tests
         */
        /*
        test 10
        binary tree constructor ()
        */
        //10
        Binarytree b1 = new Binarytree();
        if(b1.getRoot() == null)pass++;
        else fail++;
        
        /*
        test 11
        binary tree constructor (node)
        */
        Node n5 = new Node();
        Binarytree b2 = new Binarytree(n5);
        //11
        if(b2.getRoot().getValue()==0) pass++;
        else fail++;
        
        /*
        test 12
        binary tree constructor (int)
        */
        Binarytree b3 = new Binarytree(1);
        //12
        if(b3.getRoot().getValue()==1)pass++;
        else fail++;
        
        //end
        System.out.println(pass + "/" + (pass+fail) + " Tests Passed");
    }
}
