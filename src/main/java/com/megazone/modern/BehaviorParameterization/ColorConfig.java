package com.megazone.modern.BehaviorParameterization;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class ColorConfig {
    public enum Color { RED, GREEN }
}
