package practice;

public class CarryForward {
	public static int findPair(char[] a) {
		int count_a=0;
		int count_g=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a') {
				count_a++;
			}
			if(a[i]=='g')
			{
				count_g=count_g+count_a;
			}
		}
		return count_g;
		
	}
	public static void main(String[] args) {
		char[] A= {'a','b','e','g','a','g','g'};
		System.out.println(findPair(A));
	}

}
