package com.example.springwebfluxannotationbased.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by ciazhar on 11/7/17.
 * <p>
 * [ Documentation Here ]
 */

@Data
@Builder
public class Person {
    private String name;
    private Date joinedDate;
}
