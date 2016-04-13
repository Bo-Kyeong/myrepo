package com.j2.w6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Calculation{
    public static void main(String[] args) {
         
        
        JFrame frame = new JFrame("claculator");
        frame.setLocation(500, 400);
        frame.setPreferredSize(new Dimension(300, 200));
        Container con = frame.getContentPane();
 
        JTextField result = new JTextField();
        con.add(result, BorderLayout.NORTH);
 
        GridLayout blayout = new GridLayout(4, 4);
        JPanel panbtn = new JPanel();
        panbtn.setLayout(blayout);
 
         
        JButton[] num = new JButton[10];
        num[0] = new JButton("0");
        num[1] = new JButton("1");
        num[2] = new JButton("2");
        num[3] = new JButton("3");
        num[4] = new JButton("4");
        num[5] = new JButton("5");
        num[6] = new JButton("6");
        num[7] = new JButton("7");
        num[8] = new JButton("8");
        num[9] = new JButton("9");
         
        JButton clr = new JButton("C"); 
        JButton equals = new JButton("="); 
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
 
        panbtn.add(num[7]);
        panbtn.add(num[8]);
        panbtn.add(num[9]);
        panbtn.add(add);
        panbtn.add(num[4]);
        panbtn.add(num[5]);
        panbtn.add(num[6]);
        panbtn.add(sub);
        panbtn.add(num[1]);
        panbtn.add(num[2]);
        panbtn.add(num[3]);
        panbtn.add(mul);
        panbtn.add(num[0]);
        panbtn.add(equals);
        panbtn.add(clr);
        panbtn.add(div);
 
        con.add(panbtn, BorderLayout.CENTER);
 
     
         
        ActionListener numberPressListener = new NumberButtonListener(result);
        for(int i = 0; i < num.length; i++) {
            num[i].addActionListener(numberPressListener);
        }
 
        clr.addActionListener(numberPressListener);
        equals.addActionListener(numberPressListener);
        add.addActionListener(numberPressListener);
        sub.addActionListener(numberPressListener);
        mul.addActionListener(numberPressListener);
        div.addActionListener(numberPressListener);
         
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

class NumberButtonListener implements ActionListener {
    JButton btn;
    JTextField result;
 
    private int total = 0;
    private char o = ' ';
 
    NumberButtonListener(JTextField result) {
        this.result = result;
    }
 
 
    public void actionPerformed(ActionEvent e) {
        String getBut = e.getActionCommand();
        String presentVal = result.getText();
 
        if (getBut == "0") {
            if(!presentVal.equals("0")) {
                result.setText(presentVal + getBut);
            }
        } else if (getBut == "1") {
            result.setText(presentVal + getBut);
        } else if (getBut == "2") {
            result.setText(presentVal + getBut);
        } else if (getBut == "3") {
            result.setText(presentVal + getBut);
        } else if (getBut == "4") {
            result.setText(presentVal + getBut);
        } else if (getBut == "5") {
            result.setText(presentVal + getBut);
        } else if (getBut == "6") {
            result.setText(presentVal + getBut);
        } else if (getBut == "7") {
            result.setText(presentVal + getBut);
        } else if (getBut == "8") {
            result.setText(presentVal + getBut);
        } else if (getBut == "9") {
            result.setText(presentVal + getBut);
        } else if (getBut == "C") {
            result.setText("");
            total = 0;
        } else if (getBut == "+") {
            int temp =  Integer.parseInt(presentVal);
            switch (o) {
            case '+':
                total += temp;
                break;
            case '-':
                total -= temp;
                break;
            case '*':
                total *= temp;
                break;
            case '/':
                total /= temp;
                break;
            default:
                total = temp;
            }
            o = '+';
            result.setText("");
        } else if (getBut == "-") {
            int temp =  Integer.parseInt(presentVal);
            switch (o) {
            case '+':
                total += temp;
                break;
            case '-':
                total -= temp;
                break;
            case '*':
                total *= temp;
                break;
            case '/':
                total /= temp;
                break;
            default:
                total = temp;
            }
            o = '-';
            result.setText("");
        } else if (getBut == "*") {
            int temp =  Integer.parseInt(presentVal);
            switch (o) {
            case '+':
                total += temp;
                break;
            case '-':
                total -= temp;
                break;
            case '*':
                total *= temp;
                break;
            case '/':
                total /= temp;
                break;
            default:
                total = temp;
            }
            o = '*';
            result.setText("");
        } else if (getBut == "/") {
            int temp =  Integer.parseInt(presentVal);
            switch (o) {
            case '+':
                total += temp;
                break;
            case '-':
                total -= temp;
                break;
            case '*':
                total *= temp;
                break;
            case '/':
                total /= temp;
                break;
            default:
                total = temp;
            }
            o = '/';
            result.setText("");
        } else if (getBut == "=") {
            int temp = Integer.parseInt(presentVal);
            switch (o) {
            case '+':
                total += temp;
                break;
            case '-':
                total -= temp;
                break;
            case '*':
                total *= temp;
                break;
            case '/':
                total /= temp;
                break;
            default:
                total = temp;
            }
            o = ' ';
            result.setText("" + total);
            System.out.println(total);
        }
    }
 
}