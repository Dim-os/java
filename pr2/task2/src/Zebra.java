public class Zebra extends Animal{
    public Zebra(String name, int age){
        super(name, age);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", Вид: Зебра";
    }
}
