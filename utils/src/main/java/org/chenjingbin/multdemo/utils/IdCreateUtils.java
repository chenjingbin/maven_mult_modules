package org.chenjingbin.multdemo.utils;

import java.util.Random;

/**
 *
 * @author chenjb
 * @Date 2018/8/22 9:32
 **/
public class IdCreateUtils {

    private static char[] chars={'0','1','2','3','4','5','6','7','8','9',
            'q','w','e','r','t','y','u','i','o','p',
            'a','s','d','f','g','h','j','k','l','z',
            'x','c','v','b','n','m','Q','W','E','R',
            'T','Y','U','I','O','P','A','S','D','F',
            'G','H','J','K','L','Z','X','C','V','B',
            'N','M'
    };
    public static  String createId(int lang){
        StringBuffer stringBuffer = new StringBuffer(lang);
        Random random = new Random();
        for (int i=0;i<lang;i++){
            stringBuffer.append(chars[(int)(chars.length*random.nextDouble())]);
        }
        String result = stringBuffer.toString();
        stringBuffer.delete(0,lang-1);
        return result;
    }

}
