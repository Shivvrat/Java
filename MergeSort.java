package labAlgo;

import java.util.Arrays;

class MergeSort {
	 static int[] mergeSortInt(int[] a ){
		if(a.length==1||a.length==0){
			return a;
		}
		else {
		int[] var1 = Arrays.copyOfRange(a, 0, a.length/2-1);
		int[] var2 = Arrays.copyOfRange(a, a.length/2,a.length-1);
		
		var1 = mergeSortInt(var1);
		var2 = mergeSortInt(var2);
		return merge(var1,var2);}
		
	}
	 
	 static int[] merge(int[] a,int[] b){
		 int[] c = new int[a.length+b.length];
		 int counta = 0;
		 int countb = 0;
		 int countc = 0;
		 while(counta<a.length-1&&countb<b.length-1){
			 if(a[counta]<b[countb]){
				 c[countc]=a[counta];
				 countc++;
				 counta++;
			 }
			 else{
				 c[countc]=b[counta];
				 countc++;
				 countb++;
			 }
		 }
		 while(counta<a.length-1){
			 c[countc]=a[counta];
			 countc++;
			 counta++;
		 }
		 while(countb<a.length-1){
			 c[countc]=b[counta];
			 countc++;
			 countb++;
		 }
		 return c;
	 }
	 static String[] mergeSortWord(String[] a ){
			if(a.length==1){
				return a;
			}
			
			String[] var1 = Arrays.copyOfRange(a, 0, a.length/2);
			String[] var2 = Arrays.copyOfRange(a, a.length/2+1,a.length-1);
			
			var1 = mergeSortWord(var1);
			var2 = mergeSortWord(var2);
			return mergeWord(var1,var2);
		}
		 static String[] mergeWord(String[] a,String[] b){
			 String[] c = new String[a.length+b.length];
			 int counta = 0;
			 int countb = 0;
			 int countc = 0;
			 while(counta<a.length-1&&countb<b.length-1){
				 if(b[countb].compareTo(a[counta]) > 0){
					 c[countc]=a[counta];
					 countc++;
					 counta++;
				 }
				 else{
					 c[countc]=b[counta];
					 countc++;
					 countb++;
				 }
			 }
			 while(counta<a.length-1){
				 c[countc]=a[counta];
				 countc++;
				 counta++;
			 }
			 while(countb<a.length-1){
				 c[countc]=b[counta];
				 countc++;
				 countb++;
			 }
			 return c;
		 }
}
