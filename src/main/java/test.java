import com.softpower.demo.springsession.util._Date;

import java.time.LocalDateTime;
import java.util.Optional;

public class test {

    public static void main(String[] args) {
        final LocalDateTime expireDateTime = LocalDateTime.of(2018, 3, 7, 10, 20);
        System.out.println(expireDateTime);
        System.out.println(Optional.ofNullable(expireDateTime).filter(dateTime -> dateTime.isAfter(_Date.nowWithUTC())).isPresent());
    }

}
