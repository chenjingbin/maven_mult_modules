package org.chenjingbin.multdemo.utils;

import java.util.regex.Pattern;

/**
 * 邮箱校验
 * @author chenjb
 * @Date 2018/9/5 20:02
 **/
public class EmailFormatCheckUtiles {

    private static Pattern EMAIL_PATTERN = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");

    /**
     * 检验邮箱
     * @param email
     * @return
     */
    public static boolean checkEmail(String email){
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
