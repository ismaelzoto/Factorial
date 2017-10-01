
public class recursividadfactorial {
	public int factorialnormal(int n){
		
		int fact=1;
		
		//multiplica lo que contiene fact por lo que se ingrerse de parametro
		fact=fact*n;
		//permite que n vaya en decremento para realizar asi la operacion con el numero anterior 
		n--;
		
		fact=fact*n;
		n--;
		
		fact=fact*n;
		n--;
		
		return fact;
		
	}
	public int factorialciclo(int n){
		int factor=1;
		// Aqui inicia una validacion 
		if (n<0){
			return 0;
		}else{
			// mientras n sea distinto que 0 entra en el ciclo
			while(n!=0){
				//realiza la opercion
				factor=factor*n;
				//permite que n vaya decremento es decir para multiplicar por el numero anterior
				n--;
			}
			return factor;
		}
	}
	
	public int factorialRecursivo(int n){
		//Aqui hace una validacion
		if(n<0){
			return 0;
		}else{
			//Caso Base
		   if (n==0){
			
			return 1;
		}else{
			//Dominio o Funcion recursiva
			return n* factorialRecursivo(n-1);
		}	
	  }
   }
	
}
