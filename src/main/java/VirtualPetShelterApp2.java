import java.util.Scanner;

public class VirtualPetShelterApp2 {
	
	
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter2 menagerie = new VirtualPetShelter2();
	
	public static void main(String[] args) {
		
		menagerie.admitPet(new OrganicCat("OrgoCat", "Lapcat", 10, 10, 10, 10, 10));
		menagerie.admitPet(new OrganicDog("OrgoDog", "Loves. Enthusiasm.", 10, 10, 10, 10, 10, 10));
		menagerie.admitPet(new RobotCat("RobotCat", "Also a lapcat, but less comfy", 10, 10, 10, 10));
		menagerie.admitPet(new RobotDog("OrgoDog", "Will get you a beer on command.", 10, 10, 10, 10));
		System.out.println("Welcome to the menagerie!");
		menagerie.displayStatus();
		clockIn: while (true){
		
		printOptions();
		int userInput = input.nextInt();
		
			switch(userInput) {
			case 1:
				menagerie.displayStatus();
				break;
			case 2:
				menagerie.feedPets();
				menagerie.tickAllPets();
				break;
			case 3:
				menagerie.waterPets();
				menagerie.tickAllPets();
				break;
			case 4:
				System.out.println("Which pet would you like to play with?");
				printPets();
				String chosenOne = input.nextLine();
				menagerie.playWithOnePet(chosenOne);
				System.out.println("You played with " + chosenOne + "!");
				break;
			case 5:
				menagerie.walkDogs();
				System.out.println("You took the dogs on a walk!");
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				System.out.println("Great work today!");
				break clockIn;
			}
			menagerie.tickAllPets();
		}
	}
		

	private static void printOptions() {
		System.out.println("\nHere are our pets:\n" + menagerie.listNamesAndDescriptions());
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to check on our pets.");
		System.out.println("Press 2 to feed organic pets.");
		System.out.println("Press 3 to fill the water bowls of organic pets.");
		System.out.println("Press 4 to choose a pet to play with.");
		System.out.println("Press 5 to walk the dogs.");
		System.out.println("Press 6 to clean the dog cages.");
		System.out.println("Press 7 to clean the litter box.");
		System.out.println("Press 8 to oil the robotic pets.");
		System.out.println("Press 9 to fix up a robotic pet.");
		System.out.println("Press 10 to admit a pet.");
		System.out.println("Press 11 to adopt a pet.");
		System.out.println("Press 12 to clock out.");
		
	}
	

	private static void printPets() {
		menagerie.getAllPets().forEach(allPets -> System.out.println(allPets.getPetName() + ": " + allPets.getDescription()));
	}
	
		
		
		
		
}
	



