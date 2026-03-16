class Fibonacci
{
		public static void main(String[] args)
		{
			int num =10;
			int a = 0;
			int b = 1;
			
			
			System.out.println(a+"\n");
			System.out.println(b+"\n");
			
			for (int i=2; i<num; i++)
			{
				int c = a+b;
				System.out.println(c+"\n");
				
				a=b;
				b=c;
			}
		}
		
}
