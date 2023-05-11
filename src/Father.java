public class Father extends Family {
    private boolean isCar;

    public Father(String name, boolean isCar) {
        super(name);
        this.isCar = isCar;
    }

    @Override
    public void print() {
        System.out.println(getName() + "\n" + isCar + "\n--------------------------");
    }
}
