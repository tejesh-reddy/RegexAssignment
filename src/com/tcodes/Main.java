package com.tcodes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\p{Lu}.*\\.$");
        System.out.println("Enter a sentence");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        if(matcher.find())
        {
            System.out.println("Type checking success: no issue.");
        }
        else {
            System.out.println("Type checking failure: doesn't match string format.");
        }
    }
}
