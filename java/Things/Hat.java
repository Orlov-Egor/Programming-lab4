package Things;
import Utilities.*;

public class Hat extends Thing{

	private boolean Small = true;

	public Hat(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Lie(){
		System.out.print("Потому что на вершине горы лежала " + name + ", " +type + ". ");
	}
	public void HatWas(){
		if (Small){
			System.out.println(name + " была для него чуточку великовата и тяжела, но общее впечатление было весьма внушительное.");
		}
		else{
			throw new HatIsSmallExeption();
		}
		
	}
	public void Lies(){
		System.out.println("А в углу, между комодом и дверью на кухню, осталась " + name + " Волшебника с яичной скорлупой.");
	}
	public void Becom(){
		System.out.println("А в шляпе Волшебника стало пусто.");
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
		Hat other = (Hat) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}