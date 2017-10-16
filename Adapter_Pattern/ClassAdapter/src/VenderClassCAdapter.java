public class VenderClassCAdapter extends Vender2Class implements VenderClassInterface{

    public void request(){
        super.specificRequest(); //어차피 상속받고 있기 때문에 super를 써도 안써도 상관 x
    }
}
