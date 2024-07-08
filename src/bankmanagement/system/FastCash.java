package bankmanagement.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JLabel label1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
            this.pin=pin;

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel l3=new JLabel(i3);
            l3.setBounds(0,0,1550,830);
            add(l3);

            JLabel label=new JLabel("SELECT WITHDRAWL AMOUNT");
            label.setBounds(415,180,700,28);
            label.setForeground(Color.white);
            label.setFont(new Font("System",Font.BOLD,25));
            l3.add(label);

            b1=new JButton("Rs. 100");
            b1.setForeground(Color.white);
            b1.setBackground(new Color(65,125,128));
            b1.addActionListener(this);
            b1.setBounds(408,270,150,35);
            l3.add(b1);

            b2=new JButton("Rs. 500");
            b2.setForeground(Color.white);
            b2.setBackground(new Color(65,125,128));
            b2.addActionListener(this);
            b2.setBounds(701,270,150,35);
            l3.add(b2);

            b3=new JButton("Rs. 1000");
            b3.setForeground(Color.white);
            b3.setBackground(new Color(65,125,128));
            b3.addActionListener(this);
            b3.setBounds(407,317,150,35);
            l3.add(b3);

            b4=new JButton("Rs. 2000");
            b4.setForeground(Color.white);
            b4.setBackground(new Color(65,125,128));
            b4.addActionListener(this);
            b4.setBounds(701,316,150,35);
            l3.add(b4);

            b5=new JButton("Rs. 5000");
            b5.setForeground(Color.white);
            b5.setBackground(new Color(65,125,128));
            b5.addActionListener(this);
            b5.setBounds(407,363,150,35);
            l3.add(b5);

            b6=new JButton("Rs. 10000");
            b6.setForeground(Color.white);
            b6.setBackground(new Color(65,125,128));
            b6.addActionListener(this);
            b6.setBounds(701,363,150,35);
            l3.add(b6);

            b7=new JButton("Back");
            b7.setForeground(Color.white);
            b7.setBackground(new Color(65,125,128));
            b7.addActionListener(this);
            b7.setBounds(701,408,150,35);
            l3.add(b7);














        setUndecorated(true);
        setLayout(null);
        setVisible(true);
        setLocation(0,0);
        setSize(1550,830);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == b7) {
             setVisible(false);
             new main_class(pin);
         }else {
             String amount = ((JButton) e.getSource()).getText().substring(4);
             Conn c = new Conn();
             Date date = new Date();
             try {
                 ResultSet resultSet=c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
                 int balance=0;
                 while (resultSet.next()){
                     if(resultSet.getString("type").equals(("Deposit"))){
                         balance +=Integer.parseInt(resultSet.getString("amount"));
                     }else {
                         balance -= Integer.parseInt(resultSet.getString("amount"));
                     }
                 }
                 String num="17";
                 if (e.getSource()!=b7 && balance<Integer.parseInt(amount)){
                     JOptionPane.showMessageDialog(null,"Insufficient Balance");
                     return;
                 }
                 c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdraw','" + amount + "')");
                 JOptionPane.showMessageDialog(null, "Rs." + amount + " Debited Succesfully");
                 setVisible(false);
                 new main_class(pin);
             } catch (Exception E) {
                 E.printStackTrace();
             }
         }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
