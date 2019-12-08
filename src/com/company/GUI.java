package com.company;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    //добавление значений
    private Random randomNumber=new Random();
private Integer numInteger= randomNumber.nextInt(16);
private String numInString=Integer.toBinaryString(numInteger);
    //ввод элементов
    private JLabel number= new JLabel(numInteger.toString());
    private JLabel label = new JLabel("Дайте моему терминатору число в двоичной систиме исчисления!!!");
    private JTextField text = new JTextField(" ",5);
    private JButton button = new JButton("Результат");

    public GUI() {
    super("Правильность перевода в двоичную систему");
    Container container=this.getContentPane();
    container.setLayout(new GridLayout(4,1));
    container.add(number);
    container.add(label);
    container.add(text);
    container.add(button);
    button.addActionListener(new ButtonEventListener());
    }
    public class ButtonEventListener implements ActionListener
    {
    @Override
    public void actionPerformed(ActionEvent e)
    {
    //если все правильно показать новое число
    if(text.getText().equals(numInString)) {
        JOptionPane.showMessageDialog(null, "Правильно", "output", JOptionPane.PLAIN_MESSAGE);
        numInteger = randomNumber.nextInt(100);
        numInString = Integer.toBinaryString(numInteger);
        number.setText(numInteger.toString());
    }
    else {
    JOptionPane.showMessageDialog(null,"Неправильно","output",JOptionPane.PLAIN_MESSAGE);
    }

    }
    }
    }

