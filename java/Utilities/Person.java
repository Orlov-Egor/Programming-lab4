package Utilities;

public abstract class Person implements IPerson{

	protected String name;

	public Person(String name){

		this.name = name;
	}
	@Override
	public int hashCode(){
		return name.hashCode();
	}

	@Override
	public String toString(){
		return name;
	}
}