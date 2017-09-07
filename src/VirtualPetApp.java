import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet digiPet = new VirtualPet();

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to this AWESOME Virtual Pet App!! \nPlease name your pet.");
		digiPet.petName = input.next();

		int userOpt;

		do {
			System.out.println("What do you want to do? \n");
			System.out.println("Press 1 to Feed " + digiPet.petName);
			System.out.println("Press 2 to Give " + digiPet.petName + " liuid");
			System.out.println("Press 3 to Take " + digiPet.petName + " to the potty");
			System.out.println("Press 4 to Play with " + digiPet.petName);
			System.out.println("Press 5 to Do nothing with " + digiPet.petName);
			userOpt = input.nextInt();

		} while (userOpt != 1 && userOpt != 2 && userOpt != 3 && userOpt != 4 && userOpt != 5);

		switch (userOpt) {

		case 1:
			System.out.println(digiPet.petName + " thanks you for that tasty morsal!");
			digiPet.food();
			digiPet.tick();
			System.out.println("\n" + digiPet.petName + "'s hunger is now at: " + (digiPet.hunger) + "\n");
			break;

		// case 2:
		// System.out.println("Please enter the amount you would like to withdraw.");
		// double enteredWithdraw = input.nextDouble();
		// bankOfMe.withdraw(enteredWithdraw);
		// System.out.println("Your new balance is: " +
		// curancyFormat.format(bankOfMe.balance) + "\n");
		// break;
		//
		// case 3:
		// System.out.println("Your balance is: " +
		// curancyFormat.format(bankOfMe.balance) + "\n");
		// break;
		//
		// case 4:
		// System.out.println("Thank you for being a part of Bank Of Me.\nHave a great
		// day!");
		// System.exit(0);
		//
		// }
		//
		}
		//
		input.close();
	}

}
