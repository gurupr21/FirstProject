public class point {
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        var other = (point)obj;
        return other.x == x && other.y == y;
    }
}
