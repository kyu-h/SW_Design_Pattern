package hansung.designpatterns.facade.hometheater;

public class DvdPlayerAdapter implements DvdPlayer{
    LGDvdPlayer lgDvdPlayer;

    public DvdPlayerAdapter(LGDvdPlayer lgDvdPlayer){
        this.lgDvdPlayer = lgDvdPlayer;
    }

    public void on(){
        lgDvdPlayer.on();
    }

    public void off(){
        lgDvdPlayer.off();
    }

    public void eject(){
        lgDvdPlayer.eject();
    }

    public void play(String movie){
        lgDvdPlayer.play();
        System.out.println(" which is " + movie);
    }

    public void play(int track){
        lgDvdPlayer.next();
        lgDvdPlayer.previous();
    }

    public void stop(){
        lgDvdPlayer.stop();
    }

    public void pause(){
        lgDvdPlayer.pause();
    }

    public void setTwoChannelAudio(){
        lgDvdPlayer.setTwoChannelAudio();
    }

    public void setSurroundAudio(){
        throw new UnsupportedOperationException();
    }

    public String toString(){
        return lgDvdPlayer.description;
    }
}
