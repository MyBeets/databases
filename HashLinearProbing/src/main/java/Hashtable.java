/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class Hashtable {
    private int size;
    private int[] T;
    public Hashtable(){
        T = new int[10];
        size = 10;
    }
    public Hashtable(int a){
        T = new int[a];
        size = a;
    }
    public int insert(int k) throws RuntimeException{
        //HASH - INSERT(T, k)
        //1 i = 0
        int i = 0;
        //2 repeat
        while(i<size){
            //3 q = h(k, i)
            int q = hash(k,i);
            //4 if T[q] == NIL
            if(T[q] == 0){
                //5 T[q] = k
                T[q] = k;
                //6 return q
                return q;
            }
            //else i = i + 1
            else i++;
        }
        //8 until i == m
        
        //9 error “hash table overflow”
        throw new RuntimeException("hashtable overflow");
    }
    public int search(int k){
        int val = 0;
        //HASH - SEARCH(T, k)
        //1 i = 0
        int i = 0;
        int q = hash(k, i);
        
        //2 repeat
        while(T[q]!=0 && i < size){
            //3 q = h(k, i)
            q = hash(k, i);
            //4 if T[q] == k
            if(T[q] == k) return q;
            //5 return q
            //6 i = i + 1
            i++;
        }
        //7 until T[q
        //] == NIL or i == m
        //8 return NIL
        return val;
    }
    public int hash(int k, int i){
        return k;
    }
}
