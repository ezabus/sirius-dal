package org.zabus.sirius.dal;

import org.springframework.data.repository.CrudRepository;
import org.zabus.sirius.model.SiriusService;

/**
 * Created by user on 10.07.2015.
 */
public interface ServiceRepository extends CrudRepository<SiriusService, Long> {
}
