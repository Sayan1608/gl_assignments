package com.greatlearning.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SantoshTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> S = new ArrayList<>();
		List<Integer> E = new ArrayList<>();
		
		S.add(1);
		S.add(4);
		S.add(6);
		
		E.add(3);
		E.add(8);
		E.add(9);
		
		int result = minimumRemainingLength(9, 3, S, E);
		
		System.out.println(result);
	}
	
	public static int minimumRemainingLength(int N, int Q, List<Integer> S, List<Integer> E) {
		
		List<Integer> L = new ArrayList<>();
		
		for(int i=0;i<Q;i++) {
			L.add(i, E.get(i)-S.get(i) + 1 );
		}
		
//		Collections.sort(L);
		
		
		
		int sum = 0;
		int s = 0;
		int e = 0;
		
		for(int i= 0;i<L.size();i++) {
			
			if(sum + L.get(i) <= N) {
				if(i == 0) {
					sum += L.get(i);
					s = S.get(i);
					e = E.get(i);
				}else {
					if(S.get(i) > e) {
						sum+= L.get(i);
						e = E.get(i);
					}
				}
			}
		}
		
		Collections.sort(L);
		
		if(sum < L.get(L.size()-1)) {
			sum = L.get(L.size()-1);
		}
		
		System.out.println(L);
		
		return N-sum;
	}

}
