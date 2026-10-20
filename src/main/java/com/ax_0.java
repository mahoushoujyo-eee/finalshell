/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from com.ax
 */
public final class ax_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Z(Object object, Object[] objectArray) {
        String string = FV.D();
        Object[] objectArray2 = objectArray;
        if (string == null) {
            if (objectArray2 == null) return 0 != 0;
            objectArray2 = objectArray;
        }
        int n10 = objectArray2.length;
        if (string != null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        Object[] objectArray3 = objectArray;
        int n11 = objectArray3.length;
        int n12 = 0;
        do {
            if (n12 >= n11) return 0 != 0;
            Object object2 = objectArray3[n12];
            if (string != null) continue;
            n10 = ax_0.U(object, object2) ? 1 : 0;
            if (string != null) return n10 != 0;
            if (n10 != 0) {
                return true;
            }
            ++n12;
        } while (string == null);
        return 0 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean U(Object object, Object object2) {
        Object object3;
        String string;
        block5: {
            block6: {
                string = FV.D();
                object3 = object;
                if (string != null) break block5;
                if (object3 != null) break block6;
                object3 = object2;
                if (string != null) break block5;
                if (object3 == null) return true;
            }
            object3 = object;
        }
        if (string == null) {
            if (object3 == null) return false;
            object3 = object2;
        }
        if (string == null) {
            if (object3 == null) return false;
            object3 = object;
        }
        boolean bl = object3.equals(object2);
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    public static boolean f(String string, List list) {
        boolean bl;
        block3: {
            Iterator iterator = list.iterator();
            String string2 = FV.D();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        String string3 = (String)iterator.next();
                        bl = string.contains(string3);
                        if (string2 != null) break block3;
                        if (string2 != null) break block4;
                        if (!bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (string2 == null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

