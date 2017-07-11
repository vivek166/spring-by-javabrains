package com.synerzip.spring;

public class Triangle {

	private Point pointA;
	private Point pointC;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw(){
		System.out.println("point A ->"+getPointA().getX() + ""+ getPointA().getY());
		System.out.println("point B ->"+getPointB().getX() + ""+ getPointB().getY());
		System.out.println("point C ->"+getPointC().getX() + ""+ getPointC().getY());
	}
}
