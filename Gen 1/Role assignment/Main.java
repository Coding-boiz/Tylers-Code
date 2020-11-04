package code;

import java.util.*;

public class Main {
	public static void main(String[]args) {
		String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31;
		int p1I=1;
		do {
			Random p1R=new Random();
			int p1RI=p1R.nextInt(30);
			if (p1RI <= 12) {
				p1="Villager";
				break;
			} else if(p1RI == 13 || p1RI ==14 || p1RI ==15) {
				p1="Werewolf";
				break;
			} else {
				p1="no";
				break;
			}
			
		}while (p1I==1);
		System.out.println(p1);
	}
}
