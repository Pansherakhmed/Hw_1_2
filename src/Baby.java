public class Baby extends Family{

    private int age;
    public Baby(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(getName() + "\n" + age + "\n--------------------------");
    }
}
