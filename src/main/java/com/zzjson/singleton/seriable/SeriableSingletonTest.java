package com.zzjson.singleton.seriable;

import java.io.*;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 shuncom team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.singleton.seriable</li>
 * <li>Version     : 1.0.0</li>
 * <li>Creation    : 2019年03月12日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton seriableSingleton = SeriableSingleton.getInstance();
        SeriableSingleton s2;
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fos = new FileOutputStream("d.o");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriableSingleton);
            oos.flush();
            oos.close();
            fis = new FileInputStream("d.o");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SeriableSingleton) ois.readObject();
            ois.close();
            System.out.println(seriableSingleton);
            System.out.println(s2);
            System.out.println(s2 == seriableSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}