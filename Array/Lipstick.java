/*
Program to store ref's of below data Update element in each example Demo to show ArrayIndexOutOfBoundsException Read and print 
all using loop Access elements in reverse direction 
lipstick brand : 10
 gun models : 30 
car models : 25 
famous tourist places : 30
 plant names : 25 
 *Sort elements in array
 
 */
 
 class Lipstick{


	public static void main(String[] args){
		
		String lipstick1="Lakme";
		String lipstick2="Maybelline";
		String lipstick3="MAC";
		String lipstick4="L'Oréal";
		String lipstick5="Revlon";
		String lipstick6="Colorbar";
		String lipstick7="Faces Canada";
		String lipstick8="Sugar Cosmetics";
		String lipstick9="Nykaa";
		String lipstick10="Huda Beauty";
		
		
		String[] lipsticks ={lipstick1,lipstick2,lipstick3,lipstick4,lipstick5,lipstick6,lipstick7,lipstick8,lipstick9,lipstick10};
		
		
		lipsticks[2]="grapes";
		
		int size= lipsticks.length;
		for(int start=0;start<size;start++)
		{
			System.out.println("Element at position "+ start +" is :"+lipsticks[start]);
		}
		lipsticks[111]="oppo";
		}
 }
 