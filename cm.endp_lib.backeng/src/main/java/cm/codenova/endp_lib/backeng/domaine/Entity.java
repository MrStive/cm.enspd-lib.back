package cm.codenova.endp_lib.backeng.domaine;

import java.io.Serializable;

public interface Entity<T extends Serializable> {
  T getId();

  void setId(T id);

  boolean isDeleted();

  void markAsDeleted();

  void markAsNotDeleted();
}
