/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;

/**
 *
 * @author USER
 */
public class MailMessenger implements InterfaceMessenger {
        boolean isSuccess, isConnectedToServer;
        
        void connect(){
            isConnectedToServer=true;
            System.out.println("Connected To Server");
        }
        
        void disconnect(){
            isConnectedToServer=false;
            System.out.println("Disconnected from Server");
        }
        
        @Override
        public void SendMessege(String receiver, String subject, String messege) {
            System.out.println("Receiver : "+receiver);
            System.out.println("Subject : "+subject);
            System.out.println("Message : "+messege);
            System.out.println("Status Server : "+isConnectedToServer);
            
            if (isConnectedToServer==true){
                if (receiver == ""){
                    isSuccess = false;
                    System.out.println("Status Messege :"+isSuccess);
                    System.out.println("Mail NOT Sent.\n");
                } else {
                    isSuccess=true;
                    System.out.println("Status Messege :"+isSuccess);
                    System.out.println("Mail Sent.\n");   
                }
            } else {
                System.out.println("Mail NOT Sent. Please Connect To The Server First.");
            }   
    }
}
