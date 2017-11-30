package hansung.designpatterns.proxy;

import java.util.HashMap;

public class MatchMakingTestDrive {
	HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();
 	
	public static void main(String[] args) {
		try {
			MatchMakingTestDrive test = new MatchMakingTestDrive();
			test.drive();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
 
	public MatchMakingTestDrive() throws IllegalAccessException {
		initializeDatabase();
	}

	public void drive() throws IllegalAccessException {
		PersonBean joe = getPersonFromDatabase("Joe Javabean"); 
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());

		ownerProxy.setInterests("bowling, Go");

		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	PersonBean getOwnerProxy(PersonBean person) {
 		
        return new OwnerProxy(person);
	}

	PersonBean getNonOwnerProxy(PersonBean person) {
		
        return new NonOwnerProxy(person);
	}

	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}

	void initializeDatabase() throws IllegalAccessException {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
