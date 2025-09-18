/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speeding;

/**
 *
 * @author jerem
 */
public class Fine implements iFine {
    private String citizenName;
    private double speed;
    private double finePayable;
    
    public Fine(String citizenName, double speed, double finePayble){
        this.citizenName = citizenName;
        this.speed = speed;
        this.finePayable = finePayable;
    }

    Fine(String citizenName, double speed) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getcitizenName(){ 
        return citizenName;
    } 
    public void setcitizenName(String citizenName){
        this.citizenName = citizenName;
    }
    public double getspeed(){
        return speed;
    }
    public void setspeed(double speed){
        this.speed = speed;
    }
    public double getfinePayable(double finePayable){
        return finePayable;
    }
    public void setfinePayable(double finePayable){
        this.finePayable = finePayable;
    }
    public void calculateFine(){
        if(speed>120){
            finePayable = speed*10.20;
        }
        else{ 
            finePayable= 0;
        }
          
    }

    @Override
    public void printFine() {
        System.out.println("Citizen:" + citizenName);
        System.out.println("Speed:" + speed);
        if(finePayable> 0){
            System.out.printf("Fine payable: R2.F%n", finePayable);
        }
        else{
            System.out.println("No amount payable - witnin speed limit");
            
        }
    }
    
}
