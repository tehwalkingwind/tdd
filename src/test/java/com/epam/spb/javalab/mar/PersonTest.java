package com.epam.spb.javalab.mar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("Name method works correctly")
    void name() {
        Person person = new Person();
        Person person2 = new Person("Вася",
                LocalDate.of(2001, Month.JUNE, 15));
    }
}