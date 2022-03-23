/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class xiomi extends Laptop{
    
    private String name, brand, procName, SO, storage;
    private byte procCore, RAM, stok;
    private double screenSize, weight;
    
    Scanner scanner = new Scanner(System.in);
    
    public xiomi (String name, String brand){
        super(name, brand);
    }
    
    public xiomi (String name, String brand, String procName, 
            String SO, String storage, 
            byte procCore, byte RAM, byte Stok, double screenSize, double weight){
        super(name, brand, procName, SO, storage, procCore, RAM, Stok);
        setScreenSize(screenSize);
        setWeight(weight);
    }

    @Override
    public void setStok(byte stok) {
        if (stok < 0) {
            System.out.println("Harus Positif");
        } else {
            System.out.println(stok + " buah");
        }
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setRAM(byte RAM) {
        if (RAM < 0) {
            System.out.println("Harus Positif");
        } else {
            System.out.println(RAM + " GB");
        }
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setProcCore(byte procCore) {
        if (procCore < 0) {
            System.out.println("Harus Positif");
        } else {
            System.out.println(procCore + " Core");
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setStorage(String storage) {
        super.setStorage(storage); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getStorage() {
        return super.getStorage(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSO(String SO) {
        super.setSO(SO); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSO() {
        return super.getSO(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setProcName(String procName) {
        super.setProcName(procName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getProcName() {
        return super.getProcName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getBrand() {
        return super.getBrand(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setScreenSize(double screenSize) {
        if (screenSize < 0) {
            System.out.println("Harus Positif");
        } else {
            System.out.println(screenSize + " Inch");
        }
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Harus Positif");
        } else {
            System.out.println(weight + " Kg");
        }
    }
    
    public void setStorfronePosition(String storage){
        if (null == storage){
            System.out.println("General");
        } else switch (storage) {
            case "SSD M.2":
                System.out.println("Best");
                break;
            case "SSD SATA":
                System.out.println("Good");
                break;
            case "HDD":
                System.out.println("Midle");
                break;
            default:
                System.out.println("General");
                break;
        }
    }
}
