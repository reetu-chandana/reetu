import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length!=0)
                	return(students);
                else
			return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		// Add your implementation here
      /*  for(int i=0;i<students1.length;i++)
          {
                  students[i].id = students1[i].id;
		students[i].fullName = students1[i].fullName;
		students[i].birthDate =students1[i]. birthDate;
		students[i].avgMark = students1[i].avgMark;

	}*/
	this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if((index<0)||(index>=students.length))
		return null;
        else
        return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		//convert an array students into arraylist st
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		obj.add(0,student); 
		obj.toArray(students);  
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		obj.add(students.length,student); 
		obj.toArray(students);  
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		obj.add(index,student); 
		obj.toArray(students);  
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		obj.remove(index); 
		obj.toArray(students);  
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int ind=-1;
		for(int i=0;i<students.length;i++)
		 {if(students[i].compareTo(student)==1)
		    ind=i;
		    break;
		}
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		
		   obj.remove(ind);  
		  
		obj.toArray(students);  
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		   for(int i=index;i<obj.size();i++)
		      obj.remove(i); 
		obj.toArray(students);  
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int ind=-1;
		for(int i=0;i<students.length;i++)
		 {if(students[i].compareTo(student)==1)
		    ind=i;
		    break;
		}
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		
		 for(int i=ind;i<obj.size();i++)
		   obj.remove(i);  
		  
		obj.toArray(students);  
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		   for(int i=0;i<index;i++)
		      obj.remove(i); 
		obj.toArray(students); 
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int ind=-1;
		for(int i=0;i<students.length;i++)
		 {if(students[i].compareTo(student)==1)
		    ind=i;
		    break;
		}
		ArrayList obj=new ArrayList();
		for(int i=0;i<students.length;i++)
		   obj.add(students[i]);
		
		 for(int i=0;i<ind;i++)
		   obj.remove(i);  
		  
		obj.toArray(students);  
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
