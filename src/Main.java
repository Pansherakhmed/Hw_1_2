public class Main {
    public static void main(String[] args) {
        createObject("Father");
        createObject("Mother");
        createObject("Baby");
    }

    public static String createObject(String family) {
        Father father = new Father("John", true);
        Mother mother = new Mother("Sara", 1.50);
        Baby baby = new Baby("Aibek", 5);
        switch (family) {
            case "Father":
                father.print();
                break;
            case "Mother":
                mother.print();
                break;
            case "Baby":
                baby.print();
                break;
        }
        return family;
    }
}