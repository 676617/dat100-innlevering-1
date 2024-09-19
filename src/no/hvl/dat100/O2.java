package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static void main(String[] args) {
				 double skatt = 0 ;
				 int inntekt = parseInt( showInputDialog("bruttoinntekt: "));
			
				 if (inntekt > 1350000)
					 skatt = inntekt * 0.176 ;
				 else 
					 if ((inntekt > 937900) && (inntekt < 1350001))
						 skatt = inntekt * 0.166 ;
					 else 
						 if ((inntekt > 670000) && (inntekt < 937901))
							 skatt = inntekt * 0.136 ;
						 else 
							 if ((inntekt > 292850) && (inntekt < 670001))
								 skatt = inntekt * 0.04 ;
							 else
								 if ((inntekt > 208050) && (inntekt < 292851))
									 skatt = inntekt * 0.017 ;
							 else 
								 if ((inntekt > 0) && (inntekt < 208051))
									 skatt = 0 ;
				 
			showMessageDialog(null, "skatt: " + skatt);
	}
}
