package com.josk.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;
}