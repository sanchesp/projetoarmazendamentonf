package com.equipeturma862.cadastronf.repository;

import com.equipeturma862.cadastronf.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository <Funcionario, Long> {

    boolean existByFuncional (Long funcional);
    boolean existByEmail (String email);

}
