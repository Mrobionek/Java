public class Processor {
    private final String name;
    private final CPUFrequency frequency;
    private final ProcessorCore core;
    private final ProcessorManufacturer manufacturer;
    private final ProcessorWeight weight;

    public Processor(String name, CPUFrequency frequency, ProcessorCore core, ProcessorManufacturer manufacturer, ProcessorWeight weight) {
        this.name = name;
        this.frequency = frequency;
        this.core = core;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String getName() { return name; }

    public CPUFrequency getFrequency() {
        return frequency;
    }

    public ProcessorCore getCore() {
        return core;
    }

    public ProcessorManufacturer getManufacturer() {
        return manufacturer;
    }

    public ProcessorWeight getWeight() {
        return weight;
    }

}
