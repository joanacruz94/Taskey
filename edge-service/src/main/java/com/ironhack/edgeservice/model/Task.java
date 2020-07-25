package com.ironhack.edgeservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Task {
    private Long id;

    @NotNull
    private String description;

    @NotNull
    private String status;

    @NotNull
    private String urgency;

    @NotNull
    private String category;

    @NotNull
    private Long projectID;

    @NotNull
    private Long responsibleID;

    private LocalDate startDate;

    private LocalDate endDate;
}
