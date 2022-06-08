package base;
import base.Parser;
import days.Day3;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        //int[] inputx = parser.parseAllLinesAsInt("3");
        String[] input = parser.parseAllLinesAsString("3");
        //long[] input = parser.parseAllLinesAsLong("3");
        Day3 day = new Day3(input);

        //System.out.println(day.solvePart1());
        System.out.println(day.solvePart2());
    }
}
