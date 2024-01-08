public abstract class Animal{

    private String name;
    private Color color;

    public Animal(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }


    public String info() {
        return "Animal{" +
                "name=" + name +
                ", color=" + color +
                '}';
    }
}
