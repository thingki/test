package p08;

import java.util.Random;

public class Lotto {
	private int[] lottoNums;	
	private int lottoMaxNum;
	private int checkRandomNum;
	private int[] checkLottoNums;
	private int cnt;
	int castCheck;
	
	public Lotto() {
		this(6);  // 14번째 열의 생성자를 호출한다. 필요한 int값이 14열에 있기 때문!
		
	}
	
	public Lotto(int lottoMaxNum) {
		this(lottoMaxNum, 45);
	}
	
	public Lotto(int lottoNumsLength, int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;

	}
	
	void setCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums = checkLottoNums;		
	}
	
	void printMachLottoNums() {
		cnt = 0;
		for(int i=0; i<lottoNums.length; i++) {
			castCheck = lottoNums[i];
			for(int j=0; j<checkLottoNums.length; j++) {
				if(castCheck==checkLottoNums[j]) {
					cnt++;
				}
			}			
		}
		System.out.println("맞은 갯수는 " + cnt + " 입니당!!!" );		
	}
	
	
	
	void makeLottoNums() {	
		Random r = new Random();	
		for(int i=0; i<lottoNums.length; i++) {
			checkRandomNum = r.nextInt(lottoMaxNum)+1;			
			if(isDupl()) {				
				i--;
			}else {
				lottoNums[i] = checkRandomNum;
			}
		}
		
	}
	
	private boolean isDupl() {
		for(int i=0; i<lottoNums.length; i++) {
			if(lottoNums[i]==checkRandomNum) {
				return true; //return 값은 자체적으로 break가 있기에 제일 먼저 선언된 return값이  return값이다.!!!!!!!!
			}
		}
		return false;
	}
	
	
	void printLottoNums() {
		for(int i=0; i<lottoNums.length; i++) {
			System.out.print(lottoNums[i]+",");			
		}
		
	}
	
	boolean a() {
		return trun;
		
	}
	
	int a = r.nextInt(45);
	public static void main(String[] args) {
		
		
//		int[] lottoNums = new int[6];		
		Lotto lt = new Lotto();
//		lt.lottoMaxNum = 2;
		lt.makeLottoNums();
		lt.printLottoNums();
		
		int b = lt.a(); 
			
					
		
		
		
		
	}

}
