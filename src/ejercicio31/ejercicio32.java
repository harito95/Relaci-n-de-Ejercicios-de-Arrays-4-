package ejercicio31;

public class ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {1,2,3,4};
		int [] copyarray= arraybueno(array);
		for (int i=0; i<copyarray.length; i++){
		System.out.print(copyarray[i] + " ");
		}
				
				
	}
	
	public static int [] arraybueno (int [] a){
		int [] arraymalo= new int [a.length];
		for (int i=0; i<a.length; i++){
			arraymalo[i]=a[i];
			
		}
		
		return arraymalo;
	}

}
