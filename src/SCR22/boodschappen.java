package SCR22;

public class boodschappen {

	// property
		private String tomaat; 
		private int kosten;
		private int budget; 
		
		public boodschappen() {
			System.out.println("In construction"); 
			
	
		}
		
		
		
		public void printTomaat () {
			System.out.println("kleur is " + tomaat);
		}	

		public void StelTomaatIn(String tomaat){
			this.tomaat = tomaat; 
		}

		public void printKosten () {
			System.out.println("kosten is " + kosten);
	
		}

		public void StelKostenIn(int kosten){
			this.kosten = kosten; 
		}
		public String BeschrijvingTomaatKosten (){
				String a = "Kleur is " + tomaat + "en prijs is " + kosten;
				return a;
}

		public String getTomaat() {
			return tomaat;
		}

		public void setTomaat(String tomaat) {
			this.tomaat = tomaat;
		}

		public int getKosten() {
			return kosten;
		}

		public void setKosten(int kosten) {
			this.kosten = kosten;
		}

		public int getBudget() {
			return budget;
		}

		public void setBudget(int budget) {
			this.budget = budget;
		}
		public boodschappen () {
			sytem.out.println ("")
			
		}
		
		
		
		
}


