package classworkdayeleven.genericsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendShipFinder {
	public static void main(String[] args) {
		List<FriendshipareaCriteria<String, String>> friendslist = new ArrayList<>();
		friendslist.add(new FriendshipareaCriteria<>("Amirtha", "Hosur"));
		friendslist.add(new FriendshipareaCriteria<>("Sai", "Egmore"));
		friendslist.add(new FriendshipareaCriteria<>("Rajesh", "Tuticorin"));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Target Location");
		String targetLocation = sc.next();
		
		List<FriendshipageCriteria<String, Integer>> friendslist1 = new ArrayList<>();
		friendslist1.add(new FriendshipageCriteria<>("Amirtha", 21));
		friendslist1.add(new FriendshipageCriteria<>("Sai", 22));
		friendslist1.add(new FriendshipageCriteria<>("Rajesh", 23));
 
		for (FriendshipareaCriteria<String, String> friend : friendslist) {
			if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
				System.out.println(friend.getName() + " is a nearest friend.");
			}
		}
		System.out.println( "Target Age");
		int targetage = sc.nextInt();
		for (FriendshipageCriteria<String, Integer> friend : friendslist1) {
			if (friend.getage()==targetage) {
				System.out.println(friend.getName() + " is a same age friend.");
			}
		}
		sc.close();
	}
}
 