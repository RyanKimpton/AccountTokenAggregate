package controller;

import DTO.RequestAccountDTO;
import DTO.ResponseAccountDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface AccountController {

    @RequestMapping(path = "/account/{username}", method = {RequestMethod.GET})
    public Boolean checkUsernameAvailable(@PathVariable String username);

    @RequestMapping(path = "/account", method = {RequestMethod.POST})
    public ResponseAccountDTO createAccount(@RequestBody RequestAccountDTO requestAccount);

    @RequestMapping(path = "/account", method = {RequestMethod.PUT})
    public Boolean authenticate(@RequestBody RequestAccountDTO requestAccount);

    @RequestMapping(path = "/account", method = {RequestMethod.DELETE})
    public String deleteAccount(@RequestBody RequestAccountDTO requestAccount);

}