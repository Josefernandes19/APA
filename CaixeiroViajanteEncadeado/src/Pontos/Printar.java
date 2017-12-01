package Pontos;

/**
 *
 * @author a15023
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dados.Dados;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Printar extends Frame {
       
    public Printar(){
        super("Pontos na Tela");
        prepareGUI();
    }

    public void iniciaPrint(){
        Printar awtGraphicsDemo = new Printar();  
        awtGraphicsDemo.setVisible(true);
    }

    private void prepareGUI(){
        setSize(900,900);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        }); 
    }    

    @Override
    public void paint(Graphics g) {
        Ellipse2D shape = new Ellipse2D.Float();
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 100; i++) {
            shape.setFrame(Dados.entrada[i][0]+50, Dados.entrada[i][1]+50, 5, 5);    
            g2.draw (shape);
        }
            g2.drawLine((int)Dados.entrada[Dados.vetor.get(99)][0], (int)Dados.entrada[Dados.vetor.get(0)][0], (int)Dados.entrada[Dados.vetor.get(99)][1], (int)Dados.entrada[Dados.vetor.get(0)][1]);
        for (int i = 0; i < 99; i++) {
            g2.drawLine((int)Dados.entrada[Dados.vetor.get(i)][0], (int)Dados.entrada[Dados.vetor.get(i+1)][0], (int)Dados.entrada[Dados.vetor.get(i)][1], (int)Dados.entrada[Dados.vetor.get(i+1)][1]);
        }
    }
}
