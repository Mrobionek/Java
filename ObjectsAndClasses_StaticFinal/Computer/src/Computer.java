public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name, Processor processor, RAM ram, Storage storage, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int calculateComputerWeight() {
        int processorWeight = processor.getWeight().getValue();
        int keyboardWeight = keyboard.getWeight().getValue();
        int ramWeight = ram.getWeight().getValue();
        int screenWeight = screen.getWeight().getValue();
        int storageWeight = storage.getWeight().getValue();

        return processorWeight + keyboardWeight + ramWeight + screenWeight + storageWeight;
    }

    @Override
    public String toString() {
        return "Computer{" + "\n" +
                "vendor = " + vendor + "\n" +
                "name = " + name + "\n" +
                "processor = " + processor.getName() + "\n" +
                "ram = " + ram.getName() + "\n" +
                "storage = " + storage.getName() + "\n" +
                "screen = " + screen.getName() + "\n" +
                "keyboard = " + keyboard.getName() + "\n" +
                "computerWeight = " + calculateComputerWeight() + "\n" + "\n" +
                '}';
    }
}

// CPUFrequency  2, 3, 4
// processor core = ядро 2, 4, 6, 8
// ProcessorManufacturer - Intel и AMD;
// ProcessorWeight 30, 40, 50

// RAMType DDR, DDR2, DDR3, DDR4, DDR5
// RAMCapacity 4, 8, 16, 32
// RAMWeight 10, 15, 20

// InformationStorageType - HDD, SSD;
// InformationStorageVolume - 128, 256, 512
// InformationStorageWeight - 700, 800, 900

// ScreenDiagonal 17, 19, 21
// ScreenType IPS, TN, VA
// ScreenWeight 20, 28, 34

// KeyboardType QWERTY, WIRED, NUMERIC, ERGONOMIC, WIRELESS, BLUETOOTH, MAGIC, USB
// KeyboardBacklight YES, NO
// KeyboardWeight 500, 600, 700, 800



