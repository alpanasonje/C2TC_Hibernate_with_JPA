package com.cg.demo;

public class StudentNotFoundException extends Exception 
{
	StudentNotFoundException()
	{
		System.out.println("Invalid Student UID");
	}
}
