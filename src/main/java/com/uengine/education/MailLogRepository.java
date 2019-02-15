package com.uengine.education;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by uengine on 2019. 2. 13..
 */
@RepositoryRestResource(collectionResourceRel = "v2/mailLogs", path = "v2/mailLogs")
public interface MailLogRepository extends PagingAndSortingRepository<MailLog, Long>{

}
