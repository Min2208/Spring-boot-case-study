//package com.codegym.config;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//
//import com.codegym.model.Role;
//import com.codegym.model.User;
//import com.codegym.repository.RoleRepository;
//import com.codegym.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@Component
//public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {
//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent arg0) {
//        // Roles
//        if (roleRepository.findByName("ROLE_ADMIN") == null) {
//            roleRepository.save(new Role("ROLE_ADMIN"));
//        }
//
//        if (roleRepository.findByName("ROLE_MEMBER") == null) {
//            roleRepository.save(new Role("ROLE_MEMBER"));
//        }
//
//        // Admin account
//        if (userRepository.findByEmail("admin@gmail.com") == null) {
//            User admin = new User();
//            admin.setEmail("admin@gmail.com");
//            admin.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(roleRepository.findByName("ROLE_ADMIN"));
//            roles.add(roleRepository.findByName("ROLE_MEMBER"));
//            admin.setRoles(roles);
//            userRepository.save(admin);
//        }
//
//        // Member account
//        if (userRepository.findByEmail("member@gmail.com") == null) {
//            User user = new User();
//            user.setEmail("member@gmail.com");
//            user.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(roleRepository.findByName("ROLE_MEMBER"));
//            user.setRoles(roles);
//            userRepository.save(user);
//        }
//    }
//
//
//}
//
