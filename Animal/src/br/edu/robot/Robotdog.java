package br.edu.robot;

import br.edu.interfaces.Pet;

public class Robotdog extends Robo implements Pet{

	@Override
	public void maquina() {
		System.out.println("sou uma máquina cachorre");
	}

	@Override
	public void serAmigavel() {
		System.out.println("auau,error");
	}

	@Override
	public void brincar() {
         System.out.println("nao");		
	}
	
	

}
