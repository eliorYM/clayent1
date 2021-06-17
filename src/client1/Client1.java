/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ser.Board;

/**
 *
 * @author user
 */
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        new ManagerClient1();

        }
    }

