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
        int r = 10000;
        Random ran = new Random();
        for(int r2 = 100; r2<r; r2+=1000){
            //1
            LinkedList L1 = new LinkedList();
            for(int i = 0; i<n; i++){
               L1.append(new Node(ran.nextInt(100)));
            }
            LocalDateTime start = LocalDateTime.now();
            for(int i = 0; i<r2; i++){
               L1.removeAtLocation(ran.nextInt(n-r2));
            }
            LocalDateTime end = LocalDateTime.now();
            float f = (float)(end.getNano()-start.getNano())/1000000000;
            System.out.println((end.getSecond()-start.getSecond())+ String.format("%.5f", f)+ " , " +r2);
            //System.out.println(start);
            //System.out.println(end);
            //compareTo();
    }
    }
}
