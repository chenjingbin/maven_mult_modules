package org.chenjingbin.multdemo.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能描述：实体属性值设置
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/3/5 17:27
 */
public class ReflectionUtils {
    private static Pattern pattern = Pattern.compile("[A-Z]");

    public static void setBeanAttr(Object obj,String attrName,Object attrValue){
        // 将属性名的首字母变为大写，为执行set/get方法做准备
        String methodName = attrName.substring(0, 1).toUpperCase() + attrName.substring(1);
        Method setMethod = null;
        Method getMethod = null;
        try {
            getMethod = obj.getClass().getMethod("get" + methodName);
            setMethod = obj.getClass().getMethod("set" + methodName, getMethod.getReturnType());
            if (setMethod == null) {
                setMethod = obj.getClass().getSuperclass().getMethod("set" + methodName, getMethod.getReturnType());
            }
            if (setMethod != null){
                setMethod.invoke(obj, converseType(attrValue, getMethod.getReturnType()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述：数据类型转换
     * 参数        param 属性字段值   | paramClass 属性字段类型
     */
    public static Object converseType(Object param, Class<?> paramClass) {
        if("java.util.List".equals(paramClass.getName())){
            return Arrays.asList(param);
        }
        //java.util.List  java.util.Set
        // 如果是自定义类型 通过返回值类型 实例化此类 给实例赋值 然后将实例set给引用的对象
        if(!isJavaClass(param.getClass())){
            return param;
        }
        // 基本数据类型
        if (String.class.equals(paramClass)){
            return param.toString();
        }
        if ((Boolean.TYPE.equals(paramClass)) || (Boolean.class.equals(paramClass))) {
            return Boolean.valueOf(param.toString());
        }
        if ((Byte.TYPE.equals(paramClass)) || (Byte.class.equals(paramClass))) {
            return Byte.valueOf(Byte.parseByte(param.toString()));
        }
        if ((Short.TYPE.equals(paramClass)) || (Short.class.equals(paramClass))) {
            return Short.valueOf(param.toString());
        }
        if ((Integer.TYPE.equals(paramClass)) || (Integer.class.equals(paramClass))) {
            return Integer.valueOf(Integer.parseInt(param.toString()));
        }
        if ((Long.TYPE.equals(paramClass)) || (Long.class.equals(paramClass))) {
            return Long.valueOf(Long.parseLong(param.toString()));
        }
        if ((Float.TYPE.equals(paramClass)) || (Float.class.equals(paramClass))) {
            return Float.valueOf(Float.parseFloat(param.toString()));
        }
        if ((Double.TYPE.equals(paramClass)) || (Double.class.equals(paramClass))
                || (Number.class.equals(paramClass))) {
            return Double.valueOf(Double.parseDouble(param.toString()));
        }
        return param;
    }

    public static boolean isJavaClass(Class<?> clz) {
        return clz != null && clz.getClassLoader() == null;
    }

    /**
     * 将下划线和下一个字母转化成大写
     */
    public static String transferLinetoUpperCase(String string){
        String[] list = string.split("_");
        StringBuffer sb = new StringBuffer();
        for(int i =0,len=list.length;i<len;i++){
            if(i>0){
                sb.append(list[i].substring(0, 1).toUpperCase() + list[i].substring(1));
            }else{
                sb.append(list[i]);
            }
        }
        return sb.toString();
    }
    /**
     * 将一个大写字母改变成小写并在之前添加上下划线
     */
    public static String transferUpperCaseToLineAndLowerCase(String param){
        if(param==null ||param.equals("")){
            return "";
        }
        StringBuilder builder=new StringBuilder(param);
        Matcher mc=pattern.matcher(param);
        int i=0;
        while (mc.find()) {
            builder.replace(mc.start()+i, mc.end()+i, "_"+mc.group().toLowerCase());
            i++;
        }
        if('_' == builder.charAt(0)){
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }

    /**
     * 实体转化成map集合
     */
    public static Map<String,Object> describe(Object object){
        Map<String,Object> param = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                param.put(f.getName(),f.get(object));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return param;
    }
}
