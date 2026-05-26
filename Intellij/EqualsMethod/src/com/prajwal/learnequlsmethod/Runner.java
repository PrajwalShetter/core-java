package com.prajwal.learnequlsmethod;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Report");
        Report report1 = new Report("Resume ATS checker",40,1.5,"Times new Roman", 1200);

        Report report2= new Report("Garbage classification", 20, 1.5,"Times new Roman",800);

        Report report3 = new Report("Resume ATS checker",40,1.5,"Times new Roman", 1200);

        boolean same= report1.equals(report2);
        System.out.println(same);

        boolean same1= report1.equals(report3);
        System.out.println(same1);

        System.out.println("===============================");
        System.out.println("IPLTEAM");
        IplTeam iplTeam1 = new IplTeam("RCB","Rajath Pattidhar",12,10,1);
        IplTeam iplTeam2= new IplTeam("CSK","Dhoni",12,7,5);
        IplTeam iplTeam3 = new IplTeam("RCB","Rajath Pattidhar",12,10,1);
        boolean ipl=iplTeam1.equals(iplTeam2);
        System.out.println(ipl);
        boolean ipl1=iplTeam1.equals(iplTeam3);
        System.out.println(ipl1);

        System.out.println("===========================");
        System.out.println("WEATHER");
        Weather weather1= new Weather(75,30,12.6,false,"Sunny");
        Weather weather2= new Weather(67,90,16.6,true,"cloudy");
        Weather weather3= new Weather(75,30,12.6,false,"Sunny");

        boolean weth=weather1.equals(weather2);
        System.out.println(weth);
        boolean weth2=weather1.equals(weather3);
        System.out.println(weth2);

        System.out.println("========================");
        System.out.println("Application");
        Application app1= new Application("Temple Run",12.23,"Prajwal",400,true);
        Application app2= new Application("Tally",9.10,"chandu",200,false);
        Application app3= new Application("Temple Run",12.23,"Prajwal",400,true);

        boolean application1 = app1.equals(app2);
        System.out.println(application1);
        boolean application2= app1.equals(app3);
        System.out.println(application2);

        System.out.println("====================");
        System.out.println("City");
        City city1= new City("Hubli",150000,"janardhan reddy",18,"Dharwad");
        City city2= new City("Kushtagi",25000,"Basavan Gowda",22,"Koppal");
        City city3= new City("Hubli",150000,"janardhan reddy",18,"Dharwad");

        boolean citysame1= city1.equals(city2);
        System.out.println(citysame1);
        boolean citysame2= city1.equals(city3);
        System.out.println(citysame2);



    }
}
