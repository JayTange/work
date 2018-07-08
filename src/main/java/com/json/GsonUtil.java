package com.json;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

/**
 *
 */
public class GsonUtil {
    private static final Gson gson = new Gson();

    public static String toJsonString(Object object) {

        return object == null ? null : gson.toJson(object);
    }

    /**
     * ��json�ַ���ת�ɶ���
     *
     * @param jstr
     * @param clazz
     * @return
     */
    public static Object jsonToObject(String jstr, Class clazz) {
        Object object = null;

        if (StringUtils.isNotBlank(jstr)) {
            object = gson.fromJson(jstr, clazz);
        }
        return object;
    }
}
