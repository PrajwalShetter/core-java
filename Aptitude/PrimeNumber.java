/*
Program to find prime number 
Program to find armstrong 
Program to find fibonacci 
Program to find reverse of a string 
Program to find palindrome
*/

class PrimeNumber{

public static void main(String[] args){
	
	int num=5;
	int count =0;
	
	for(int i=2; i<=num; i++){
		if(num % i == 0){
			count++;
			
	}
	}
	if(count==2){
		System.out.println("The given number" + num +" is Prime"); 
	}
	else{
		System.out.println("The given number" +num +" is not Prime");
	}
	
}
}