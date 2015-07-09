package org.zabus.sirius.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zabus.sirius.model.SiriusCluster;

/**
 * Created by user on 09.07.2015.
 */
@Repository
public interface ClusterRepository extends CrudRepository<SiriusCluster,Long> {
}
