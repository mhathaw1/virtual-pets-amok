import java.util.Scanner;

//import VirtualPetShelter2.VirtualPet2;

public class VirtualPetShelterApp2 {
	
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter2 menagerie = new VirtualPetShelter2();
	
	public static void main(String[] args) {
		
		menagerie.admitPet(new OrganicCat("OrgoCat", "Lapcat", 10, 10, 10, 10, 10));
		menagerie.admitPet(new OrganicDog("OrgoDog", "Loves enthusiasm.", 10, 10, 10, 10, 10, 10));
		menagerie.admitPet(new RobotCat("RobotCat", "Also a lapcat, but less comfy", 10, 10, 10, 10));
		menagerie.admitPet(new RobotDog("RobotDog", "Will get you a beer on command.", 10, 10, 10, 10));
		System.out.println("Welcome to the menagerie!");
		menagerie.displayStatus();
		clockIn: while (true){
		
		printOptions();
		int userInput = input.nextInt();
		input.nextLine();
		
			switch(userInput) {
			case 1:
				menagerie.displayStatus();
				break;
			case 2:
				menagerie.tickAllPets();
				menagerie.feedPets();
				break;
			case 3:
				menagerie.tickAllPets();
				menagerie.waterPets();
				break;
			case 4:
				menagerie.tickAllPets();
				printPets();
				System.out.println("Which pet would you like to play with?");
				input.hasNextLine();
				String chosenOne = input.nextLine();
				menagerie.playWithOnePet(chosenOne);
				System.out.println("You played with " + chosenOne + "!");
				break;
			case 5:
				System.out.println("You took the dogs on a walk!");
				menagerie.tickAllPets();
				menagerie.walkDogs();
				break;
			case 6:
				System.out.println("You clean out the dogs' cages.");
				menagerie.tickAllPets();
				menagerie.cleanCages();
				break;
			case 7:
				System.out.println("You clean out the litter boxes");
				menagerie.tickAllPets();
				menagerie.cleanLitterBox();
				break;
			case 8:
				System.out.println("You oiled the robotic pets");
				menagerie.oilAllRobots();
				menagerie.tickAllPets();
				break;
			case 9:
				System.out.println("You fixed up the robotic pets!");
				menagerie.maintainRobots();
				menagerie.tickAllPets();
				break;
			case 10:
				System.out.println("What is the name of the cat you're addmitting?");
				String newPet = input.nextLine();
				System.out.println("Please enter a description for " + newPet + ":");
				String newPetDescription = input.nextLine();
				System.out.println("Enter '1' if this pet is an organic cat, '2' if an organic dog, '3' if a robot cat, or '4' if a robot dog");
				int petType = input.nextInt();
				
				switch (petType) {
				case 1:
					menagerie.admitPet(new OrganicCat(newPet, newPetDescription, 10, 10, 10, 10, 10));
					break;
				case 2:
					menagerie.admitPet(new OrganicDog(newPet, newPetDescription, 10, 10, 10, 10, 10, 10));
					break;
				case 3: 
					menagerie.admitPet(new RobotCat(newPet, newPetDescription, 10, 10, 10, 10));
					break;
				case 4:
					menagerie.admitPet(new RobotDog(newPet, newPetDescription, 10, 10, 10, 10));
					break;
				}
				System.out.println("We'll take good care of " + newPet + "!");
				break;
			case 11:
				System.out.println("Which pet would you like to adopt?");
				input.hasNextLine();
				String petToBeAdopted = input.nextLine();
				VirtualPet2 pet = menagerie.getPetName(petToBeAdopted);
				menagerie.adoptPet(pet);
				System.out.println("Take good care of " + pet + "!");
				break;
				
			case 12:
				System.out.println("Great work today!");
				break clockIn;
			}
			
		}
	}

	private static void printOptions() {
		System.out.println("\nHere are our pets:\n" + menagerie.listNamesAndDescriptions());
		System.out.println("1: Check on pets \t 2: Feed pets \t 3: Water pets \n4: Play with pet \t 5: Walk dogs \t 6: Clean dog cages \n7: Clean litter \t 8: Oil robots \t 9: Fix up robots \n10: Admit a pet \t 11: Adopt pet \t 12: Clock out");
		
	}
	
	private static void printPets() {
		menagerie.getAllPets().forEach(allPets -> System.out.println(allPets.getPetName() + ": " + allPets.getDescription()));
	}
	
}
	



