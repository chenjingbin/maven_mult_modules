
package org.chenjingbin.multdemo.utils;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;


/**
 * Map工具类
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    /**
     * 重置Map对象，把为空字符串值的key，设置为null
     *
     * @param entity 集合
     * @return 处理后的Map对象
     */
    public static Map<String, Object> resetMap(Map<String, Object> entity) {
        for (String key : entity.keySet()) {
            if (entity.get(key) == null || entity.get(key).toString().trim().length() <= 0) {
                entity.put(key, null);
            }
        }
        return entity;
    }

    /**
     * 判断一个Map的key对应的Value是否为空
     *
     * @param entity Map对象
     * @param key    验证的Key
     * @return 是否为空{true,false}
     */
    public static boolean isNull(Map<String, Object> entity, String key) {
        boolean flag = false;
        if (entity != null && (!entity.isEmpty())) {
            if (entity.get(key) != null) {
                String result = entity.get(key).toString();
                if (StringUtils.isNotBlank(result))
                    flag = true;
            }
        }
        return flag;
    }

    /**
     * 判断一个Map的keys对应的Value是否为空
     *
     * @param entity Map对象
     * @param keys   (验证的Key列表，以“，”隔开)
     * @return 是否为空{true,false}
     */
    public static boolean isNulls(Map<String, Object> entity, String keys) {
        boolean flag = false;
        String[] list = keys.split(",");
        for (int i = 0; i < list.length; i++) {
            flag = isNull(entity, list[i]);
            if (!flag) {
                break;
            }
        }
        return flag;
    }
}
