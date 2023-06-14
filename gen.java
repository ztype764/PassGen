import java.util.Random;
public class gen {
static char[] pass(int len) {
	 String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String small = "abcdefghijklmnopqrstuvwxyz";
     String nums = "0123456789";
     String syms = "!@#$%^&*_=+-/.?<>(),;:|[]{}";
     Random rs=new Random();
     char[] pass=new char[len];
     while(i<=len;) {
 pass[i]=caps.charAt(rs.nextInt(caps.length()));
i++;
pass[i]=small.charAt(rs.nextInt(small.length()));
i++;
pass[i]=nums.charAt(rs.nextInt(nums.length()));
i++;
pass[i]=syms.charAt(rs.nextInt(syms.length()));
i++;
     }
return pass;
}

}
