package hansung.designpatterns.facade.hometheater;

public class DvdPlayerInterfaceFactory {
    String description = "Top-O-Line DVD";
    Amplifier amplifier;

    private static DvdPlayerInterfaceFactory instance;
    private DvdPlayerInterfaceFactory(){}

    public static DvdPlayerInterfaceFactory getInstance() {
        if (instance == null){
            instance = new DvdPlayerInterfaceFactory();
        }
        return  instance;
    }

    public DvdPlayerCAdapter createDvdPlayer() {
        return new DvdPlayerCAdapter(description, amplifier);
    }
}
