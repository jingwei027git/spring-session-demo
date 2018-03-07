package com.softpower.demo.springsession.util;

import lombok.experimental.UtilityClass;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

@UtilityClass
public class _Crypto {

    @UtilityClass
    public static class BCrypt {

        public static String encode(String rawPassword) {
            if (StringUtils.isEmpty(rawPassword)) {
                return "";
            } else {
                final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                final String encodedPassword = encoder.encode(rawPassword);
                return encodedPassword;
            }
        }

        public static boolean isMatch(String rawPassword, String encodedPassword) {
            if (StringUtils.trimWhitespace(rawPassword).equals(StringUtils.trimWhitespace(encodedPassword))) {
                return true;
            }
            final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.matches(rawPassword, encodedPassword);
        }

    }

}
