package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.NumberFormatException.*;
public class O1 {
  public static void main(String[] args) {
	  
	  for (int studnr=1; studnr<=10; studnr++) {
		  String poeng = showInputDialog("Poeng:");
		  int poengsum = parseInt(poeng);
		  String karakter = "";
		  
		  if ((0 > poengsum) || (poengsum > 100))
			  poeng = showInputDialog("Ugyldig poengsum! Skriv inn gyldig poengsum:");
			  poengsum = parseInt(poeng);
			  
			  if ((90 <= poengsum) && (poengsum <= 100))
			  karakter = "Du fikk karakter A";
			  else 
				  if ((80 <= poengsum) && (poengsum <= 89))
				  karakter = "Du fikk karakter B";
				  else 
					  if ((60 <= poengsum) && (poengsum <= 79))
						  karakter = "Du fikk karakter C";
					  else
						  if ((50 <= poengsum) && (poengsum <= 59))
							  karakter = "Du fikk karakter D";
						  else 
							  if ((40 <= poengsum) && (poengsum <= 49))
								  karakter = "Du fikk karakter E";
							  else 
								  if ((0 <= poengsum) && (poengsum <= 39))
									  karakter = "Du fikk karakter F";
    					
    showMessageDialog(null, karakter); }
  }
}
