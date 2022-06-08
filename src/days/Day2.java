package days;

public class Day2 {
    String[] entries;
    int hPos = 0;
    int dept = 0;
    int aim = 0;

    public Day2(String[] entries){
        this.entries = entries;
    }

    public int solvePart1() {
        for(String c : entries){
            char charVal = c.charAt(c.length()-1);
           if(c.contains("forward")){
               hPos += Character.getNumericValue(charVal);
               System.out.println(c + " hPos " + hPos);
           } else if(c.contains("down")){
               dept += Character.getNumericValue(charVal);
               System.out.println(c + " dept now " + dept);
           } else {
               dept -= Character.getNumericValue(charVal);
               System.out.println(c + " dept now " + dept);
           }
        }
        return hPos * dept;
    }

    public int solvePart2(){
        for(String c : entries){
            char charVal = c.charAt(c.length()-1);
            int intVal = Character.getNumericValue(charVal);
            if(c.contains("forward")){
                hPos += intVal;
                dept += intVal * aim;
            } else if(c.contains("down")){
                aim += intVal;
            } else {
                //dept -= intVal;
                aim -= intVal;
            }
        }
        return hPos * dept;
     }
}
