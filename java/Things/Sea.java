package Things;
import Utilities.*;

public class Sea extends Thing{
	public Sea(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void WasSea(){
		System.out.print(type + " было " + name + ", ");
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
		Sea other = (Sea) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}