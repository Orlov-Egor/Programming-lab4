package Things;
import Utilities.*;

public class Pressure extends Thing{
	public Pressure(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Turn(){
		System.out.println(type + " " + name + " одной ногой -- поворот. ");
	}
	public void Forward(){
		System.out.print("Обеими ногами -- полный вперед.");
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
		Pressure other = (Pressure) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}