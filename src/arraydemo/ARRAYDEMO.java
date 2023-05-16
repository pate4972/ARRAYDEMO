/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ARRAYDEMO {

    private static Readable source;
    private static int index;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = false;
        /*char[] myLetters = new char[5];
        myLetters[0] ='M';
        myLetters[1] ='S';
        myLetters[2] ='A';
        myLetters[3] ='I';
        myLetters[4] ='F';
        for(int i = 0;i<myLetters.length;i++){
            System.out.print(myLetters[i]);
        } */
        System.out.println(" Enter Word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        for(int i =0;i<myLetters.length;i++) {
            myLetters[i]=myWord.charAt( i);
            System.out.print(myLetters[i]);
        }
        for(int i = myLetters.length-1;i>=0 ;i --)
            System.out.print(myLetters[i]);
        // TODO code application logic here
    }
    
}
