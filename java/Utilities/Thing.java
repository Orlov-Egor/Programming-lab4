package Utilities;

public abstract class Thing implements IThing{

	protected String type;
	protected String name;

	public Thing(String name, String type){

		this.type = type;
		this.name = name;
	}

	@Override
	public int hashCode(){
		return name.hashCode() + type.hashCode();
	}

	@Override
	public String toString(){
		return type + " " +  name;
	}
}