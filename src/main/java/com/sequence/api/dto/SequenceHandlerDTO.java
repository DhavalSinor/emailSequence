package com.sequence.api.dto;

import com.sequence.api.utils.CommonUtils;
import lombok.*;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author Nawaz
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SequenceHandlerDTO implements Delayed {

    private Long delayTime;

    @Override
    public long getDelay(TimeUnit unit) {
        return delayTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return CommonUtils.saturatedCast(this.delayTime - ((SequenceHandlerDTO) o).delayTime);
    }
}
