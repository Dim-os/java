public class Mother {
    private String name;

    public Mother(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Мать: " + name;
    }
}


