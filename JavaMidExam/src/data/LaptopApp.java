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
public class LaptopApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String name, brand, procName, SO, storage;
        byte procCore, RAM, stok;
        double screenSize = 0, weight = 0;
        
        System.out.println("SKEYYY CELL");
        System.out.println("============");
        
        System.out.print("Name\t\t: ");
        name = scanner.nextLine();
        
        System.out.print("Brand\t\t: ");
        brand = scanner.nextLine();
        
        System.out.print("Processor\t: ");
        procName = scanner.nextLine();
        
        System.out.print("Sistem Operasi\t: ");
        SO = scanner.nextLine();
        
        System.out.print("Storage\t\t: ");
        storage = scanner.nextLine();
        
        System.out.print("Core Proccesor\t: ");
        procCore = scanner.nextByte();
        
        System.out.print("RAM\t\t: ");
        RAM = scanner.nextByte();
        
        System.out.print("Stok\t\t: ");
        stok = scanner.nextByte();
        
       
        var lap = new Laptop(name, brand, procName, SO, storage, procCore, RAM, stok);
        
        System.out.println("=======================");
        System.out.println("Nama Pembeli\t\t: " + lap.getName());
        System.out.println("Brand Laptop\t\t: "+ lap.getBrand());
        System.out.println("Nama Proccesor Laptop\t: "+ lap.getProcName());
        System.out.println("Core Proccesor\t\t: " + lap.getProcCore() + " Core");
        System.out.println("Sistem Operasi Laptop\t: " + lap.getSO());
        System.out.println("Ukuran RAM Laptop\t: " + lap.getRAM() + " GB");
        System.out.println("Jenis Storage Laptop\t: " + lap.getStorage());
        System.out.println("Stok yang ada\t\t: " + lap.getStok() + " Buah");
        
        
        
        
        
        
        
    }
}
