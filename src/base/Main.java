package base;
import base.Parser;
import days.Day4ap;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        //int[] inputx = parser.parseAllLinesAsInt("day2");
        String[] input = parser.parseAllLinesAsString("day4");
        //long[] input = parser.parseAllLinesAsLong("3");
        Day4ap day = new Day4ap(input);
        System.out.println(day.solvePart1());

        //System.out.println(day.solvePart1());
        //System.out.println(day.solvePart2());
        
    }
}
