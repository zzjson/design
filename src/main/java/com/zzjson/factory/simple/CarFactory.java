package com.zzjson.factory.simple;

import com.zzjson.factory.*;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 是由一个工厂对象决定创造出哪一种产品的实例，属于创建型</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月09日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class CarFactory {

    public Car getCar(String name) {
        switch (name) {
            case "宝马":
                return new BMWCar();
            case "奔驰":
                return new BCCar();
            case "吉利":
                return new JLCar();
        }
        return new BMWCar();
    }

}