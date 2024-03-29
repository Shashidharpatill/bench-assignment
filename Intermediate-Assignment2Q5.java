package com.company.Assignments.Assignment2;

abstract class shape {
	abstract void draw();
}

class line extends shape {
	public void draw() {
		System.out.println("Line is drawn");
	}
}

class rectangle extends shape {
	public void draw() {
		System.out.println("rectangle is drawn");
	}
}

class cube extends shape {
	public void draw() {
		System.out.println("cube is drawn");
	}
}

class square extends shape {
	public void draw() {
		System.out.println("square is drawn");
	}
}

public class Assignment2Q5 {
	public static void main(String[] args) {
		shape l = new line();
		shape r = new rectangle();
		shape c = new cube();
		shape s = new square();
		draw_All(l);
		draw_All(r);
		draw_All(c);
		draw_All(s);
	}

	public static void draw_All(shape obj) {
		obj.draw();
	}
}