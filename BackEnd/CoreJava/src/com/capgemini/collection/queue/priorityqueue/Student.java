package com.capgemini.collection.queue.priorityqueue;

public class Student implements Comparable<Student> {
		int age;
		String name;
		public Student(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "Student [age=" + age + ", " + (name != null ? "name=" + name : "") + "]";
		}
		@Override
		public int compareTo(Student o) {
			if(this.age > o.age)
				return 1;
			else if (this.age<o.age)
				return -1;
			else
				return 0;
		}
}

