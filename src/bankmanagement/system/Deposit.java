package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton d2,d1;
    Deposit(String pin){

        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System",Font.BOLD,18));
        label1.setForeground(Color.white);//to chaNGE FONT COLOR
        label1.setBounds(422,145,450,30);
        //add(label1); Can't do this cz it will add on the frame that will get covered by the atm image
        l3.add(label1);

        textField=new TextField();
        textField.setBounds(475,200,300,25);
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setFont(new Font("Raleway",Font.BOLD,18));
        l3.add(textField);

        d1=new JButton("DEPOSIT");
        d1.setBounds(730,350,120,28);
        d1.setBackground(new Color(65,125,128));
        d1.setForeground(Color.white);
        d1.addActionListener(this);
        l3.add(d1);

        d2=new JButton("BACK");
        d2.setBounds(730,395,120,28);
        d2.setBackground(new Color(65,125,128));
        d2.setForeground(Color.white);
        d2.addActionListener(this);
        l3.add(d2);






        setLocation(0,0);
        setSize(1550,830);
        setVisible(true);
        setLayout(null);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == d1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
                } else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " Deposited Succesfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource() == d2) {
                setVisible(false);
                new main_class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}
