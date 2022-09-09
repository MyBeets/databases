/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */

public class Kstack {
    private int[] array;
    private int idx;
    
    //constructors
    public Kstack(){
        array = new int[1];
        idx = 0;
    }
    public Kstack(int n){
        // add an exception thrower
        array = new int[n];
        idx = 0;
    }
    
    //getters
    public boolean empty(){
        return getidx()==0;
    }
    public int[] getarr(){
        return array;
    }
    public int getidx(){
        return idx;
    }
    
    //must implement
    public void push(int a) throws RuntimeException{
        // add an exception thrower
        if(idx==array.length) throw new RuntimeException("stack overflow");
           array[idx] = a;
           idx++;
    }
    public int pop() throws RuntimeException{
        // add an exception thrower
        if(idx-1<0) throw new RuntimeException("stack underflow");
        idx--;
        int r = array[idx];
        array[idx] = 0;  
        return r;
    }
}
