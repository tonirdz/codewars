public class Fusion_Chamber_Shutdown {
    public static int[] burner(int c, int h, int o) {
        int w,cd,m;
        w = Math.min(h >> 1, o);
        cd = Math.min(c, o - w >> 1);
        m = Math.min(c - cd, (h - (w << 1)) >> 2);
        return new int[]{w, cd, m};
    }
}
