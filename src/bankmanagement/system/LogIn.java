package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
//1409962999826305

//3535

public class LogIn extends JFrame implements ActionListener {
    JLabel lable1,lable2,lable3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    LogIn(){
        super("Bank Management System");

        lable1=new JLabel("WELCOME TO ATM");
        lable1.setForeground(Color.white);
        lable1.setFont(new Font("AvantGarde",Font.BOLD,40));
        lable1.setBounds(230,30,450,40);
        add(lable1);

        lable2=new JLabel("Card No:");
        lable2.setForeground(Color.white);
        lable2.setFont(new Font("Ralway",Font.PLAIN,28));
        lable2.setBounds(150,190,375,30);
        add(lable2);

        textField2=new JTextField(15);//col
        textField2.setBounds(300,190,350,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        lable3=new JLabel("PIN:");
        lable3.setForeground(Color.white);
        lable3.setFont(new Font("Ralway",Font.PLAIN,28));
        lable3.setBounds(150,240,375,30);
        add(lable3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(300,240,350,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1=new JButton("SIGN UP");
        button1.setBounds(200,320,100,30);
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Arial",Font.BOLD,12));
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("LOG IN");
        button2.setBounds(400,320,100,30);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial",Font.BOLD,12));
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("CLEAR");
        button3.setBounds(600,320,100,30);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial",Font.BOLD,12));
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/2322548.png"));
        Image iii2= iii1.getImage().getScaledInstance(850,500,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image2=new JLabel(iii3);
        image2.setBounds(0,0,850,500);
        add(image2);

        setLayout(null);
        setSize(850,500);
        setLocation(250,150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() ==button1){
                new SignUp();
                setVisible(false);
            }else if(e.getSource()==button2){
                Conn c=new Conn();
                String cardno=textField2.getText();
                String pin=passwordField3.getText();
                String q="select * from login where card_no='"+cardno+"' and pin='"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card no or Pin!!");
                }

            }else if (e.getSource()==button3){
                textField2.setText("");
                passwordField3.setText("");
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LogIn();
    }
}
