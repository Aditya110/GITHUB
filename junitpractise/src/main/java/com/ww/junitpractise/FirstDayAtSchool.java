package com.ww.junitpractise;

import java.util.Arrays;

public class FirstDayAtSchool {
	
		public String[] prepareMyBag(){
			String[] schoolbag = {"Books", "NoteBooks", "Pens"};
			System.out.println("My School Bag Contains :"+ Arrays.toString(schoolbag));
			return schoolbag;
		}
		
		public String[] addPencils(){
			String[] schoolbag = {"Books", "NoteBooks", "Pens", "Pencils"};
			System.out.println("Now My School Bag Contains :"+ Arrays.toString(schoolbag));
			return schoolbag;
		}
}
