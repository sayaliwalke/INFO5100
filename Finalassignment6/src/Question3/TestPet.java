package Question3;

public class TestPet {

	public static void main(String[] args) {
		Pet pet = new Pet("Spot", "Mary", "Black and White");
		pet.setSex(1);
		System.out.println(pet);
		Cat cat = new Cat("Spot", "Bob", "Black", "Short");
		cat.setSex(2);
		System.out.println(cat);
		cat.setBoardStart(2, 15, 2014);
		cat.setBoardEnd(5, 15, 2015);
		cat.boarding(04, 10, 2014);
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setSex(3);
		System.out.println(dog);

	}
}