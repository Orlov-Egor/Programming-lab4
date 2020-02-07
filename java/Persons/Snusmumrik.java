package Persons;
import Utilities.*;

public class Snusmumrik extends Person{
	public Snusmumrik(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Droped(){
		System.out.print(name + " поставил шляпу на пол между комодом и кухонной дверью. ");
	}
	public void pushed(){
		System.out.println(name + " осторожно толкнул одну из тучек. ");
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
		Snusmumrik other = (Snusmumrik) obj;
		return name.equals(other.name);
	}
}