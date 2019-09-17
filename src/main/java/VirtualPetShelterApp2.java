import java.util.Scanner;

public class VirtualPetShelterApp2 {
	
	
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter2 menagerie = new VirtualPetShelter2();
	
	public static void main(String[] args) {
		
		menagerie.admitPet(new OrganicCat("Name1", "Description1"));
		menagerie.admitPet(new OrganicCat("Name2", "Description2"));
		menagerie.admitPet(new OrganicDog("Name3", "Description3"));
		menagerie.admitPet(new OrganicDog("Name4", "Description4"));
		menagerie.admitPet(new RobotCat("Name5", "Description5"));
		menagerie.admitPet(new RobotCat("Name6", "Description6"));
		menagerie.admitPet(new RobotDog("Name7", "Description7"));
		menagerie.admitPet(new RobotDog("Name8", "Description8"));
		
		
		System.out.println("Welcome to the menagerie!");
		System.out.println(menagerie.getAllPets());
	}
		
		
		
		
		
	}
	



