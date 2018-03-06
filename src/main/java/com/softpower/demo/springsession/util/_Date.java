package com.softpower.demo.springsession.util;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class _Date {

    public static LocalDateTime nowWithUTC() {
        return LocalDateTime.now(ZoneId.of("UTC"));
    }

}
