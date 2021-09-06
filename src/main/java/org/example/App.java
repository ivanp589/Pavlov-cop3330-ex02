package org.example;

import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *    Copyright 2021 first_name last_name
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "What is the input string?" );
        String str = scanner.nextLine();

        while (str.length() == 0){
            System.out.print("please enter a string");
            str = scanner.nextLine();

        }

        System.out.print(str+ " has " +str.length()+ " characters");
    }}

