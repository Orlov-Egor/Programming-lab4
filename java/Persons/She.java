package Persons;
import Utilities.*;

public class She extends Person{
	public She(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void GoAway(){
		System.out.println("И " + name + " снова ушла на кухню. ");
	}
	public void Swim(){
		System.out.print(name + " проплыла немного в воздухе и снова застыла на месте. ");
	}
	public void Sway(){
		System.out.print("Чуть покачаешь тучку -- и " + name + " набирает высоту. ");
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
		She other = (She) obj;
		return name.equals(other.name);
	}
}