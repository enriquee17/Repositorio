package entornosdesarrollo;

public class operararray {
	static int array[] = new int [10];
	static int numAleatorio = 0;
	static int suma = 0;
	

	public static void main(String[] args) {
		array();
		imprimeArray();
		suma();
		metodoRama2();
	}
	public static void array () {
		for (int i = 0; i < array.length; i++) {
			numAleatorio = (int)Math.round(Math.random()*(20-1)+1);
			array[i] = numAleatorio;
			
		}
	}
	
	public static void imprimeArray() {
		for (int i = 0; i < array.length; i++) {
			 
			System.out.print(array[i]+"");
			
		}
	}
	
	public static void suma() {
		for (int i = 0; i < array.length; i++) {
			 
			suma += array[i];
			System.out.println();
			System.out.println("La suma de los numeros del array es: "+suma);
		}
	}

	
	public static void metodoRama2() {
		System.out.println();
		System.out.println("Metodo de la rama 2");
	}


//hola

}
