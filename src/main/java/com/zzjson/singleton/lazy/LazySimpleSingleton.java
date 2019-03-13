package com.zzjson.singleton.lazy;

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
public class LazySimpleSingleton {
    private static volatile LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance() {
        //加上空判断保证初只会初始化一次
        if (lazySimpleSingleton == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazySimpleSingleton != null) {
                    lazySimpleSingleton = new LazySimpleSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}