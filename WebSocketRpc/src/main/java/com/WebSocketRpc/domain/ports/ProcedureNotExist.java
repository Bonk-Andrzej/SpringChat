package com.WebSocketRpc.domain.ports;

public class ProcedureNotExist extends RuntimeException {
    public ProcedureNotExist(String message) {
        super(message);
    }
}
