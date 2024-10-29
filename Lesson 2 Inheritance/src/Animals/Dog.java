package Animals;

public class Dog extends Animal{
    public Dog(String animalname) {
        super(animalname);
    }
    private void bark(){
        System.out.println("the dog " + getAnimalName()+ " bark");
    }
    @Override   //Due to Bark being private within the object, use sound() to call the object
    public void sound() {
        bark();
    }
}
