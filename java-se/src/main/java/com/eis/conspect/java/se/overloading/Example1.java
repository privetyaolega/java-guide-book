package com.eis.conspect.java.se.overloading;

import java.util.List;

public class Example1 {

	
		public void doSmth(){}
		
		void doSmth(int i){}
		
		public void doSmth(String s){}
		
		public void doSmth(String s, int i){}
		
		public void doSmth(String s, int i, double d) throws Exception{}
		
		protected Object doSmth(Object o){return null;}
		
		static int doSmth(List list){return 10;}
		
		//wrong
		
//		public boolean doSmth(){return false;}
//		private void doSmth(String s){}
//		public void doSmth(String text, int num){}
//		public static void doSmth(){}
		
		
}
