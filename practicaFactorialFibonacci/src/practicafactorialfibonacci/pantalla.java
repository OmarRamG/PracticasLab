/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafactorialfibonacci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Alumno
 */
public class pantalla extends JFrame {

    JButton factorial, fibonacci;
    JTextField num;
    JLabel subt;
    public int numero;
    public int resultado;

    public pantalla() {
        configVentana();
        iniciarComp();

    }

    public void configVentana() {
        setTitle("Factorial y Fibonacci");
        setSize(700, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void iniciarComp() {

        num = new JTextField("Ingresa el numero");
        num.setBounds(200, 300, 200, 30);
        num.setVisible(true);
        add(num);

        factorial = new JButton("Factorial");
        factorial.setBounds(100, 400, 200, 30);
        factorial.setVisible(true);
        add(factorial);

        fibonacci = new JButton("Fibonacci");
        fibonacci.setBounds(300, 400, 150, 30);
        fibonacci.setVisible(true);
        add(fibonacci);

        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hacerFactorial();
            }
        });

        fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hacerSerie();
            }
        });

        setLayout(new FlowLayout());
        setResizable(false);
        setLocation(500, 500);
        setVisible(true);
    }

    public void hacerFactorial() {
        numero = Integer.parseInt(num.getText());
        resultado = 1;
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        JOptionPane.showMessageDialog(this, "Factorial resultante: " + resultado);
    }

    public void hacerSerie() {
        int a, b = 0, valor, c = 1;
        valor = Integer.parseInt(num.getText());
        for (a = 0; a < valor; a++) {
            if(b == 0)
                JOptionPane.showMessageDialog(this, "Serie resultante: " +b);
            if(b > 0)
                JOptionPane.showMessageDialog(this, "Serie resultante: " +b);
            b = b + c;
            c = b - c;
        }
        }
    }



