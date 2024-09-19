package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	public static void main(String[] args) {
		int fakultet = 1 ;
		int tall = parseInt( showInputDialog("Skriv et positivt heltall: "));
		int n = tall;
			while (n>1) {
				fakultet *= n;
				n--;}
		if (tall<0)
			showMessageDialog(null, tall + " er ikke et positivt heltall");
		else 
			showMessageDialog(null, tall + "!" + " = " + fakultet);}}
