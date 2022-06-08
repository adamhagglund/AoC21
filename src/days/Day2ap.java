package days;

public class Day2ap {
    String[] entries;
    private int horizontal = 0;
    private int depth = 0;
    private int aim = 0;

    public Day2ap(String[] entries){
        this.entries = entries;
    }

    public int solvePart1() {
        for(String s : entries){
            String[] parts = s.split("\\s");
            switch(parts[0]){
                case "forward":
                    horizontal += Integer.valueOf(parts[1]);
                    break;
                
                case "down":
                    depth += Integer.valueOf(parts[1]);
                    break;

                case "up":
                    depth -= Integer.valueOf(parts[1]);
                    break;
            }
        }
        return horizontal*depth;
    }

    public int solvePart2(){
        for(String s : entries){
            String[] parts = s.split("\\s");
            switch(parts[0]){

                case "forward":
                    horizontal += Integer.valueOf(parts[1]);
                    depth += (aim * Integer.valueOf(parts[1]));
                    break;
                
                case "down":
                    aim += Integer.valueOf(parts[1]);
                    break;

                case "up":
                    aim -= Integer.valueOf(parts[1]);
                    break;
            }
        }
        return horizontal*depth;
    }
}
