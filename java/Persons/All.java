package Persons;
import Utilities.*;

public class All extends Person{
	public All(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Drink(){
		System.out.print("Когда Муми-тролль, Снусмумрик и Снифф вошли на веранду, " + name + " уже попили кофе");
	}
	public void Go(){
		System.out.print("и разбрелись кто куда. ");
	}
	public void Moved(){
		System.out.print("Тут " + name + " придвинулись ближе и стали ощупывать тучки. ");
	}
	public void MovedUp(){
		System.out.print("Тут уж и " + name + " остальные взобрались каждый на свою тучку и закричали: \"А ну давай! Гоп!\"");
	}
	public void Scary(){
		System.out.print(name + " это было страшно занятно. ");
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
		All other = (All) obj;
		return name.equals(other.name);
	}
}