package synle.com.controller;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class Home {  
    String message = "Welcome to your 1st Maven Spring project !";  
  
    @RequestMapping("/hello")  
    public ModelAndView showMessage() {  
        System.out.println("from controller");  
        ModelAndView mv = new ModelAndView("hello", "message", message);
        
        return mv;
    }  
}  