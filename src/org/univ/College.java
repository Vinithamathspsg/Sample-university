package org.univ;

public class College extends University {
	public void ug(int total) {
		System.out.println("Total ug course in college -"+total);
		super.ug(20);
}
	public void pg(int totally) {
		System.out.println("Total pg course in college -"+totally);
		super.pg(15);
	}
	public static void main(String[] args) {
		College v=new College();
		v.ug(18);
		v.pg(12);
		}

}
