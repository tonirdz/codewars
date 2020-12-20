package _7kyu;

public class Red_Knight {
    public static PawnDistance redKnight(int knight, long pawn) {
        String color = (pawn * 2 + knight * 2L) % 4 == 0 ? "White" : "Black";
        return new PawnDistance(color, pawn * 2);
    }
}
