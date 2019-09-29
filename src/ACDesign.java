/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uvenu
 */
public class ACDesign {
    private double HP = 3.5;
    private int zones = 2;
    private int outlets = 6;

    //constructor
    public ACDesign() {
    }
    
    //getter and setter
    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public int getZones() {
        return zones;
    }

    public void setZones(int zones) {
        this.zones = zones;
    }

    public int getOutlets() {
        return outlets;
    }

    public void setOutlets(int outlets) {
        this.outlets = outlets;
    }

    //Overridden toString method
    @Override
    public String toString() {
        return "AC Design :\n" + "HP : " + HP + "\nZones : " + zones + "\nOutlets: " + outlets + '\n';
    }
        
}
