
package SCR22;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!");

		boodschappen p1 = new boodschappen();

		  boodschappen p2 = new boodschappen();
	        p2.setKosten(2); 
	        p2.printKosten();


		String beschrijving = p1.BeschrijvingTomaatKosten();
		System.out.println("antwoord = " + beschrijving);

	}
}