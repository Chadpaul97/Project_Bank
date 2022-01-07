package com.codingdojo.project_bank.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.project_bank.models.LoginUser;
import com.codingdojo.project_bank.models.User;
import com.codingdojo.project_bank.services.UserService;


@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }  
    
    @GetMapping("/register_page")
    public String register_page(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "register.jsp";
    }  
    
    
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "dashboard.jsp";
    } else {
    	
    	return "redirect:/";
    }
}  	
    

    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
    	
        userServ.register(newUser, result);
        if(result.hasErrors()) {
        	System.out.println(result);
            model.addAttribute("newLogin", new LoginUser());
            return "register.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/dashboard";
    }
    
    
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
    	
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        
        session.setAttribute("user_id", user.getId());
        return "redirect:/dashboard";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.removeAttribute("user_id");
    	return "redirect:/";
    }
    
    
    
    //ACCOUNT DETAILS
    @GetMapping("/details")
    public String details(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "details.jsp";
    } else {
    	
    	return "redirect:/";
    }
}  	
    
    //MAKE DEPOSITS
    @GetMapping("/deposit")
    public String deposit(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "deposit.jsp";
    } else {
    	
    	return "redirect:/";
    }
} 
    
    
    //MAKE WITHDAW
    @GetMapping("/withdraw")
    public String withdraw(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "withdraw.jsp";
    } else {
    	
    	return "redirect:/";
    }
} 
    
    
    //MAKE TRANSFER
    @GetMapping("/transfer")
    public String transfer(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "transfer.jsp";
    } else {
    	
    	return "redirect:/";
    }
} 
    
    
    //MAKE TRANSFER
    @GetMapping("/history")
    public String history(Model model, HttpSession session) {
    	
    	if(session.getAttribute("user_id") != null) {
    		
    	Long user_id = (Long) session.getAttribute("user_id");
    	
    	model.addAttribute("user", userServ.oneUser(user_id));
    	
    	 return "history.jsp";
    } else {
    	
    	return "redirect:/";
    }
} 
}