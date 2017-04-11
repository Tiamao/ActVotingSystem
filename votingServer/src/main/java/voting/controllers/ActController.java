package voting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import voting.models.Act;
import voting.models.ActDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil on 10.04.2017.
 */

@Controller
public class ActController {

    @Autowired
    private ActDao actDao;

    @RequestMapping(value = "/acts", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Act> getAllActs(){
        return actDao.getAll();
    }

    @RequestMapping(value="/get-act-by-sphere/{id}")
    @ResponseBody
    public List<Act> getActBySphere(@PathVariable int id) {
        List<Act> selectedActs = new ArrayList<>();
        try {
            List<Act> allActs= getAllActs();
            allActs.forEach(act -> {
                if (act.getSphereID() == id){
                    selectedActs.add(act);
                }
            });
        }
        catch (Exception ex) {

        }
        return selectedActs;
    }
}
