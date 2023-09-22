public enum RAMWeight {
    GR_10(10),
    GR_20(20),
    GR_30(30);

    private final int value;

    RAMWeight(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
