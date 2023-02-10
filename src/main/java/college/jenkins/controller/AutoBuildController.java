package college.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuxianbei
 * Date: 2023/2/6
 * Time: 16:39
 * Version:V1.0
 */
@RequestMapping("build")
@RestController
public class AutoBuildController {

    @GetMapping("success")
    public String success() {
        return "自动构建成功";
    }
}
