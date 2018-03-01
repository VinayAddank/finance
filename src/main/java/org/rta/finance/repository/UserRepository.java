package org.rta.finance.repository;


import org.rta.finance.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUserId(Long id);

    UserEntity findByUserName(String userName);
}
