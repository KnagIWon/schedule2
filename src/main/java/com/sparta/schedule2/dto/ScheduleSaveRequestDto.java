package com.sparta.schedule2.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleSaveRequestDto {
    private String username;
    private String title;
    private String description;
}
