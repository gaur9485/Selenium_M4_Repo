package pomPackage;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		
		Random random = new Random();
		int no = random.nextInt(1000, 9999);
		System.out.println(no);
	}

}
