import com.softpower.demo.springsession.util._Crypto;

public class test {

    public static void main(String[] args) {
        System.out.println(_Crypto.BCrypt.encode("!softpower123"));
        System.out.println(_Crypto.BCrypt.encode("11111"));
        System.out.println(_Crypto.BCrypt.encode("12345"));
        System.out.println(_Crypto.BCrypt.encode("13579"));
        System.out.println(_Crypto.BCrypt.encode("2468a"));
    }

}
