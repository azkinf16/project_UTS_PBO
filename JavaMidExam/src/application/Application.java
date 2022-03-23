/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import data.*;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Application {
    public static void main(String[] args) {
        
        String name = null, brand = null, procName = null, SO = null, storage = null;
        byte procCore = 0, RAM = 0, stok = 0;
        double screenSize = 0, weight = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Azki Cell");
        System.out.println("===================");
                
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

        System.out.print("Screen\t\t: ");
        screenSize = scanner.nextDouble();

        System.out.print("Berat\t\t: ");
        weight = scanner.nextDouble();


        var ac = new acer(name, brand, procName, SO, storage, procCore, RAM, stok, screenSize, weight);

        System.out.println("=======================");
        System.out.println("Nama Pembeli\t\t: " + ac.getName());
        System.out.println("Brand Laptop\t\t: "+ ac.getBrand());
        System.out.println("Nama Proccesor Laptop\t: "+ ac.getProcName());
        System.out.print("Core Proccesor\t\t: "); ac.setProcCore(procCore);
        System.out.println("Sistem Operasi Laptop\t: " + ac.getSO());
        System.out.print("Ukuran RAM Laptop\t: "); ac.setRAM(RAM);
        System.out.println("Jenis Storage Laptop\t: " + ac.getStorage());
        System.out.print("Storfront Position\t: "); ac.setStorfronePosition(storage);
        System.out.print("Berat Laptop\t\t: "); ac.setWeight(weight);
        System.out.print("Lebar Layar Laptop\t: "); ac.setScreenSize(screenSize);
        System.out.print("Stok yang ada\t\t: "); ac.setStok(stok);

    }
}
