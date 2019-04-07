package com.tenni.ExceptionValidtor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonException extends RuntimeException {

    private String code;
    private String msg;
}
