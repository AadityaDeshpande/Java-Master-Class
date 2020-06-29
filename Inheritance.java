import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Student{
	int id;
	int phy;
	int chem;
	int math;
	Student(int id, int phy, int chem, int math){
		this.id = id;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
		System.out.println("Student class const");
	}
	void displayStudentMarks() {
		System.out.println(id);
		System.out.println(phy);
		System.out.println(chem);
		System.out.println(math);
	}
	void name() {
		System.out.println("inside student class");
	}
}


class BioStudent extends Student {
	int bio;
	BioStudent(int id, int phy, int chem, int math,int bio)
	{	
		super(id, phy, chem, math);
		this.bio = bio;
		System.out.println("BioStudent class const");
	}
	void displayBioStudentsMarks() {
		super.displayStudentMarks();
		System.out.println(bio);
	}
	@Override
	void name() {
		System.out.println("inside BIOstudent class");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BioStudent bstd = new BioStudent(0, 100, 120, 340, 500);
		bstd.displayBioStudentsMarks();
		bstd.name();

		
	}

}
