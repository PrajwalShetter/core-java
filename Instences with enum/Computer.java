class Computer {

    Monitor monitor;
    String cpu;
    int ram;
    UsageType usageType;

    Computer(Monitor monitor, String cpu, int ram, UsageType usageType) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.ram = ram;
        this.usageType = usageType;
    }

    void showDetails() {

        if (monitor != null) {
            monitor.display();
        } else {
            System.out.println("Monitor is null");
        }

        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Usage Type: " + usageType);
    }
}