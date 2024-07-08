package bankmanagement.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1,r2,r3,r4,r5;
    JTextField textName,textEmail,textAd,textCity,textPin,textSt,textFName;
    JDateChooser dateChooser;

    Random r=new Random();
    long first4=(r.nextLong() % 9000L)+1000L;
    String first=""+Math.abs(first4);
    SignUp(){
        super("Application Form");

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/bankpicture.png"));
        Image iii2= iii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image1=new JLabel(iii3);
        image1.setBounds(25,10,100,100);
        add(image1);

        JLabel lable1=new JLabel("Application Form No:"+first);
        lable1.setFont(new Font("AvantGarde",Font.BOLD,22));
        lable1.setBounds(260,20,600,40);
        add(lable1);

        JLabel lable2=new JLabel("Page 1");
        lable2.setFont(new Font("AvantGarde",Font.BOLD,18));
        lable2.setBounds(390,55,600,20);
        add(lable2);

        JLabel lable3=new JLabel("Personal Details");
        lable3.setFont(new Font("AvantGarde",Font.BOLD,18));
        lable3.setBounds(340,80,600,22);
        add(lable3);

        JLabel lable4=new JLabel("Name :");
        lable4.setFont(new Font("Raleway",Font.BOLD,18));
        lable4.setBounds(100,150,100,30);
        add(lable4);

        textName= new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,150,400,30);
        add(textName);

        JLabel lable5=new JLabel("Father's Name :");
        lable5.setFont(new Font("Raleway",Font.BOLD,18));
        lable5.setBounds(100,200,200,30);
        add(lable5);

        textFName= new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,200,400,30);
        add(textFName);

        JLabel lable6=new JLabel("D.O.B :");
        lable6.setFont(new Font("Raleway",Font.BOLD,18));
        lable6.setBounds(100,250,100,30);
        add(lable6);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,250,200,30);
        add(dateChooser);

        JLabel lable7=new JLabel("Gender :");
        lable7.setFont(new Font("Raleway",Font.BOLD,18));
        lable7.setBounds(100,300,200,30);
        add(lable7);

        r1=new JRadioButton("Male");
        r1.setBounds(300,300,100,30);
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(450,300,100,30);
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel lable8=new JLabel("Email Address :");
        lable8.setFont(new Font("Raleway",Font.BOLD,18));
        lable8.setBounds(100,350,200,30);
        add(lable8);

        textEmail= new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,30);
        add(textEmail);

        JLabel lable9=new JLabel("Marital status :");
        lable9.setFont(new Font("Raleway",Font.BOLD,18));
        lable9.setBounds(100,400,200,30);
        add(lable9);

        r3=new JRadioButton("Married");
        r3.setBounds(300,400,120,30);
        r3.setFont(new Font("Raleway",Font.BOLD,18));
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setBounds(420,400,140,30);
        r4.setFont(new Font("Raleway",Font.BOLD,18));
        r4.setBackground(new Color(222,255,228));
        add(r4);

        r5=new JRadioButton("Other");
        r5.setBounds(580,400,100,30);
        r5.setFont(new Font("Raleway",Font.BOLD,18));
        r5.setBackground(new Color(222,255,228));
        add(r5);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);

        JLabel lable10=new JLabel("Address :");
        lable10.setFont(new Font("Raleway",Font.BOLD,18));
        lable10.setBounds(100,450,200,30);
        add(lable10);

        textAd= new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,14));
        textAd.setBounds(300,450,400,30);
        add(textAd);

        JLabel lable11=new JLabel("City :");
        lable11.setFont(new Font("Raleway",Font.BOLD,18));
        lable11.setBounds(100,500,200,30);
        add(lable11);

        textCity= new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,500,400,30);
        add(textCity);

        JLabel lable12=new JLabel("Pin code :");
        lable12.setFont(new Font("Raleway",Font.BOLD,18));
        lable12.setBounds(100,550,200,30);
        add(lable12);

        textPin= new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,550,400,30);
        add(textPin);

        JLabel lable13=new JLabel("State :");
        lable13.setFont(new Font("Raleway",Font.BOLD,18));
        lable13.setBounds(100,600,200,30);
        add(lable13);

        textSt= new JTextField();
        textSt.setFont(new Font("Raleway",Font.BOLD,14));
        textSt.setBounds(300,600,400,30);
        add(textSt);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620,650,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setUndecorated(true);
        setLocation(250,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String formNo=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if (r3.isSelected()){
            marital="Married";
        } else if (r4.isSelected()) {
            marital="Unmarried";
        }else{
            marital="Other";
        }
        String addresss=textAd.getText();
        String city=textCity.getText();
        String pin=textPin.getText();
        String state=textSt.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill up all the fields");
            }else {
                Conn conn=new Conn();
                String q="insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+addresss+"','"+city+"','"+pin+"','"+state+"')";
                conn.statement.executeUpdate(q);
                new SignUp2(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
