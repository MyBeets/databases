/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class DAHT {
    private int[] A;
    public DAHT(){
        A = new int[10];
    }
    public DAHT(int size){
        A = new int[size];
    }
    public void insert(int k, int v)throws RuntimeException{
        if(k<=A.length) A[k]=v;
        else throw new RuntimeException("key greater than table size");
    }
    
    public int search(int k)throws RuntimeException{
        if(k<=A.length) return A[k];
        else throw new RuntimeException("key greater than table size");
    }
    public void remove(int k)throws RuntimeException{
        if(k<=A.length) A[k] = 0;
        else throw new RuntimeException("key greater than table size");
    }
    public int[] getArray(){
        return A;
    }
}
