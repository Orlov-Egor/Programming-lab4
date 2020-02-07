package Things;
import Utilities.*;

public class Shelf extends Thing{

	public Shelf(String name, String type){
		super(name, type);
	}
	
	public void TypeOfShell(){
		System.out.print(type + " " + name);
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
		Shelf other = (Shelf) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}