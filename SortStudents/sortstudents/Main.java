import java.util.*;
import java.util.Collections.*;

public class Main
{
	ArrayList<Student> studentList;

	public static void main(String args[])
	{
		new Main().getGoing();
	}

	public void getGoing()
	{
		studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Zues", 26));
		studentList.add(new Student(505, "Abey", 24));
		studentList.add(new Student(809, "Vignesh", 32));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(studentList, Student.StuNameComparator);

		for (Student str : studentList)
		{
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(studentList, Student.StuRollno);
		for (Student str : studentList)
		{
			System.out.println(str);
		}
	}
}
