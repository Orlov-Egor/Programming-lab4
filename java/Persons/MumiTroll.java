package Persons;
import Utilities.*;

public class MumiTroll extends Person{
	public MumiTroll(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Take(){
		System.out.println(name + " поднял шляпу и начал её рассматривать. ");
	}
	public void Shook(){
		System.out.print(name + " только покачал головой в ответ. ");
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
		MumiTroll other = (MumiTroll) obj;
		return name.equals(other.name);
	}
}