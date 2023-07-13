package br.eti.allandemiranda.forex.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Accessors(fluent = true)
@Getter
@ToString
public class Candlestick {
    @NotNull private final long idx;
    @NotNull private final LocalDateTime openTime;
    @NotNull private final float open;
    @NotNull private final float high;
    @NotNull private final float low;
    @NotNull private final float close;
}
