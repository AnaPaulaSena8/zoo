package br.edu.animal;

import br.edu.interfaces.Pet;

public class Dog extends Canine implements Pet {
	@Override
	public void Emitirsom() {
		System.out.println("Auauau");
	}
@Override
public void nome() {
	System.out.println("cachorro");
}
@Override
public void local() {
	System.out.println("todo lugar");
}
@Override
public void nichoEc() {
	System.out.println("mamiferos");
}
@Override
public void serAmigavel() {
     System.out.println("auau<3");
	
}
@Override
public void brincar() {
	System.out.println("corre e pega graveto");	
}
}
