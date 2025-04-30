package cm.codenova.endp_lib.backeng.domaine.demo;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Demo {
  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id", updatable = false))
  @Builder.Default
  private DemoId demoId = new DemoId();

  private String name;
}
