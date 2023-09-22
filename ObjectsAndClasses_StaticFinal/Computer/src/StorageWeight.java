public enum StorageWeight {
     GR_700(700),
     GR_800(800),
     GR_900(900);

     private final int value;

     StorageWeight(int value) {
          this.value = value;
     }

     public int getValue() {
          return value;
     }
}
