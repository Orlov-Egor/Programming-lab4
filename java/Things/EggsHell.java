package Things;
import Utilities.*;

public class EggsHell extends Thing{
	public EggsHell(String name, String type){
		super(name, type);
		System.out.println("Объект "+name+" создан.");
	}
	public void Start(){
		System.out.print("И тут сотворилось чудо: " + type + " " + name + " начала преображаться. " );
	}
	public void StartTurn(){
		System.out.println("Зато " + type + " " + name + ", оставшиеся в шляпе, мало-помалу начали менять свой вид. " );
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
		EggsHell other = (EggsHell) obj;
		return name.equals(other.name) && type.equals(other.type);
	}
}