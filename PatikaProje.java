import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ay: ");
		int ay = input.nextInt();
		
		System.out.print("Doğduğunuz gün: ");
		int gun = input.nextInt();
		
		if (ay == 1 && (gun >= 1 && gun <= 31)) {
			if (gun <= 21) System.out.println("Oğlak Burcu");
			else System.out.println("Kova Burcu");
		}
		else if (ay == 2 && (gun >= 1 && gun <= 28)) {
			if (gun <= 19) System.out.println("Kova Burcu");
			else System.out.println("Balık Burcu");
		}
		else if (ay == 3 && (gun >= 1 && gun <= 31)) {
			if (gun <= 20) System.out.println("Balık Burcu");
			else System.out.println("Koç Burcu");
		}
		else if (ay == 4 && (gun >= 1 && gun <= 30)) {
			if (gun <= 20) System.out.println("Koç Burcu");
			else System.out.println("Boğa Burcu");
		}
		else if (ay == 5 && (gun >= 1 && gun <= 31)) {
			if (gun <= 21) System.out.println("Boğa Burcu");
			else System.out.println("İkizler Burcu");
		}
		else if (ay == 6 && (gun >= 1 && gun <= 30)) {
			if (gun <= 22) System.out.println("İkizler Burcu");
			else System.out.println("Yengeç Burcu");
		}
		else if (ay == 7 && (gun >= 1 && gun <= 31)) {
			if (gun <= 22) System.out.println("Yengeç Burcu");
			else System.out.println("Aslan Burcu");
		}
		else if (ay == 8 && (gun >= 1 && gun <= 31)) {
			if (gun <= 22) System.out.println("Aslan Burcu");
			else System.out.println("Başak Burcu");
		}
		else if (ay == 9 && (gun >= 1 && gun <= 30)) {
			if (gun <= 22) System.out.println("Başak Burcu");
			else System.out.println("Terazi Burcu");
		}
		else if (ay == 10 && (gun >= 1 && gun <= 31)) {
			if (gun <= 22) System.out.println("Terazi Burcu");
			else System.out.println("Akrep Burcu");
		}
		else if (ay == 11 && (gun >= 1 && gun <= 30)) {
			if (gun <= 21) System.out.println("Akrep Burcu");
			else System.out.println("Yay Burcu");
		}
		else if (ay == 12 && (gun >= 1 && gun <= 31)) {
			if (gun <= 21) System.out.println("Yay Burcu");
			else System.out.println("Oğlak Burcu");
		}
		else System.out.println("Error");
	}

}
