package cursoJava2024;

import java.util.Scanner;

public class Celcius {
public static int main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Quantos graus C'?");
			int C = scanner.nextInt();
			return (C * 9/5) + 32;
}
}
