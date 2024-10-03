public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("tomas");
        Dog dog2 = new Dog("tomasin");
        Cat cat = new Cat("tomasThemagicwizard");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat);

        dog1.greets();
        dog1.greets(dog2);
        System.out.println("  / \\__");
        System.out.println(" (    @\\___");
        System.out.println(" /         O");
        System.out.println("/   (_____ /");
        System.out.println("/_____/ U");
        System.out.println();
        System.out.println("  / \\__");
        System.out.println(" (    @\\___");
        System.out.println(" /         O");
        System.out.println("/   (_____ /");
        System.out.println("/_____/ U");

        System.out.println();
        cat.greets();
        System.out.println("  _._     _,-'\"\"`-._");
        System.out.println(" (,-.`._,'(       |\\`-/|");
        System.out.println("    `-.-' \\ )-`( , o o)");
        System.out.println("          `-    \\`_`\"'-");
    }
}
