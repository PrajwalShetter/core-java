class Movie{
	
	String title;
	String director;
	String genre;
	String language;
	double duration;
	double rating;
	int releaseYear;
	boolean isHit;
	String leadActor;
	double budget;
	
	Movie(String title, String director, String genre, String language, double duration, double rating, int releaseYear, boolean isHit, String leadActor, double budget){
		
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.language = language;
		this.duration = duration;
		this.rating = rating;
		this.releaseYear = releaseYear;
		this.isHit = isHit;
		this.leadActor = leadActor;
		this.budget = budget;
		
	}
	
	void display(){
		
		System.out.println("================");
		System.out.println("title :"+this.title);
		System.out.println("director :"+this.director);
		System.out.println("genre :"+this.genre);
		System.out.println("language :"+this.language);
		System.out.println("duration :"+this.duration);
		System.out.println("rating :"+this.rating);
		System.out.println("releaseYear :"+this.releaseYear);
		System.out.println("isHit :"+this.isHit);
		System.out.println("leadActor :"+this.leadActor);
		System.out.println("budget :"+this.budget);
		
	}
}