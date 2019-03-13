package com.zzjson.singleton.register;

import java.lang.reflect.Constructor;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.singleton.register</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月12日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    EnumSingleton() {

    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Class clazz = EnumSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.newInstance("dd", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}