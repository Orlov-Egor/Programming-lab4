package Things;
import Utilities.*;

public class Wind extends Thing{
	public Wind(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Walk(){
		System.out.print("На вершине разгуливал "+ type + " " + name + ". ");
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
		Wind other = (Wind) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}