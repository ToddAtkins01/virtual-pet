
public class VirtualPet {

	String petName;
	int hunger = 100;
	int thirst = 100;
	int waste = 100;
	int boredom = 100;

	void food() {
		hunger += 10;
		// thirst -= 5;
		// waste += 15;
		// boredom -= 10;
	}

	void liquid(double amount) {
		thirst += amount;
	}

	void potty(double amount) {
		waste += amount;
	}

	void play(double amount) {
		boredom += amount;
	}

	void tick() {
		hunger -= 2;
		thirst += 2;
		waste += 2;
		boredom += 2;
	}
}
