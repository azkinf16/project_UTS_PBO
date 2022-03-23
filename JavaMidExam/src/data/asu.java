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
public class asu {
    public static void main(String[] args) {
        
        String name = null, brand = null, procName = null, SO = null, storage = null;
        byte procCore = 0, RAM = 0, stok = 0;
        double screenSize = 0, weight = 0;
        
        var scanner = new Scanner(System.in);
        
        var ac = new acer(name, brand, procName, SO, storage, procCore, RAM, stok, screenSize, weight);
        
        System.out.println(ac.getName());
    }
}
