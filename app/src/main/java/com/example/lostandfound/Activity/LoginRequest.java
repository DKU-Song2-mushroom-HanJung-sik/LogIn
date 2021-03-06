package com.example.lostandfound.Activity;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //서버 URL 설정( PHP 파일 연동)
    final static private String URL = "http://172.23.14.54/login.php";
    private Map<String, String> map;

    public LoginRequest(String customerId, String customerContact, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("customerId",customerId);
        map.put("customerContact", customerContact);
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
