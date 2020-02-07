package Things;
import Utilities.*;

public class Forest extends Thing{
	public Forest(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	
	public void WasForest(Time time){
		switch(time){
			case SPRING:
				System.out.print(type + " как весенний ковер простирались дремучие " + name + ", ");
				break;
			case AUTUMN:
				System.out.print(type + " как осенний ковер простирались дремучие " + name + ", ");
				break;
			case SUMMER:
				System.out.print(type + " как летний ковер простирались дремучие " + name + ", ");
				break;
		}
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
		Forest other = (Forest) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}