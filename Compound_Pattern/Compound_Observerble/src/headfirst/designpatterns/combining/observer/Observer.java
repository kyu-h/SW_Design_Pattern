package headfirst.designpatterns.combining.observer;

public interface Observer extends java.util.Observer{
	public void update(QuackObservable duck);
}
