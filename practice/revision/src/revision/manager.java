package revision;

public class manager extends employee{
	private double perfbonus;

	public manager(int empid, int deptno, String name, double salary, double perfbonus) {
		super(empid, deptno, name, salary);
		this.perfbonus = perfbonus;
	}

	public manager() {
		super();
		this.perfbonus=5000;
	}
	
	public void showprefbonus()
	{
		System.out.println("Manager preformance bonus="+perfbonus);
	}

	@Override
	public String toString() {
		return super.toString()+"performance bonus="+"["+this.perfbonus+"]";
	}
	
	
	
}
