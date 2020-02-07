package Persons;
import Utilities.*;

public class LivingRoom extends Person{
	public LivingRoom(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Empty(){
		System.out.print(name + " опустела. ");
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
		LivingRoom other = (LivingRoom) obj;
		return name.equals(other.name);
	}
}