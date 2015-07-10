package org.zabus.sirius.dal;

import org.springframework.data.repository.CrudRepository;
import org.zabus.sirius.model.SiriusServer;

/**
 * Created by user on 10.07.2015.
 */
public interface ServerRepository extends CrudRepository<SiriusServer, Long> {
}
