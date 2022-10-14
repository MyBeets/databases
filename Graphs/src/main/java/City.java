/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabella
 */
public class City {
    private String moniker;//saying
    private int last;//number of points in last football game
    
    public City(String moniker, int lastScore){
        this.moniker = moniker;
        this.last = lastScore;
    }
    public String toString(){
        return moniker+" last scored " + last + " points";
    }
}
