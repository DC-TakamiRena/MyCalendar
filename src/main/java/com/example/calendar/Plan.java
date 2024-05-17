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
public class Plan {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private LocalDateTime startDatetime;
	private LocalDateTime endDatetime;
}
