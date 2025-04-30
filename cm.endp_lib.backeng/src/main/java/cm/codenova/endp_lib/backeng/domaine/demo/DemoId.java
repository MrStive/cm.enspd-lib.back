package cm.codenova.endp_lib.backeng.domaine.demo;

import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@Getter
public class DemoId implements Serializable {
  String value;

  public DemoId() {
    value = UUID.randomUUID().toString();
  }
}
