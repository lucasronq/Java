package Primos;
import java.util.*;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Digite um número: ");
	      
	        try {
	        int number= Integer.parseInt(sc.nextLine());
	        if(isPrime(number)) {
	            System.out.println(number + " é primo");
	        }
	        else{
	            System.out.println(number + " não é primo");
	        }
	    }catch(Exception err){
	    	System.out.println("Caractere inválido!");
	    }
	 }
	    static  boolean isPrime(int num)
	    {
	        if(num<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	    }
}