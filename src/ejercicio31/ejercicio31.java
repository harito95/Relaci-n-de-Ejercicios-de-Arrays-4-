package ejercicio31;

public class ejercicio31 {

	public static void main(String[] args) {

		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		int[] c = {8,9,10}; 
		int[] d = concatenarpizzas(a,b,c);
		
		for(int i = 0; i < d.length; i++ )
			System.out.print(d[i]+ " ");
	}

	public static int [] concatenarpizzas (int []tomate, int []queso, int [] shawarma){
		int [] pizza= new int[shawarma.length + queso.length + tomate.length];
		for (int i=0; i<tomate.length; i++){
			pizza[i]= tomate[i];
		}
		for (int i=0; i<queso.length; i++){
			pizza[tomate.length +i] = queso[i];
		}
		for (int i=0; i<shawarma.length; i++){
			pizza[queso.length + tomate.length + i]= shawarma[i];
		}
		
		return pizza;
	}

}
