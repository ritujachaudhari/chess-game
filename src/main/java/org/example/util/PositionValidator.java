package org.example.util;

import java.util.regex.Pattern;

public class PositionValidator {

    public static boolean validatePosition(String position){
        return Pattern.matches("[A-H]{1}[1-8]{1}",position);
    }

}
