package cm.codenova.endp_lib.backeng.service.mappers;

import cm.codenova.backeng.enspd_lib.backeng.dto.DemoDTO;
import cm.codenova.endp_lib.backeng.domaine.demo.Demo;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DemoMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(source = "name", target = "name")
  @Mapping(source = "demoId.value", target = "id")
  DemoDTO mapToDemoDTO(Demo demo);
}
