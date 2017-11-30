package hansung.designpatterns.proxy;

/**
 * Created by kwanwoo on 2017. 11. 20..
 */
public class NonOwnerProxy implements PersonBean {

    private PersonBean person;

    public NonOwnerProxy(PersonBean person){
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
        throw new IllegalAccessException();
    }

    @Override
    public void setGender(String gender) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void setInterests(String interests) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void setHotOrNotRating(int rating) throws IllegalAccessException {
        person.setHotOrNotRating(rating);
    }
}
