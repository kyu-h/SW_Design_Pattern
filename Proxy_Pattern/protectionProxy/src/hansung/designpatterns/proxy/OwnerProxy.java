package hansung.designpatterns.proxy;

/**
 * Created by kwanwoo on 2017. 11. 20..
 */
public class OwnerProxy implements PersonBean {
    private PersonBean person;

    public OwnerProxy(PersonBean person){
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getGender() {
        return person.getGender();
    }

    @Override
    public String getInterests() {
        return person.getInterests();
    }

    @Override
    public int getHotOrNotRating() {
        return person.getHotOrNotRating();
    }

    @Override
    public void setName(String name) throws IllegalAccessException {
        person.setName(name);
    }

    @Override
    public void setGender(String gender) throws IllegalAccessException{
        person.setGender(gender);
    }

    @Override
    public void setInterests(String interests) throws IllegalAccessException{
        person.setInterests(interests);
    }

    @Override
    public void setHotOrNotRating(int rating) throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
