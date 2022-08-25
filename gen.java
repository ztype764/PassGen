package ba;
import java.util.Random;
public class gen {
static char[] pass(int len) {
	 String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String small = "abcdefghijklmnopqrstuvwxyz";
     String nums = "0123456789";
     String syms = "!@#$%^&*_=+-/.?<>)";
     String disk = caps + small +
             nums + syms;
     Random rs=new Random();
     char[] pass=new char[len];
     for(int i=0;i<len;i++) {
    	 pass[i]=disk.charAt(rs.nextInt(disk.length()));
     }
return pass;
}

}
