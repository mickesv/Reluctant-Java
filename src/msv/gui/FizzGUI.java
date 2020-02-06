package msv.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import msv.example.FizzBuzz;

public class FizzGUI {
  private FizzBuzz myFizzBuzz;

  public FizzGUI() {
    createGUI();
  }

  public FizzGUI(FizzBuzz theFizzBuzz) {
    myFizzBuzz = theFizzBuzz;
    createGUI();
  }

  private DefaultListModel myList = new DefaultListModel();
  private JTextField myNumber = new JTextField(10);
  private JTextField myCallout = new JTextField(20);
  
  private void createGUI() {
    JFrame myWindow = new JFrame("FizzBuzz GUI");
    JPanel canvas = new JPanel();

    myWindow.setSize(640,480);
    myWindow.getContentPane().add(canvas);
    canvas.setLayout(new FlowLayout());

    JList list = new JList(myList);
    list.setLayoutOrientation(JList.VERTICAL);
    list.setVisibleRowCount(-1);
    JScrollPane sp = new JScrollPane(list);
    sp.setPreferredSize(new Dimension(100, 400));
    canvas.add(sp);

    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());
    myNumber.setText("1");
    myCallout.setEditable(false);
    p.add(myNumber);
    p.add(myCallout);

    JButton b = new JButton("Call Fizz");
    b.addActionListener(new FizzButtonListener());
    p.add(b);

    canvas.add(p);

    myWindow.setVisible(true);    
  }

  private class FizzButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (null != myFizzBuzz) {
        String in = myNumber.getText();
        if (0 < in.length()) {
          int num = Integer.parseInt(in);
          String out = "" + num + " is a " + myFizzBuzz.callNum(num);
          myCallout.setText(out);
          myList.addElement(out);
          myNumber.setText(num + 1 + "");
        }
      }
    }
  }  
}
