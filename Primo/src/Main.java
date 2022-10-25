import java.util.*;

public class Main {
	public static void main(String[] args) {
		
	     Scanner sc= new Scanner(System.in);
	     try {
	        System.out.println("Digite um número: ");
	        int number= sc.nextInt();
	        if(isPrime(number)) {
	            System.out.println(number + " é primo");
	        }
	        else{
	            System.out.println(number + " não é primo");
	        }
	     }
	     catch{
	    	 System.out.print("Comando inválido!");
	     }
	 }

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if ((num % i) == 0)
				return false;
		}
		return true;
	}
}
