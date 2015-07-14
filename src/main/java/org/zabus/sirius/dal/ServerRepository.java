package org.zabus.sirius.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zabus.sirius.model.SiriusServer;

/**
 * Created by user on 10.07.2015.
 */
@Repository
public interface ServerRepository extends CrudRepository<SiriusServer, Long> {
}
