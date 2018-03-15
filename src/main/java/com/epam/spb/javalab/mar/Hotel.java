package com.epam.spb.javalab.mar;

import lombok.Builder;
import lombok.Singular;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lombok.AccessLevel.PRIVATE;

@Builder
@FieldDefaults(level = PRIVATE)
public class Hotel {

    @Singular
    List<Body> guests;

    //...

    public String guestsNames() {
        return String.join(", ",
                (guests.stream()
                        .map(Body::getName)).toArray(String[]::new));
    }
}
