package com.tenni.ExceptionValidtor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoReq {
    @NotEmpty(message="code不能为空")
    String code;

    @Length(max=10,message="name长度不能超过10")
    String name;
}
