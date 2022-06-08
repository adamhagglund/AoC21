package base;
import base.Parser;
import days.Day2ap;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        //int[] inputx = parser.parseAllLinesAsInt("day2");
        String[] input = parser.parseAllLinesAsString("day2");
        //long[] input = parser.parseAllLinesAsLong("3");
        Day2ap day = new Day2ap(input);
        System.out.println(day.solvePart2());

        //System.out.println(day.solvePart1());
        //System.out.println(day.solvePart2());
        
    }
}
