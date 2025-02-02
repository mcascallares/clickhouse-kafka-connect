package com.clickhouse.kafka.connect.sink.kafka;

public enum RangeState {
    SAME(1),
    PREFIX(2),
    SUFFIX(3),
    CONTAINS(4),
    OVER_LAPPING(5),
    NEW(6),
    ERROR(7);


    private int rangeState;

    RangeState(int rangeState) {
        this.rangeState = rangeState;
    }
}
