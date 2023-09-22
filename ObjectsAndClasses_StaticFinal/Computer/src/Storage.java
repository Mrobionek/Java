public class Storage {
    private final String name;
    private final StorageType type;
    private final StorageVolume volume;
    private final StorageWeight weight;

    public Storage(String name, StorageType type, StorageVolume volume, StorageWeight weight) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getName() { return name; }

    public StorageType getType() {
        return type;
    }

    public StorageVolume getVolume() {
        return volume;
    }

    public StorageWeight getWeight() {
        return weight;
    }

}
