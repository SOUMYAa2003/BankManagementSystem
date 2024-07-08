package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton w1;
    JLabel label2,label1;
    String pin;
    BalanceEnquiry(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);


        label1 = new JLabel("Your current balance is Rs. ");
        label1.setFont(new Font("System", Font.PLAIN, 16));
        label1.setForeground(Color.white);//to chaNGE FONT COLOR
        label1.setBounds(445, 145, 700, 30);
        //add(label1); Can't do this cz it will add on the frame that will get covered by the atm image
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System", Font.BOLD, 17));
        label2.setForeground(Color.white);//to chaNGE FONT COLOR
        label2.setBounds(415, 210, 700, 30);
        //add(label1); Can't do this cz it will add on the frame that will get covered by the atm image
        l3.add(label2);

        w1 = new JButton("Back");
        w1.setBounds(730, 350, 120, 28);
        w1.setBackground(new Color(65, 125, 128));
        w1.setForeground(Color.white);
        w1.addActionListener(this);
        l3.add(w1);

        int balance=0;
        try {
            Conn c = new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='" + pin + "'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals(("Deposit"))){
                    balance +=Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        label2.setText(""+balance);




        setLocation(0, 0);
        setSize(1550, 830);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        setVisible(false);
        new main_class(pin);

    }




    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
