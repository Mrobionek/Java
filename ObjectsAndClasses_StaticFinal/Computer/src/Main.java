public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor("processor1", CPUFrequency.GHz_2, ProcessorCore.CORE_2, ProcessorManufacturer.Intel, ProcessorWeight.GR_30);
        Processor processor2 = new Processor("processor2",CPUFrequency.GHz_3, ProcessorCore.CORE_4, ProcessorManufacturer.AMD, ProcessorWeight.GR_40);
        Processor processor3 = new Processor("processor3",CPUFrequency.GHz_4, ProcessorCore.CORE_6, ProcessorManufacturer.Intel, ProcessorWeight.GR_50);

        Keyboard keyboard1 = new Keyboard("keyboard1", KeyboardType.BLUETOOTH, KeyboardBacklight.NO, KeyboardWeight.GR_500);
        Keyboard keyboard2 = new Keyboard("keyboard2", KeyboardType.QWERTY, KeyboardBacklight.YES, KeyboardWeight.GR_600);
        Keyboard keyboard3 = new Keyboard("keyboard3", KeyboardType.MAGIC, KeyboardBacklight.YES, KeyboardWeight.GR_800);

        RAM ram1 = new RAM("ram1", RAMType.DDR2, RAMCapacity.GB_8, RAMWeight.GR_20);
        RAM ram2 = new RAM("ram2", RAMType.DDR4, RAMCapacity.GB_16, RAMWeight.GR_10);
        RAM ram3 = new RAM("ram3", RAMType.DDR5, RAMCapacity.GB_32, RAMWeight.GR_30);

        Screen screen1 = new Screen("screen1", ScreenDiagonal.Inches_17, ScreenType.VA, ScreenWeight.GR_28);
        Screen screen2 = new Screen("screen2", ScreenDiagonal.Inches_19, ScreenType.TN, ScreenWeight.GR_20);
        Screen screen3 = new Screen("screen3", ScreenDiagonal.Inches_21, ScreenType.IPS, ScreenWeight.GR_34);

        Storage storage1 = new Storage("storage1", StorageType.HDD, StorageVolume.GB_128, StorageWeight.GR_700);
        Storage storage2 = new Storage("storage2", StorageType.SSD, StorageVolume.GB_256, StorageWeight.GR_800);
        Storage storage3 = new Storage("storage3", StorageType.HDD, StorageVolume.GB_512, StorageWeight.GR_900);

        Computer computer1 = new Computer("vendor1", "name1", processor1, ram1, storage1, screen1, keyboard1);
        Computer computer2 = new Computer("vendor2", "name2", processor2, ram2, storage2, screen2, keyboard2);
        Computer computer3 = new Computer("vendor3", "name3", processor3, ram3, storage3, screen3, keyboard3);

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(computer3.toString());

    }
}
