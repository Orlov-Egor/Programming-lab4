import Things.*;
import Persons.*;
import Utilities.*;

public class Main{
	public static void main(String args[]){

		Wind wind = new Wind("Ветер", "весенний");
		Horizon horizon = new Horizon("Горизонт", "голубой");
		Sea sea = new Sea("Море", "На западе");
		River river = new River("Река", "На востоке");
		Forest forest = new Forest("Леса", "На севере");
		Smoke smoke = new Smoke("Дымок", "На юге");
		MumiMather mumiMather = new MumiMather("Муми-мама");
		Sniff sniff = new Sniff("Снифф");
		Hat hat = new Hat("Шляпа", "точнее говоря, черный цилиндр");
		MumiTroll mumiTroll = new MumiTroll("Муми-тролль");
		They they = new They("Они");
		All all = new All("Все");
		MumiFather mumiFather = new MumiFather("Муми-папа");
		She she = new She("Она");
		Snusmumrik snusmumrik = new Snusmumrik("Снусмумрик");
		LivingRoom livingRoom = new LivingRoom("Гостинная");
		EggsHell eggsHell = new EggsHell("Скорлупа", "яичная");
		Concern concern = new Concern("Вещь", "всякая");
		Clouds clouds = new Clouds("Тучки", "Белые");
		FrankenSnork frankenSnork = new FrankenSnork ("Фрекен Снорк");
		He he = new He("Он");
		Snork snork = new Snork("Снорк");
		Pressure pressure = new Pressure ("Нажим", "Легкий");
		Time time = Time.SPRING;

		//String[] cylinder = {"зубная счетка", "зубной порошок", "кусок пахучего земленичного мыла", "полотенце", "несколько носовых платков", "запасные носки", "два ржавых гвоздя", "кусок медной проволоки"};

		wind.Walk();
		horizon.SwungOpen();
		sea.WasSea();
		river.WasRiver();
		forest.WasForest(time);
		smoke.Spinning();
		mumiMather.Cook();
		sniff.DidNotSaw();
		hat.Lie();
		mumiTroll.Take();
		they.Find();
		they.Taken();
		they.Turned();
		all.Drink();
		all.Go();
		mumiFather.Stay();
		try{
			mumiFather.Watching(mumiFather);
		}
		catch(MumiFatherExeption e){
			System.out.println(e.getMessage());
		}
		/*mumiFather.Try();
		hat.HatWas();
		class Drop{
			static void Drop(){
				System.out.print("и со вздохом положил шляпу на комод. ");
			}
		}*/
		mumiMather.Open();
		mumiMather.Stoped();
		mumiFather.WatchingAgain();
		mumiFather.Drop();
		she.GoAway();
		snusmumrik.Droped();
		livingRoom.Empty();
		hat.Lies();
		eggsHell.Start();
		concern.Lay();
		concern.TurnedOn();
		mumiFather.Luck();
		mumiFather.Wait();
		mumiFather.Earn();
		eggsHell.StartTurn();
		they.Save();
		they.Grow();
		they.Fill();
		they.Swim();
		hat.Becom();
		clouds.Staing();
		frankenSnork.Touch();
		all.Moved();
		snusmumrik.pushed();
		she.Swim();
		mumiTroll.Shook();
		he.Skream();
		clouds.Up();
		all.MovedUp();
		clouds.Fly();
		snork.DoOpen();
		pressure.Turn();
		pressure.Forward();
		she.Sway();
		all.Scary();
		they.Flying();
	}
}

