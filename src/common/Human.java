//Write a class, called Human. It has the following properties: age (int), name (String), 
//height (double, means the height of the human in meters). Create a class, 
//called HumanHeightComparator which implements java.util.Comparator and is able to decide 
//if a human is taller than another human. Create a class, called HumanHandler, create 
//a main method and instantiate some Human objects in the main method. Add the objects to a 
//List. Sort the human objects by their height in the List.

package common;

public class Human {
	
	private int age;
	private String name;
	private double height;
	
	public Human(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString(){
		return "Age: " + age + ", \nName: " + name + ", \nHeight: " + height + "\n\n";
	}
}
