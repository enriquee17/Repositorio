package entornosdesarrollo;

public class operararray {
	static int array[] = new int [10];
	static int numAleatorio = 0;
	

	public static void main(String[] args) {
		array();
		
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

}
