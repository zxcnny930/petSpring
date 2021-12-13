package com.petlist.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComitPojo {
    private int pet;
    private String name;
    private String gender;
    private String location;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String date;
    private int phone;
    private int prove;
}
