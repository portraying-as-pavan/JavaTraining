import com.moneytap.insurance.Insurance;
import com.moneytap.insurance.InvalidInsuranceClaimException;
import com.moneytap.insurance.InvalidInsuranceException;
import com.moneytap.insurance.TermInsurance;
import com.moneytap.pojo.Employee;
//import junit.framework.TestCase;
import org.junit.Test;

public class EmployeeInsuranceTest  {

    @Test(expected = InvalidInsuranceClaimException.class)
    public void termInsuranceInsuranceAmountExceeded() throws InvalidInsuranceClaimException, InvalidInsuranceException {
        Employee emp=new Employee("MT1001","Pavan","SDE",10000);
        Insurance insurance=new Insurance("Term Insurance");
        insurance.addEmployeeInsurance(emp);
        assert emp.claimInsurance(1300000);
    }

    @Test
    public void termInsuranceAmount() throws InvalidInsuranceClaimException, InvalidInsuranceException {
        Employee emp=new Employee("MT1001","Pavan","SDE",10000);
        Insurance insurance=new Insurance("Term Insurance");
        insurance.addEmployeeInsurance(emp);
        assert emp.claimInsurance(13000);
    }

    @Test(expected = InvalidInsuranceException.class)
    public void checkInvalidInsurance() throws InvalidInsuranceException {
        Employee emp=new Employee("MT1001","Pavan","SDE",10000);
        Insurance insurance=new Insurance("AccidentInsurance");
        insurance.addEmployeeInsurance(emp);

    }


}
