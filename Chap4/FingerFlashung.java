package Chap4;

import java.util.Scanner;

public class FingerFlashung {

	public static void main(String[] args) {
		Scanner standerdInput = new Scanner(System.in);

		int hundNumber = 0;

		do {
			System.out.print("手を選べ ( 0…グー/1…チョキ/2…パー） : ");
			hundNumber = standerdInput.nextInt();

		} while (hundNumber < 0 || hundNumber > 2);

		switch (hundNumber) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;

		}

	}

}
