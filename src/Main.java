// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int h;
        int m;
        int s;

        System.out.printf("Escribe la hora");
        h=  Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas:"));
        m=  Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos:"));
        s=  Integer.parseInt(JOptionPane.showInputDialog("ingrese los segundos:"));


    }
}