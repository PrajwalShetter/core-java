package com.xworkz.streamApi.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class LensDto {

    private int lensId;
    private String lensType;
    private  double price;

}
