package test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchunrong
 * @Date 2022/7/16 22:17
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test21", method = RequestMethod.GET)
    public String test() {
        return "这是一个test21";
    }
}
