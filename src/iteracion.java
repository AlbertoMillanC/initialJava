public class Iteracion {
	public static final long STOP = 1000000000000L;
	
	public static void main (String []args) {
		long t1 = System.currentTimeMillis();
		for (long i = 0; i < STOP; i++){
			if (i % 1000000000 == 0){
				System.out.println(i + " - " + (System.currentTimeMillis() - t1));				
			}
		}
		long t2 = System.currentTimeMillis() -t1;
	
		System.out.println("la funcion tardo " + t2 / 1000.0 + " segundos en ejecutarse.");
	
	}
}
