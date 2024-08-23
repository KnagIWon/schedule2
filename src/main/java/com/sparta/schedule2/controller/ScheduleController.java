package com.sparta.schedule2.controller;

import com.sparta.schedule2.dto.ScheduleRequestDto;
import com.sparta.schedule2.dto.ScheduleResponseDto;
import com.sparta.schedule2.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto) {
        return scheduleService.saveSchedule(requestDto);
    }

    @GetMapping("/{id}")
    public ScheduleResponseDto getSchedule(@PathVariable long id) {
        return scheduleService.getSchedule(id);
    }

    @PutMapping("/{id}")
    public ScheduleResponseDto updateSchedule(@PathVariable Long id, @RequestBody ScheduleRequestDto requestDto) {
        return scheduleService.updateSchedule(id, requestDto);
    }
}
