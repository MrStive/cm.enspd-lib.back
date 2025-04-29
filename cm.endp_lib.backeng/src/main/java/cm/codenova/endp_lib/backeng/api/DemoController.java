package cm.codenova.endp_lib.backeng.api;

import cm.codenova.backeng.enspd_lib.backeng.api.DemoApi;
import cm.codenova.backeng.enspd_lib.backeng.dto.DemoDTO;
import cm.codenova.endp_lib.backeng.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController implements DemoApi {
  private final DemoService demoService;
  @Override
  public ResponseEntity<List<DemoDTO>> fetchAllDemo(String fieldsToExtractCode) {
    return ResponseEntity.ok().body(demoService.fetchAllDemos());
  }
}
