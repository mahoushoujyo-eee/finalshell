/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.T.a;
import org.l.E;
import org.l.d_0;
import org.l.e_0;
import org.l.o_0;

public final class F {
    private static boolean g;

    private F() {
    }

    public static Iterable v(Object[] objectArray, Class clazz) {
        return F.L(Arrays.asList(objectArray), clazz);
    }

    public static Iterable L(Iterable iterable, Class clazz) {
        return new e_0(iterable, clazz);
    }

    public static Iterator P(Iterator iterator, Class clazz) {
        Iterator iterator2 = F.e(iterator, new d_0(clazz));
        return iterator2;
    }

    public static Iterable t(Object[] objectArray, a a10) {
        return F.W(Arrays.asList(objectArray), a10);
    }

    public static Iterable W(Iterable iterable, a a10) {
        return new o_0(iterable, a10);
    }

    public static Iterator e(Iterator iterator, a a10) {
        return new E(iterator, a10);
    }

    public static Object[] A(Iterable iterable, Class clazz) {
        return F.p(iterable.iterator(), clazz);
    }

    public static Object[] p(Iterator iterator, Class clazz) {
        Object object;
        ArrayList arrayList;
        block2: {
            arrayList = new ArrayList();
            boolean bl = F.G();
            while (iterator.hasNext()) {
                object = arrayList;
                if (!bl) {
                    object.add(iterator.next());
                    if (!bl) continue;
                }
                break block2;
            }
            object = Array.newInstance(clazz, arrayList.size());
        }
        Object[] objectArray = (Object[])object;
        return arrayList.toArray(objectArray);
    }

    public static void u(boolean bl) {
        g = bl;
    }

    public static boolean G() {
        return g;
    }

    public static boolean s() {
        boolean bl = F.G();
        return !bl;
    }

    static {
        if (F.G()) {
            F.u(true);
        }
    }
}

