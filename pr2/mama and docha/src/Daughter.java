public class Daughter extends Mother{
    private String hobby;
    public Daughter (String name, String hobby){
        super(name);
        this.hobby=hobby;
    }
    @Override
    public String toString(){
        return "Дочь: " + getName() + " Увлечение: " + hobby;
    }
}
