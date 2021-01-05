package com;

public class student1 {

		private int rollno;
		private String name;
		private int marks;
		private String collegename;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		@Override
		public String toString() {
			return "student2 [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", collegename=" + collegename
					+ "]";
		}



	}
