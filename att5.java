package Atts_Montanha;

import java.util.Scanner;

public class att5 {

    public static void main(String[] args){
           double centimetros;
           double metros;
           System.out.println("digite um valor:");
           
           Scanner scanner = new Scanner(System.in);
           centimetros = scanner.nextDouble();



           metros = centimetros *  100;
           System.out.println(" metros: "+ metros);




        }
}