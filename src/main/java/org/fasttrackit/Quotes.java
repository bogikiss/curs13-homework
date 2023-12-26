package org.fasttrackit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@AllArgsConstructor
public class Quotes {
    private int id;
    private final String author;
    private final String quote;
    @Setter
    private boolean favourite;
}
