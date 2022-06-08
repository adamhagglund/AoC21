package days;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {
    String[] entries;
    int nbrOfOnes, nbrOfZeros = 0;
    String gamma = "";
    String epsilon = "";

    public Day3(String[] entries) {
        this.entries = entries;
    }

    public int toDecimal(String nbr) {
        int decimal = Integer.parseInt(nbr, 2);
        return decimal;
    }

    public int solvePart1() {
        for (int i = 0; i < entries[0].length(); i++) {
            for (String currLine : entries) {
                char charVal = currLine.charAt(i);
                if (charVal == '1') {
                    nbrOfOnes += 1;
                } else {
                    nbrOfZeros += 1;
                }
            }
            if (nbrOfOnes > nbrOfZeros) {
                gamma += "1";
                epsilon += "0";
            } else {
                gamma += "0";
                epsilon += "1";
            }
            nbrOfZeros = 0;
            nbrOfOnes = 0;
            System.out.println(gamma + " " + epsilon);
        }
        System.out.println(toDecimal("10110"));
        return toDecimal(gamma) * toDecimal(epsilon);
    }

    public int getOxi(ArrayList<String> input, int pos){
        ArrayList<String> ones = new ArrayList<>();
        ArrayList<String> zeros = new ArrayList<>();
        nbrOfZeros = 0;
        nbrOfOnes = 0;
        if (input.size() > 1) {
            for (String currLine : input) {
                char charVal = currLine.charAt(pos);
                if (charVal == '1') {
                    nbrOfOnes += 1;
                    ones.add(currLine);
                } else {
                    nbrOfZeros += 1;
                    zeros.add(currLine);
                }
            }

            if (nbrOfOnes >= nbrOfZeros) {
                return getOxi(ones, pos+1);

            } else {
                return getOxi(zeros, pos+1);
            }

        }
        return toDecimal(input.get(0));
    }

    public int getCO2(ArrayList<String> input, int pos){
        ArrayList<String> ones = new ArrayList<>();
        ArrayList<String> zeros = new ArrayList<>();
        nbrOfZeros = 0;
        nbrOfOnes = 0;
        if (input.size() > 1) {

            for (String currLine : input) {
                char charVal = currLine.charAt(pos);
                if (charVal == '1') {
                    nbrOfOnes += 1;
                    ones.add(currLine);
                } else {
                    nbrOfZeros += 1;
                    zeros.add(currLine);
                }
            }
            if (nbrOfOnes >= nbrOfZeros) {
                return getCO2(zeros, pos+1);
            } else {
                return getCO2(ones, pos+1);
            }
        }
        return toDecimal(input.get(0));
    }


    public int solvePart2() {
        ArrayList<String> tempArray = new ArrayList<>();
        for(String s:entries){
            tempArray.add(s);
        }
        int oxi = getOxi(tempArray, 0);
        int co2 = getCO2(tempArray, 0);
        return oxi * co2;

    }
}
