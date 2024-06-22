package Basic_Concepts;



public class Encapsulation {
	
	private int empId;
	private String empName, comName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setEmpId(1);
		e.setEmpName("AA");
		e.setComName("BB");
		
		System.out.println(e.getEmpId()+e.getEmpName()+e.getComName());

	}

}
