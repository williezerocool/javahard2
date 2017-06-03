public class TVActorDriver {
	public static void main(String[] args) {
		TVActor a = new TVActor();
		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";
		a.age = 28;

		TVActor b = new TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";
		b.age = 42;

		TVActor c = new TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";
		c.age = 33;

		System.out.println(a.name + " played " + a.role + " his age is " + a.age);
		System.out.println(b.name + " played " + b.role + " his age is " + b.age);
		System.out.println(c.name + " played " + c.role + " his age is " + c.age);
	}
}