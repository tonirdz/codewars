package _8kyu;

public class Will_There_Be_Enough_Space {
    public static int enough(int cap, int on, int wait){
        int seats = cap - on;
        return seats < wait ? wait - seats : 0;
    }
}
