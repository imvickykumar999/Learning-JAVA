
// Swing is a part of the JFC (Java Foundation Classes).
// Building Graphical User Interface in Java requires the use
// of Swings. Swing Framework contains a large set of components
// which allow a high level of customization and provide rich
// functionalities, and is used to create window-based applications.
// Java swing components are lightweight, platform-independent,
// provide powerful components like tables, scroll panels, buttons,
// list, colour chooser, etc.

import javax.swing.*;

public class miniproject {
   public static void main(String[] args) {
      JFrame f=new JFrame("miniproject");

      JLabel title = new JLabel("Registration Form");
      title.setBounds(150, 10, 150, 30);
      f.add(title);

      JLabel name = new JLabel("Full Name");
      name.setBounds(50, 50, 100, 30);
      f.add(name);
      JTextField tname = new JTextField();
  		tname.setBounds(150, 50, 200, 30);
  		f.add(tname);

      JLabel email = new JLabel("Email Id");
      email.setBounds(50, 100, 100, 30);
      f.add(email);
      JTextField ename = new JTextField();
  		ename.setBounds(150, 100, 200, 30);
  		f.add(ename);

  		JLabel mno = new JLabel("Phone Number");
  		mno.setBounds(50, 150, 150, 30);
  		f.add(mno);
  		JTextField tmno = new JTextField();
  		tmno.setBounds(150, 150, 200, 30);
  		f.add(tmno);

      JLabel l1=new JLabel("Password");
      l1.setBounds(50, 200, 150,30);
      f.add(l1);
      JPasswordField value = new JPasswordField();
      value.setBounds(150,200,200,30);
      f.add(value);

      JLabel branch = new JLabel("Branch/Course");
      branch.setBounds(50, 250, 100, 30);
      f.add(branch);
      String country[]={"Civil","CSE","EEE","Mechanical","MBA","MCA"};
      JComboBox cb=new JComboBox(country);
      cb.setBounds(150,250,200,30);
      f.add(cb);

      JLabel gender = new JLabel("Gender");
  		gender.setBounds(50, 300, 150, 30);
  		f.add(gender);

      JRadioButton r1=new JRadioButton("A) Male");
      JRadioButton r2=new JRadioButton("B) Female");
      r1.setBounds(150,300,100,30);
      r2.setBounds(150,330,100,30);
      ButtonGroup bg=new ButtonGroup();
      bg.add(r1);
      bg.add(r2);
      f.add(r1);
      f.add(r2);

      JCheckBox checkBox1 = new JCheckBox("Accept Terms And Conditions.");
      checkBox1.setBounds(150,400, 450,50);
      f.add(checkBox1);

      JButton sub = new JButton("Submit");
      sub.setBounds(150,450,100,30);
      f.add(sub);

      f.setSize(450,600);
      f.setLayout(null);
      f.setVisible(true);
  }
}
