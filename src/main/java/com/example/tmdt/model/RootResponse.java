package com.example.tmdt.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RootResponse<T> {

    private Integer code;
    private String message;
    private T payload;

    public RootResponse() {

    }
    private static <T> RootResponse<T> result(Integer code, String message, T payload) {
        RootResponse<T> result = new RootResponse<T>();
        result.code = code;
        result.message = message;
        result.payload = payload;
        return result;
    }
    public static <T> RootResponse<T> result(Integer code, String message) {
        return result(code, message, null);

    }

    public static <T> RootResponse<T> success(T payload) {
        return success(HttpStatus.SUCCESS.value, payload);
    }

    public static <T> RootResponse<T> success(String message, T payload) {
        return result(HttpStatus.SUCCESS.status, message, payload);
    }

    public static <T> RootResponse<T> fail(String message, T payload) {
        return result(HttpStatus.FAIL.status, message, payload);
    }
    @Getter
    public enum HttpStatus {

        SUCCESS(200, "SUCCESS"),
        FAIL(100, "FAIL"),
        NOT_FOUND(404, "NOT_FOUND"),
        UNAUTHORIZED(401, "UNAUTHORIZED"),
        TIMEOUT(408, "TIME_OUT"),
        TOKENTIMEOUT(410, "TOKEN_TIME_OUT"),
        EXPECTATIONFAILED(417, "EXPECTATION_FAILED");


        private Integer status;
        private String value;

        HttpStatus(Integer status, String value) {
            this.status = status;
            this.value = value;
        }
    }
}
