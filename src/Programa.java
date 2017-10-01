
public class Programa {

	public static void main (String[] args){
		
		recursividadfactorial fact = new recursividadfactorial();
		System.out.println("El factorial de 4 mediante paso por paso es : "+ fact.factorialnormal(3));

		System.out.println("El factorial de 4 por medio de un ciclo es: "+ fact.factorialciclo(7));
		
		System.out.println("El factorial de 5 por medio de Recursividad es: "+ fact.factorialRecursivo(5));
		
	}
}
