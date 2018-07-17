package com.ds;

import java.util.Random;

public class NutsandBolts {

	public static void main(String[] args) {
		Random r = new Random();
		int size = 90;
		int[] nuts  = new int[size];
		int[] bolts = new int[size];

		for(int i=0; i< size; i++)
			nuts[i] = r.nextInt(1000);
		
		bolts = nuts;
		
		qSort(nuts, bolts, 0, nuts.length - 1);
		String[] strArray = new String[nuts.length];
		
		for(int i=0; i<nuts.length; i++){
			strArray[i] = nuts[i] + " " + bolts[i];
		}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

	private static void qSort(int[] nuts, int[] bolts, int lo, int hi) {
		if (hi <= lo) return;
		
		int p = partition(nuts, bolts, lo, hi);
		//partition(bolts, lo, hi, nuts[p]);
		
		qSort(nuts, bolts, lo, p - 1);
		qSort(nuts, bolts, p + 1, hi);
	}

	private static int partition(int[] a, int[] b, int st, int en) {
		int pivot = a[st];
		int lt = st; int rt = en;
		while (lt < rt) {
			while(a[lt] < pivot) {lt++; if(lt == en) break;}
			while(a[rt] > pivot) {rt--; if(rt == st) break;}
			if(lt < rt) swap(a, lt, rt);
		}
		swap(a, lt, rt);
		
		pivot = a[rt];
		lt = st; rt = en;
		while (lt < rt) {
			while(b[lt] < pivot) {lt++; if(lt == en) break;}
			while(b[rt] > pivot) {rt--; if(rt == st) break;}
			if(lt < rt) swap(b, lt, rt);
		}
		swap(b, lt, rt);
		
		return rt;

	}

/*
	private static void qSort(int[] nuts, int[] bolts, int lo, int hi) {
		if (hi <= lo) return;
		
		int p = partition(nuts, lo, hi, bolts[lo]);
		partition(bolts, lo, hi, nuts[p]);
		
		qSort(nuts, bolts, lo, p - 1);
		qSort(nuts, bolts, p + 1, hi);
	}

	private static int partition(int[] a, int st, int en, int pivot) {
		int lt = st; int rt = en;
		while (lt < rt) {
			while(a[lt] < pivot) {lt++; if(lt == en) break;}
			while(a[rt] > pivot) {rt--; if(rt == st) break;}
			if(lt < rt) swap(a, lt, rt);
		}
		
		swap(a, lt, rt);
		
		return rt;

	}
*/
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}


}
