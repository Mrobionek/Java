public enum CPUFrequency {
        GHz_2(2),
        GHz_3(3),
        GHz_4(4);

        private final int value;

        CPUFrequency(int value) {
                this.value = value;
        }

        public int getValue() {
                return value;
        }
}
