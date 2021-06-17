/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

/**
 *
 * @author elior studies
 */
public class Client1ClikBroa {
           
     Client1ClikBroaGraphics clik[][] = new Client1ClikBroaGraphics[8][8];
    
    public Client1ClikBroa(){
        
        clik[0][0] = new Client1ClikBroaGraphics(0,0);
        
        
    }

    public Client1ClikBroaGraphics[][] getClik() {
        return clik;
    }

    public void setClik(Client1ClikBroaGraphics[][] clik) {
        this.clik = clik;
    }
    
    public int getx(int i, int j){
        return clik[i][j].getRow();        
    }
    public int gety(int i, int j){
        return clik[i][j].getColome();  
    }    
}
