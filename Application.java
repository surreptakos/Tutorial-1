class Thing {
	public static final int LUCKY_NUM = 6;
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	/*
	public Thing() {
		this.LUCKY_NUM = 6;
	}
	
	public Thing(int num) {
		this.LUCKY_NUM = num;
	}
	*/
	
	public void showName() {
		System.out.println("Object id: " + id + ", Name: " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
}
public class Application {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		System.out.println(Thing.description);
		Thing.showInfo();
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.LUCKY_NUM);
		System.out.println("After creating objects, count is: " + Thing.count);
		
	}

}
