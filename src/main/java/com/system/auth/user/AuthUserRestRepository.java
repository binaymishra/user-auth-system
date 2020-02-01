package com.system.auth.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "auth_users", path = "auth_users")
public interface AuthUserRestRepository extends PagingAndSortingRepository<AuthUser, Long> {
	
}
