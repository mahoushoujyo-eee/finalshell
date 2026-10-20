/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.l0_0;
import java.awt.Color;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;

/*
 * Renamed from com.lR
 */
public class lr_1
implements UIDefaults.LazyValue {
    private final String S;
    private final String u;
    private Object[] F;

    public lr_1(String string) {
        this(string, (String)null);
    }

    public lr_1(String string, String string2) {
        this(string, string2, null);
    }

    public lr_1(String string, Object[] objectArray) {
        this(string, null, objectArray);
    }

    public lr_1(String string, String string2, Object[] objectArray) {
        block3: {
            Object object;
            block2: {
                int[] nArray = WC.V();
                this.S = string;
                int[] nArray2 = nArray;
                lr_1 lr_12 = this;
                object = string2;
                if (nArray2 != null) break block2;
                lr_12.u = object;
                if (objectArray == null) break block3;
                lr_12 = this;
                object = objectArray.clone();
            }
            lr_12.F = (Object[])object;
        }
    }

    @Override
    public Object createValue(UIDefaults uIDefaults) {
        int[] nArray = WC.V();
        try {
            lr_1 lr_12;
            Class<?> clazz;
            block4: {
                block5: {
                    clazz = Class.forName(this.S, true, null);
                    try {
                        lr_12 = this;
                        if (nArray != null) break block4;
                        if (lr_12.u == null) break block5;
                    }
                    catch (Exception exception) {
                        throw lr_1.a(exception);
                    }
                    Class[] classArray = this.e(this.F);
                    Method method = clazz.getMethod(this.u, classArray);
                    this.w(method);
                    return method.invoke(clazz, this.F);
                }
                lr_12 = this;
            }
            Class[] classArray = lr_12.e(this.F);
            Constructor<?> constructor = clazz.getConstructor(classArray);
            this.w(constructor);
            return constructor.newInstance(this.F);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void w(AccessibleObject accessibleObject) {
        AccessController.doPrivileged(new l0_0(this, accessibleObject));
    }

    private Class[] e(Object[] objectArray) {
        Class[] classArray;
        block10: {
            Object[] objectArray2;
            int[] nArray;
            block9: {
                classArray = null;
                nArray = WC.V();
                objectArray2 = objectArray;
                if (nArray != null) break block9;
                if (objectArray2 == null) break block10;
                objectArray2 = objectArray;
            }
            classArray = new Class[objectArray2.length];
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                boolean bl = objectArray[i2] instanceof Integer;
                if (nArray == null) {
                    if (bl) {
                        classArray[i2] = Integer.TYPE;
                        if (nArray == null) continue;
                    }
                    bl = objectArray[i2] instanceof Boolean;
                }
                if (nArray == null) {
                    if (bl) {
                        classArray[i2] = Boolean.TYPE;
                        if (nArray == null) continue;
                    }
                    bl = objectArray[i2] instanceof ColorUIResource;
                }
                if (bl) {
                    classArray[i2] = Color.class;
                    if (nArray == null) continue;
                }
                classArray[i2] = objectArray[i2].getClass();
                if (nArray == null) continue;
            }
        }
        return classArray;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

