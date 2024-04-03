package classworkdayeleven.genericsexample;

public class FriendshipareaCriteria <T extends Comparable<T>, S extends Comparable<S>> {
	private T Friendname;
	private S location;

	public FriendshipareaCriteria(T name, S area) {
		this.Friendname = name;
		this.location = area;
	}

	public T getName() {
		return Friendname;
	}

	public void setName(T name) {
		this.Friendname = name;
	}

	public S getAttribute() {
		return location;
	}

	public void setAttribute(S area) {
		this.location = area;
	}
}


