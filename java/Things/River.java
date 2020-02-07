package Things;
import Utilities.*;

public class River extends Thing{
	public River(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void WasRiver(){
		System.out.println(type + " " + name + ", петляя уползала вглубь Пустынных гор, a ");
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
		River other = (River) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}