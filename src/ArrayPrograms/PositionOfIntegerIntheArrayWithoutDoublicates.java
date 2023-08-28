package ArrayPrograms;

import java.util.LinkedHashSet;

public class PositionOfIntegerIntheArrayWithoutDoublicates {

	public static void main(String[] args) {
		 int[]a= {4,6,3,7,9,3,3,4};
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			for(int i=0;i<a.length;i++) {
				set.add(a[i]);
			}
			for(Integer i: set) {
			for(int j=0;j<a.length;j++) {
			if(i==a[j]);
			System.out.println(i+"---"+(j+1)+" times");
			break;
			}
			
			}    
	}

}
