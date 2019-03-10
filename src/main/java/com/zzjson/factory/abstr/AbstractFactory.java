package com.zzjson.factory.abstr;

import com.zzjson.factory.BCCar;
import com.zzjson.factory.BMWCar;
import com.zzjson.factory.Car;
import com.zzjson.factory.JLCar;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.factory.abstr</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月10日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public abstract class AbstractFactory {

    protected abstract Car getCar();

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