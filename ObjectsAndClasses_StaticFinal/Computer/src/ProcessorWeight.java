public enum ProcessorWeight {
    GR_30(30),
    GR_40(40),
    GR_50(50);

    private final int value;

    ProcessorWeight(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
