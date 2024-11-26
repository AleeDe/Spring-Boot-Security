package com.aleedev.SecuityCheck.Model;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "students")
public class Student {
    @Id
    private ObjectId id;
    @NonNull
    private String name;
    private int marks;


}
