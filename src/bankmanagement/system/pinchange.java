package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pinchange extends JFrame implements ActionListener{
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    pinchange(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label=new JLabel("CHANGE YOUR PIN");
        label.setBounds(480,180,700,28);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,30));
        l3.add(label);

        JLabel label1=new JLabel("NEW PIN ");
        label1.setBounds(420,270,500,18);
        label1.setFont(new Font("System",Font.PLAIN,18));
        label1.setForeground(Color.white);
        l3.add(label1);

        p1=new JPasswordField(15);
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(650,267,200,23);
        p1.setFont(new Font("System",Font.PLAIN,18));
        l3.add(p1);

        JLabel label2=new JLabel("RE-ENTER THE NEW PIN ");
        label2.setBounds(420,300,500,18);
        label2.setFont(new Font("System",Font.PLAIN,18));
        label2.setForeground(Color.white);
        l3.add(label2);

        p2=new JPasswordField(15);
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(650,300,200,23);
        p2.setFont(new Font("System",Font.PLAIN,18));
        l3.add(p2);


        b1=new JButton("CHANGE");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(701,363,150,35);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        b2.setBounds(701,408,150,35);
        l3.add(b2);







        setLayout(null);
        setVisible(true);
        setLocation(0,0);
        setSize(1550,830);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter The New PIN");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin='" + pin1+ "' where pin='" + pin + "'";
                String q2 = "update login set pin='" + pin1+ "' where pin='" + pin + "'";
                String q3 = "update signup3 set pin='" + pin1+ "' where pin='" + pin + "'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "Pin changed succesfully");
                setVisible(false);
                new main_class(pin);
            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new pinchange("");
    }
}
