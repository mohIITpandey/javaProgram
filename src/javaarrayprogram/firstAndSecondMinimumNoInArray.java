package javaarrayprogram;

public class firstAndSecondMinimumNoInArray {
public static void main(String[] args) {
	int []a= {0,0,3,1,2,0};int swap=a[0];
//	for(int i=1;i<a.length;i++) {
//		if(swap>a[i]) {
//			swap=a[i];
//		}
//	}
//	int swap2=a[0];
//	for(int i=1;i<a.length;i++) {
//		if(swap2>a[i] ) {
//			swap2=a[i];}
//			if(swap2==swap) {
//				swap2=a[i-1];
//			}	
//		}
int fmin=a[0];
int smin=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]<=fmin) {
		if(a[i]!=fmin) {
			smin=fmin;
		}
		fmin=a[i];
	}else if(smin==fmin || smin>a[i]) {
		smin=a[i];
	}
}

	System.out.println(fmin+"  "+smin);
	}
	
	
	
}

