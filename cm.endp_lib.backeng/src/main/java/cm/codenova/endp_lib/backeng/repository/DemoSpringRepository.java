package cm.codenova.endp_lib.backeng.repository;

import cm.codenova.endp_lib.backeng.domaine.demo.Demo;
import cm.codenova.endp_lib.backeng.domaine.demo.DemoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoSpringRepository extends JpaRepository<Demo, DemoId> {}
