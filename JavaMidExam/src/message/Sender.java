/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;

/**
 *
 * @author USER
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger ");
        std.SendMessege("", "Test", "Hy");
        std.SendMessege("Azki", "Ari", "Hey how are you today ?");
        
        MailMessenger maill = new MailMessenger();
        System.out.println("MaillMessenger");
        maill.connect();
        maill.SendMessege("", "Dismiss", "Wrong Email Sorry");
        maill.SendMessege("Edi", "Ali", "What's your problem?");
        maill.disconnect();
        maill.SendMessege("Kira", "Ghani", "Ping");
    }
}
