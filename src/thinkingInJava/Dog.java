package thinkingInJava;

public class Dog {
	String name, says;
	
	private Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("spot", "Ruff");
		Dog dog2 = new Dog("scuffy", "Wurf");
		
		System.out.println("dog:" + dog.name + "\t bark:" + dog.says);
		System.out.println("dog:" + dog2.name + "\t bark:" + dog2.says);
		
		Dog dog3 = dog;
		System.out.println(dog == dog3);
		System.out.println(dog.equals(dog3));
	}
}
