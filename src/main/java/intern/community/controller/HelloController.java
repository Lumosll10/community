package intern.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller   //自动把Bean识别为类进行管理，同时识别为Controller;Controller:允许这个类接收前端的请求
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name); //相当于key value
        return "hello"; //去templates下寻找hello.html

    }
}
