package com.example.xyz.controller.admin;

import com.example.xyz.dto.Company;
import com.example.xyz.untils.UploadFileUntil;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class MyController {
//    @Autowired
//    private HttpServletRequest request;
//    @Autowired
//    private HttpServletResponse response;
//    @Autowired
//    private HttpSession session;
   @Autowired
    private ServletContext context;
   @Autowired
   private UploadFileUntil uploadFileUntil;


@Autowired
        @Qualifier("huebui")
    Company company;
    @ResponseBody
    @GetMapping("/test")
    public String test()
    {
        return company.getName();
    }
    @GetMapping("/hello")
    public String hello(Model model)
    {
        System.out.println(this.context.getRealPath(""));
        String message="xin chào ae 29";
        model.addAttribute("message",message);
        return "hello";
    }
    @PostMapping("/upload")
    public String uploadfile(@RequestParam("upload") MultipartFile file, Model model)
    {
        this.uploadFileUntil.hanleFile(file);
        System.out.println(this.context.getRealPath(""));
        return "redirect:/admin/hello";
    }


}
