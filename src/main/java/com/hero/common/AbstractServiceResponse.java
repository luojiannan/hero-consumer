package com.hero.common;

/**
 * @author ljn
 * @date 2018/10/10.
 */
public class AbstractServiceResponse {

    private static final String SUCCESS_CODE = "00";

    private static final String FAIL_CODE = "01";

    private String code = "00";

    private String message;

    public AbstractServiceResponse() {
    }

    public void setErrorMessage(String message) {
        this.code = "01";
        this.message = message;
    }

    public void setSuccess() {
        this.code = "00";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
