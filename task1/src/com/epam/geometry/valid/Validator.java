package com.epam.geometry.valid;


import java.util.Locale;
import java.util.Scanner;

public class Validator {
    public static boolean isValidCoordinate(String coordinate){
        Scanner scanner = new Scanner(coordinate);
        scanner.useLocale(Locale.US);
        if(scanner.hasNextFloat()){
            return true;
        }
        return false;
    }
}
