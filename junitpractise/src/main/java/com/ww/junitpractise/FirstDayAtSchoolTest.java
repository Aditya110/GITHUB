package com.ww.junitpractise;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = {"Books", "NoteBooks", "Pens"};
	String[] bag2 = {"Books", "NoteBooks", "Pens", "Pencils"};
	
	@Test
	public void testprepareMyBag() {
		System.out.println("Inside testprepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
	
	@Ignore
	@Test
	public void testaddPencils(){
		System.out.println("Inside testaddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

}
