package hansung.designpatterns.facade.hometheater;

public class DvdPlayerInterfaceFactory {
    String description;
    Amplifier amplifier;

    private static DvdPlayerInterfaceFactory instance;

    private DvdPlayerInterfaceFactory() {}

    public static DvdPlayerInterfaceFactory getInstance(){
        if (instance == null){
            instance = new DvdPlayerInterfaceFactory();
        }
        return  instance;
    }

    public DvdPlayer createDvdPlayer() {
        return new DvdPlayerAdapter(new LGDvdPlayer(description, amplifier));
    }
}
