package com.myheadchat.shared;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericResponse
{

    private String mesage;
    public GenericResponse(String mesage){

        this.mesage=mesage;
    }

}
