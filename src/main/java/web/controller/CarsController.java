package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDAO;

@Controller
public class CarsController {

    private CarsDAO carsDAO;

    @Autowired
    public CarsController(CarsDAO carsDAO){
        this.carsDAO = carsDAO;
    }

    @GetMapping("/cars")
    public String print(Model model, @RequestParam(value = "count", required = false) Integer count){
        if (count != null){
            model.addAttribute("cars", carsDAO.result(count));
            return "cars";
        } else{
            model.addAttribute("cars", carsDAO.index());
            return "cars";
        }
    }

}