package springsource;

import java.util.Date;


public class Test {

	public static void main(String args[]){
		@SuppressWarnings("deprecation")
		Date date = new Date(115,1,16,10,54,22);
		System.out.println(date.getTime());
	}
}
