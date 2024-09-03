package br.edu.principal;

import br.edu.animal.*;
import br.edu.robot.*;
public class Principal {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Gato g1 = new Gato();
		Hippo h1 = new Hippo();
		Leao l1 = new Leao();
		Tigre t1 = new Tigre();
		Lobo lb1 = new Lobo();
		AspiradorRobo ab1 = new AspiradorRobo();
		Robotdog rd1 = new Robotdog();
		
		
		//d1.Emitirsom();
	    //g1.Emitirsom();
	    //h1.Emitirsom();
	    //l1.Emitirsom();
	    //t1.Emitirsom();
	    //lb1.Emitirsom();
        
	    g1.serAmigavel();
	    ab1.maquina();
	    rd1.brincar();
	    rd1.maquina();
	    rd1.serAmigavel();
	    
	    
	}

}
