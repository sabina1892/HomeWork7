package HomeWork6;

import HomeWork4.Human;
import HomeWork4.Pet;
import org.junit.jupiter.api.Test;


public class aHappyFamily1 {

    public static void main(String[] args) throws Throwable {
        Pet1 pet = new Fish("Rock", 5, 25, new String[]{"eat", "drink", "sleep"});
        pet.respond();
        Human1 mother = new Human1("Jane", "Karleone", 1935);
        Human1 father = new Human1("Vito", "Karleone", 1932);
        Family family = new Family(mother, father);


        Human1 child = new Human1("Michael", "Karleone", 1977,
                95, new String[][]{{DayOfWeek.SUNDAY.name(), "do home work"},
                {DayOfWeek.MONDAY.name(), "go to courses; watch a film"},
                {DayOfWeek.TUESDAY.name(), "read a book"},
                {DayOfWeek.THURSDAY.name(), "to go for a walk"},
                {DayOfWeek.WEDNESDAY.name(), "read a newspaper"},
                {DayOfWeek.FRIDAY.name(), "go to the gym"},
                {DayOfWeek.SATURDAY.name(), "resting"}}, family);
        family.setPet(pet);

        Men men = new Men();
        Women women = new Women();
        men.greetPet();
        men.repairCar();
        women.greetPet();
        women.makeUp();

        family.addChild(child);
        family.countFamily();
        System.out.println(child.getFamily());
        System.out.println(family);

        family.deleteChild(child);
        System.out.println(family);
        family.countFamily();
        family.finalize();
        //  pet.finalize();

        for (int i = 0; i < 10000; i++) {
            Human1 human = new Human1();
        }
    }


}