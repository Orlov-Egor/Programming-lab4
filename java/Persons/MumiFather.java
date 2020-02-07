package Persons;
import Utilities.*;

public class MumiFather extends Person{
	public MumiFather(String name){
		super(name);
		System.out.println("Объект "+name+" создан.");
	}
	public void Stay(){
			System.out.println("Один только " + name + " остался дома читать газету. ");
	}
	public void Watching(MumiFather mumiFather) throws MumiFatherExeption{
		if(mumiFather instanceof MumiFather){
			System.out.print(name + " оглядел шляпу со всех сторон, ");
		}
		else{
			throw new MumiFatherExeption("Только Муми-Папа может трогать шляпу!");
		}
		mumiFather.Try();
	}
	public void Try(){
		System.out.print("а потом примерил перед зеркалом в гостиной. ");
	}

	public void WatchingAgain(){
		System.out.println(name + " оглядел себя в зеркале и спереди и сзади, ");
	}

	public void Drop(){
		System.out.print("оглядел с боков и со вздохом положил шляпу на комод. ");
	}

	public void Luck(){
		System.out.print(name + " ужасно повезло, что шляпа ему не подошла: ");
	}

	public void Wait(){
		System.out.println("побудь он в ней чуточку подольше -- и только покровителю всех троллей и Сниффов известно, какая участь его ожидала. ");
	}
	public void Earn(){
		System.out.print(name + " заработал лишь легкую головную боль ");
		MumiFather.Explanator.ExplanatorOfEarn();

	}
	public static class Explanator{
		public static void ExplanatorOfEarn(){
			System.out.print("(которая прошла после обеда). ");
		}
	}
	public class HeartOfMumiFather{
		public HeartOfMumiFather(){
			System.out.println("Тук-тук");
		}
	}
	static{
		class FatherEyes{
			FatherEyes(){
				System.out.println("Муми-папа может видлеть с помощью глаз");
				new MumiFather("Новый Муми-папа"){
					public void NewMumiFather(){
						System.out.println("Я новый Муми-папа! У-ха-ха");
					}
				};
			}
		}
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
		MumiFather other = (MumiFather) obj;
		return name.equals(other.name);
	}
}