package webapp.controllers;

// Import framework depenencies  - required to handle the HTTP request and send a response
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

// import webapp.models.*;
// import webapp.dao.*;


// The @ annotation identifies this as a Controller class
@Controller
public class ApplicationController {


    // index accepts a request parameter, named name,  from the address URL
    // the parameter is optional and has a default value if not provided
    // String name will be assigned the param value
    // Model model is used to pass data to the view
    // This method, index(), serves as the site index - the default page
    // Requests for the root '/' will be handled by this method
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {

        // add name and its value to the view model object
        model.addAttribute("name", name);

        //Load and return the index view
        return "index";
    }
}
