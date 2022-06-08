package days;

public class Day1 {
    int[] entries;

    public Day1(int[] entries){
        this.entries = entries;
    }

    public int solvePart1(){
        int previous = entries[0];
        int count = 0;

        for(int i : entries){
            if(i > previous) {
                count++;
            }
            previous = i;
        }
        return count;
    }

    public int solvePart2(){
        int previousWindow = entries[0] + entries[1] + entries[2];
        int count = 0;

        for(int i = 1; i < entries.length-2; i++){
            int currWindow = entries[i] + entries[i+1] + entries[i+2];
            if(currWindow > previousWindow){
                count++;
            }
            previousWindow = currWindow;
        }
        return count;
    }
}
