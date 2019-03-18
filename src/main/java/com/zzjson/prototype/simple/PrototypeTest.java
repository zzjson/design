package com.zzjson.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.prototype.simple</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月18日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(21);
        concretePrototypeA.setName("zzy0_0");
        List hobbies = new ArrayList<>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(copy);
        System.out.println();
        System.out.println("克隆对象中引用地址的值：" + copy.getHobbies());
        System.out.println("原有对象中引用地址的值:" + concretePrototypeA.getHobbies());
        System.out.println(copy.getHobbies() == concretePrototypeA.getHobbies());
    }
}