package com.forty2.training.crud.utils;

import lombok.Data;

@Data
public class R {
    private Integer code;
    private String msg;
    private Object data;

    public static R ok() {
        R r = new R();
        r.setCode(200);
        r.setMsg("ok");
        return r;
    }

    public static R ok(Object data) {
        R r = R.ok();
        r.setData(data);
        return r;
    }

    public static R error(Integer code, String msg) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static R error(Integer code, String msg, Object data) {
        R r = error(code, msg);
        r.setData(data);
        return r;
    }
}
