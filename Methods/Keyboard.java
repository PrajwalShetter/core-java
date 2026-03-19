class Keyboard {
	
    static void type(){
		System.out.println("Keyboard used for typing"); 
		}
		
    static void press(){
		System.out.println("Keys are pressed"); 
		}
		
    static void connect(){
		System.out.println("Keyboard connected to computer");
		light();
		clean();
		}
		
    static void light(){
		System.out.println("Keyboard backlight on"); 
		}
		
    static void clean(){
		System.out.println("Keyboard can be cleaned"); 
		}
}