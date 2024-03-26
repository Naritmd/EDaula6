package view;
import java.util.Scanner;
import controller.Ex3_controller;
public class Ex3_principal {
	
	public static void main(String[] args) throws Exception 
	{
		Ex3_controller Ex3_controller = new Ex3_controller();
		Scanner sc = new Scanner(System.in);
		int num = 100;
		while(num > 10 || num <0) {
			System.out.println("Digite um número");
		 num = sc.nextInt();
		}
		int c = controller.Ex3_controller.FatController(num);
		System.out.println(c);
	}
 
}
