package bankmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadh;

    JButton next;
    JRadioButton r1,r2,r3,r4;
    String formNo;
    SignUp2(String formNo){
        super("APPLICATION FORM");

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/bankpicture.png"));
        Image iii2= iii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image1=new JLabel(iii3);
        image1.setBounds(25,10,100,100);
        add(image1);

        this.formNo=formNo;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(360,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional details :");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,140,200,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(246, 246, 245));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,140,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,200,200,30);
        add(l4);

        String category[]={"General","SC","ST","OBC","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(246, 246, 245));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,200,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,260,200,30);
        add(l5);

        String income[]={"Null","<1,50,000","<2,50,000","5,00,000","above 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(246, 246, 245));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,260,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,320,200,30);
        add(l6);

        String Education[]={"Non-Graduate","Graduate","Post-graduate","Doctorate","Other"};
        comboBox4=new JComboBox(Education);
        comboBox4.setBackground(new Color(246, 246, 245));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,320,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,380,200,30);
        add(l7);

        String Occupation[]={"Salaried","Self-employed","Buisness","Student","Retired","Other"};
        comboBox5=new JComboBox(Occupation);
        comboBox5.setBackground(new Color(246, 246, 245));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,380,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN number :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,440,200,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,440,320,30);
        add(textPan);

        JLabel l9=new JLabel("Aadhar number :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,500,200,30);
        add(l9);

        textAadh=new JTextField();
        textAadh.setFont(new Font("Raleway",Font.BOLD,18));
        textAadh.setBounds(350,500,320,30);
        add(textAadh);

        JLabel l10=new JLabel("Senior citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,560,200,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setBounds(350,560,100,30);
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(null);
        add(r1);

        r2=new JRadioButton("No");
        r2.setBounds(450,560,100,30);
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(null);
        add(r2);

        ButtonGroup b1=new ButtonGroup();
        b1.add(r1);
        b1.add(r2);

        JLabel l11=new JLabel("Existing account :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,620,250,30);
        add(l11);

        r3=new JRadioButton("Yes");
        r3.setBounds(350,620,100,30);
        r3.setFont(new Font("Raleway",Font.BOLD,18));
        r3.setBackground(null);
        add(r3);

        r4=new JRadioButton("No");
        r4.setBounds(450,620,100,30);
        r4.setFont(new Font("Raleway",Font.BOLD,18));
        r4.setBackground(null);
        add(r4);

        ButtonGroup b2=new ButtonGroup();
        b2.add(r3);
        b2.add(r4);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(600,10,150,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(680,10,150,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(600,650,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        getContentPane().setBackground(new Color(252,208,76));
        setSize(850,750);
        setLocation(250,150);
        setVisible(true);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occu=(String) comboBox5.getSelectedItem();
        String pan=textPan.getText();
        String aad=textAadh.getText();
        String scitizen=null;
        if (r1.isSelected()){
            scitizen="Yes";
        }else if (r2.isSelected()){
            scitizen="No";
        }
        String eaccount=null;
        if (r3.isSelected()){
            eaccount="Yes";
        }else if (r4.isSelected()){
            eaccount="No";
        }

        try {
            if (textPan.getText().equals("") || textAadh.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill up all the fields");
            }else {
                Conn conn=new Conn();
                String q= "insert into signup2 values('"+formNo+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occu+"','"+pan+"','"+aad+"','"+scitizen+"','"+eaccount+"')";
                conn.statement.executeUpdate(q);
                new SignUp3(formNo);
                setVisible(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
