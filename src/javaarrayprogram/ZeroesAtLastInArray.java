package javaarrayprogram;

public class ZeroesAtLastInArray {

	public static void main(String[] args) {
		int[]a= {2,0,4,0,2,7,0,8,5};
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==0 && a[i]!=a[a.length-1]) {
//				int next=a[i+1];
//                 for(int j=i;j<a.length;j++) {
//					a[j]=a[j+1];
//				}
//                 a[a.length-1]=next;
//                 i++;
//			}
//			
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
	int b[]=new int[a.length];	  
    int m=0;
    int n=a.length-1;
    for(int i=0;i<a.length;i++) {
    	if(a[i]!=0) {
    		b[m]=a[i];
    		m++;
    	}else {
    		a[i]=b[n];
    		n--;
    	}
    
	}

	}
}