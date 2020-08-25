package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author LuGew
 * @since 2020/7/27
 */
@Slf4j
class HttpSpecification {
    @Test
    void send() {
        HttpResponse httpResponse = HttpRequest.post("http://192.168.20.14:30000")
                .body(new JSONObject() {{
                    put("title", "hello");
                }}.toJSONString().getBytes())
                .execute();
        log.info(httpResponse.body());
    }
}
