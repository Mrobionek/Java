public class Screen {
    private final String name;
    private final ScreenDiagonal diagonal;
    private final ScreenType type;
    private final ScreenWeight weight;

    public Screen(String name, ScreenDiagonal diagonal, ScreenType type, ScreenWeight weight) {
        this.name = name;
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public String getName() { return name; }

    public ScreenDiagonal getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public ScreenWeight getWeight() {
        return weight;
    }
}
