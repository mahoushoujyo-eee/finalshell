/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.lang.reflect.Method;
import java.util.Comparator;

/*
 * Renamed from com.Ki
 */
public class ki_0
implements Comparator {
    public int b(Method method, Method method2) {
        int n10;
        block10: {
            int n11;
            block9: {
                int n12 = method.getName().compareTo(method2.getName());
                n10 = ph_0.u();
                n11 = n12;
                if (n10 != 0) break block9;
                if (n11 == 0) break block10;
                n11 = n12;
            }
            return n11;
        }
        Class<?> clazz = method.getReturnType();
        Class<?> clazz2 = method2.getReturnType();
        int n12 = clazz.equals(clazz2);
        if (n10 == 0) {
            if (n12 != 0) {
                return 0;
            }
            n12 = clazz.isAssignableFrom(clazz2);
        }
        if (n10 == 0) {
            if (n12 != 0) {
                return -1;
            }
            n12 = clazz2.isAssignableFrom(clazz) ? 1 : 0;
        }
        if (n10 == 0) {
            if (n12 != 0) {
                return 1;
            }
            n12 = 0;
        }
        return n12;
    }

    public int compare(Object object, Object object2) {
        return this.b((Method)object, (Method)object2);
    }
}

