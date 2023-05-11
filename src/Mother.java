public class Mother extends Family{

    private double height;
    public Mother(String name, double height) {
        super(name);
        this.height = height;
    }
    @Override
    public void print() {
        System.out.println(getName() + "\n" + height  + "\n--------------------------");
    }
}
