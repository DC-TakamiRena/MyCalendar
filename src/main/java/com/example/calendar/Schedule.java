package com.example.calendar;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private LocalDateTime startDatetime;
	private LocalDateTime endDatetime;
}
