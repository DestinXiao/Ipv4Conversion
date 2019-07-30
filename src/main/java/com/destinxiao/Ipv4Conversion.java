package com.destinxiao;

import com.destinxiao.execption.IPFormatException;

public class Ipv4Conversion {

    public static Integer toInt(String source) {
        String pattern = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

        if(!source.matches(pattern)) {
            throw new IPFormatException(source + " is not a valid IP format");
        } else {
            String[] nums = source.split("\\.");
            int res = 0;
            int i = 0;

            while(i < 4) {
                res = res << 8 | Integer.parseInt(nums[i++]);
            }
            return res;
        }
    }

    public static String toIpv4(int source) {
        return ((source >> 24) & 0xff) +
                "." + ((source >> 16) & 0xff) +
                "." + ((source >> 8) & 0xff) +
                "." + ((source >> 0) & 0xff);
    }
}
