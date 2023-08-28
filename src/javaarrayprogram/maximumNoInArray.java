package javaarrayprogram;

public class maximumNoInArray {

	public static void main(String[] args) {
		int []a= {5,3,1,2,4};int swap=a[0];
		for(int i=1;i<a.length;i++) {
			if(swap<a[i]) {
				swap=a[i];
			}
	}
		System.out.println(swap);
	}

}
