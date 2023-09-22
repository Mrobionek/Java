public class RAM {
    private final String name;
    private final RAMType type;
    private final RAMCapacity capacity;
    private final RAMWeight weight;

    public RAM(String name, RAMType type, RAMCapacity capacity, RAMWeight weight) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getName() { return name; }

    public RAMType getType() {
        return type;
    }

    public RAMCapacity getCapacity() {
        return capacity;
    }

    public RAMWeight getWeight() {
        return weight;
    }
}
