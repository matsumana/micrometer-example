package info.matsumana.example.entity;

import lombok.Data;

@Data
public class Todo {
    private int id;
    private String title;
    private String detail;
    private boolean finished;
}
