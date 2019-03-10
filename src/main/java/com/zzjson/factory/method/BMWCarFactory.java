package com.zzjson.factory.method;

import com.zzjson.factory.BMWCar;
import com.zzjson.factory.Car;
import com.zzjson.factory.ICarFactory;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.factory.method</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月10日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class BMWCarFactory implements ICarFactory {

    @Override
    public Car getCar() {
        return new BMWCar();
    }
}