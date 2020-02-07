package Persons;
import Utilities.*;

public class They extends Person{
	public They(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Find(){
		System.out.print("Вот так получилось, что " + name + " нашли шляпу Волшебника ");
	}
	public void Taken(){
		System.out.print("и забрали ее с собой, не подозревая о том, что тем самым ");
	}
	public void Turned(){
		System.out.println("превратили Муми-дол в арену всяческого волшебства и удивительнейших событий. ");
	}
	public void Save(){
		System.out.print(name + "сохранили белый цвет, ");
	}
	public void Grow(){
		System.out.print(" но все росли и росли в размерах и стали мягкими и пухлыми. ");
	}
	public void Fill(){
		System.out.println("Немного погодня " + name + " целиком заполнили шляпу, а потом из шляпы выпорхнули пять маленьких круглых тучек. ");
	}
	public void Swim(){
		System.out.print(name +  " выплыли на веранду, мягко спустились с крыльца и повисли в воздухе над самой землей. ");
	}
	public void Flying(){
		System.out.print("Расхрабрившись " + name +  " взлетали до верхушек деревьев и даже на крышу. ");
	}

	@Override
	public String getName(){
		return name;
	}
	@Override
	public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		They other = (They) obj;
		return name.equals(other.name);
	}
}