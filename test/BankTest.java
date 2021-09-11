import com.moneytap.banking.Bank;
import com.moneytap.banking.BankCustomer;
import com.moneytap.banking.DailyWithdrawalLimit;
import com.moneytap.banking.InsufficientAmount;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BankTest {

  //  BankCustomer john=new BankCustomer(1,100000);
    Bank sbi=null;
    BankCustomer pavan=null,rakesh=null;
    @Before
          public void bankSetUp() throws Exception {
         rakesh = new BankCustomer(2, 5000);
         pavan = new BankCustomer(3, 30000);
         sbi = new Bank("SBI");
    }


    @Test
    public void withDrawAmount() throws DailyWithdrawalLimit, InsufficientAmount {
        assert sbi.withdraw(pavan,5000);
    }

    @Ignore("Feature Not implemented")
    @Test(expected = InsufficientAmount.class )
    public void withdrawAmountExceeded() throws DailyWithdrawalLimit, InsufficientAmount {
        assert sbi.withdraw(rakesh,10000);
    }
}
