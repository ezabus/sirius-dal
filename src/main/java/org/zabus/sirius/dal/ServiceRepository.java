package org.zabus.sirius.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.zabus.sirius.model.SiriusService;

/**
 * Created by user on 10.07.2015.
 */
@Repository
@Transactional
public interface ServiceRepository extends CrudRepository<SiriusService, Long> {
}
