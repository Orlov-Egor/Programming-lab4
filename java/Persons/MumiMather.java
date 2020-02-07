package Persons;
import Utilities.*;

public class MumiMather extends Person{
	public MumiMather(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Cook(){
		System.out.print("-- это " + name + " варила к завтраку кофе. ");
	}
	public void Open(){
		System.out.print(name + " открыла дверь ");
	}
	public void Stoped(){
		System.out.print("да так и застыла от удивления. ");
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
		MumiMather other = (MumiMather) obj;
		return name.equals(other.name);
	}
}