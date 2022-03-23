/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;

/**
 *
 * @author USER
 */
public class StdMessenger implements InterfaceMessenger{
    boolean isSuccess;
    
    public void SendMessege(String receiver, String subject, String messege) {
        System.out.println("Recevier : "+receiver);
        System.out.println("Subject : "+subject);
        System.out.println("Message : "+messege);
    
        if(receiver==""){
            isSuccess=false;
            System.out.println("Status Message : "+isSuccess);
            System.out.println("Std NOT Sent.\n");
        } else{
            isSuccess=true;
            System.out.println("Status Message");
            System.out.println("Std Sent.\n");
        }
    }
}
