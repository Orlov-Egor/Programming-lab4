package Persons;
import Utilities.*;

public class Sniff extends Person{
	public Sniff(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void DidNotSaw(){
		System.out.println("Но " + name + " ничего этого не замечал. ");
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
		Sniff other = (Sniff) obj;
		return name.equals(other.name);
	}
}