public class Keyboard {
    private final String name;
    private final KeyboardType type;
    private final KeyboardBacklight backlight;
    private final KeyboardWeight weight;

    public Keyboard(String name, KeyboardType type, KeyboardBacklight backlight, KeyboardWeight weight) {
        this.name = name;
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public String getName() { return name; }

    public KeyboardType getType() {
        return type;
    }

    public KeyboardBacklight getBacklight() {
        return backlight;
    }

    public KeyboardWeight getWeight() {
        return weight;
    }

}
