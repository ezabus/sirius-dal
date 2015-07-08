package org.zabus.sirius.dal;

/**
 * Created by user on 07.07.2015.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zabus.sirius.model.SiriusServiceMethod;

@Repository
public interface SiriusRepository extends CrudRepository<SiriusServiceMethod,Long> {

}
