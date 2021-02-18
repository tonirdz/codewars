import java.util.Objects;

public class PawnDistance {
    private final String color;
    private final long distance;

    public PawnDistance(String s, long d) {
        color = s;
        distance = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PawnDistance that = (PawnDistance) o;
        return distance == that.distance && Objects.equals(color, that.color);
    }
}
