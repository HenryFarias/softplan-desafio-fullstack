package br.com.softplan.process.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessRequest {

    private Long id;

    @NotNull(message = "Nome é obrigatório")
    private String name;

    private List<Long> users;
}
