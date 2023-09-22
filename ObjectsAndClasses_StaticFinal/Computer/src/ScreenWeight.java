public enum ScreenWeight {
    GR_20(20),
    GR_28(28),
    GR_34(34);

    private final int value;

    ScreenWeight(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
