package revision;

public class employee {

	private int empid,deptno;
	private String name;
	private double basicsalary;
	
	public employee(int empid,int deptno,String name,double salary)
	{
		this.empid=empid;
		this.deptno=deptno;
		this.name=name;
		this.basicsalary=salary;
	}
	public employee()
	{
		this.empid=101;
		this.deptno=10;
		this.name="default";
		this.basicsalary=10000;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", deptno=" + deptno + ", name=" + name + ", basicsalary=" + basicsalary
				+ "]";
	}
	
}
