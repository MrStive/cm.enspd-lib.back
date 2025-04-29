package cm.codenova.endp_lib.backeng.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import cm.codenova.backeng.enspd_lib.backeng.dto.DemoDTO;
import cm.codenova.endp_lib.backeng.domaine.demo.Demo;
import cm.codenova.endp_lib.backeng.repository.DemoSpringRepository;
import cm.codenova.endp_lib.backeng.service.mappers.DemoMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoServiceTest {
    @InjectMocks private DemoService objetUnderTest;
    @Mock private DemoMapper demoMapper;
    @Mock private DemoSpringRepository demoSpringRepository;

    @Test
    @DisplayName("the return the list of demoDTO when the repository return the list of demo")
    void fetchAllDemos() {
        Demo demo2 = mock(Demo.class);
        Demo demo1 = mock(Demo.class);
        when(demoSpringRepository.findAll()).thenReturn(List.of(demo1, demo2));
        DemoDTO demoDTO1 = mock(DemoDTO.class);
        DemoDTO demoDTO2 = mock(DemoDTO.class);
        when(demoMapper.mapToDemoDTO(demo1)).thenReturn(demoDTO1);
        when(demoMapper.mapToDemoDTO(demo2)).thenReturn(demoDTO2);

        List<DemoDTO> result = objetUnderTest.fetchAllDemos();

        assertNotNull(result);
        assertThat(result).hasSize(2).contains(demoDTO1, demoDTO2);
    }
}