package br.com.apresentacoes.sprint02.generics.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HomeWorkGrade extends Grade{
    private String studentName;
    private String homeWorkName;

}
