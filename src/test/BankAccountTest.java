/**
 * 
 */
package test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import intro2java.BankAccount;
import intro2java.InsufficientFundsException;
import intro2java.InvalidAmmount;



//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("test  for class BankAccount")
class BankAccountTest {
	private BankAccount bankAccount;
	{System.out.print("class initialized ");}

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("this needs to run before all");
	}

	@AfterAll
	static void afterAllunit() {
		System.out.println("finished testing");
	}

	@BeforeEach
	void init() {
		bankAccount=new BankAccount("testAccount", 1000);
		System.out.print("test account initialized with 1000 balance");
	}

	@AfterEach
	void cleanup() {
		System.out.println(" instant ended");
	}

	@Nested
	@DisplayName("test withdraw method of class BankAccount")
	class WithdrawTest{
		@Test
		@DisplayName("Testing withdraw")
		void testWithdraw() throws InsufficientFundsException, InvalidAmmount {
			boolean IsServerup =true;
			assumeTrue(IsServerup,"the server is down ");
			int withdrawAmount =300;
			int expectedBalance=700;
			bankAccount.withdraw(withdrawAmount);
			assertEquals(expectedBalance,bankAccount.getBalance(),"withdraw 300");

		}

		@Test
		@DisplayName("Testing withdraw invalid ammount")
		void testWithdrawInvalidAmmount() {
			int withdrawAmount =-300;
			assertThrows(InvalidAmmount.class,()->bankAccount.withdraw(withdrawAmount), "withdraw -300");

		}

		@Test
		@DisplayName("Testing withdraw Insufficient funds")
		void testWithdrawInsufficient() {
			int withdrawAmount =2000;
			assertThrows(InsufficientFundsException.class,()->bankAccount.withdraw(withdrawAmount), "withdraw 2000");

		}
	}

	@Test
	@DisplayName("Testing debosit method")
	void testDepositMoney() throws InvalidAmmount{
		int depositAmount =1000;
		int expectedBalance=2000;
		bankAccount.depositMoney(depositAmount);
		assertEquals(expectedBalance,bankAccount.getBalance(),"withdraw 300");
	}

	@Test
	//@Disabled
	@DisplayName("Testing deposit invalid ammount")
	void testDepositMoneyInvalidAmmount() {
		int depositAmount =0;
		assertThrows(InvalidAmmount.class,()->bankAccount.depositMoney(depositAmount), "deposit 0");
	}
	@Test
	@Disabled
	@DisplayName("Disabled the test the feature not yet implemented")
	void disabledMethod() {
		fail("Not yet implemented");
	}

}
