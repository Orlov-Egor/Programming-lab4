package Things;
import Utilities.*;

public class Horizon extends Thing{
	public Horizon(String name, String type){
		super(name, type);;
		System.out.println("Объект "+name+" создан.");
	}
	public void SwungOpen(){
		System.out.print(name+" был прямой противоположностью первому. ");
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
		Horizon other = (Horizon) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}