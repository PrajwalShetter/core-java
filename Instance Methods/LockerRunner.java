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

                Locker l4 = new Locker("Steel", 20000, true);
                l4.show();

                Locker l5 = new Locker("Home", "Gray");
                l5.show();

                Locker l6 = new Locker(150.0, 60.0);
                l6.show();

                Locker l7 = new Locker(8, "Godrej");
                l7.show();

                Locker l8 = new Locker("Biometric");
                l8.show();
        }
}