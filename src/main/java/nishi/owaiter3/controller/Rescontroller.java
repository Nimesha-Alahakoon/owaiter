package nishi.owaiter3.controller;

import nishi.owaiter3.entity.User;
import nishi.owaiter3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/users")
public class Rescontroller {


    @Autowired
    private UserRepository urepo;

    @RequestMapping( value = "/all")
    private Collection<User> findAll()
    { return urepo.findAll();}

    @PostMapping(value = "/load")
    public Collection<User> persist(@RequestBody final User users)
    {
        urepo.save(users);
        return urepo.findAll();
    }

}

