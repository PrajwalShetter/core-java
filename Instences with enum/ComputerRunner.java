class ComputerRunner {

    public static void main(String... args) {

        Monitor monitor = new Monitor("Dell", 24.0);

        Computer computer = new Computer(monitor, "Intel i5", 16, UsageType.GAMING);

        computer.showDetails();
    }
}