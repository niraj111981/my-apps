package com.niraj.app.repository;

import com.niraj.app.entity.CustomerAccount;
import org.springframework.data.repository.CrudRepository;

public interface CustomerAccountRepository extends CrudRepository<CustomerAccount, Long> {
}
