package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.*;

public class Task2Runner {

    public static void main(String[] args) {

        Greetings greeting = name -> "Welcome " + name;
        System.out.println(greeting.greet("Prajwal"));

        Country country = name -> name.substring(0,3).toUpperCase();
        System.out.println(country.getCountryCode("India"));

        Voter voter = age -> age>=18;
        System.out.println(voter.isEligible(23));

        Temperature temperature = temperature1 -> temperature1>25 ? "Hot" : "Cool";
        System.out.println(temperature.weather(34));

        CharacterType characterType = ch -> Character.isAlphabetic(ch);
        System.out.println(characterType.isCharacter('A'));

        Message message = msg -> System.out.println(msg);
        message.display("Hello prajwal");

        FruitList fruitList = arr -> arr[0];
        System.out.println(fruitList.firstFruit(new String[]{"Apple","Banana", "churry"}));

        Student student = arr -> arr[arr.length-1];
        System.out.println(student.studentName(new String[]{"Danesh", "Karthik", "priya"}));

        Mobile mobile= imei -> "Samsong";
        System.out.println(mobile.brand(980078657890237L));

        Password password = password1 -> password1.length()>=8;
        System.out.println(password.validate("TumTum123"));

        Printer printer = cost -> cost>=10 ? "Color" : "Black and white";
        System.out.println(printer.printCopy(2));

        Whether w = new Whether("Bengaluru",28.5);
        WhetherReport wr = whether -> w.getCity();
        System.out.println(wr.report(w));

        Pizza p = new Pizza("cheesyPizza",120);
        Bill b = new Bill("B110","2028");
        PizzaOrder pizzaOrder = pizza -> b;
        System.out.println(pizzaOrder.order(p));

        Photo ph = new Photo("122*778",10);
        CameraFilter cm = photo -> ph;
        System.out.println(cm.details(ph));

        Rocket rocket = new Rocket("Vikram",6000.00);
        RocketLaunch Rl = rocket1 -> rocket.getName().equals("Vikram");
        System.out.println(Rl.launch(rocket));

        Drone dr = new Drone("SkyHigh", 200,"1080p");
        Location lc = new Location("Malleshwarm","12.00.998","278.90.765");
        DroneTracker dt = drone -> lc;
        System.out.println(dt.track(dr));

        Coffee cf = new Coffee("BlackCoffee", 120 );
        CoffeeMaker coffeeMaker = coffee -> {

        };
        coffeeMaker.data(cf);

        Movie movie = new Movie("My fault");
        Ticket ticket = new Ticket("T110","2029");
        MovieTicket mt = movie1 -> ticket;
        System.out.println(mt.display(movie));

        Planet p1 = new Planet("earth", 5,true);
        Planet p2 = new Planet("Mars", 2,true);
        Planet p3 = new Planet("Venus",3,false);
        Planet[] plantes = {p1,p2,p3};
        PlanetScanner ps = planets -> p1;
        System.out.println(ps.details(plantes));

        Passport passport = new Passport("Prajwal","India");
        PassportVerifier pv = passport1 -> passport.getNation().equals("India");
        System.out.println(pv.verify(passport));

        Song song = new Song("Gamanava",3.00,"kannada");
        MusicPlayer mp = song1 -> System.out.println(song);
        mp.songInfo(song);


        NameFormatter  nameFormatter = name -> name.toLowerCase();
        System.out.println(nameFormatter.displayName("Jacki"));

        UsernameChecker usernameChecker = (userName, prefix) -> userName.startsWith(prefix);
        System.out.println(usernameChecker.checker("Prajwal", "q"));

        EmailValidator emailValidator = (email, domain) -> email.endsWith(domain);
        System.out.println(emailValidator.validate("kanasu@gmail.com",".com"));

        PasswordMatcher passwordMatcher = (pass1, pass2) -> pass1.equals(pass2);
        System.out.println(passwordMatcher.match("oooooOO333","pppppp((0"));

        CityComparer cityComparer = (city1, city2) -> city1.compareTo(city2);
        System.out.println(cityComparer.compare("Koppal", "koppal"));

        WordFinder wordFinder = (sentence, word) -> sentence.contains(word);
        System.out.println(wordFinder.find("Putting someones need befor them", "Love"));

        InitialExtractor initialExtractor = (firstName, lastName) -> firstName.substring(3);
        System.out.println(initialExtractor.extract("Prajwal", "Shetter"));

        ProductCode productCode = (brand, model, year) -> brand.concat(model);
        System.out.println(productCode.concat("BMW","XWW",2019));













    }
}
