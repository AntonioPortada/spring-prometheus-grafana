package com.tyj.prometheus_grafana.controller.exception;

public record Error(
    String type,
    String message
) {
}
