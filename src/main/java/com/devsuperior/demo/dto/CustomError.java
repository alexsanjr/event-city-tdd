package com.devsuperior.demo.dto;

import java.time.Instant;

public record CustomError(Instant timestamp, Integer status, String error, String path) {

}
