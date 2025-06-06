package com.example.pafbackend.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "StatusUpdates")
@Getter
@Setter
public class StatusUpdate {
    @Id
    private String id;
    private String userId;
    private Date timestamp;
    private String title;
    private String image;
    private String description;


}