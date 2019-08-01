package myFirstJavaCode2;
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListClass {
	
	String name;
	int age;
	int weight;
	int height;
	
	
	public void editMember(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner indexing = new Scanner(System.in);
		int members,num;
		
		String newName;
		int newAge, newHeight, newWeight;
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Integer> weights = new ArrayList<Integer>();
		ArrayList<Integer> heights = new ArrayList<Integer>();
		
		
		ArrayListClass obj = new ArrayListClass();
		
		System.out.print("How many peoples? ");
		members = input.nextInt();
		input.nextLine();
		
		for(int i=0;i<members;i++) {
		System.out.print("Enter name: ");
		obj.name = input.nextLine();
		
		System.out.print("Enter age: ");
		obj.age = input.nextInt();
		
		System.out.print("Enter weight: ");
		obj.weight = input.nextInt();
		
		System.out.print("Enter height: ");
		obj.height = input.nextInt();
		input.nextLine();
		
		
		names.add(obj.name);
		ages.add(obj.age);
		weights.add(obj.weight);
		heights.add(obj.height);
		
		}
		
		int index = 0;
		//obj.show();
		System.out.println("Names\tAge\tWeight\tHeight");
		for(int i=0;i<names.size();i++) {
			//you can write any of the int in **for(int i=0;i<names.size();i++)**
			//like for(int i=0;i<ages.size();i++) or
			//for(int i=0;i<weights.size();i++)
			//because the size of these int and String will be same 
			//because of the for loop above
			//try to understand
			System.out.println(names.get(index)+"\t"+ages.get(index)+"\t"+
										weights.get(index)+"\t"+heights.get(index));
			index++;
		}
		
		System.out.println();
		System.out.print("Enter 1 to edit any member >> ");
		int number = input.nextInt();
		input.nextLine();
		
		switch(number) {
		case 1:
			
			System.out.print("Enter index: ");
			num = indexing.nextInt();
			indexing.nextLine();
			
			System.out.print("Enter new name: ");
			newName = indexing.nextLine();
			newName = names.set(num, newName);
			
			if(newName.isEmpty())
				newName = obj.name;
			
			System.out.print("Enter new age: ");
			newAge = indexing.nextInt();
			newAge = ages.set(num, newAge);
			
			System.out.print("Enter new weight: ");
			newWeight = indexing.nextInt();
			newWeight = weights.set(num, newWeight);
			
			System.out.print("Enter new height: ");
			newHeight = indexing.nextInt();
			newHeight = heights.set(num, newHeight);
			
			System.out.println("Updated version!");
			
			index = 0;
			System.out.println("Names\tAge\tWeight\tHeight");
			for(int i=0;i<names.size();i++) {
				System.out.println(names.get(index)+"\t"+ages.get(index)+"\t"+
						weights.get(index)+"\t"+heights.get(index));
						index++;
			}
		}
		
	}

}
