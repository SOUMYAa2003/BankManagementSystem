package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener{

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label=new JLabel("Please select your transaction");
        label.setBounds(415,180,700,28);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,25));
        l3.add(label);

        b1=new JButton("Deposit");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(407,270,150,35);
        l3.add(b1);

        b2=new JButton("Cash Withdrawl");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        b2.setBounds(701,270,150,35);
        l3.add(b2);

        b3=new JButton("Fast Cash");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        b3.setBounds(407,317,150,35);
        l3.add(b3);

        b4=new JButton("Mini Statement");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        b4.setBounds(701,316,150,35);
        l3.add(b4);

        b5=new JButton("Pin Change");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        b5.setBounds(407,363,150,35);
        l3.add(b5);

        b6=new JButton("Balance Enquiry");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        b6.setBounds(701,363,150,35);
        l3.add(b6);

        b7=new JButton("Exit");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        b7.setBounds(701,408,150,35);
        l3.add(b7);











        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        }else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        }else if (e.getSource()==b4) {
            new mini(pin);
            setVisible(false);
        }else if (e.getSource()==b5) {
            new pinchange(pin);
            setVisible(false);
        }else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
