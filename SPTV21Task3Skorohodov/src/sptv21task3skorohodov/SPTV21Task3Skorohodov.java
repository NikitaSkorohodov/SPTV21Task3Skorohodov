/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task3skorohodov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task3Skorohodov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("первое число : ");
        String name = scanner.nextLine();
        System.out.print("второе число : ");
        String fname = scanner.nextLine();
        System.out.print("второе число : ");
        String cod = scanner.nextLine();
        char pol = cod.charAt(0);
        String pos = "";
        String year1 = "";
        if (pol==1 ){pos="родился "; year1="18";}if (pol==3 ){pos="родился ";year1="19";} if (pol==5 ){pos="родился ";year1="20";}if (pol==7 ){pos="родился ";year1="21";}
        if (pol==2 ){pos="родился "; year1="18";}if (pol==4 ){pos="родился ";year1="19";} if (pol==6 ){pos="родился ";year1="20";}if (pol==8 ){pos="родился ";year1="21";}
   
        System.out.println("сумма : " + name+" "+fname+" "+year1);
    }
    
}
