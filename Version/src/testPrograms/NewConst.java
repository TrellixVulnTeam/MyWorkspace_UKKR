package testPrograms;

public class NewConst {

	public NewConst() {
		System.out.println("Hi I am a Default Contructor");

	}

	public NewConst(String cons) {
		System.out.println("Hi I am an Single Parameter Contructor");

	}

	public NewConst(int thirdcons, String cons) {
		System.out.println(
				"Hi I am an Two Parameter Contructor"+" " + "First Parameter"+" "+ thirdcons + " " + "Second Parameter"+" " +cons);
		// System.out.println("Hi I am an Two Parameter Contructor"+cons);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewConst constr = new NewConst();
		NewConst constr1 = new NewConst("Second");
		NewConst constr2 = new NewConst(3, "Third");

	}

}
