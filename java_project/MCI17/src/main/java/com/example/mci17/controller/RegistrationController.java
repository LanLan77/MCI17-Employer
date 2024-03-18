package com.example.mci17.controller;
import com.example.mci17.model.Employer;


import org.springframework.web.bind.annotation.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String register(@RequestBody Employer employer) {
        // 将注册信息写入文本文件
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("registrations.txt", true))) {
            writer.write("Company Name: " + employer.getCompanyName() + ", ");
            writer.write("Email: " + employer.getEmail() + ", ");
            writer.write("Password: " + employer.getPassword());  // 注意: 不应在实际应用中以明文形式保存密码
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error during registration";
        }
        return "Registration successful";
    }
}

