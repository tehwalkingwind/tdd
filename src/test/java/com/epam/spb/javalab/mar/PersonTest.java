package com.epam.spb.javalab.mar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PersonTest {
    @Test
    @DisplayName("Name method works correctly")
    void name() {
//        Body person = new Person();
//        Body person2 = new Person("Вася",
//                LocalDate.of(2001, Month.JUNE, 15));

        Body mock = mock(Body.class);
        when(mock.getDob())
                .thenReturn(LocalDate.of(2001, Month.JUNE, 15))
                .thenReturn(LocalDate.of(2001, Month.JUNE, 14));

        when(mock.getName()).thenReturn("Вася");

        Hotel build = Hotel.builder()
                .guest(mock)
                .build();

        assertThat(build.guestsNames(), is("Вася"));
    }
}