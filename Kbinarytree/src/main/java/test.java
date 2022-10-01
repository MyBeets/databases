/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */

import java.time.LocalDateTime;
import java.util.Random;
import java.math.*;

public class test {
    public static void main(String arg[]){
        int n = 10000;
        int r = 100000;
        int cycles = 20;
        Random ran = new Random();
        for(int a = 0; a<=cycles; a++){
            Binarytree B1 = new Binarytree();
            for(int i = 0; i<n; i++){
               B1.insert(new Node(ran.nextInt(100)));
            }
            
            int bmax = r/cycles*a;
            
            //time start
            long start = System.nanoTime();
            for(int b = 0; b<= bmax; b++){
                B1.insert(new Node(ran.nextInt(100)));
                /*
                try{B1.remove(ran.nextInt(100));}
                catch(Exception e){}
*/
            }
            long end = System.nanoTime();
            System.out.println( bmax + " , " + (end-start));
        }

    }
}
