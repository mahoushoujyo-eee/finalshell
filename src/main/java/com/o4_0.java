/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.FV;
import com.io_1;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/*
 * Renamed from com.o4
 */
public final class o4_0 {
    private static final Map C = new WeakHashMap();

    public static Shape k(Component component, String string, E e2, Object[] objectArray) {
        io_1 io_12;
        block7: {
            io_1 io_13;
            block8: {
                Object object;
                HashMap<String, io_1> hashMap;
                String string2;
                block5: {
                    block6: {
                        string2 = o4_0.z(objectArray);
                        hashMap = (HashMap<String, io_1>)C.get(component);
                        String string3 = FV.D();
                        HashMap<String, io_1> hashMap2 = hashMap;
                        if (string3 == null) {
                            if (hashMap2 == null) {
                                Shape shape = (Shape)e2.J();
                                hashMap = new HashMap<String, io_1>(1);
                                hashMap.put(string, new io_1(string2, shape));
                                C.put(component, hashMap);
                                return shape;
                            }
                            hashMap2 = hashMap.get(string);
                        }
                        io_13 = (io_1)((Object)hashMap2);
                        object = io_13;
                        if (string3 != null) break block5;
                        if (object == null) break block6;
                        io_12 = io_13;
                        if (string3 != null) break block7;
                        if (io_1.l(io_12).equals(string2)) break block8;
                    }
                    object = e2.J();
                }
                Shape shape = (Shape)object;
                hashMap.put(string, new io_1(string2, shape));
                return shape;
            }
            io_12 = io_13;
        }
        return io_1.N(io_12);
    }

    private static String z(Object[] objectArray) {
        StringBuilder stringBuilder;
        block3: {
            StringBuilder stringBuilder2 = new StringBuilder();
            Object[] objectArray2 = objectArray;
            int n10 = objectArray2.length;
            String string = FV.D();
            for (int i2 = 0; i2 < n10; ++i2) {
                Object object = objectArray2[i2];
                stringBuilder = stringBuilder2;
                if (string == null) {
                    if (string != null) continue;
                    if (stringBuilder.length() > 0) {
                        stringBuilder2.append(";");
                    }
                    stringBuilder2.append(o4_0.D(object));
                    if (string == null) continue;
                }
                break block3;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    private static String D(Object object) {
        Object object2;
        block8: {
            boolean bl;
            block7: {
                String string = FV.D();
                bl = object instanceof Insets;
                if (string == null) {
                    if (bl) {
                        Insets insets = (Insets)object;
                        return insets.top + "," + insets.left + "," + insets.bottom + "," + insets.right;
                    }
                    bl = object instanceof Rectangle;
                }
                if (string != null) break block7;
                if (bl) {
                    Rectangle rectangle = (Rectangle)object;
                    return rectangle.x + "," + rectangle.y + "," + rectangle.width + "," + rectangle.height;
                }
                object2 = object;
                if (string != null) break block8;
                bl = object2 instanceof Point;
            }
            if (bl) {
                Point point = (Point)object;
                return point.x + "," + point.y;
            }
            object2 = object;
        }
        return object2.toString();
    }
}

