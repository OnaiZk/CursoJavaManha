package cursoJava2024;

import java.util.Scanner;

public class Bimestre {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("=============================");
	System.out.println("FECHAMENTO DE NOTAS 4BIMESTRE");
	System.out.println("=============================");
	System.out.println("Matematica:");
	double mat = sc.nextDouble();
	System.out.println("Portugues:");
	double por = sc.nextDouble();
	System.out.println("Historia:");
	double his = sc.nextDouble();
	System.out.println("Ingles:");
	double ing = sc.nextDouble();
	System.out.println("Arte:");
	double art = sc.nextDouble();
	System.out.println("Biologia:");
	double bio = sc.nextDouble();
	System.out.println("Fisica:");
	double fis = sc.nextDouble();
	System.out.println("Filosofia:");
	double fil = sc.nextDouble();
	System.out.println("Educacao Financeira:");
	double edf = sc.nextDouble();
	System.out.println("Geografia:");
	double geo = sc.nextDouble();
	System.out.println("Quimica:");
	double qui = sc.nextDouble();
	System.out.println("Tecnologia e Robotica:");
	double tec = sc.nextDouble();
	System.out.println("Projeto de Vida:");
	double pro = sc.nextDouble();
	int nota = (int) ((mat + por + his + ing + art + bio + fis + fil + edf + geo + qui + tec 	+ pro) /5);
	if (nota < 20) {
		System.out.println("Voce foi reprovado!");
	}else {
		System.out.println("Voce foi aprovado!");
	}
}
}
