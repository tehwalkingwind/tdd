package com.epam.spb.javalab.mar;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import static lombok.AccessLevel.PRIVATE;

@Value
public class Person implements Serializable {
    String name;
    LocalDate dob;
}
