package _8kyu;

public class Smallest_unused_ID {
    public static int nextId(int[] ids) {
        boolean[] exists = new boolean[ids.length];
        for (int id : ids) {
            if (id < ids.length) exists[id] = true;
        }
        for(int i = 0; i < exists.length; i++) {
            if (!exists[i]) return i;
        }
        return exists.length;
   }
}
