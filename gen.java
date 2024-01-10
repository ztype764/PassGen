import java.util.Random;

public class gen {
     static char[] pass(int len) {
          String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>(),;:|[]{}";
          int len1 = base.length();
          Random rs = new Random();
          char[] pass = new char[len];
          pass[0] = base.charAt(rs.nextInt(26) + 52);
          pass[1] = base.charAt(rs.nextInt(10) + 62);
          for (int i = 2; i < len; i++) {
               pass[i] = base.charAt(rs.nextInt(len1));
          }
          return pass;
     }
}

