/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c8_0;
import java.io.File;

/*
 * Renamed from com.lV
 */
public class lv_1
implements c8_0 {
    private static int[] Y;

    public String z(File file) {
        return file.getName();
    }

    @Override
    public String C(Object object) {
        return this.z((File)object);
    }

    public static void Z(int[] nArray) {
        Y = nArray;
    }

    public static int[] Z() {
        return Y;
    }

    static {
        if (lv_1.Z() == null) {
            lv_1.Z(new int[2]);
        }
    }
}

