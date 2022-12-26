package com.bridgelabz.linecomparison;

import java.util.Scanner;
  public class LenghtOfLine {
    public void lengthOfLine(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point x1: ");
        int x1 = scan.nextInt();
        System.out.println("Enter line y1: ");
        int y1 = scan.nextInt();
        System.out.println("Enter line x2: ");
        int x2 = scan.nextInt();
        System.out.println("Enter line y2: ");
        int y2 = scan.nextInt();
        double length = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length Of Line is: " +length);

    }

    public static void main(String[] args) {
        LenghtOfLine lenght = new LenghtOfLine();
        lenght.lengthOfLine();
    }

}
