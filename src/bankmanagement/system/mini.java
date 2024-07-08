package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini(String pin){
        this.pin=pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLayout(null);
        setLocation(20,20);

        JLabel label1=new JLabel();
        //label1.setFont(new Font());
        label1.setBounds(20,140,400,210);
        add(label1);

        JLabel label2=new JLabel();
        //label1.setFont(new Font());
        label2.setBounds(150,20,200,30);
        add(label2);

        JLabel label3=new JLabel();
        //label1.setFont(new Font());
        label3.setBounds(20,80,300,30);
        add(label3);

        JLabel label4=new JLabel();
        //label1.setFont(new Font());
        label4.setBounds(20,400,300,20);
        add(label4);

        try {
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * login where pin='"+pin+"'");//c.statement.executeQuery("select * login where pin= '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_no").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int balance=0;
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals(("Deposit"))) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your total balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }
        button=new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.addActionListener(this);
        add(button);







        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
