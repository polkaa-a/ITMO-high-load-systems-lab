package ru.itmo.monsters.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.itmo.monsters.dto.monster.MonsterDTO;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
public class InfectionDTO {

    private UUID id;

    @NotNull(message = "shouldn't be null")
    private UUID monsterId;

    @NotNull(message = "shouldn't be null")
    private UUID infectedThing;

    @NotNull(message = "shouldn't be null")
    private Date infectionDate;

    @NotNull(message = "shouldn't be null")
    private Date cureDate;
}
