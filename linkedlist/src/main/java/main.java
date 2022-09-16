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
        
        
        //prepend test
        LinkedList L1 = new LinkedList(new Node(1));
        L1.prepend(new Node(2));
        if(L1.getHead().getValue() == 2) pass++;
        else fail++;
        
        //append test
        L1.append(new Node(2));
        if(L1.getEnd().getValue() == 2) pass++;
        else fail++;
        
        //delete front test
        L1.append(new Node(3));
        L1.deleteFront();
        //System.out.println(L1.getHead().getValue());
        if(L1.getHead().getValue() == 1)pass++;
        else fail++;
        
        //delete end test
        L1.append(new Node(4));
        L1.deleteEnd();
        //System.out.println(L1.getHead().getValue());
        if(L1.getEnd().getValue() == 3)pass++;
        else fail++;
        
        //insert at index
        LinkedList L2 = new LinkedList(1);
        try{ L2.insertAtLocation(new Node(2), 1);}
        catch(Exception e){ pass++;}
        

        L2.append(new Node(2));
        L2.printLinkedList();
        //System.out.println(L2.getEnd().getValue());
        //System.out.println(L2.getEnd().getPrev().getValue());
        L2.insertAtLocation(new Node(3), 1);
        if(L2.getHead().getNext().getValue()==3)pass++;
        else fail++;
        
        L2.removeAtLocation(1);
        if(L2.getHead().getNext().getValue()==2)pass++;
        else fail++;
        
        //end
        System.out.println(pass + "/" + (pass+fail) + " Tests Passed");
    }
}
