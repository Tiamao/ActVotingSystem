package voting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import voting.models.User;
import voting.models.UserDao;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @RequestMapping(value="/get-by-pesel/{pesel}")
    @ResponseBody
    public String getPasswordByPesel(@PathVariable String pesel) {
        String password;
        try {
            User user = userDao.getByPesel(pesel);
            password = String.valueOf(user.getPassword());
        }
        catch (Exception ex) {
            return "User not found: " + ex.toString();
        }
        return password;
    }

}
