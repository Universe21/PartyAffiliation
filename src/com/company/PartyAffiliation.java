package com.company;

import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch;

        System.out.print("menu:\n(D)emocratic\n(R)epublican\n(I)ndependent\n(O)ther\nEnter your choice(D/R/I/O): ");

        //input(ch)

        ch = scanner.next().charAt(0);

        if(ch == 'D')

            System.out.println("You get a Democratic Donkey");

        else if(ch == 'R')

            System.out.println("You get a Republican Elephant");

        else if(ch == 'I')

            System.out.println("You are an Independent Person");

        else

            System.out.println("You are apart of the Others");

    }

}


