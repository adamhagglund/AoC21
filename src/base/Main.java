package base;
import base.Parser;
import days.Day1ap;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        int[] inputx = parser.parseAllLinesAsInt("day1");
        //String[] input = parser.parseAllLinesAsString("day1");
        //long[] input = parser.parseAllLinesAsLong("3");
        Day1ap day = new Day1ap(inputx);
        System.out.println(day.solvePart2());

        //System.out.println(day.solvePart1());
        //System.out.println(day.solvePart2());
        
    }
}
