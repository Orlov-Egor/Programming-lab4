package Persons;
import Utilities.*;

public class Snork extends Person{
	public Snork(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void DoOpen(){
		System.out.print("Ими можно было управлять -- это открытие сделал " + name + ". ");
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
		Snork other = (Snork) obj;
		return name.equals(other.name);
	}
}