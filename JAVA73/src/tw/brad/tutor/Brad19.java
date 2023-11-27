package tw.brad.tutor;

import tw.brad.classes.TWId;

public class Brad19 {

	public static void main(String[] args) {
		TWId myId = TWId.createTWId("A123456789");
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(7);
		TWId id4 = new TWId(true, 25);
		
		System.out.println(id1.getID());
		System.out.println(id2.getID());
		System.out.println(id3.getID());
		System.out.println(id4.getID());

//		if (TWId.isReightID("A123456789")) {
//			System.out.println("OK");
//		} else {
//			System.out.println("XX");
//		}

	}

}