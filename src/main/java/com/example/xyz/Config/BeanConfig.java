package com.example.xyz.Config;

import com.example.xyz.dto.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("huebui")
//  c1:  @Primary có 2 bên trở nên đặt vào bean nào thì bean ý được gọi
    //c2 : đặt tên cho bean rồi @qualier trước được gọi
    public Company getCompany() {
       Company company = new Company();
       company.setName("bùi minh huệ");
       return company;
    }
    @Bean("anhtrinh")
    public Company getCompany2() {
        Company company = new Company();
        company.setName("Trịnh thị ánh");
        return company;
    }
}
