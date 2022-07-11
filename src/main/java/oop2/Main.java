package oop2;

import oop.Auto;
import oop.Motor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor motorDesdeAfuera = new Motor("ferrari", 200f);
		Auto auto = new Auto (300f, "renault", null);
		
		//quiero ver la marca del auto
		auto.setMarca("RENAULT");
		 
	}
	

}
