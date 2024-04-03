package classworkdayeleven.capgemini.generics;

public class SwapPositions {
	 public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
	        if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
	            throw new IndexOutOfBoundsException("Either one or both the given indexes are out of bounds.");
	        }

	        T temp = list[firstPos];
	        list[firstPos] = list[secondPos];
	        list[secondPos] = temp;

	        return list;
	    }
	public static void main(String[] args) {
		String[] list= {"1","2","3","4"};
		 swap(list,1,3);
		//swap(list,1,8); exception
		for (String s : list) {
         System.out.print(s + " ");
	}}}


