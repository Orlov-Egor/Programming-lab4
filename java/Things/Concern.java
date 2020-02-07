package Things;
import Utilities.*;

public class Concern extends Thing{
	public Concern(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Lay(){
		System.out.println("Дело в том, что " + type + " " + name + ", если она достаточно долго пролежит в шляпе Волшебника, ");
	}
	public void TurnedOn(){
		System.out.println("превращается в нечто совершенно иное -- и никогда нельзя знать заранее, во что именно. ");
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
		Concern other = (Concern) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}