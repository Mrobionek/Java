public enum KeyboardWeight {
    GR_500(500),
    GR_600(600),
    GR_700(700),
    GR_800(800);

    private int value;

    KeyboardWeight(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
