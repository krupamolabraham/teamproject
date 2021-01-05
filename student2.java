package com;

public class student2 {

			private int rollno;
			private int marks;
			private String name;
			private String collegename;
			private boolean ismarried;
			private String  gender;
			private int phoneno;
			private String Email;
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public int getMarks() {
				return marks;
			}
			public void setMarks(int marks) {
				this.marks = marks;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getCollegename() {
				return collegename;
			}
			public void setCollegename(String collegename) {
				this.collegename = collegename;
			}
			public boolean isIsmarried() {
				return ismarried;
			}
			public void setIsmarried(boolean ismarried) {
				this.ismarried = ismarried;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public int getPhoneno() {
				return phoneno;
			}
			public void setPhoneno(int phoneno) {
				this.phoneno = phoneno;
			}
			public String getEmail() {
				return Email;
			}
			public void setEmail(String email) {
				Email = email;
			}
			@Override
			public String toString() {
				return "student2 [rollno=" + rollno + ", marks=" + marks + ", name=" + name + ", collegename=" + collegename
						+ ", ismarried=" + ismarried + ", gender=" + gender + ", phoneno=" + phoneno + ", Email=" + Email + "]";
			}
			
	}
