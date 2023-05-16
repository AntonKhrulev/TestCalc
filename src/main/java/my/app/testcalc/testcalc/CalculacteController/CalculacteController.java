package my.app.testcalc.testcalc.CalculacteController;

import my.app.testcalc.testcalc.Calculacte;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculacteController {

    private Object RequestMetod;

    @RequestMapping(value = "/calculacte", method = RequestMethod.GET)
    @ResponseBody
    public String calculacte (@RequestParam String a, @RequestParam String b) {
        Calculacte calculacte = new Calculacte(a, b);
        return calculacte.getResult();
    }

}
