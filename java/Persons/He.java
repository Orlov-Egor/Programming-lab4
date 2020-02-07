package Persons;
import Utilities.*;

public class He extends Person{
	public He(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Skream(){
		System.out.print("И только " + name + " крикнул: \"А ну давай!\" -- как ");
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
		He other = (He) obj;
		return name.equals(other.name);
	}
}