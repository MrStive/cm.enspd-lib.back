package cm.codenova.endp_lib.backeng.service;

import cm.codenova.backeng.enspd_lib.backeng.dto.DemoDTO;
import cm.codenova.endp_lib.backeng.repository.DemoSpringRepository;
import cm.codenova.endp_lib.backeng.service.mappers.DemoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoService {
  private final DemoMapper demoMapper;
  private final DemoSpringRepository demoSpringRepository;

  public List<DemoDTO> fetchAllDemos() {
    return demoSpringRepository.findAll().stream().map(demoMapper::mapToDemoDTO).toList();
  }
}
