public enum ProcessorCore {
    CORE_2(2),
    CORE_4(4),
    CORE_6(6),
    CORE_8(8);

    private final int value;

    ProcessorCore(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
