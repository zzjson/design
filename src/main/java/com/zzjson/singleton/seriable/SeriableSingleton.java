package com.zzjson.singleton.seriable;

import java.io.Serializable;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.singleton.lazy</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月12日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class SeriableSingleton implements Serializable {
    private SeriableSingleton() {
        //throw new RuntimeException("不允许构建多个实例");
    }

    public static final SeriableSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final SeriableSingleton LAZY = new SeriableSingleton();
    }

    private Object readResolve() {
        return getInstance();
    }
}