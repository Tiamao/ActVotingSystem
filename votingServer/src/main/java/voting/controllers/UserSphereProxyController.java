package voting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import voting.models.UserSphereProxy;
import voting.models.UserSphereProxyDao;

import java.util.List;

/**
 * Created by Kamil on 10.04.2017.
 */
@Controller
public class UserSphereProxyController {

    @Autowired
    private UserSphereProxyDao userSphereProxyDao;


    @RequestMapping(value = "/usersphereproxies", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<UserSphereProxy> getAllUsers() {
        return userSphereProxyDao.getAll();
    }
}
