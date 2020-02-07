package Persons;
import Utilities.*;

public class FrankenSnork extends Person{
	public FrankenSnork(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Touch(){
		System.out.print(name + " тихонечко протянула лапу и потрогала тучку, которая была к ней поближе. ");
	}
	
	@Override
	public String getName(){
		return name;
	}
	@Override
	public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		FrankenSnork other = (FrankenSnork) obj;
		return name.equals(other.name);
	}
}