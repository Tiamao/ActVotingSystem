package voting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import voting.models.Proxy;
import voting.models.ProxyDao;

import java.util.List;

/**
 * Created by Kamil on 10.04.2017.
 */
@Controller
public class ProxyController {

    @Autowired
    private ProxyDao proxyDao;

    @RequestMapping(value = "/proxies", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Proxy> getAllActs(){
        return proxyDao.getAll();
    }
}
