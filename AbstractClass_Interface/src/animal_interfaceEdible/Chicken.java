package animal_interfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cuc-tac cuc-tac";
    }

    @Override
    public String howToEat() {
        return "Chicken: could be fried";
    }
}
