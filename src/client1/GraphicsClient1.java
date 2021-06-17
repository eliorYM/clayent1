package client1;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import ser.Board;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elior studies
 */
public class GraphicsClient1 extends JFrame implements ActionListener {
    
    JPanel pStart;
    JPanel pSingIn;
    JPanel pSingUp;
    JPanel pBoard;
    JPanel pUserAccount;
    JPanel pWinAndLosses;
        
    JLabel lUserAccount;
    JLabel lSingIn;
    JLabel lSingInName;
    JLabel lSingInPassword;
    JLabel lSingUp;
    JLabel lSingUpName;
    JLabel lSingUpPassword;
    JLabel lSingUpGmail;
    JLabel lBoard;
    JLabel lWinAndLosses;
    JLabel lT44;
    JLabel lT55;
    JLabel lT54;
    JLabel lT45;
    JLabel lT11;
    JLabel lT21;
    JLabel lT31;
    JLabel lT41;
    JLabel lT51;
    JLabel lT61;
    JLabel lT71;
    JLabel lT81;
    JLabel lT12;
    JLabel lT22;
    JLabel lT32;
    JLabel lT42;
    JLabel lT52;
    JLabel lT62;
    JLabel lT72;
    JLabel lT82;
    JLabel lT13;
    JLabel lT23;
    JLabel lT33;
    JLabel lT43;
    JLabel lT53;
    JLabel lT63;
    JLabel lT73;
    JLabel lT83;
    JLabel lT14;
    JLabel lT24;
    JLabel lT34;
    JLabel lT64;
    JLabel lT74;
    JLabel lT84;
    JLabel lT15;
    JLabel lT25;
    JLabel lT35;
    JLabel lT65;
    JLabel lT75;
    JLabel lT85;
    JLabel lT16;
    JLabel lT26;
    JLabel lT36;
    JLabel lT46;
    JLabel lT56;
    JLabel lT66;
    JLabel lT76;
    JLabel lT86;
    JLabel lT17;
    JLabel lT27;
    JLabel lT37;
    JLabel lT47;
    JLabel lT57;
    JLabel lT67;
    JLabel lT77;
    JLabel lT87;
    JLabel lT18;
    JLabel lT28;
    JLabel lT38;
    JLabel lT48;
    JLabel lT58;
    JLabel lT68;
    JLabel lT78;
    JLabel lT88;    
    JLabel lTW44;
    JLabel lTW55;
    JLabel lTW54;
    JLabel lTW45;
    JLabel lTW11;
    JLabel lTW21;
    JLabel lTW31;
    JLabel lTW41;
    JLabel lTW51;
    JLabel lTW61;
    JLabel lTW71;
    JLabel lTW81;
    JLabel lTW12;
    JLabel lTW22;
    JLabel lTW32;
    JLabel lTW42;
    JLabel lTW52;
    JLabel lTW62;
    JLabel lTW72;
    JLabel lTW82;
    JLabel lTW13;
    JLabel lTW23;
    JLabel lTW33;
    JLabel lTW43;
    JLabel lTW53;
    JLabel lTW63;
    JLabel lTW73;
    JLabel lTW83;
    JLabel lTW14;
    JLabel lTW24;
    JLabel lTW34;
    JLabel lTW64;
    JLabel lTW74;
    JLabel lTW84;
    JLabel lTW15;
    JLabel lTW25;
    JLabel lTW35;
    JLabel lTW65;
    JLabel lTW75;
    JLabel lTW85;
    JLabel lTW16;
    JLabel lTW26;
    JLabel lTW36;
    JLabel lTW46;
    JLabel lTW56;
    JLabel lTW66;
    JLabel lTW76;
    JLabel lTW86;
    JLabel lTW17;
    JLabel lTW27;
    JLabel lTW37;
    JLabel lTW47;
    JLabel lTW57;
    JLabel lTW67;
    JLabel lTW77;
    JLabel lTW87;
    JLabel lTW18;
    JLabel lTW28;
    JLabel lTW38;
    JLabel lTW48;
    JLabel lTW58;
    JLabel lTW68;
    JLabel lTW78;
    JLabel lTW88;
    JLabel lTB44;
    JLabel lTB55;
    JLabel lTB54;
    JLabel lTB45;
    JLabel lTB11;
    JLabel lTB21;
    JLabel lTB31;
    JLabel lTB41;
    JLabel lTB51;
    JLabel lTB61;
    JLabel lTB71;
    JLabel lTB81;
    JLabel lTB12;
    JLabel lTB22;
    JLabel lTB32;
    JLabel lTB42;
    JLabel lTB52;
    JLabel lTB62;
    JLabel lTB72;
    JLabel lTB82;
    JLabel lTB13;
    JLabel lTB23;
    JLabel lTB33;
    JLabel lTB43;
    JLabel lTB53;
    JLabel lTB63;
    JLabel lTB73;
    JLabel lTB83;
    JLabel lTB14;
    JLabel lTB24;
    JLabel lTB34;
    JLabel lTB64;
    JLabel lTB74;
    JLabel lTB84;
    JLabel lTB15;
    JLabel lTB25;
    JLabel lTB35;
    JLabel lTB65;
    JLabel lTB75;
    JLabel lTB85;
    JLabel lTB16;
    JLabel lTB26;
    JLabel lTB36;
    JLabel lTB46;
    JLabel lTB56;
    JLabel lTB66;
    JLabel lTB76;
    JLabel lTB86;
    JLabel lTB17;
    JLabel lTB27;
    JLabel lTB37;
    JLabel lTB47;
    JLabel lTB57;
    JLabel lTB67;
    JLabel lTB77;
    JLabel lTB87;
    JLabel lTB18;
    JLabel lTB28;
    JLabel lTB38;
    JLabel lTB48;
    JLabel lTB58;
    JLabel lTB68;
    JLabel lTB78;
    JLabel lTB88;
    
    JButton bSingIn;
    JButton bSingInOK;
    JButton bSingInBack;
    JButton bSingUp;
    JButton bSingUpOK;
    JButton bSingUpBack;
    JButton bWAL;
    JButton bUAPlay;
    JButton bUASingOut;
    JButton bWinAndLossesBack;
    
    JTextField tFSingInUN;
    JTextField tFSingUpUN;
    JTextField tFSingUpG;
    
    JPasswordField PFSingIn;
    JPasswordField PFSingUp;
    
    ImageIcon board = new ImageIcon("C:\\Users\\try\\Desktop\\board.png");
    ImageIcon WD = new ImageIcon("C:\\Users\\try\\Desktop\\WD.png");
    ImageIcon BD = new ImageIcon("C:\\Users\\try\\Desktop\\BD.png");
    ImageIcon UABG = new ImageIcon("C:\\Users\\try\\Desktop\\RBG.jpg");
    
