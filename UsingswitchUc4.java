package employeewagepart1;

public class UsingswitchUc4 {

	
		 final int IS_FULL_TIME=2;
	     final int IS_PART_TIME=1;
	      float EMP_RATE_PER_HOUR=20;
	     float salary=0.0f;
	     int emphr;

	     public float getEmp()
	     {
	        double empCheck = Math.floor(Math.random() * 10) % 3;

	        switch((int) empCheck)
	        {
	            case IS_FULL_TIME: System.out.println("Employee is Full Time");
	                               emphr=8;
	                               break;
	            case IS_PART_TIME: System.out.println("Employee is Part Time");
	                               emphr=4;
	                               break;
	                      default: System.out.println("Employee is Abscent");
	                               emphr=0;
	                               break;
	        }
	        salary=(EMP_RATE_PER_HOUR * emphr );
	        return salary;
	    }

	    public static void main(String[] args) {
	       UsingswitchUc4 usingSwitchCase=new UsingswitchUc4();
	     //System.out.println("Salary"+usingSwitchCase.salary());
	          float EmplSal=usingSwitchCase.getEmp();
	        System.out.println("Employee Salary : "+EmplSal);
	    }

	}


