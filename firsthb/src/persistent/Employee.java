package persistent;

public class Employee 
{
  public int id;
  public String name;
  public int dept_no;
  public float salary;
  public int getId()
  {
	return id;
  }
  public void setId(int id) 
  {
	this.id = id;
  }
  public String getName() 
  {
	return name;
  }
  public void setName(String name)
  {
	this.name = name;
  }
  public int getDept_no() 
  {
	return dept_no;
  }
  public void setDept_no(int dept_no) 
  {
	this.dept_no = dept_no;
  }
  public float getSalary() 
  {
	return salary;
  }
  public void setSalary(float salary)
  {
	this.salary = salary;
  }	
 }
