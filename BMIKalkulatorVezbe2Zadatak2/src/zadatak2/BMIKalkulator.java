package zadatak2;

public class BMIKalkulator {

	
	
	double vrednost=0.0;
	BMIKategorija status;
	
	
	void izracunajBMI(double visina, double tezina) { //void jer ne vraca nista(samo izracunava), u () su ulazni param.
	  if(visina >= 1.20 && visina <= 2.40 && tezina >= 30 && tezina <= 200) {
		  vrednost = tezina / (visina * visina);
		 }else {
			 System.out.println("GRESKA");
			 
		 }
}
	
	
	
	
	
	
	void izracunajBMIVrednost() {
		if(vrednost<=18.5)
			status=BMIKategorija.MRSAV;
		else if(vrednost<=15)
			status=BMIKategorija.ANOREKSICAN;
		else if(vrednost<=30)
			status=BMIKategorija.NORMALAN;
		else
			status=BMIKategorija.GOJAZAN;
	}

	
	void ispisi() {
		System.out.println("BMI vrednost: "+vrednost);
		System.out.println("BMI status:"+status);
	}
	
	
	
	
	
	
	
	
	
	
	
}





