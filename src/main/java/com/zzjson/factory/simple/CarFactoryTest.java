package com.zzjson.factory.simple;

import com.zzjson.factory.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.factory.simple</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月09日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class CarFactoryTest {
    Logger logger = LoggerFactory.getLogger("dd");


    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("宝马");
        System.out.println(car.getName());
    }

}