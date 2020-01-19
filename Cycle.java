import java.lang.Math;


public class Cycle {

    int month;
    int[] yearCycle = new int[12];

    public Cycle(int month, int[] yearCycle){
        this.yearCycle = yearCycle;
        this.month = month;
    }

    public void updateCycle(int value) {
        this.yearCycle[month - 1] = value;
    }

    public int calculateMean() { 
        int sum = 0;
        for(int i = 0; i < 13; i++) {
            sum += this.yearCycle[i];
        }
        return (Math.round(sum / 12));
    }
}