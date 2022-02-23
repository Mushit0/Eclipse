
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class lista {
	public static void main(String[]args) {
		ArrayList <Integer> numeros;
		numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(53);
		numeros.add(3);
		numeros.add(1,4);
		
		

			System.out.println("FOR MEJORADO: ");
			for(int a:numeros) {
				System.out.println(a);
			}System.out.println("FOR NORMAL");
			for(int i=0;i<numeros.size();i++) {
				System.out.println(numeros.get(i));
				
				}
			System.out.println("ORDENAR");
			Collections.sort(numeros);
			System.out.println(numeros);

		}
}	

