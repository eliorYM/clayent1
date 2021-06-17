/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author elior studies
 */
public class ManagerClient1 {
    
    ObjectOutputStream out;
    Object obj;
    Socket s = null;
    
    public ManagerClient1() throws IOException{
    GraphicsClient1 g = new GraphicsClient1();
        // TODO code application logic here
        
        try {
            s = new Socket("localhost",130);
            System.out.println("yaaaa");
        } catch (Exception e) {
        System.err.println("zzzzzzz");
        }
        
        //GraphicsClient1 GraphicsClient1 = new GraphicsClient1();
        Scanner S = new Scanner(System.in);
        
       // boolean turn;
        while (true) { 
            obj = S.nextInt();
            out = new ObjectOutputStream(s.getOutputStream());
            out.writeObject(obj);

        }
    }
}
