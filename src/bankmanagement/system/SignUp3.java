package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JButton s,c;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String form_No;
    SignUp3(String form_No){
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/bankpicture.png"));
        Image iii2= iii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image1=new JLabel(iii3);
        image1.setBounds(25,10,100,100);
        add(image1);

        JLabel l1=new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1=new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,200,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2=new JRadioButton("Fixed Deposit  Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(400,180,200,30);
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3=new JRadioButton("Curent Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,200,30);
        r3.setBackground(new Color(215,252,252));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(400,220,200,30);
        r4.setBackground(new Color(215,252,252));
        add(r4);

        ButtonGroup b1=new ButtonGroup();
        b1.add(r3);
        b1.add(r4);
        b1.add(r2);
        b1.add(r1);

        JLabel l4=new JLabel("Card Number");
        l4.setBounds(100,300,200,30);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setBounds(100,330,300,20);
        l5.setFont(new Font("Raleway",Font.ITALIC,10));
        add(l5);

        JLabel l6=new JLabel("XXX-XXX-XXX-7845");
        l6.setBounds(400,300,250,20);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        add(l6);

        JLabel l7=new JLabel("(It would appear on your atm card/cheque book and statements)");
        l7.setBounds(400,330,500,20);
        l7.setFont(new Font("Raleway",Font.ITALIC,10));
        add(l7);

        JLabel l8=new JLabel("PIN NO:");
        l8.setBounds(100,370,200,30);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setBounds(400,370,200,30);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        add(l9);

        JLabel l10=new JLabel("(Four digit password)");
        l10.setBounds(100,400,200,20);
        l10.setFont(new Font("Raleway",Font.ITALIC,10));
        add(l10);

        JLabel l11=new JLabel("Service Required:");
        l11.setBounds(100,450,200,30);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        c2=new JCheckBox("Internate Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        add(c2);
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        add(c3);
        c4=new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,550,200,30);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        add(c5);
        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,200,30);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        add(c6);

        JCheckBox c7=new JCheckBox("I hereby decleares that the above entered details are corrrect to the best of my knowledge");
        c7.setBounds(100,640,600,20);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.ITALIC,12));
        add(c7);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(600,10,150,30);
        add(l12);

        JLabel l13=new JLabel(form_No);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(680,10,150,30);
        add(l13);

        s=new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setForeground(Color.white);
        s.setBackground(Color.BLACK);
        s.setBounds(300,670,100,30);
        s.addActionListener(this);
        add(s);

        c=new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setForeground(Color.white);
        c.setBackground(Color.black);
        c.setBounds(450,670,100,30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(900,900);
        setLocation(250,150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String acctype=null;
        if (r1.isSelected()){
            acctype="Savings Account";
        } else if (r2.isSelected()) {
            acctype="Fixed Deposit  Account";
        } else if (r3.isSelected()) {
            acctype="Curent Account";
        }else if (r4.isSelected()){
            acctype="Recurring Deposit Account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3= (ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String faculty=null;
        if(c1.isSelected()){
            faculty+="ATM CARD";
        }else if (c2.isSelected()){
            faculty+="Internate Banking";
        }else if (c3.isSelected()){
            faculty+="Mobile Banking";
        }else if (c4.isSelected()){
            faculty+="EMAIL Alerts";
        }else if (c5.isSelected()){
            faculty+="Cheque Book";
        }else if (c6.isSelected()){
            faculty+="E-Statement";
        }

        try{
            if (actionEvent.getSource()==s){
                if (acctype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Conn conn=new Conn();
                    String q1="insert into signup3 values('"+form_No+"','"+acctype+"','"+cardno+"','"+pin+"','"+faculty+"')";
                    String q2="insert into login values('"+form_No+"','"+cardno+"','"+pin+"')";
                    conn.statement.executeUpdate(q1);
                    conn.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (actionEvent.getSource()==c) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new SignUp3("");
    }



}
