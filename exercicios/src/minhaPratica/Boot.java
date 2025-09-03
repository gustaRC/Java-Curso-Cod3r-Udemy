package minhaPratica;

import java.util.Date;

import minhaPratica.classes.User;
import minhaPratica.enums.Occupations;

public class Boot {

	public static void main(String[] args) {
	
		User maria = new User("Maria", new Date("02/12/2004"), Occupations.DESEMPREGADO);
		
		System.out.println(maria.getName());
		System.out.println(maria.getId());
		System.out.println(maria.getAge());
	}
}
