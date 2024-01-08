final public class Dog extends Pet{
    public Dog(String name ,Color color , String ability){
        super(name,color,ability);
    }
    @Override
    public void makeVoice() {
        System.out.println("Собака лает");
    }

    public void makeVoice(String sound){
        System.out.println("Cобака лает " + sound);
    };

    @Override
    public String toString() {
        return "Dog{}";
    }
    public String info() {
        return
                "Name "  + getName() + '\n' +
                        "Color " +  getColor() + '\n' + "Ability " + getAbility()
                ;
    }
}
