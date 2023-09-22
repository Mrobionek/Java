public enum StorageVolume {
    GB_128(128),
    GB_256(256),
    GB_512(512);

    private final int value;

    StorageVolume(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
