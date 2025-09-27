// goes into infinite recursion

class InfiniteRecursion{
	
	static void show(){
		System.out.println("Hello Recursion");
		show(); // calls itself again → recursion
	}
	
	public static void main(String args[]){
		System.out.println("Recursion...!!");
		show();
	}
}
