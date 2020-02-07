package Things;
import Utilities.*;

public class Clouds extends Thing{
	public Clouds(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Staing(){
		System.out.println(type + name + " неподвижно стояли перед ними и словно чего-то ждали. ");
	}
	public void Up(){
		System.out.println(name + " поднялась над землей и описала небольшую изящную дугу. ");
	}
	public void Fly(){
		System.out.println(name + " , словно большие послушные кролики, парили над землей. ");
	}
	
	@Override
	public String getName(){
		return name;
	}
	@Override
	public String getType(){
		return type;
	}
	@Override
	public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Clouds other = (Clouds) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}