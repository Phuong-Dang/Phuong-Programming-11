import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class DepositTest {
    Deposit testDeposit;
    Withdraw testWithdraw;
    Customer testCustomer;
    Scanner scan = new Scanner(System.in);

    @Before
    public void setup() {
        testCustomer = new Customer();
        testDeposit = new Deposit(scan.nextInt(), new Date(), scan.next());
        testWithdraw = new Withdraw(scan.nextInt(), new Date(), scan.next());
    }

    @Test
    public void testDeposit() {
        testCustomer.deposit(500, new Date(), Customer.CHECKING);
        assertEquals(500, testDeposit.getAmount());
        assertEquals(Customer.CHECKING, testDeposit.getAccount(Customer.CHECKING));
        assertEquals(500,testCustomer.getCheckBalance());
    }

    @Test
    public void testWithdraw() {
        testCustomer.withdraw(200, new Date(), Customer.SAVING);
        assertEquals(200, testWithdraw.getAmount());
        double result = testDeposit.getAmount() - testWithdraw.getAmount();
        assertEquals(300, result);
    }
}
