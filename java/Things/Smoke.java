package Things;
import Utilities.*;

public class Smoke extends Thing{
	public Smoke(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Spinning(){
		System.out.print(type + " из трубы Муми-дома крутился " + name + " ");
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
		Smoke other = (Smoke) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}