    Border border = BorderFactory.createLineBorder(Color.BLACK,3);
    Border UAWAL = BorderFactory.createLineBorder(Color.BLACK,3);

    
     GraphicsClient1(){
        
            JFrame fraem = new JFrame();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(Color.BLACK);
            this.setSize(1000, 1000);
            this.setVisible(true);
            this.setLayout(null);
            this.repaint();
            
            pStart = new JPanel();
            pStart.setBounds(0, 0, 1000, 1000);
            pStart.setBackground(Color.GREEN);
            pStart.setLayout(null);
            pStart.setVisible(true);
            this.add(pStart);
                        
            bSingIn = new JButton("sign in");
            bSingIn.setFocusable(false);
            bSingIn.setBounds(150, 200, 300, 600);
            bSingIn.setFont(new Font("", 1, 40));
            bSingIn.setBackground(Color.BLUE);
            bSingIn.addActionListener(this);
            pStart.add(bSingIn);
            
            bSingUp = new JButton("sign up");
            bSingUp.setFocusable(false);
            bSingUp.setBounds(550, 200, 300, 600);
            bSingUp.setFont(new Font("", 1, 40));
            bSingUp.setBackground(Color.BLUE);
            bSingUp.addActionListener(this);
            pStart.add(bSingUp);
            
            /* lSingIn = new JLabel();
            lSingIn.setBounds(450, 150, 100, 700);
            lSingIn.setBackground(Color.red);*/
            
            
            pSingIn = new JPanel();
            pSingIn.setBounds(0, 0, 1000, 1000);
            pSingIn.setBackground(new Color(123,150,250));
            pSingIn.setLayout(null);
            pSingIn.setVisible(false);
            this.add(pSingIn);
            
            lSingIn = new JLabel();
            lSingIn.setBounds(200, 100, 600, 800);
            lSingIn.setBackground(Color.WHITE);
            lSingIn.setOpaque(true);            
            pSingIn.add(lSingIn);
            
            tFSingInUN = new JTextField();
            tFSingInUN.setBounds(250, 300, 250, 80);
            tFSingInUN.setBackground(Color.LIGHT_GRAY);
            lSingIn.add(tFSingInUN);
            
            PFSingIn = new JPasswordField();
            PFSingIn.setBounds(250, 500, 250, 80);
            PFSingIn.setBackground(Color.LIGHT_GRAY);
            lSingIn.add(PFSingIn);
            
            lSingInName = new JLabel("Name");
            lSingInName.setBounds(100, 300, 100, 80);
            lSingInName.setBackground(Color.BLUE);
            lSingInName.setOpaque(true);
            lSingInName.setFont(new Font("Font", 1, 20));
            lSingIn.add(lSingInName);
            
            lSingInPassword = new JLabel("Password");
            lSingInPassword.setBounds(100, 500, 100, 80);
            lSingInPassword.setBackground(Color.BLUE);
            lSingInPassword.setOpaque(true);
            lSingInPassword.setFont(new Font("Font", 1, 20));
            lSingIn.add(lSingInPassword);
            
            bSingInOK = new JButton("SingIn");
            bSingInOK.setBounds(500, 700, 90, 80);
            bSingInOK.setFont(new Font("Font", 1, 15));
            bSingInOK.setBackground(Color.LIGHT_GRAY); 
            bSingInOK.addActionListener(this);
            lSingIn.add(bSingInOK);
            
            bSingInBack = new JButton("back");
            bSingInBack.setBounds(10, 700, 90, 80);
            bSingInBack.setFont(new Font("Font", 1, 15));
            bSingInBack.setBackground(Color.LIGHT_GRAY); 
            bSingInBack.addActionListener(this);
            lSingIn.add(bSingInBack);
            
            pBoard = new JPanel();
            pBoard.setBounds(0, 0, 1000, 1000);
            pBoard.setVisible(false);
            this.add(pBoard);
            
            lBoard = new JLabel();
            lBoard.setBounds(0, 0, 1000, 1000);
            lBoard.setVisible(true);
            lBoard.setIcon(board);
            lBoard.setOpaque(true);
            pBoard.add(lBoard);
            
            lT44 = new JLabel();
            lT44.setBounds(400, 400, 100, 100);
            lT44.setBackground(Color.GREEN);
            lT44.setBorder(border);
            lT44.setVisible(false);            
            lT44.setOpaque(true);
            lBoard.add(lT44);
            
            lT45 = new JLabel();
            lT45.setBounds(400, 500, 100, 100);
            lT45.setBackground(Color.GREEN);
            lT45.setBorder(border);
            lT45.setVisible(false);
            lT45.setOpaque(true);
            lBoard.add(lT45);
            
            lT54 = new JLabel();
            lT54.setBounds(500, 400, 100, 100);
            lT54.setBackground(Color.GREEN);
            lT54.setBorder(border);
            lT54.setVisible(false);
            lT54.setOpaque(true);
            lBoard.add(lT54);
            
            lT55 = new JLabel();
            lT55.setBounds(500, 500, 100, 100);
            lT55.setBackground(Color.GREEN);
            lT55.setBorder(border);
            lT55.setVisible(false);
            lT55.setOpaque(true);            
            lBoard.add(lT55);
            
            lT11 = new JLabel();
            lT11.setBounds(100, 100, 100, 100);
            lT11.setBackground(Color.GREEN);
            lT11.setBorder(border);
            lT11.setVisible(true);
            lT11.setOpaque(true);
            lT11.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            lTB11.setVisible(true);
            lTW11.setVisible(false);
            }
        });
            lBoard.add(lT11);
            
            lT21 = new JLabel();
            lT21.setBounds(200, 100, 100, 100);
            lT21.setBackground(Color.GREEN);
            lT21.setBorder(border);
            lT21.setVisible(true);
            lT21.setOpaque(true);            
            lBoard.add(lT21);
            
            lT31 = new JLabel();
            lT31.setBounds(300, 100, 100, 100);
            lT31.setBackground(Color.GREEN);
            lT31.setBorder(border);
            lT31.setVisible(true);
            lT31.setOpaque(true);            
            lBoard.add(lT31);
            
            lT41 = new JLabel();
            lT41.setBounds(400, 100, 100, 100);
            lT41.setBackground(Color.GREEN);
            lT41.setBorder(border);
            lT41.setVisible(true);
            lT41.setOpaque(true);            
            lBoard.add(lT41);
            
            lT51 = new JLabel();
            lT51.setBounds(500, 100, 100, 100);
            lT51.setBackground(Color.GREEN);
            lT51.setBorder(border);
            lT51.setVisible(true);
            lT51.setOpaque(true);
            lBoard.add(lT51);
            
            lT61 = new JLabel();
            lT61.setBounds(600, 100, 100, 100);
            lT61.setBackground(Color.GREEN);
            lT61.setBorder(border);
            lT61.setVisible(true);
            lT61.setOpaque(true);
            lBoard.add(lT61);
            
            lT71 = new JLabel();
            lT71.setBounds(700, 100, 100, 100);
            lT71.setBackground(Color.GREEN);
            lT71.setBorder(border);
            lT71.setVisible(true);
            lT71.setOpaque(true);
            lBoard.add(lT71);
            
            lT81 = new JLabel();
            lT81.setBounds(800, 100, 100, 100);
            lT81.setBackground(Color.GREEN);
            lT81.setBorder(border);
            lT81.setVisible(true);
            lT81.setOpaque(true);
            lBoard.add(lT81);
            
            lT12 = new JLabel();
            lT12.setBounds(100, 200, 100, 100);
            lT12.setBackground(Color.GREEN);
            lT12.setBorder(border);
            lT12.setVisible(true);
            lT12.setOpaque(true);
            lBoard.add(lT12);
            
            lT22 = new JLabel();
            lT22.setBounds(200, 200, 100, 100);
            lT22.setBackground(Color.GREEN);
            lT22.setBorder(border);
            lT22.setVisible(true);
            lT22.setOpaque(true);
            lBoard.add(lT22);
            
            lT32 = new JLabel();
            lT32.setBounds(300, 200, 100, 100);
            lT32.setBackground(Color.GREEN);
            lT32.setBorder(border);
            lT32.setVisible(true);
            lT32.setOpaque(true);
            lBoard.add(lT32);
            
            lT42 = new JLabel();
            lT42.setBounds(400, 200, 100, 100);
            lT42.setBackground(Color.GREEN);
            lT42.setBorder(border);
            lT42.setVisible(true);
            lT42.setOpaque(true);
            lBoard.add(lT42);
            
            lT52 = new JLabel();
            lT52.setBounds(500, 200, 100, 100);
            lT52.setBackground(Color.GREEN);
            lT52.setBorder(border);
            lT52.setVisible(true);
            lT52.setOpaque(true);
            lBoard.add(lT52);
            
            lT62 = new JLabel();
            lT62.setBounds(600, 200, 100, 100);
            lT62.setBackground(Color.GREEN);
            lT62.setBorder(border);
            lT62.setVisible(true);
            lT62.setOpaque(true);
            lBoard.add(lT62);
            
            lT72 = new JLabel();
            lT72.setBounds(700, 200, 100, 100);
            lT72.setBackground(Color.GREEN);
            lT72.setBorder(border);
            lT72.setVisible(true);
            lT72.setOpaque(true);
            lBoard.add(lT72);
            
            lT82 = new JLabel();
            lT82.setBounds(800, 200, 100, 100);
            lT82.setBackground(Color.GREEN);
            lT82.setBorder(border);
            lT82.setVisible(true);
            lT82.setOpaque(true);
            lBoard.add(lT82);
            
            lT13 = new JLabel();
            lT13.setBounds(100, 300, 100, 100);
            lT13.setBackground(Color.GREEN);
            lT13.setBorder(border);
            lT13.setVisible(true);
            lT13.setOpaque(true);
            lBoard.add(lT13);
            
            lT23 = new JLabel();
            lT23.setBounds(200, 300, 100, 100);
            lT23.setBackground(Color.GREEN);
            lT23.setBorder(border);
            lT23.setVisible(true);
            lT23.setOpaque(true);
            lBoard.add(lT23);
            
            lT33 = new JLabel();
            lT33.setBounds(300, 300, 100, 100);
            lT33.setBackground(Color.GREEN);
            lT33.setBorder(border);
            lT33.setVisible(true);
            lT33.setOpaque(true);
            lBoard.add(lT33);
            
            lT43 = new JLabel();
            lT43.setBounds(400, 300, 100, 100);
            lT43.setBackground(Color.GREEN);
            lT43.setBorder(border);
            lT43.setVisible(true);
            lT43.setOpaque(true);
            lBoard.add(lT43);
            
            lT53 = new JLabel();
            lT53.setBounds(500, 300, 100, 100);
            lT53.setBackground(Color.GREEN);
            lT53.setBorder(border);
            lT53.setVisible(true);
            lT53.setOpaque(true);
            lBoard.add(lT53);
            
            lT63 = new JLabel();
            lT63.setBounds(600, 300, 100, 100);
            lT63.setBackground(Color.GREEN);
            lT63.setBorder(border);
            lT63.setVisible(true);
            lT63.setOpaque(true);
            lBoard.add(lT63);
            
            lT73 = new JLabel();
            lT73.setBounds(700, 300, 100, 100);
            lT73.setBackground(Color.GREEN);
            lT73.setBorder(border);
            lT73.setVisible(true);
            lT73.setOpaque(true);
            lBoard.add(lT73);
            
            lT83 = new JLabel();
            lT83.setBounds(800, 300, 100, 100);
            lT83.setBackground(Color.GREEN);
            lT83.setBorder(border);
            lT83.setVisible(true);
            lT83.setOpaque(true);
            lBoard.add(lT83);
            
            lT14 = new JLabel();
            lT14.setBounds(100, 400, 100, 100);
            lT14.setBackground(Color.GREEN);
            lT14.setBorder(border);
            lT14.setVisible(true);
            lT14.setOpaque(true);
            lBoard.add(lT14);
            
            lT24 = new JLabel();
            lT24.setBounds(200, 400, 100, 100);
            lT24.setBackground(Color.GREEN);
            lT24.setBorder(border);
            lT24.setVisible(true);
            lT24.setOpaque(true);
            lBoard.add(lT24);
            
            lT34 = new JLabel();
            lT34.setBounds(300, 400, 100, 100);
            lT34.setBackground(Color.GREEN);
            lT34.setBorder(border);
            lT34.setVisible(true);
            lT34.setOpaque(true);
            lBoard.add(lT34);
                                    
            lT64 = new JLabel();
            lT64.setBounds(600, 400, 100, 100);
            lT64.setBackground(Color.GREEN);
            lT64.setBorder(border);
            lT64.setVisible(true);
            lT64.setOpaque(true);
            lT64.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            
            lTW64.setVisible(true);
            lTW54.setVisible(true);
            lT64.setVisible(false);
            lTB54.setVisible(false);
            }
            });
            lBoard.add(lT64);
            
            lT74 = new JLabel();
            lT74.setBounds(700, 400, 100, 100);
            lT74.setBackground(Color.GREEN);
            lT74.setBorder(border);
            lT74.setVisible(true);
            lT74.setOpaque(true);
            lT74.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            lTW74.setVisible(true);
            lT74.setVisible(false);
            }
            });
            lBoard.add(lT74);
            
            lT84 = new JLabel();
            lT84.setBounds(800, 400, 100, 100);
            lT84.setBackground(Color.GREEN);
            lT84.setBorder(border);
            lT84.setVisible(true);
            lT84.setOpaque(true);
            lBoard.add(lT84);
            
            lT15 = new JLabel();
            lT15.setBounds(100, 500, 100, 100);
            lT15.setBackground(Color.GREEN);
            lT15.setBorder(border);
            lT15.setVisible(true);
            lT15.setOpaque(true);
            lBoard.add(lT15);
            
            lT25 = new JLabel();
            lT25.setBounds(200, 500, 100, 100);
            lT25.setBackground(Color.GREEN);
            lT25.setBorder(border);
            lT25.setVisible(true);
            lT25.setOpaque(true);
            lBoard.add(lT25);
            
            lT35 = new JLabel();
            lT35.setBounds(300, 500, 100, 100);
            lT35.setBackground(Color.GREEN);
            lT35.setBorder(border);
            lT35.setVisible(true);
            lT35.setOpaque(true);
            lBoard.add(lT35);
            
            lT65 = new JLabel();
            lT65.setBounds(600, 500, 100, 100);
            lT65.setBackground(Color.GREEN);
            lT65.setBorder(border);
            lT65.setVisible(true);
            lT65.setOpaque(true);
            lBoard.add(lT65);
            
            lT75 = new JLabel();
            lT75.setBounds(700, 500, 100, 100);
            lT75.setBackground(Color.GREEN);
            lT75.setBorder(border);
            lT75.setVisible(true);
            lT75.setOpaque(true);
            lBoard.add(lT75);
            
            lT85 = new JLabel();
            lT85.setBounds(800, 500, 100, 100);
            lT85.setBackground(Color.GREEN);
            lT85.setBorder(border);
            lT85.setVisible(true);
            lT85.setOpaque(true);
            lBoard.add(lT85);
            
            lT16 = new JLabel();
            lT16.setBounds(100, 600, 100, 100);
            lT16.setBackground(Color.GREEN);
            lT16.setBorder(border);
            lT16.setVisible(true);
            lT16.setOpaque(true);
            lBoard.add(lT16);
            
            lT26 = new JLabel();
            lT26.setBounds(200, 600, 100, 100);
            lT26.setBackground(Color.GREEN);
            lT26.setBorder(border);
            lT26.setVisible(true);
            lT26.setOpaque(true);
            lBoard.add(lT26);
            
            lT36 = new JLabel();
            lT36.setBounds(300, 600, 100, 100);
            lT36.setBackground(Color.GREEN);
            lT36.setBorder(border);
            lT36.setVisible(true);
            lT36.setOpaque(true);
            lBoard.add(lT36);
            
            lT46 = new JLabel();
            lT46.setBounds(400, 600, 100, 100);
            lT46.setBackground(Color.GREEN);
            lT46.setBorder(border);
            lT46.setVisible(true);
            lT46.setOpaque(true);
            lBoard.add(lT46);
            
            lT56 = new JLabel();
            lT56.setBounds(500, 600, 100, 100);
            lT56.setBackground(Color.GREEN);
            lT56.setBorder(border);
            lT56.setVisible(true);
            lT56.setOpaque(true);
            lBoard.add(lT56);
            
            lT66 = new JLabel();
            lT66.setBounds(600, 600, 100, 100);
            lT66.setBackground(Color.GREEN);
            lT66.setBorder(border);
            lT66.setVisible(true);
            lT66.setOpaque(true);
            lBoard.add(lT66);
            
            lT76 = new JLabel();
            lT76.setBounds(700, 600, 100, 100);
            lT76.setBackground(Color.GREEN);
            lT76.setBorder(border);
            lT76.setVisible(true);
            lT76.setOpaque(true);
            lBoard.add(lT76);
            
            lT86 = new JLabel();
            lT86.setBounds(800, 600, 100, 100);
            lT86.setBackground(Color.GREEN);
            lT86.setBorder(border);
            lT86.setVisible(true);
            lT86.setOpaque(true);
            lBoard.add(lT86);
            
            lT17 = new JLabel();
            lT17.setBounds(100, 700, 100, 100);
            lT17.setBackground(Color.GREEN);
            lT17.setBorder(border);
            lT17.setVisible(true);
            lT17.setOpaque(true);
            lBoard.add(lT17);
            
            lT27 = new JLabel();
            lT27.setBounds(200, 700, 100, 100);
            lT27.setBackground(Color.GREEN);
            lT27.setBorder(border);
            lT27.setVisible(true);
            lT27.setOpaque(true);
            lBoard.add(lT27);
            
            lT37 = new JLabel();
            lT37.setBounds(300, 700, 100, 100);
            lT37.setBackground(Color.GREEN);
            lT37.setBorder(border);
            lT37.setVisible(true);
            lT37.setOpaque(true);
            lBoard.add(lT37);
            
            lT47 = new JLabel();
            lT47.setBounds(400, 700, 100, 100);
            lT47.setBackground(Color.GREEN);
            lT47.setBorder(border);
            lT47.setVisible(true);
            lT47.setOpaque(true);
            lBoard.add(lT47);
            
            lT57 = new JLabel();
            lT57.setBounds(500, 700, 100, 100);
            lT57.setBackground(Color.GREEN);
            lT57.setBorder(border);
            lT57.setVisible(true);
            lT57.setOpaque(true);
            lBoard.add(lT57);
            
            lT67 = new JLabel();
            lT67.setBounds(600, 700, 100, 100);
            lT67.setBackground(Color.GREEN);
            lT67.setBorder(border);
            lT67.setVisible(true);
            lT67.setOpaque(true);
            lBoard.add(lT67);
            
            lT77 = new JLabel();
            lT77.setBounds(700, 700, 100, 100);
            lT77.setBackground(Color.GREEN);
            lT77.setBorder(border);
            lT77.setVisible(true);
            lT77.setOpaque(true);
            lBoard.add(lT77);
            
            lT87 = new JLabel();
            lT87.setBounds(800, 700, 100, 100);
            lT87.setBackground(Color.GREEN);
            lT87.setBorder(border);
            lT87.setVisible(true);
            lT87.setOpaque(true);
            lBoard.add(lT87);
            
            lT18 = new JLabel();
            lT18.setBounds(100, 800, 100, 100);
            lT18.setBackground(Color.GREEN);
            lT18.setBorder(border);
            lT18.setVisible(true);
            lT18.setOpaque(true);
            lBoard.add(lT18);
            
            lT28 = new JLabel();
            lT28.setBounds(200, 800, 100, 100);
            lT28.setBackground(Color.GREEN);
            lT28.setBorder(border);
            lT28.setVisible(true);
            lT28.setOpaque(true);
            lBoard.add(lT28);
            
            lT38 = new JLabel();
            lT38.setBounds(300, 800, 100, 100);
            lT38.setBackground(Color.GREEN);
            lT38.setBorder(border);
            lT38.setVisible(true);
            lT38.setOpaque(true);
            lBoard.add(lT38);
            
            lT48 = new JLabel();
            lT48.setBounds(400, 800, 100, 100);
            lT48.setBackground(Color.GREEN);
            lT48.setBorder(border);
            lT48.setVisible(true);
            lT48.setOpaque(true);
            lBoard.add(lT48);
            
            lT58 = new JLabel();
            lT58.setBounds(500, 800, 100, 100);
            lT58.setBackground(Color.GREEN);
            lT58.setBorder(border);
            lT58.setVisible(true);
            lT58.setOpaque(true);
            lBoard.add(lT58);
            
            lT68 = new JLabel();
            lT68.setBounds(600, 800, 100, 100);
            lT68.setBackground(Color.GREEN);
            lT68.setBorder(border);
            lT68.setVisible(true);
            lT68.setOpaque(true);
            lBoard.add(lT68);
            
            lT78 = new JLabel();
            lT78.setBounds(700, 800, 100, 100);
            lT78.setBackground(Color.GREEN);
            lT78.setBorder(border);
            lT78.setVisible(true);
            lT78.setOpaque(true);
            lBoard.add(lT78);
            
            lT88 = new JLabel();
            lT88.setBounds(800, 800, 100, 100);
            lT88.setBackground(Color.GREEN);
            lT88.setBorder(border);
            lT88.setVisible(true);
            lT88.setOpaque(true);
            lBoard.add(lT88);
            
            lTW44 = new JLabel();
            lTW44.setBounds(400, 400, 100, 100);
            lTW44.setBackground(Color.GREEN);
            lTW44.setBorder(border);
            lTW44.setIcon(WD);
            lTW44.setVisible(true);            
            lTW44.setOpaque(true);
            lBoard.add(lTW44);
            
            lTW45 = new JLabel();
            lTW45.setBounds(400, 500, 100, 100);
            lTW45.setBackground(Color.GREEN);
            lTW45.setBorder(border);
            lTW45.setIcon(WD);
            lTW45.setVisible(false);
            lTW45.setOpaque(true);
            lBoard.add(lTW45);
            
            lTW54 = new JLabel();
            lTW54.setBounds(500, 400, 100, 100);
            lTW54.setBackground(Color.GREEN);
            lTW54.setBorder(border);
            lTW54.setIcon(WD);
            lTW54.setVisible(false);
            lTW54.setOpaque(true);
            lBoard.add(lTW54);
            
            lTW55 = new JLabel();
            lTW55.setBounds(500, 500, 100, 100);
            lTW55.setBackground(Color.GREEN);
            lTW55.setBorder(border);
            lTW55.setIcon(WD);
            lTW55.setVisible(true);
            lTW55.setOpaque(true);            
            lBoard.add(lTW55);
            
            lTW11 = new JLabel();
            lTW11.setBounds(100, 100, 100, 100);
            lTW11.setBackground(Color.GREEN);
            lTW11.setBorder(border);
            lTW11.setIcon(WD);
            lTW11.setVisible(false);
            lTW11.setOpaque(true);
            lTW11.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            lTB11.setVisible(true);
            lTW11.setVisible(false);
            }
        });
            lBoard.add(lTW11);
            
            lTW21 = new JLabel();
            lTW21.setBounds(200, 100, 100, 100);
            lTW21.setBackground(Color.GREEN);
            lTW21.setBorder(border);
            lTW21.setIcon(WD);
            lTW21.setVisible(false);
            lTW21.setOpaque(true);            
            lBoard.add(lTW21);
            
            lTW31 = new JLabel();
            lTW31.setBounds(300, 100, 100, 100);
            lTW31.setBackground(Color.GREEN);
            lTW31.setBorder(border);
            lTW31.setIcon(WD);
            lTW31.setVisible(false);
            lTW31.setOpaque(true);            
            lBoard.add(lTW31);
            
            lTW41 = new JLabel();
            lTW41.setBounds(400, 100, 100, 100);
            lTW41.setBackground(Color.GREEN);
            lTW41.setBorder(border);
            lTW41.setIcon(WD);
            lTW41.setVisible(false);
            lTW41.setOpaque(true);            
            lBoard.add(lTW41);
            
            lTW51 = new JLabel();
            lTW51.setBounds(500, 100, 100, 100);
            lTW51.setBackground(Color.GREEN);
            lTW51.setBorder(border);
            lTW51.setIcon(WD);
            lTW51.setVisible(false);
            lTW51.setOpaque(true);
            lBoard.add(lTW51);
            
            lTW61 = new JLabel();
            lTW61.setBounds(600, 100, 100, 100);
            lTW61.setBackground(Color.GREEN);
            lTW61.setBorder(border);
            lTW61.setIcon(WD);
            lTW61.setVisible(false);
            lTW61.setOpaque(true);
            lBoard.add(lTW61);
            
            lTW71 = new JLabel();
            lTW71.setBounds(700, 100, 100, 100);
            lTW71.setBackground(Color.GREEN);
            lTW71.setBorder(border);
            lTW71.setIcon(WD);
            lTW71.setVisible(false);
            lTW71.setOpaque(true);
            lBoard.add(lTW71);
            
            lTW81 = new JLabel();
            lTW81.setBounds(800, 100, 100, 100);
            lTW81.setBackground(Color.GREEN);
            lTW81.setBorder(border);
            lTW81.setIcon(WD);
            lTW81.setVisible(false);
            lTW81.setOpaque(true);
            lBoard.add(lTW81);
            
            lTW12 = new JLabel();
            lTW12.setBounds(100, 200, 100, 100);
            lTW12.setBackground(Color.GREEN);
            lTW12.setBorder(border);
            lTW12.setIcon(WD);
            lTW12.setVisible(false);
            lTW12.setOpaque(true);
            lBoard.add(lTW12);
            
            lTW22 = new JLabel();
            lTW22.setBounds(200, 200, 100, 100);
            lTW22.setBackground(Color.GREEN);
            lTW22.setBorder(border);
            lTW22.setIcon(WD);
            lTW22.setVisible(false);
            lTW22.setOpaque(true);
            lBoard.add(lTW22);
            
            lTW32 = new JLabel();
            lTW32.setBounds(300, 200, 100, 100);
            lTW32.setBackground(Color.GREEN);
            lTW32.setBorder(border);
            lTW32.setIcon(WD);
            lTW32.setVisible(false);
            lTW32.setOpaque(true);
            lBoard.add(lTW32);
            
            lTW42 = new JLabel();
            lTW42.setBounds(400, 200, 100, 100);
            lTW42.setBackground(Color.GREEN);
            lTW42.setBorder(border);
            lTW42.setIcon(WD);
            lTW42.setVisible(false);
            lTW42.setOpaque(true);
            lBoard.add(lTW42);
            
            lTW52 = new JLabel();
            lTW52.setBounds(500, 200, 100, 100);
            lTW52.setBackground(Color.GREEN);
            lTW52.setBorder(border);
            lTW52.setIcon(WD);
            lTW52.setVisible(false);
            lTW52.setOpaque(true);
            lBoard.add(lTW52);
            
            lTW62 = new JLabel();
            lTW62.setBounds(600, 200, 100, 100);
            lTW62.setBackground(Color.GREEN);
            lTW62.setBorder(border);
            lTW62.setIcon(WD);
            lTW62.setVisible(false);
            lTW62.setOpaque(true);
            lBoard.add(lTW62);
            
            lTW72 = new JLabel();
            lTW72.setBounds(700, 200, 100, 100);
            lTW72.setBackground(Color.GREEN);
            lTW72.setBorder(border);
            lTW72.setIcon(WD);
            lTW72.setVisible(false);
            lTW72.setOpaque(true);
            lBoard.add(lTW72);
            
            lTW82 = new JLabel();
            lTW82.setBounds(800, 200, 100, 100);
            lTW82.setBackground(Color.GREEN);
            lTW82.setBorder(border);
            lTW82.setIcon(WD);
            lTW82.setVisible(false);
            lTW82.setOpaque(true);
            lBoard.add(lTW82);
            
            lTW13 = new JLabel();
            lTW13.setBounds(100, 300, 100, 100);
            lTW13.setBackground(Color.GREEN);
            lTW13.setBorder(border);
            lTW13.setIcon(WD);
            lTW13.setVisible(false);
            lTW13.setOpaque(true);
            lBoard.add(lTW13);
            
            lTW23 = new JLabel();
            lTW23.setBounds(200, 300, 100, 100);
            lTW23.setBackground(Color.GREEN);
            lTW23.setBorder(border);
            lTW23.setIcon(WD);
            lTW23.setVisible(false);
            lTW23.setOpaque(true);
            lBoard.add(lTW23);
            
            lTW33 = new JLabel();
            lTW33.setBounds(300, 300, 100, 100);
            lTW33.setBackground(Color.GREEN);
            lTW33.setBorder(border);
            lTW33.setIcon(WD);
            lTW33.setVisible(false);
            lTW33.setOpaque(true);
            lBoard.add(lTW33);
            
            lTW43 = new JLabel();
            lTW43.setBounds(400, 300, 100, 100);
            lTW43.setBackground(Color.GREEN);
            lTW43.setBorder(border);
            lTW43.setIcon(WD);
            lTW43.setVisible(false);
            lTW43.setOpaque(true);
            lBoard.add(lTW43);
            
            lTW53 = new JLabel();
            lTW53.setBounds(500, 300, 100, 100);
            lTW53.setBackground(Color.GREEN);
            lTW53.setBorder(border);
            lTW53.setIcon(WD);
            lTW53.setVisible(false);
            lTW53.setOpaque(true);
            lBoard.add(lTW53);
            
            lTW63 = new JLabel();
            lTW63.setBounds(600, 300, 100, 100);
            lTW63.setBackground(Color.GREEN);
            lTW63.setBorder(border);
            lTW63.setIcon(WD);
            lTW63.setVisible(false);
            lTW63.setOpaque(true);
            lBoard.add(lTW63);
            
            lTW73 = new JLabel();
            lTW73.setBounds(700, 300, 100, 100);
            lTW73.setBackground(Color.GREEN);
            lTW73.setBorder(border);
            lTW73.setIcon(WD);
            lTW73.setVisible(false);
            lTW73.setOpaque(true);
            lBoard.add(lTW73);
            
            lTW83 = new JLabel();
            lTW83.setBounds(800, 300, 100, 100);
            lTW83.setBackground(Color.GREEN);
            lTW83.setBorder(border);
            lTW83.setIcon(WD);
            lTW83.setVisible(false);
            lTW83.setOpaque(true);
            lBoard.add(lTW83);
            
            lTW14 = new JLabel();
            lTW14.setBounds(100, 400, 100, 100);
            lTW14.setBackground(Color.GREEN);
            lTW14.setBorder(border);
            lTW14.setIcon(WD);
            lTW14.setVisible(false);
            lTW14.setOpaque(true);
            lBoard.add(lTW14);
            
            lTW24 = new JLabel();
            lTW24.setBounds(200, 400, 100, 100);
            lTW24.setBackground(Color.GREEN);
            lTW24.setBorder(border);
            lTW24.setIcon(WD);
            lTW24.setVisible(false);
            lTW24.setOpaque(true);
            lBoard.add(lTW24);
            
            lTW34 = new JLabel();
            lTW34.setBounds(300, 400, 100, 100);
            lTW34.setBackground(Color.GREEN);
            lTW34.setBorder(border);
            lTW34.setIcon(WD);
            lTW34.setVisible(false);
            lTW34.setOpaque(true);
            lBoard.add(lTW34);
                                    
            lTW64 = new JLabel();
            lTW64.setBounds(600, 400, 100, 100);
            lTW64.setBackground(Color.GREEN);
            lTW64.setBorder(border);
            lTW64.setIcon(WD);
            lTW64.setVisible(false);
            lTW64.setOpaque(true);
            lBoard.add(lTW64);
            
            lTW74 = new JLabel();
            lTW74.setBounds(700, 400, 100, 100);
            lTW74.setBackground(Color.GREEN);
            lTW74.setBorder(border);
            lTW74.setIcon(WD);
            lTW74.setVisible(false);
            lTW74.setOpaque(true);
            lBoard.add(lTW74);
            
            lTW84 = new JLabel();
            lTW84.setBounds(800, 400, 100, 100);
            lTW84.setBackground(Color.GREEN);
            lTW84.setBorder(border);
            lTW84.setIcon(WD);
            lTW84.setVisible(false);
            lTW84.setOpaque(true);
            lBoard.add(lTW84);
            
            lTW15 = new JLabel();
            lTW15.setBounds(100, 500, 100, 100);
            lTW15.setBackground(Color.GREEN);
            lTW15.setBorder(border);
            lTW15.setIcon(WD);
            lTW15.setVisible(false);
            lTW15.setOpaque(true);
            lBoard.add(lTW15);
            
            lTW25 = new JLabel();
            lTW25.setBounds(200, 500, 100, 100);
            lTW25.setBackground(Color.GREEN);
            lTW25.setBorder(border);
            lTW25.setIcon(WD);
            lTW25.setVisible(false);
            lTW25.setOpaque(true);
            lBoard.add(lTW25);
            
            lTW35 = new JLabel();
            lTW35.setBounds(300, 500, 100, 100);
            lTW35.setBackground(Color.GREEN);
            lTW35.setBorder(border);
            lTW35.setIcon(WD);
            lTW35.setVisible(false);
            lTW35.setOpaque(true);
            lBoard.add(lTW35);
            
            lTW65 = new JLabel();
            lTW65.setBounds(600, 500, 100, 100);
            lTW65.setBackground(Color.GREEN);
            lTW65.setBorder(border);
            lTW65.setIcon(WD);
            lTW65.setVisible(false);
            lTW65.setOpaque(true);
            lBoard.add(lTW65);
            
            lTW75 = new JLabel();
            lTW75.setBounds(700, 500, 100, 100);
            lTW75.setBackground(Color.GREEN);
            lTW75.setBorder(border);
            lTW75.setIcon(WD);
            lTW75.setVisible(false);
            lTW75.setOpaque(true);
            lBoard.add(lTW75);
            
            lTW85 = new JLabel();
            lTW85.setBounds(800, 500, 100, 100);
            lTW85.setBackground(Color.GREEN);
            lTW85.setBorder(border);
            lTW85.setIcon(WD);
            lTW85.setVisible(false);
            lTW85.setOpaque(true);
            lBoard.add(lTW85);
            
            lTW16 = new JLabel();
            lTW16.setBounds(100, 600, 100, 100);
            lTW16.setBackground(Color.GREEN);
            lTW16.setBorder(border);
            lTW16.setIcon(WD);
            lTW16.setVisible(false);
            lTW16.setOpaque(true);
            lBoard.add(lTW16);
            
            lTW26 = new JLabel();
            lTW26.setBounds(200, 600, 100, 100);
            lTW26.setBackground(Color.GREEN);
            lTW26.setBorder(border);
            lTW26.setIcon(WD);
            lTW26.setVisible(false);
            lTW26.setOpaque(true);
            lBoard.add(lTW26);
            
            lTW36 = new JLabel();
            lTW36.setBounds(300, 600, 100, 100);
            lTW36.setBackground(Color.GREEN);
            lTW36.setBorder(border);
            lTW36.setIcon(WD);
            lTW36.setVisible(false);
            lTW36.setOpaque(true);
            lBoard.add(lTW36);
            
            lTW46 = new JLabel();
            lTW46.setBounds(400, 600, 100, 100);
            lTW46.setBackground(Color.GREEN);
            lTW46.setBorder(border);
            lTW46.setIcon(WD);
            lTW46.setVisible(false);
            lTW46.setOpaque(true);
            lBoard.add(lTW46);
            
            lTW56 = new JLabel();
            lTW56.setBounds(500, 600, 100, 100);
            lTW56.setBackground(Color.GREEN);
            lTW56.setBorder(border);
            lTW56.setIcon(WD);
            lTW56.setVisible(false);
            lTW56.setOpaque(true);
            lBoard.add(lTW56);
            
            lTW66 = new JLabel();
            lTW66.setBounds(600, 600, 100, 100);
            lTW66.setBackground(Color.GREEN);
            lTW66.setBorder(border);
            lTW66.setIcon(WD);
            lTW66.setVisible(false);
            lTW66.setOpaque(true);
            lBoard.add(lTW66);
            
            lTW76 = new JLabel();
            lTW76.setBounds(700, 600, 100, 100);
            lTW76.setBackground(Color.GREEN);
            lTW76.setBorder(border);
            lTW76.setIcon(WD);
            lTW76.setVisible(false);
            lTW76.setOpaque(true);
            lBoard.add(lTW76);
            
            lTW86 = new JLabel();
            lTW86.setBounds(800, 600, 100, 100);
            lTW86.setBackground(Color.GREEN);
            lTW86.setBorder(border);
            lTW86.setIcon(WD);
            lTW86.setVisible(false);
            lTW86.setOpaque(true);
            lBoard.add(lTW86);
            
            lTW17 = new JLabel();
            lTW17.setBounds(100, 700, 100, 100);
            lTW17.setBackground(Color.GREEN);
            lTW17.setBorder(border);
            lTW17.setIcon(WD);
            lTW17.setVisible(false);
            lTW17.setOpaque(true);
            lBoard.add(lTW17);
            
            lTW27 = new JLabel();
            lTW27.setBounds(200, 700, 100, 100);
            lTW27.setBackground(Color.GREEN);
            lTW27.setBorder(border);
            lTW27.setIcon(WD);
            lTW27.setVisible(false);
            lTW27.setOpaque(true);
            lBoard.add(lTW27);
            
            lTW37 = new JLabel();
            lTW37.setBounds(300, 700, 100, 100);
            lTW37.setBackground(Color.GREEN);
            lTW37.setBorder(border);
            lTW37.setIcon(WD);
            lTW37.setVisible(false);
            lTW37.setOpaque(true);
            lBoard.add(lTW37);
            
            lTW47 = new JLabel();
            lTW47.setBounds(400, 700, 100, 100);
            lTW47.setBackground(Color.GREEN);
            lTW47.setBorder(border);
            lTW47.setIcon(WD);
            lTW47.setVisible(false);
            lTW47.setOpaque(true);
            lBoard.add(lTW47);
            
            lTW57 = new JLabel();
            lTW57.setBounds(500, 700, 100, 100);
            lTW57.setBackground(Color.GREEN);
            lTW57.setBorder(border);
            lTW57.setIcon(WD);
            lTW57.setVisible(false);
            lTW57.setOpaque(true);
            lBoard.add(lTW57);
            
            lTW67 = new JLabel();
            lTW67.setBounds(600, 700, 100, 100);
            lTW67.setBackground(Color.GREEN);
            lTW67.setBorder(border);
            lTW67.setIcon(WD);
            lTW67.setVisible(false);
            lTW67.setOpaque(true);
            lBoard.add(lTW67);
            
            lTW77 = new JLabel();
            lTW77.setBounds(700, 700, 100, 100);
            lTW77.setBackground(Color.GREEN);
            lTW77.setBorder(border);
            lTW77.setIcon(WD);
            lTW77.setVisible(false);
            lTW77.setOpaque(true);
            lBoard.add(lTW77);
            
            lTW87 = new JLabel();
            lTW87.setBounds(800, 700, 100, 100);
            lTW87.setBackground(Color.GREEN);
            lTW87.setBorder(border);
            lTW87.setIcon(WD);
            lTW87.setVisible(false);
            lTW87.setOpaque(true);
            lBoard.add(lTW87);
            
            lTW18 = new JLabel();
            lTW18.setBounds(100, 800, 100, 100);
            lTW18.setBackground(Color.GREEN);
            lTW18.setBorder(border);
            lTW18.setIcon(WD);
            lTW18.setVisible(false);
            lTW18.setOpaque(true);
            lBoard.add(lTW18);
            
            lTW28 = new JLabel();
            lTW28.setBounds(200, 800, 100, 100);
            lTW28.setBackground(Color.GREEN);
            lTW28.setBorder(border);
            lTW28.setIcon(WD);
            lTW28.setVisible(false);
            lTW28.setOpaque(true);
            lBoard.add(lTW28);
            
            lTW38 = new JLabel();
            lTW38.setBounds(300, 800, 100, 100);
            lTW38.setBackground(Color.GREEN);
            lTW38.setBorder(border);
            lTW38.setIcon(WD);
            lTW38.setVisible(false);
            lTW38.setOpaque(true);
            lBoard.add(lTW38);
            
            lTW48 = new JLabel();
            lTW48.setBounds(400, 800, 100, 100);
            lTW48.setBackground(Color.GREEN);
            lTW48.setBorder(border);
            lTW48.setIcon(WD);
            lTW48.setVisible(false);
            lTW48.setOpaque(true);
            lBoard.add(lTW48);
            
            lTW58 = new JLabel();
            lTW58.setBounds(500, 800, 100, 100);
            lTW58.setBackground(Color.GREEN);
            lTW58.setBorder(border);
            lTW58.setIcon(WD);
            lTW58.setVisible(false);
            lTW58.setOpaque(true);
            lBoard.add(lTW58);
            
            lTW68 = new JLabel();
            lTW68.setBounds(600, 800, 100, 100);
            lTW68.setBackground(Color.GREEN);
            lTW68.setBorder(border);
            lTW68.setIcon(WD);
            lTW68.setVisible(false);
            lTW68.setOpaque(true);
            lBoard.add(lTW68);
            
            lTW78 = new JLabel();
            lTW78.setBounds(700, 800, 100, 100);
            lTW78.setBackground(Color.GREEN);
            lTW78.setBorder(border);
            lTW78.setIcon(WD);
            lTW78.setVisible(false);
            lTW78.setOpaque(true);
            lBoard.add(lTW78);
            
            lTW88 = new JLabel();
            lTW88.setBounds(800, 800, 100, 100);
            lTW88.setBackground(Color.GREEN);
            lTW88.setBorder(border);
            lTW88.setIcon(WD);
            lTW88.setVisible(false);
            lTW88.setOpaque(true);
            lBoard.add(lTW88);
            
            lTB44 = new JLabel();
            lTB44.setBounds(400, 400, 100, 100);
            lTB44.setBackground(Color.GREEN);
            lTB44.setBorder(border);
            lTB44.setIcon(BD);
            lTB44.setVisible(false);            
            lTB44.setOpaque(true);
            lBoard.add(lTB44);
            
            lTB45 = new JLabel();
            lTB45.setBounds(400, 500, 100, 100);
            lTB45.setBackground(Color.GREEN);
            lTB45.setBorder(border);
            lTB45.setIcon(BD);
            lTB45.setVisible(true);
            lTB45.setOpaque(true);
            lBoard.add(lTB45);
            
            lTB54 = new JLabel();
            lTB54.setBounds(500, 400, 100, 100);
            lTB54.setBackground(Color.GREEN);
            lTB54.setBorder(border);
            lTB54.setIcon(BD);
            lTB54.setVisible(true);
            lTB54.setOpaque(true);
            lBoard.add(lTB54);
            
            lTB55 = new JLabel();
            lTB55.setBounds(500, 500, 100, 100);
            lTB55.setBackground(Color.GREEN);
            lTB55.setBorder(border);
            lTB55.setIcon(BD);
            lTB55.setVisible(false);
            lTB55.setOpaque(true);            
            lBoard.add(lTB55);
            
            lTB11 = new JLabel();
            lTB11.setBounds(100, 100, 100, 100);
            lTB11.setBackground(Color.GREEN);
            lTB11.setBorder(border);
            lTB11.setIcon(BD);
            lTB11.setVisible(false);
            lTB11.setOpaque(true);
            lBoard.add(lTB11);
            
            lTB21 = new JLabel();
            lTB21.setBounds(200, 100, 100, 100);
            lTB21.setBackground(Color.GREEN);
            lTB21.setBorder(border);
            lTB21.setIcon(BD);
            lTB21.setVisible(false);
            lTB21.setOpaque(true);            
            lBoard.add(lTB21);
            
            lTB31 = new JLabel();
            lTB31.setBounds(300, 100, 100, 100);
            lTB31.setBackground(Color.GREEN);
            lTB31.setBorder(border);
            lTB31.setIcon(BD);
            lTB31.setVisible(false);
            lTB31.setOpaque(true);            
            lBoard.add(lTB31);
            
            lTB41 = new JLabel();
            lTB41.setBounds(400, 100, 100, 100);
            lTB41.setBackground(Color.GREEN);
            lTB41.setBorder(border);
            lTB41.setIcon(BD);
            lTB41.setVisible(false);
            lTB41.setOpaque(true);            
            lBoard.add(lTB41);
            
            lTB51 = new JLabel();
            lTB51.setBounds(500, 100, 100, 100);
            lTB51.setBackground(Color.GREEN);
            lTB51.setBorder(border);
            lTB51.setIcon(BD);
            lTB51.setVisible(false);
            lTB51.setOpaque(true);
            lBoard.add(lTB51);
            
            lTB61 = new JLabel();
            lTB61.setBounds(600, 100, 100, 100);
            lTB61.setBackground(Color.GREEN);
            lTB61.setBorder(border);
            lTB61.setIcon(BD);
            lTB61.setVisible(false);
            lTB61.setOpaque(true);
            lBoard.add(lTB61);
            
            lTB71 = new JLabel();
            lTB71.setBounds(700, 100, 100, 100);
            lTB71.setBackground(Color.GREEN);
            lTB71.setBorder(border);
            lTB71.setIcon(BD);
            lTB71.setVisible(false);
            lTB71.setOpaque(true);
            lBoard.add(lTB71);
            
            lTB81 = new JLabel();
            lTB81.setBounds(800, 100, 100, 100);
            lTB81.setBackground(Color.GREEN);
            lTB81.setBorder(border);
            lTB81.setIcon(BD);
            lTB81.setVisible(false);
            lTB81.setOpaque(true);
            lBoard.add(lTB81);
            
            lTB12 = new JLabel();
            lTB12.setBounds(100, 200, 100, 100);
            lTB12.setBackground(Color.GREEN);
            lTB12.setBorder(border);
            lTB12.setIcon(BD);
            lTB12.setVisible(false);
            lTB12.setOpaque(true);
            lBoard.add(lTB12);
            
            lTB22 = new JLabel();
            lTB22.setBounds(200, 200, 100, 100);
            lTB22.setBackground(Color.GREEN);
            lTB22.setBorder(border);
            lTB22.setIcon(BD);
            lTB22.setVisible(false);
            lTB22.setOpaque(true);
            lBoard.add(lTB22);
            
            lTB32 = new JLabel();
            lTB32.setBounds(300, 200, 100, 100);
            lTB32.setBackground(Color.GREEN);
            lTB32.setBorder(border);
            lTB32.setIcon(BD);
            lTB32.setVisible(false);
            lTB32.setOpaque(true);
            lBoard.add(lTB32);
            
            lTB42 = new JLabel();
            lTB42.setBounds(400, 200, 100, 100);
            lTB42.setBackground(Color.GREEN);
            lTB42.setBorder(border);
            lTB42.setIcon(BD);
            lTB42.setVisible(false);
            lTB42.setOpaque(true);
            lBoard.add(lTB42);
            
            lTB52 = new JLabel();
            lTB52.setBounds(500, 200, 100, 100);
            lTB52.setBackground(Color.GREEN);
            lTB52.setBorder(border);
            lTB52.setIcon(BD);
            lTB52.setVisible(false);
            lTB52.setOpaque(true);
            lBoard.add(lTB52);
            
            lTB62 = new JLabel();
            lTB62.setBounds(600, 200, 100, 100);
            lTB62.setBackground(Color.GREEN);
            lTB62.setBorder(border);
            lTB62.setIcon(BD);
            lTB62.setVisible(false);
            lTB62.setOpaque(true);
            lBoard.add(lTB62);
            
            lTB72 = new JLabel();
            lTB72.setBounds(700, 200, 100, 100);
            lTB72.setBackground(Color.GREEN);
            lTB72.setBorder(border);
            lTB72.setIcon(BD);
            lTB72.setVisible(false);
            lTB72.setOpaque(true);
            lBoard.add(lTB72);
            
            lTB82 = new JLabel();
            lTB82.setBounds(800, 200, 100, 100);
            lTB82.setBackground(Color.GREEN);
            lTB82.setBorder(border);
            lTB82.setIcon(BD);
            lTB82.setVisible(false);
            lTB82.setOpaque(true);
            lBoard.add(lTB82);
            
            lTB13 = new JLabel();
            lTB13.setBounds(100, 300, 100, 100);
            lTB13.setBackground(Color.GREEN);
            lTB13.setBorder(border);
            lTB13.setIcon(BD);
            lTB13.setVisible(false);
            lTB13.setOpaque(true);
            lBoard.add(lTB13);
            
            lTB23 = new JLabel();
            lTB23.setBounds(200, 300, 100, 100);
            lTB23.setBackground(Color.GREEN);
            lTB23.setBorder(border);
            lTB23.setIcon(BD);
            lTB23.setVisible(false);
            lTB23.setOpaque(true);
            lBoard.add(lTB23);
            
            lTB33 = new JLabel();
            lTB33.setBounds(300, 300, 100, 100);
            lTB33.setBackground(Color.GREEN);
            lTB33.setBorder(border);
            lTB33.setIcon(BD);
            lTB33.setVisible(false);
            lTB33.setOpaque(true);
            lBoard.add(lTB33);
            
            lTB43 = new JLabel();
            lTB43.setBounds(400, 300, 100, 100);
            lTB43.setBackground(Color.GREEN);
            lTB43.setBorder(border);
            lTB43.setIcon(BD);
            lTB43.setVisible(false);
            lTB43.setOpaque(true);
            lBoard.add(lTB43);
            
            lTB53 = new JLabel();
            lTB53.setBounds(500, 300, 100, 100);
            lTB53.setBackground(Color.GREEN);
            lTB53.setBorder(border);
            lTB53.setIcon(BD);
            lTB53.setVisible(false);
            lTB53.setOpaque(true);
            lBoard.add(lTB53);
            
            lTB63 = new JLabel();
            lTB63.setBounds(600, 300, 100, 100);
            lTB63.setBackground(Color.GREEN);
            lTB63.setBorder(border);
            lTB63.setIcon(BD);
            lTB63.setVisible(false);
            lTB63.setOpaque(true);
            lBoard.add(lTB63);
            
            lTB73 = new JLabel();
            lTB73.setBounds(700, 300, 100, 100);
            lTB73.setBackground(Color.GREEN);
            lTB73.setBorder(border);
            lTB73.setIcon(BD);
            lTB73.setVisible(false);
            lTB73.setOpaque(true);
            lBoard.add(lTB73);
            
            lTB83 = new JLabel();
            lTB83.setBounds(800, 300, 100, 100);
            lTB83.setBackground(Color.GREEN);
            lTB83.setBorder(border);
            lTB83.setIcon(BD);
            lTB83.setVisible(false);
            lTB83.setOpaque(true);
            lBoard.add(lTB83);
            
            lTB14 = new JLabel();
            lTB14.setBounds(100, 400, 100, 100);
            lTB14.setBackground(Color.GREEN);
            lTB14.setBorder(border);
            lTB14.setIcon(BD);
            lTB14.setVisible(false);
            lTB14.setOpaque(true);
            lBoard.add(lTB14);
            
            lTB24 = new JLabel();
            lTB24.setBounds(200, 400, 100, 100);
            lTB24.setBackground(Color.GREEN);
            lTB24.setBorder(border);
            lTB24.setIcon(BD);
            lTB24.setVisible(false);
            lTB24.setOpaque(true);
            lBoard.add(lTB24);
            
            lTB34 = new JLabel();
            lTB34.setBounds(300, 400, 100, 100);
            lTB34.setBackground(Color.GREEN);
            lTB34.setBorder(border);
            lTB34.setIcon(BD);
            lTB34.setVisible(false);
            lTB34.setOpaque(true);
            lBoard.add(lTB34);
                                    
            lTB64 = new JLabel();
            lTB64.setBounds(600, 400, 100, 100);
            lTB64.setBackground(Color.GREEN);
            lTB64.setBorder(border);
            lTB64.setIcon(BD);
            lTB64.setVisible(false);
            lTB64.setOpaque(true);
            lBoard.add(lTB64);
            
            lTB74 = new JLabel();
            lTB74.setBounds(700, 400, 100, 100);
            lTB74.setBackground(Color.GREEN);
            lTB74.setBorder(border);
            lTB74.setIcon(BD);
            lTB74.setVisible(false);
            lTB74.setOpaque(true);
            lBoard.add(lTB74);
            
            lTB84 = new JLabel();
            lTB84.setBounds(800, 400, 100, 100);
            lTB84.setBackground(Color.GREEN);
            lTB84.setBorder(border);
            lTB84.setIcon(BD);
            lTB84.setVisible(false);
            lTB84.setOpaque(true);
            lBoard.add(lTB84);
            
            lTB15 = new JLabel();
            lTB15.setBounds(100, 500, 100, 100);
            lTB15.setBackground(Color.GREEN);
            lTB15.setBorder(border);
            lTB15.setIcon(BD);
            lTB15.setVisible(false);
            lTB15.setOpaque(true);
            lBoard.add(lTB15);
            
            lTB25 = new JLabel();
            lTB25.setBounds(200, 500, 100, 100);
            lTB25.setBackground(Color.GREEN);
            lTB25.setBorder(border);
            lTB25.setIcon(BD);
            lTB25.setVisible(false);
            lTB25.setOpaque(true);
            lBoard.add(lTB25);
            
            lTB35 = new JLabel();
            lTB35.setBounds(300, 500, 100, 100);
            lTB35.setBackground(Color.GREEN);
            lTB35.setBorder(border);
            lTB35.setIcon(BD);
            lTB35.setVisible(false);
            lTB35.setOpaque(true);
            lBoard.add(lTB35);
            
            lTB65 = new JLabel();
            lTB65.setBounds(600, 500, 100, 100);
            lTB65.setBackground(Color.GREEN);
            lTB65.setBorder(border);
            lTB65.setIcon(BD);
            lTB65.setVisible(false);
            lTB65.setOpaque(true);
            lBoard.add(lTB65);
            
            lTB75 = new JLabel();
            lTB75.setBounds(700, 500, 100, 100);
            lTB75.setBackground(Color.GREEN);
            lTB75.setBorder(border);
            lTB75.setIcon(BD);
            lTB75.setVisible(false);
            lTB75.setOpaque(true);
            lBoard.add(lTB75);
            
            lTB85 = new JLabel();
            lTB85.setBounds(800, 500, 100, 100);
            lTB85.setBackground(Color.GREEN);
            lTB85.setBorder(border);
            lTB85.setIcon(BD);
            lTB85.setVisible(false);
            lTB85.setOpaque(true);
            lBoard.add(lTB85);
            
            lTB16 = new JLabel();
            lTB16.setBounds(100, 600, 100, 100);
            lTB16.setBackground(Color.GREEN);
            lTB16.setBorder(border);
            lTB16.setIcon(BD);
            lTB16.setVisible(false);
            lTB16.setOpaque(true);
            lBoard.add(lTB16);
            
            lTB26 = new JLabel();
            lTB26.setBounds(200, 600, 100, 100);
            lTB26.setBackground(Color.GREEN);
            lTB26.setBorder(border);
            lTB26.setIcon(BD);
            lTB26.setVisible(false);
            lTB26.setOpaque(true);
            lBoard.add(lTB26);
            
            lTB36 = new JLabel();
            lTB36.setBounds(300, 600, 100, 100);
            lTB36.setBackground(Color.GREEN);
            lTB36.setBorder(border);
            lTB36.setIcon(BD);
            lTB36.setVisible(false);
            lTB36.setOpaque(true);
            lBoard.add(lTB36);
            
            lTB46 = new JLabel();
            lTB46.setBounds(400, 600, 100, 100);
            lTB46.setBackground(Color.GREEN);
            lTB46.setBorder(border);
            lTB46.setIcon(BD);
            lTB46.setVisible(false);
            lTB46.setOpaque(true);
            lBoard.add(lTB46);
            
            lTB56 = new JLabel();
            lTB56.setBounds(500, 600, 100, 100);
            lTB56.setBackground(Color.GREEN);
            lTB56.setBorder(border);
            lTB56.setIcon(BD);
            lTB56.setVisible(false);
            lTB56.setOpaque(true);
            lBoard.add(lTB56);
            
            lTB66 = new JLabel();
            lTB66.setBounds(600, 600, 100, 100);
            lTB66.setBackground(Color.GREEN);
            lTB66.setBorder(border);
            lTB66.setIcon(BD);
            lTB66.setVisible(false);
            lTB66.setOpaque(true);
            lBoard.add(lTB66);
            
            lTB76 = new JLabel();
            lTB76.setBounds(700, 600, 100, 100);
            lTB76.setBackground(Color.GREEN);
            lTB76.setBorder(border);
            lTB76.setIcon(BD);
            lTB76.setVisible(false);
            lTB76.setOpaque(true);
            lBoard.add(lTB76);
            
            lTB86 = new JLabel();
            lTB86.setBounds(800, 600, 100, 100);
            lTB86.setBackground(Color.GREEN);
            lTB86.setBorder(border);
            lTB86.setIcon(BD);
            lTB86.setVisible(false);
            lTB86.setOpaque(true);
            lBoard.add(lTB86);
            
            lTB17 = new JLabel();
            lTB17.setBounds(100, 700, 100, 100);
            lTB17.setBackground(Color.GREEN);
            lTB17.setBorder(border);
            lTB17.setIcon(BD);
            lTB17.setVisible(false);
            lTB17.setOpaque(true);
            lBoard.add(lTB17);
            
            lTB27 = new JLabel();
            lTB27.setBounds(200, 700, 100, 100);
            lTB27.setBackground(Color.GREEN);
            lTB27.setBorder(border);
            lTB27.setIcon(BD);
            lTB27.setVisible(false);
            lTB27.setOpaque(true);
            lBoard.add(lTB27);
            
            lTB37 = new JLabel();
            lTB37.setBounds(300, 700, 100, 100);
            lTB37.setBackground(Color.GREEN);
            lTB37.setBorder(border);
            lTB37.setIcon(BD);
            lTB37.setVisible(false);
            lTB37.setOpaque(true);
            lBoard.add(lTB37);
            
            lTB47 = new JLabel();
            lTB47.setBounds(400, 700, 100, 100);
            lTB47.setBackground(Color.GREEN);
            lTB47.setBorder(border);
            lTB47.setIcon(BD);
            lTB47.setVisible(false);
            lTB47.setOpaque(true);
            lBoard.add(lTB47);
            
            lTB57 = new JLabel();
            lTB57.setBounds(500, 700, 100, 100);
            lTB57.setBackground(Color.GREEN);
            lTB57.setBorder(border);
            lTB57.setIcon(BD);
            lTB57.setVisible(false);
            lTB57.setOpaque(true);
            lBoard.add(lTB57);
            
            lTB67 = new JLabel();
            lTB67.setBounds(600, 700, 100, 100);
            lTB67.setBackground(Color.GREEN);
            lTB67.setBorder(border);
            lTB67.setIcon(BD);
            lTB67.setVisible(false);
            lTB67.setOpaque(true);
            lBoard.add(lTB67);
            
            lTB77 = new JLabel();
            lTB77.setBounds(700, 700, 100, 100);
            lTB77.setBackground(Color.GREEN);
            lTB77.setBorder(border);
            lTB77.setIcon(BD);
            lTB77.setVisible(false);
            lTB77.setOpaque(true);
            lBoard.add(lTB77);
            
            lTB87 = new JLabel();
            lTB87.setBounds(800, 700, 100, 100);
            lTB87.setBackground(Color.GREEN);
            lTB87.setBorder(border);
            lTB87.setIcon(BD);
            lTB87.setVisible(false);
            lTB87.setOpaque(true);
            lBoard.add(lTB87);
            
            lTB18 = new JLabel();
            lTB18.setBounds(100, 800, 100, 100);
            lTB18.setBackground(Color.GREEN);
            lTB18.setBorder(border);
            lTB18.setIcon(BD);
            lTB18.setVisible(false);
            lTB18.setOpaque(true);
            lBoard.add(lTB18);
            
            lTB28 = new JLabel();
            lTB28.setBounds(200, 800, 100, 100);
            lTB28.setBackground(Color.GREEN);
            lTB28.setBorder(border);
            lTB28.setIcon(BD);
            lTB28.setVisible(false);
            lTB28.setOpaque(true);
            lBoard.add(lTB28);
            
            lTB38 = new JLabel();
            lTB38.setBounds(300, 800, 100, 100);
            lTB38.setBackground(Color.GREEN);
            lTB38.setBorder(border);
            lTB38.setIcon(BD);
            lTB38.setVisible(false);
            lTB38.setOpaque(true);
            lBoard.add(lTB38);
            
            lTB48 = new JLabel();
            lTB48.setBounds(400, 800, 100, 100);
            lTB48.setBackground(Color.GREEN);
            lTB48.setBorder(border);
            lTB48.setIcon(BD);
            lTB48.setVisible(false);
            lTB48.setOpaque(true);
            lBoard.add(lTB48);
            
            lTB58 = new JLabel();
            lTB58.setBounds(500, 800, 100, 100);
            lTB58.setBackground(Color.GREEN);
            lTB58.setBorder(border);
            lTB58.setIcon(BD);
            lTB58.setVisible(false);
            lTB58.setOpaque(true);
            lBoard.add(lTB58);
            
            lTB68 = new JLabel();
            lTB68.setBounds(600, 800, 100, 100);
            lTB68.setBackground(Color.GREEN);
            lTB68.setBorder(border);
            lTB68.setIcon(BD);
            lTB68.setVisible(false);
            lTB68.setOpaque(true);
            lBoard.add(lTB68);
            
            lTB78 = new JLabel();
            lTB78.setBounds(700, 800, 100, 100);
            lTB78.setBackground(Color.GREEN);
            lTB78.setBorder(border);
            lTB78.setIcon(BD);
            lTB78.setVisible(false);
            lTB78.setOpaque(true);
            lBoard.add(lTB78);
            
            lTB88 = new JLabel();
            lTB88.setBounds(800, 800, 100, 100);
            lTB88.setBackground(Color.GREEN);
            lTB88.setBorder(border);
            lTB88.setIcon(BD);
            lTB88.setVisible(false);
            lTB88.setOpaque(true);
            lBoard.add(lTB88);
            
            pSingUp = new JPanel();
            pSingUp.setBounds(0, 0, 1000, 1000);
            pSingUp.setBackground(Color.PINK);
            pSingUp.setLayout(null);
            pSingUp.setVisible(false);
            this.add(pSingUp);
            
            lSingUp = new JLabel();
            lSingUp.setBounds(200, 100, 600, 800);
            lSingUp.setBackground(Color.WHITE);
            lSingUp.setOpaque(true);
            pSingUp.add(lSingUp);
            
            tFSingUpUN = new JTextField();
            tFSingUpUN.setBounds(250, 150, 250, 80);
            tFSingUpUN.setBackground(Color.LIGHT_GRAY);
            lSingUp.add(tFSingUpUN);
            
            PFSingUp = new JPasswordField();
            PFSingUp.setBounds(250, 350, 250, 80);
            PFSingUp.setBackground(Color.LIGHT_GRAY);
            lSingUp.add(PFSingUp);
            
            tFSingUpG = new JTextField();
            tFSingUpG.setBounds(250, 550, 250, 80);
            tFSingUpG.setBackground(Color.LIGHT_GRAY);
            lSingUp.add(tFSingUpG);
            
            lSingUpName = new JLabel("Name");
            lSingUpName.setBounds(100, 150, 100, 80);
            lSingUpName.setBackground(Color.BLUE);
            lSingUpName.setOpaque(true);
            lSingUpName.setFont(new Font("Font", 1, 20));
            lSingUp.add(lSingUpName);
            
            lSingUpPassword = new JLabel("Password");
            lSingUpPassword.setBounds(100, 350, 100, 80);
            lSingUpPassword.setBackground(Color.BLUE);
            lSingUpPassword.setOpaque(true);
            lSingUpPassword.setFont(new Font("Font", 1, 20));
            lSingUp.add(lSingUpPassword);
                       
            lSingUpGmail = new JLabel("Gmail");
            lSingUpGmail.setBounds(100, 550, 100, 80);
            lSingUpGmail.setBackground(Color.BLUE);
            lSingUpGmail.setOpaque(true);
            lSingUpGmail.setFont(new Font("Font", 1, 20));
            lSingUp.add(lSingUpGmail);
            
            bSingUpOK = new JButton("SingUp");
            bSingUpOK.setBounds(500, 700, 90, 80);
            bSingUpOK.setFont(new Font("Font", 1, 15));
            bSingUpOK.setBackground(Color.LIGHT_GRAY); 
            bSingUpOK.addActionListener(this);
            lSingUp.add(bSingUpOK);
            
            bSingUpBack = new JButton("Back");
            bSingUpBack.setBounds(10, 700, 90, 80);
            bSingUpBack.setFont(new Font("Font", 1, 15));
            bSingUpBack.setBackground(Color.LIGHT_GRAY); 
            bSingUpBack.addActionListener(this);
            lSingUp.add(bSingUpBack);
            
            pUserAccount = new JPanel();
            pUserAccount.setBounds(0, 0, 1000, 1000);
            pUserAccount.setBackground(Color.PINK);
            pUserAccount.setLayout(null);
            pUserAccount.setVisible(false);            
            this.add(pUserAccount);
            
            lUserAccount = new JLabel();
            lUserAccount.setBounds(0, 0, 1000, 1000);
            lUserAccount.setBackground(new Color(123,150,250));
            lUserAccount.setIcon(UABG);
            lUserAccount.setLayout(null);
            lUserAccount.setVisible(true);
            pUserAccount.add(lUserAccount);
            
            bWAL = new JButton("wins&losses");
            bWAL.setFocusable(false);
            bWAL.setBounds(800, 30, 150, 100);
            bWAL.setBackground(Color.green);
            bWAL.setFont(new Font("", 1, 15));
            bWAL.setBorder(UAWAL);
            bWAL.addActionListener(this);
            lUserAccount.add(bWAL);
            
            bUAPlay = new JButton("play");
            bUAPlay.setFocusable(false);
            bUAPlay.setBounds(800, 800, 150, 100);
            bUAPlay.setBackground(Color.green);
            bUAPlay.setFont(new Font("", 1, 15));
            bUAPlay.addActionListener(this);
            lUserAccount.add(bUAPlay);
            
            bUASingOut = new JButton("SingOut");
            bUASingOut.setFocusable(false);
            bUASingOut.setBounds(20, 800, 150, 100);
            bUASingOut.setBackground(Color.green);
            bUASingOut.setFont(new Font("", 1, 15));
            bUASingOut.addActionListener(this);
            lUserAccount.add(bUASingOut);
            
            pWinAndLosses = new JPanel();
            pWinAndLosses.setBounds(0, 0, 1000, 1000);
            pWinAndLosses.setBackground(Color.RED);
            pWinAndLosses.setLayout(null);
            pWinAndLosses.setVisible(false);
            this.add(pWinAndLosses);
            
            lWinAndLosses = new JLabel();
            lWinAndLosses.setBounds(0, 0, 1000, 1000);
            lWinAndLosses.setBackground(Color.BLUE);
            lWinAndLosses.setOpaque(true);
            lWinAndLosses.setFont(new Font("Font", 1, 20));
            pWinAndLosses.add(lWinAndLosses);
            
            bWinAndLossesBack = new JButton("Back");
            bWinAndLossesBack.setBounds(20, 800, 150, 100);
            bWinAndLossesBack.setBackground(Color.YELLOW);
            bWinAndLossesBack.setFont(new Font("Font", 1, 15));             
            bWinAndLossesBack.addActionListener(this);
            lWinAndLosses.add(bWinAndLossesBack);
            
            /*//JPanel Redpanel = new  JPanel();
            //JPanel Bluepanel = new  JPanel();
            //JPanel Greenpanel = new JPanel();
            
            Border border = BorderFactory.createLineBorder(Color.yellow,3);
            
            
            ImageIcon start = new ImageIcon("C:\\Users\\try\\Desktop\\start.jpg");
            ImageIcon board = new ImageIcon("C:\\Users\\try\\Desktop\\board.jpg");
            
            label.setIcon(board);
            label.setBounds(0, 0, 500, 500);
            label.setVisible(false);
            
            
            button.setBounds(50, 0, 400, 250);
            button.addActionListener(this);
            button.setText("start");
            button.setFocusable(false);
            button.setIcon(start);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setFont(new Font("Comic Sans", Font.BOLD, 25));
            button.setIconTextGap(5);
            button.setForeground(Color.ORANGE);
            button.setBackground(Color.LIGHT_GRAY);
            button.setBorder(BorderFactory.createEtchedBorder());
            
            
            
            label.setText("welcome to the best game ever");
            ImageIcon BG = new ImageIcon("C:\\Users\\try\\Desktop\\RBG.jpg");
            label.setIcon(BG);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setForeground(Color.yellow);
            label.setFont(new Font("MV Boli", Font.PLAIN, 20));
            label.setIconTextGap(10);
            label.setBackground(Color.red);
            label.setOpaque(true);
            label.setBorder(border);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            //label.setBounds(100, 100, 250, 300);
            
            
            Redpanel.setBackground(Color.red);
            Redpanel.setBounds(0, 0, 250, 250);
            
            Bluepanel.setBackground(Color.BLUE);
            Bluepanel.setBounds(250, 0, 250, 250);
            
            Greenpanel.setBackground(Color.GREEN);
            Greenpanel.setBounds(0, 250, 500, 250);
            
            
            fraem.setTitle("reversi");
            fraem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //fraem.setResizable(false);
            fraem.setSize(515,545);
            fraem.setLayout(null);
            fraem.setVisible(true);
            fraem.add(button);
            fraem.add(label);
            
            //fraem.setResizable(false);
            //ImageIcon icon = new javax.swing.ImageIcon("C:\\Users\\try\\Desktop\\reversi icon.jpg");
            //fraem.setIconImage(icon.getImage());//change icon of frame
            fraem.getContentPane().setBackground(Color.YELLOW);
            Greenpanel.add(label);
            fraem.add(Redpanel);
            fraem.add(Bluepanel);
            fraem.add(Greenpanel);
            //fraem.pack();
            
            }
            public void actionperformed(ActionEvent e){
            
            }
            }
            
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){
            //System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
            button.setVisible(false);
            }*/
    }
     
     public void setVisible(Board B){
          
         for (int i = 0; i < B.getBoard().length; i++) {
             for (int j = 0; j < B.getBoard()[0].length; j++) {
                 switch(B.getBoard()[i][j].getType()){
                     
                     case Black:{
                         
                         break;
                     }
                     case White:{
                         setVisible(true);
                         break;
                     }
                     case Empty:{
                         
                         break;
                     }
                     default:
                         break;
                 }
             }
         }
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource() == bSingIn){
            pSingIn.setVisible(true);
            pStart.setVisible(false);
        }
         if(e.getSource() == bSingInOK){
            pUserAccount.setVisible(true);
            pSingIn.setVisible(false);
            pStart.setVisible(false);
        }
         if(e.getSource() == bSingInBack){
            pSingIn.setVisible(false);
            pStart.setVisible(true);
        }
         if(e.getSource() == bSingUp){
            pSingUp.setVisible(true);
            pStart.setVisible(false);
        }
         if(e.getSource() == bSingUpOK){
            pBoard.setVisible(true);
            pSingUp.setVisible(false);
            pStart.setVisible(false);
        }
         if(e.getSource() == bSingUpBack){
            pSingUp.setVisible(false);
            pStart.setVisible(true);
        }
         if(e.getSource() == bUAPlay){
            pBoard.setVisible(true);
            pUserAccount.setVisible(false);
        }
         if(e.getSource() == bUASingOut){
            pStart.setVisible(true);
            pUserAccount.setVisible(false);
        }
         if(e.getSource() == bWAL){
            pWinAndLosses.setVisible(true);
            pUserAccount.setVisible(false);
        }
         if(e.getSource() == bWinAndLossesBack){
            pUserAccount.setVisible(true);
            pWinAndLosses.setVisible(false);
        }
    }
}