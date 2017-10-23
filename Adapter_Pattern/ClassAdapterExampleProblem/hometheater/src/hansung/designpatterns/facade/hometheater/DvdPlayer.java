package hansung.designpatterns.facade.hometheater;

public interface DvdPlayer {
 
	void on();
 
	void off();

	void eject();
 
	void play(String movie);

	void play(int track);

	void stop();
 
	void pause();

	void setTwoChannelAudio();
 
	void setSurroundAudio();
 
	String toString();
}
