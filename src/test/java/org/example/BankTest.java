package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    // leave getter and setter and add all like this.
    private Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
        bank.setName("SBI");
        bank.setBranch("CBE");
        bank.setBankType(BankType.PUBLIC_SECTOR);
        bank.setIfscCode("SBI00012");
        bank.setStartShift(LocalDateTime.of(2024, 11,9, 10,  00));
        bank.setEndShift(LocalDateTime.of(2024, 11,9, 16, 00));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createAccount() {

    }

    @Test
    void fetchCustomerDetails() {
    }

    @Test
    void blockAccount() {
    }

    @Test
    void updateAccount() {
    }

    @Test
    void transfer() {
    }

    @Test
    void generateTransactionReport() {
    }

    @Test
    void checkBalance() {
    }

    @Test
    void login() {
        Assertions.assertTrue(bank.login("SBI", "SBI@123"));
        Assertions.assertFalse(bank.login("SBI@", "SBI@123"));
        Assertions.assertFalse(bank.login("SBI123", "SBI@123"));
    }

    @Test
    void deposit() {
    }

    @Test
    void withdraw() {
    }
}