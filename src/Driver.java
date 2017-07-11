import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Driver
{
	public static String myoutput_writer = "dfsdfsdf";
	public static ArrayList<course_dtls> course_list = new ArrayList<course_dtls>();
	public static ArrayList<course_allocation> course_list_2 = new ArrayList<course_allocation>();
	public int courseCapacity_A = 0,courseCapacity_B = 0,courseCapacity_C = 0,courseCapacity_D = 0;
	private static String OUTPUT_FILENAME;
	
	public void fileReader(FileReader filereader )
	{
		String newline = null;
		try
		{
			BufferedReader bufferreader = new BufferedReader(filereader);
			while((newline = bufferreader.readLine()) != null)
			{
				//object is created for course_dtls class
				course_dtls course_obj = new course_dtls();
				String[] student_dtls = newline.split(" ");
				
				for(int i = 0;i < student_dtls.length;i++)
				{
					if(i == 0)
					{
						course_obj.setStudent_name(student_dtls[0]);
					}
					else if(i == 1)
					{
						course_obj.setCourse_A(Integer.parseInt(student_dtls[1]));	
					}
					else if(i == 2)
					{
						course_obj.setCourse_B(Integer.parseInt(student_dtls[2]));
					}
					else if(i == 3)
					{
						course_obj.setCourse_C(Integer.parseInt(student_dtls[3]));
					}
					else if(i == 4)
					{
						course_obj.setCourse_D(Integer.parseInt(student_dtls[4]));
					}	
				}
				course_list.add(course_obj);
				System.out.println(course_obj.getStudent_Name()+" "+course_obj.getCourse_A()+" "+course_obj.getCourse_B()+" "+course_obj.getCourse_C()+" "+course_obj.getCourse_D());
			}
			bufferreader.close();
			filereader.close();
//			course_allocation(course_list);
			
		}
		catch (IOException io)
		{
			System.out.println("io exception");
			io.printStackTrace();
			System.exit(1);
		}
	
	}

	public void course_allocation(ArrayList<course_dtls> course_list)
	{		
		System.out.println("\n\n\n");
		int i;
		for(i = 0;i < course_list.size();i++)
		{
			if(courseCapacity_A < 10 || courseCapacity_B < 10 || courseCapacity_C < 10 || courseCapacity_C < 10)
			{
				course_allocation course_alloc_obj = new course_allocation();
				course_alloc_obj.setStudentName(course_list.get(i).getStudent_Name());
				//for course A
				if(course_list.get(i).getCourse_A()== 1){
					course_alloc_obj.setPreference_course1("A");
					course_alloc_obj.setCount_course1(course_list.get(i).getCourse_A());
					courseCapacity_A++;
				}
				else if(course_list.get(i).getCourse_A()== 2){
					course_alloc_obj.setPreference_course2("A");
					course_alloc_obj.setCount_course2(course_list.get(i).getCourse_A());
					courseCapacity_A++;
				}
				else if(course_list.get(i).getCourse_A()== 3){
					course_alloc_obj.setPreference_course3("A");
					course_alloc_obj.setCount_course3(course_list.get(i).getCourse_A());
					courseCapacity_A++;
				}
				else if(course_list.get(i).getCourse_A() == 4){
					course_alloc_obj.setPreference_course4("A");
					course_alloc_obj.setCount_course4(course_list.get(i).getCourse_A());
//					courseCapacity_A++;
				}
				//for course B
				if(course_list.get(i).getCourse_B()== 1){
					course_alloc_obj.setPreference_course1("B");
					course_alloc_obj.setCount_course1(course_list.get(i).getCourse_B());					
					courseCapacity_B++;
				}
				else if(course_list.get(i).getCourse_B()== 2){
					course_alloc_obj.setPreference_course2("B");
					course_alloc_obj.setCount_course2(course_list.get(i).getCourse_B());
					courseCapacity_B++;
				}
				else if(course_list.get(i).getCourse_B()== 3){
					course_alloc_obj.setPreference_course3("B");
					course_alloc_obj.setCount_course3(course_list.get(i).getCourse_B());
					courseCapacity_B++;
				}
				else if(course_list.get(i).getCourse_B() == 4)
				{
					course_alloc_obj.setPreference_course4("B");
					course_alloc_obj.setCount_course4(course_list.get(i).getCourse_B());
//					courseCapacity_B++;
				}
				//for course C
				if(course_list.get(i).getCourse_C()== 1){
					course_alloc_obj.setPreference_course1("C");
					course_alloc_obj.setCount_course1(course_list.get(i).getCourse_C());
					courseCapacity_C++;
				}
				else if(course_list.get(i).getCourse_C()== 2){
					course_alloc_obj.setPreference_course2("C");
					course_alloc_obj.setCount_course2(course_list.get(i).getCourse_C());
					courseCapacity_C++;
				}
				else if(course_list.get(i).getCourse_C()== 3){
					course_alloc_obj.setPreference_course3("C");
					course_alloc_obj.setCount_course3(course_list.get(i).getCourse_C());
					courseCapacity_C++;
				}
				else if(course_list.get(i).getCourse_C() == 4){
					course_alloc_obj.setPreference_course4("C");
					course_alloc_obj.setCount_course4(course_list.get(i).getCourse_C());
//					courseCapacity_C++;
				}
				//for course D
				if(course_list.get(i).getCourse_D()== 1){
					course_alloc_obj.setPreference_course1("D");
					course_alloc_obj.setCount_course1(course_list.get(i).getCourse_D());
					courseCapacity_D++;
				}
				else if(course_list.get(i).getCourse_D()== 2){
					course_alloc_obj.setPreference_course2("D");
					course_alloc_obj.setCount_course2(course_list.get(i).getCourse_D());
					courseCapacity_D++;
				}
				else if(course_list.get(i).getCourse_D()== 3){
					course_alloc_obj.setPreference_course3("D");
					course_alloc_obj.setCount_course3(course_list.get(i).getCourse_D());
					courseCapacity_D++;
				}
				else if(course_list.get(i).getCourse_D() == 4){
					course_alloc_obj.setPreference_course4("D");
					course_alloc_obj.setCount_course4(course_list.get(i).getCourse_D());
//					courseCapacity_D++;
				}
				course_list_2.add(course_alloc_obj);
			}
			else{
				System.out.println(" ");
			}
		}
				
		
	}
	
	public void print_course_allocation(ArrayList<course_allocation> course_list_2)
	{
		File f = new File(OUTPUT_FILENAME);
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		BufferedWriter writer = new BufferedWriter(fw);

		int preferenceValue_1sub = 0 ,preferenceValue_2sub = 0,preferenceValue_3sub = 0,totalpreference_Value ;
		float preference_Score_Students = 0;
		int numb_Students = course_list_2.size();
		for(int i = 0;i < course_list_2.size();i++)
		{	
			/*printing out the preference values
			for preference 1*/
			if(course_list_2.get(i).getPreference_course1() == "A") {
				preferenceValue_1sub = course_list.get(i).getCourse_A();
			}
			else if(course_list_2.get(i).getPreference_course1() == "B") {
				preferenceValue_1sub = course_list.get(i).getCourse_B();
			}
			else if(course_list_2.get(i).getPreference_course1() == "C")
			{
				preferenceValue_1sub = course_list.get(i).getCourse_C();
			}
			else if(course_list_2.get(i).getPreference_course1() == "D")
			{
				preferenceValue_1sub = course_list.get(i).getCourse_D();
			}
			//for preference 2
			if(course_list_2.get(i).getPreference_course2() == "A")
			{
				preferenceValue_2sub = course_list.get(i).getCourse_A();
			}
			else if(course_list_2.get(i).getPreference_course2() == "B")
			{
				preferenceValue_2sub = course_list.get(i).getCourse_B();
			}
			else if(course_list_2.get(i).getPreference_course2() == "C")
			{
				preferenceValue_2sub = course_list.get(i).getCourse_C();
			}
			else if(course_list_2.get(i).getPreference_course2() == "D")
			{
				preferenceValue_2sub = course_list.get(i).getCourse_D();
			}
			//for preference 3
			if(course_list_2.get(i).getPreference_course3() == "A")
			{
				preferenceValue_3sub = course_list.get(i).getCourse_A();
			}
			else if(course_list_2.get(i).getPreference_course3() == "B")
			{
				preferenceValue_3sub = course_list.get(i).getCourse_B();
			}
			else if(course_list_2.get(i).getPreference_course3() == "C")
			{
				preferenceValue_3sub = course_list.get(i).getCourse_C();
			}
			else if(course_list_2.get(i).getPreference_course3() == "D")
			{
				preferenceValue_3sub = course_list.get(i).getCourse_D();
			}
			totalpreference_Value = preferenceValue_1sub+preferenceValue_2sub+preferenceValue_3sub;
			preference_Score_Students = preference_Score_Students + totalpreference_Value;
			
			System.out.println(course_list_2.get(i).getStudentName()+" "+course_list_2.get(i).getPreference_course1()+" "+course_list_2.get(i).getPreference_course2()+" "+course_list_2.get(i).getPreference_course3()+" "+totalpreference_Value);
			write(writer, course_list_2.get(i).getStudentName()+" "+course_list_2.get(i).getPreference_course1()+" "+course_list_2.get(i).getPreference_course2()+" "+course_list_2.get(i).getPreference_course3()+" "+totalpreference_Value+"\n");
			
		}
		System.out.println("Average preference score is : "+preference_Score_Students/numb_Students);
		write(writer,"Average preference score is : "+preference_Score_Students/12+"\n");
		System.out.println("A is :" +courseCapacity_A+" B is :"+courseCapacity_B+" C is :"+courseCapacity_C+" D is :"+courseCapacity_D);
		close_write(writer);
	}

	private void write(BufferedWriter bw, String data) {
		try 
		{
			bw.write(data);
		} 
		catch (IOException e) 
		{
			System.out.println("Error while writing data to file: " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	private void close_write(BufferedWriter bw)
	{
		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		if(args.length < 2 )
		{
			System.out.println("few arguments,please enter more arguments");
			System.exit(1);
		}
		Driver dr = new Driver();
		try
		{
			OUTPUT_FILENAME = args[1];
			FileReader filereader = new FileReader(args[0]);
			dr.fileReader(filereader);
			dr.course_allocation(course_list);
			dr.print_course_allocation(course_list_2);

			
				
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("Input File Not Found");
			fnf.printStackTrace();
			System.exit(1);
		} 
		
		
	}

}
