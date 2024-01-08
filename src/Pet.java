public class Pet extends Animal{
    private String ability;
    public Pet(String name, Color color , String ability) {
        super(name, color);
        this.ability = ability;
    }

    @Override
    public String info() {
        return
                "Name "  + getName() + '\n' +
                        "Color " + getColor()+  '\n' +"Ability " + getAbility()
                ;
    }

    public void setAbility(String ability){
        this.ability = ability;
    }

    public String getAbility(){
        return ability;
    }
    public void makeVoice() {
        System.out.println("Животное издает звук");
    }
    public void makeVoice(String sound) {
        System.out.println("Животное издает звук: " + sound);
    }
    public final void makeVoice(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Животное издает звук: " + times +" раз");
        }
    }
}
