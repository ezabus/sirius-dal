package org.zabus.sirius.dal;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.zabus.sirius.model.SiriusServiceMethod;

import java.util.List;

/**
 * Created by user on 07.07.2015.
 */

@Component
public class Service {

    @Autowired
    SiriusRepository siriusRepository;

    public List<SiriusServiceMethod> findAll()
    {
        return (List<SiriusServiceMethod>) siriusRepository.findAll();
    }

    public void save(SiriusServiceMethod siriusServiceMethod)
    {
        siriusRepository.save(siriusServiceMethod);
    }

}
