package controller;


import DTO.ResponseTokenDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("Token")
public interface TokenController {
    @RequestMapping(value = "/token/{username}", method = RequestMethod.POST)
    public ResponseTokenDTO createToken(@PathVariable String username);

    @RequestMapping(value = "/token/{bearerToken}", method = RequestMethod.GET)
    public ResponseTokenDTO getTokenFromBearerToken(@PathVariable String bearerToken);

    @RequestMapping(value = "/token/{bearerToken}", method = RequestMethod.PUT)
    public ResponseTokenDTO updateItem(@PathVariable String bearerToken);

    @RequestMapping(value = "/token/{bearerToken}", method = RequestMethod.DELETE)
    public ResponseTokenDTO deleteByBearerToken(@PathVariable String bearerToken);
}


