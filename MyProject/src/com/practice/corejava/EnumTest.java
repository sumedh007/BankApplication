package com.practice.corejava;

public class EnumTest {
	enum Day{MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
		private int num;
		Day(int num){
			this.num=num;
		}
		
		public int getNum(){
			return num;
		}
	};
	Day d;
	
	
}
