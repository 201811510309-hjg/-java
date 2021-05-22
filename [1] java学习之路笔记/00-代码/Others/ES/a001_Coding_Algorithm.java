package Others.ES;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class a001_Coding_Algorithm {
    public static void main(String[] args) {
        //URL编码

        String encoded = URLEncoder.encode ("李小龙", StandardCharsets.UTF_8);
        System.out.println(encoded); //%E6%9D%8E%E5%B0%8F%E9%BE%99

        String decoded = URLDecoder.decode("%E6%9D%8E%E5%B0%8F%E9%BE%99",StandardCharsets.UTF_8);
        System.out.println(decoded);

        /**
         * Base64编码
         */
//在Java中，二进制数据就是byte[]数组。Java标准库提供了Base64来对byte[]数组进行编解码：
        byte[] input = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded); //5Lit

        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));





    }
}
