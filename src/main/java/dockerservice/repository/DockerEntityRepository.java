package dockerservice.repository;

import dockerservice.entity.DockerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerEntityRepository extends JpaRepository< DockerEntity,Long> {
}
