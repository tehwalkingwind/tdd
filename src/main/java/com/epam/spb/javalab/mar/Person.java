package com.epam.spb.javalab.mar;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static lombok.AccessLevel.PRIVATE;

@Data
@Log4j2
@Builder
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
public class Person implements Serializable, Body {

    @Wither
    @Getter(onMethod = @__(@NotNull))
    String name;
    LocalDate dob;

    @Singular
    List<String> telephones;

    @Singular
    Map<String, Integer> pairs;

    @SneakyThrows
    public static void main(String... args) {

        int x;
        int y;
        //...
        y = x = 5 + 8;

        var person1 = Person.builder()
                .name("Олег")
                .dob(LocalDate.of(1255, 5, 7))
                .telephone("222-33-22")
                .telephone("333-22-33")
                .pair("jhgsdg", 5)
                .pair("iuwgyef", 9)
                .build();

        Body person2 = Person.builder()
                .dob(LocalDate.of(1255, 5, 7))
                .name("Олег")
                .build();

        ((Person) person2).withName("Вася").getName();// "Вася"

        Class<?> jkhadgadfg = Class.forName("jkhadgadfg");
    }
}
