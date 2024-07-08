package bankmanagement.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener{

        String pin;
        TextField textField;
        JButton w2,w1;
        Withdrawl(String pin) {

            this.pin = pin;
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(0, 0, 1550, 830);
            add(l3);


            JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL LIMIT IS Rs.10,000");
            label1.setFont(new Font("System", Font.PLAIN, 16));
            label1.setForeground(Color.white);//to chaNGE FONT COLOR
            label1.setBounds(445, 145, 700, 30);
            //add(label1); Can't do this cz it will add on the frame that will get covered by the atm image
            l3.add(label1);

            JLabel label2 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
            label2.setFont(new Font("System", Font.BOLD, 17));
            label2.setForeground(Color.white);//to chaNGE FONT COLOR
            label2.setBounds(415, 210, 700, 30);
            //add(label1); Can't do this cz it will add on the frame that will get covered by the atm image
            l3.add(label2);

            textField = new TextField();
            textField.setBounds(475, 250, 300, 25);
            textField.setBackground(new Color(65, 125, 128));
            textField.setForeground(Color.white);
            textField.setFont(new Font("Raleway", Font.BOLD, 18));
            l3.add(textField);

            w1 = new JButton("Withdraw");
            w1.setBounds(730, 350, 120, 28);
            w1.setBackground(new Color(65, 125, 128));
            w1.setForeground(Color.white);
            w1.addActionListener(this);
            l3.add(w1);

            w2 = new JButton("BACK");
            w2.setBounds(730, 395, 120, 28);
            w2.setBackground(new Color(65, 125, 128));
            w2.setForeground(Color.white);
            w2.addActionListener(this);
            l3.add(w2);


            setLocation(0, 0);
            setSize(1550, 830);
            setVisible(true);
            setLayout(null);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == w1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (e.getSource() == w1) {
                    if (textField.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                    } else {
                        Conn c = new Conn();
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='" + pin + "'");
                        int balance = 0;
                        while (resultSet.next()) {
                            if (resultSet.getString("type").equals(("Deposit"))) {
                                balance += Integer.parseInt(resultSet.getString("amount"));
                            } else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));
                            }
                            if (balance < Integer.parseInt(amount)) {
                                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                                return;
                            }
                            c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdraw','" + amount + "')");
                            JOptionPane.showMessageDialog(null, "Rs." + amount + "Debited Succesfully");
                            setVisible(false);
                            new main_class(pin);
                        }

                    }
                } else if (e.getSource() == w2) {
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == w2) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
