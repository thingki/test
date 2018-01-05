package p08;

public class Exam {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,3,4};
		
		int cnt = 0;
		for(int i=0; i<nums1.length; i++) {
			int checkNum = nums1[i];
			for(int j=0; j<nums2.length; j++) {
				if(checkNum==nums2[j]) {
					cnt++;					
				}				
			}			
		}
		
		
//		for(int i=0; i<nums2.length;i++) {
//			int checkNum = nums1[0];
//			if(checkNum==nums2[i]) {
//				cnt++;
//				System.out.println(nums2[i]==checkNum);
//			}			
//		}
//		for(int i=0; i<nums2.length;i++) {
//			int checkNum = nums1[1];
//			if(checkNum==nums2[i]) {
//				cnt++;
//				System.out.println(nums2[i]==checkNum);
//			}			
//		}
//		for(int i=0; i<nums2.length;i++) {
//			int checkNum = nums1[2];
//			if(checkNum==nums2[i]) {
//				cnt++;
//				System.out.println(nums2[i]==checkNum);
//			}			
//		}
			
		
		System.out.println(cnt);
		
//		System.out.println(num);
		
		
	}

}
