public enum ScreenDiagonal {
    Inches_17(17),
    Inches_19(19),
    Inches_21(21);

    private final int value;

    ScreenDiagonal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
