package com.example.user.program;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mm:ss", timezone = "Asia/Colombo")
    private Date addedTime;
}
