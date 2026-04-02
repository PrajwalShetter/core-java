class LockerRunner {

    public static void main(String... args) {

        Locker l1 = new Locker("Steel", "Home", 100.0, 50.0, 15000,
                "Gray", true, "PIN", 5, "Godrej");
        l1.show();

        Locker l2 = new Locker("Iron", "Office", 200.0, 80.0, 25000,
                "Black", false, "Key", 10, "SecureSafe");
        l2.show();

        Locker l3 = new Locker("Alloy", "Bank", 500.0, 150.0, 80000,
                "Silver", true, "Biometric", 20, "SafeGuard");
        l3.show();
    }
}