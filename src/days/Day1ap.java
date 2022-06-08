package days;

public class Day1ap {
    int[] entries;

    public Day1ap(int[] entries){
        this.entries = entries;
    }

    public int solvePart1() {
        int increased = 0;
        for(int i = 1; i < entries.length-1; i++){
            if(Integer.valueOf(entries[i]) > Integer.valueOf(entries[i-1])){
                increased++;
            }
        }
        return increased;
    }

    public int solvePart2(){
        int cur = 0;
        int prev = 0;
        int increased = 0;

        for(int i = 1; i < 3; i++){
            if(entries[i-1] > entries[i]+entries[i-1]){
                increased++;
            }
        }    

        for(int i = 3; i < entries.length; i++){
            cur = entries[i] + entries[i-1] + entries[i-2];
            prev = entries[i-1] + entries[i-2] + entries[i-3];
            
            if(cur > prev){
                increased++;
            }
        }
        return increased;
    }



}


