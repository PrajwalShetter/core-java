class Snake {

    static void crawl() {
        System.out.println("Snake is crawling");
    }

    static void hiss() {
        System.out.println("Snake is hissing");
    }

    static void bite() {
        System.out.println("Snake can bite");
		hunt();
		shedSkin();
    }

    static void hunt() {
        System.out.println("Snake hunts prey");
    }

    static void shedSkin() {
        System.out.println("Snake sheds skin");
    }
}