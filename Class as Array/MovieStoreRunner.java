class MovieStoreRunner{
	
	public static void main(String[] args){
		
		Movie[] movies = new Movie[20];
		
		movies[0] = new Movie("KGF","Prashanth Neel","Action","Kannada",155.0,8.5,2018,true,"Yash",80000000.0);
		movies[1] = new Movie("RRR","Rajamouli","Action","Telugu",180.0,8.8,2022,true,"NTR",550000000.0);
		movies[2] = new Movie("Inception","Nolan","Sci-Fi","English",148.0,8.9,2010,true,"DiCaprio",160000000.0);
		movies[3] = new Movie("Bahubali","Rajamouli","Drama","Telugu",160.0,8.2,2015,true,"Prabhas",250000000.0);
		movies[4] = new Movie("Dangal","Aamir Khan","Sports","Hindi",161.0,8.4,2016,true,"Aamir Khan",70000000.0);
		movies[5] = new Movie("Avengers","Russo","Action","English",143.0,8.0,2012,true,"Downey",220000000.0);
		movies[6] = new Movie("Pushpa","Sukumar","Action","Telugu",179.0,7.8,2021,true,"Allu Arjun",200000000.0);
		movies[7] = new Movie("Interstellar","Nolan","Sci-Fi","English",169.0,8.6,2014,true,"McConaughey",165000000.0);
		movies[8] = new Movie("3 Idiots","Hirani","Comedy","Hindi",171.0,8.4,2009,true,"Aamir Khan",55000000.0);
		movies[9] = new Movie("Jailer","Nelson","Action","Tamil",168.0,7.5,2023,true,"Rajinikanth",200000000.0);
		movies[10] = new Movie("Kantara","Rishab Shetty","Drama","Kannada",150.0,8.3,2022,true,"Rishab",16000000.0);
		movies[11] = new Movie("Titanic","Cameron","Romance","English",195.0,8.1,1997,true,"DiCaprio",200000000.0);
		movies[12] = new Movie("Vikram","Lokesh","Action","Tamil",175.0,8.3,2022,true,"Kamal",150000000.0);
		movies[13] = new Movie("KGF 2","Prashanth Neel","Action","Kannada",168.0,8.6,2022,true,"Yash",100000000.0);
		movies[14] = new Movie("Drishyam","Nishikant","Thriller","Hindi",163.0,8.2,2015,true,"Ajay Devgn",60000000.0);
		movies[15] = new Movie("Pathaan","Siddharth Anand","Action","Hindi",146.0,7.2,2023,true,"Shah Rukh",250000000.0);
		movies[16] = new Movie("Leo","Lokesh","Action","Tamil",165.0,7.6,2023,true,"Vijay",300000000.0);
		movies[17] = new Movie("Jawan","Atlee","Action","Hindi",169.0,7.8,2023,true,"Shah Rukh",300000000.0);
		movies[18] = new Movie("Salaar","Prashanth Neel","Action","Telugu",175.0,7.9,2023,true,"Prabhas",400000000.0);
		movies[19] = new Movie("Animal","Sandeep Reddy","Drama","Hindi",180.0,7.5,2023,true,"Ranbir Kapoor",350000000.0);
		
		MovieStore store = new MovieStore();
		
		for(int i=0; i<movies.length; i++){
			store.store(movies[i]);
		}
		
		store.display();
	}
}