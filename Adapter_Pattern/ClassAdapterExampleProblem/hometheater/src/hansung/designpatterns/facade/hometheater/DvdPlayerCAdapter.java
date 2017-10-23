package hansung.designpatterns.facade.hometheater;

public class DvdPlayerCAdapter extends LGDvdPlayer implements DvdPlayer{

    public DvdPlayerCAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

    public void on(){
        super.on();
    }

    public void off(){
        super.off();
    }

    public void eject(){
        super.eject();
    }

    public void play(String movie){
        super.play();
        System.out.println(" which is " + movie);
    }

    public void play(int track){
        super.next();
        super.previous();
    }

    public void stop(){
        super.stop();
    }

    public void pause(){
        super.pause();
    }

    public void setTwoChannelAudio(){
        super.setTwoChannelAudio();
    }

    public void setSurroundAudio(){
        throw new UnsupportedOperationException();
    }

    public String toString(){
        return super.description;
    }
}
