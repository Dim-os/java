public class Dolphin extends Animal{
    public Dolphin(String name, int age){
        super(name, age);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", Вид: Дельфин";
    }
}
