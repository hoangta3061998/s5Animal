public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "O o o o o o o!";
    }
    @Override
    public String howToEat(){
        return "Can be fried!";
    }
}
