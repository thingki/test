package p08;

import java.util.Random;


public class ExecLotto {
	int[] cast;
	int checkNum;
	
	
	
	public ExecLotto(int castLength) {
		cast = new int[castLength];
	}
	
	boolean isDupl() {
		for(int i=0; i<cast.length; i++) {
			if(checkNum == cast[i]) {
				
				return true;
			}
			
		}
		return false;
	}
	
	void castNum() {
		Random rd = new Random();
		for(int i=0; i<cast.length; i++) {
			checkNum = rd.nextInt(45) + 1;
			if(isDupl()) {
				i--;
				continue;
			}
			cast[i] = checkNum;
		}
	}
	
	void print() {
		
		String str = "";
		for(int i=0; i<cast.length; i++) {
			str += cast[i] + ", ";
			
		}System.out.println(str.substring(0, str.length()-2));		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Lotto lt = new Lotto(6, 45); //여기서 입력된 파라미터는 사실상 Lotto 내에서 입력된 것!!! 그렇게 바꿀 수 있다.
//		lt.lottoMaxNum = 2;  // class Lotto에서 private를 했기에 안됨 ---> Lotto 내에서는 사용이 가능하나, 나머지는 불가능하다  // 변수 자체를 건드리지는 못함
		lt.makeLottoNums();
		lt.printLottoNums();
		
		System.out.println("");
		ExecLotto el = new ExecLotto(6);
//		int[] cast = new int[6];
		el.castNum();
		el.print();
		
		System.out.println("");
	
		lt.setCheckLottoNums(el.cast);
		lt.printMachLottoNums();
		
		
		
	}

}
