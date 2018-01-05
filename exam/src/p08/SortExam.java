package p08;

public class SortExam {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 3, 4};
		int cnt = 0;
		String duplstr = "";
		for(int j=0; j<nums.length; j++) {
			int idx = j;
			int num =nums[idx];
			for(int i=idx+1; i<nums.length; i++) {
				if(num==nums[i]) {					
					cnt++;
					duplstr += nums[i] + ",";
//					System.out.println(num +"이 중복되었어용");					
				}
			}
		}
		
		System.out.println("중복된 숫자 : "+duplstr.substring(0, duplstr.length() -1));
		System.out.println(cnt);                                                
		
		
		
		
		
		
		
	}

}
