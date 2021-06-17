/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import ser.Board;
import ser.PrintBoard;

/**
 *
 * @author elior studies
 */
public class Client1Board {
    
    public Client1Board(){
        pb = new PrintBoard();
    }
    PrintBoard pb;
    Board bord;

    public void setBord(Board bord) {
        this.bord = bord;
    }
    public void printBoardClient(){
        pb.printBoard(bord);
    }
}
