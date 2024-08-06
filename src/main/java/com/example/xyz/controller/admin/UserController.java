package com.example.xyz.controller.admin;

import com.example.xyz.Mapper.UserMapper;
import com.example.xyz.dto.UserDto;
import com.example.xyz.entity.User;
import com.example.xyz.repository.Userrepsitory;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("admin/user")
public class UserController {
    @Autowired
    Userrepsitory userrepsitory;
    @Autowired
    private UserMapper mapper;


    // hiển thị tất cả bản ghi
   @GetMapping("")
   public String index(Model model)
   {
       Sort sortbyName =Sort.by(Sort.Direction.DESC,"id"); // sắp xếp giảm dần theo id
       List<com.example.xyz.entity.User> listusers = userrepsitory.findAll(sortbyName);
//       System.out.println(listusers);

      model.addAttribute("listusers",listusers);
       return "admin/user/index";
   }
   // hiển thị 1 bản ghi
    @GetMapping(value = "{id}")
//    @GetMapping(params = "id")
   public String show(
//           @RequestParam(name = "id") Integer id, Model model
           @PathVariable("id") User entity ,Model model
    )
   {
       // ép sang User entity
//       User entity = userrepsitory.getOne(id);
       System.out.println(entity.getEmail());
       UserDto userDto = mapper.convertDto(entity);

//       System.out.println("id"+id);
       model.addAttribute("user",userDto);
       return "admin/user/show";
   }
    // hieen thị giao diện tạo mới
    @GetMapping("/create")
   public String create()
   {
       return "admin/user/create";
   }
   // caapj nhật 1 bản ghi
    @PostMapping("/store")
   public String store()
   {
       return "redirect:/admin/user";
   }
   // lấy bản ghi cần edit
    @GetMapping(value = "/edit/{id}")
   public String edit( @PathVariable("id") User entity, Model model)
   {
//       UserDto user = new UserDto();
//       // set dữ liệu cho User
//       user.setId(1);
//       user.setName("kieuducmanh");
//       user.setEmail("manh121123@gmail.com");
//       user.setPassword("123456");
//       user.setDate(new Date(2003,11,12));
//       // truyền dữ liệu
//       model.addAttribute("user",user);
       UserDto user= mapper.convertDto(entity);
       model.addAttribute("user",user);


       return "admin/user/edit";
   }
   // update
    @PostMapping(value = "/update/{id}")
   public String update(
           Model model,

           @Valid UserDto user,
           BindingResult bindingResult
           )

   {
     if(bindingResult.hasErrors())
     {
         System.out.println("Có lỗi ");

//         return "redirect:/admin/user/edit/1"; // cos lỗi chuyển về trang edit
         model.addAttribute("errors",bindingResult.getAllErrors());
         System.out.println(bindingResult.getAllErrors().get(0));
     model.addAttribute("user",user);
         return "admin/user/edit";
     }
     else{
         System.out.println("Không lỗi");
          User entity = this.mapper.convertEntity(user);
         this.userrepsitory.save(entity);
         return "redirect:/admin/user";     // không lỗi thì truyeenf vefe trang chủ
     }


   }
   // delete
    @PostMapping(value = "/delete/{id}")
   public String delete()
   {
      return "redirect:/admin/user";

   }

    // requesstbody
    @RequestMapping(value = "/foos", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Get some Foos";
    }
    // optinal
    @GetMapping(value = { "/api", "/api/{id}" })
    @ResponseBody
    public String getDefaultEmployeesByIdWithOptional(@PathVariable Optional<String> id) {
        if (id.isPresent()) {
            return "ID: " + id.get();
        } else {
            return "ID: Default Employee";
        }
    }
    // redirect
    @GetMapping("/test")
    public String test() {
       return "redirect:/admin/user";
    }
    //foward
    @GetMapping("/test1")
    public String test1() {
       return "forward:/admin/user";
    }

}
