package interfaceEx.prob01;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		if (cheatableChicken instanceof Cheatable) {
			cheatableChicken.fly();
		}

		for (int hours = 1; hours < 4; hours++) {
			System.out.println(hours + "시간 후");
			dog.run(1);
			System.out.println("개의 이동거리=" + dog.getDistance());
			chicken.run(1);
			System.out.println("닭의 이동거리=" + chicken.getDistance());
			cheatableChicken.run(1);
			System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
		}
	}

}










