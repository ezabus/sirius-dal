package org.zabus.sirius.dal;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.zabus.sirius.model.SiriusService;
import org.zabus.sirius.model.SiriusServiceMethod;

import java.util.List;

/**
 * Created by user on 07.07.2015.
 */

@Component
@Transactional
public class Service {

    @Autowired
    MethodRepository methodRepository;
    @Autowired
    ServiceRepository serviceRepository;

    public SiriusService findService(Long id)
    {
        SiriusService service = serviceRepository.findOne(id);
        //service.getSiriusServiceMethods().size();
        return service;
    }

    public void deleteService(Long id)
    {
        serviceRepository.delete(id);
    }

    public SiriusServiceMethod findMethod(Long id)
    {
        return methodRepository.findOne(id);
    }

    public List<SiriusService> findAllService()
    {
        return (List<SiriusService>) serviceRepository.findAll();
    }

    public List<SiriusServiceMethod> findAllMethods()
    {
        return (List<SiriusServiceMethod>) methodRepository.findAll();
    }

    public void save(SiriusServiceMethod siriusServiceMethod)
    {
        methodRepository.save(siriusServiceMethod);
    }

}
