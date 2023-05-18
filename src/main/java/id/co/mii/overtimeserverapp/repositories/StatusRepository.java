package id.co.mii.overtimeserverapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.mii.overtimeserverapp.models.Status;
import java.util.List;


@Repository
public interface StatusRepository extends JpaRepository<Status, Integer>{
    Status findByName(String name);
}
