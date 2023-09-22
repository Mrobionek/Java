public enum RAMCapacity {
    GB_4(4),
    GB_8(8),
    GB_16(16),
    GB_32(32);

    private final int value;

    RAMCapacity(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
