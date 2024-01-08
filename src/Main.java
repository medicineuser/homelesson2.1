// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("Bobi",Color.WHITE,Ability.text);

        Dog dog1 = new Dog("Rex",Color.BLACK,Ability.text);
        Dog dog2 = new Dog("Lina",Color.GREY,Ability.text);

        pet.makeVoice();
        pet.makeVoice(2);
        pet.makeVoice("Мяу");
        System.out.println("-----------------------");

        dog1.makeVoice();
        dog1.makeVoice("Гавгав");
        dog1.makeVoice(2);
        System.out.println("-----------------------");


        dog2.makeVoice();
        dog2.makeVoice("Тссс");
        dog2.makeVoice(3);
        System.out.println("-----------------------");


        System.out.println(pet.info());
        System.out.println("-----------------------");
        System.out.println(dog1.info());
        System.out.println("-----------------------");
        System.out.println(dog2.info());
    }
}