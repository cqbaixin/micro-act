package com.haitao.pb.common.response;

public class Result<T> {
    private Integer code;

    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data){
        return new Result<>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage(),data);
    }

    public Result(){}

    public Result(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ResultEnum.SUCCESS.getCode(), message, data);
    }

    public static Result<?> failed() {
        return new Result<>(ResultEnum.FAIL.getCode(),
                ResultEnum.FAIL.getMessage(), null);
    }

    public static Result<?> failed(String message) {
        return new Result<>(ResultEnum.FAIL.getCode(), message, null);
    }

    public static Result<?> failed(IResultEnum errorResult) {
        return new Result<>(errorResult.getCode(), errorResult.getMessage(), null);
    }

}
