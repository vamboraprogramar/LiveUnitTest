package br.com.vamboraprogramar.liveunittest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String givenName;
    private String surname;
    private String gender;
    private LocalDate birthDate;

}
