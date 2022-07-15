package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    Account account = new Account();

    @Test
     void depositTest() {
        account.setBalance(100);
        account.deposit(500);
        assertEquals(account.getBalance(), 600, "Deposit Test");
    }
}
