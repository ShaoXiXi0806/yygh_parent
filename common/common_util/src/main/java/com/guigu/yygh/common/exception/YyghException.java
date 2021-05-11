package com.guigu.yygh.common.exception;

import com.guigu.yygh.common.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "自定义全局异常类")
public class YyghException extends RuntimeException{

    @ApiModelProperty(value = "异常状态码")
    private Integer code;

    public YyghException(String message, Integer code){
        super(message);
        this.code = code;
    }

    public YyghException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "YyghException{" +
                "code=" + code +
                ",message=" + this.getMessage() +
                '}';
    }
}
