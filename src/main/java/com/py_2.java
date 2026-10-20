/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cz_0;
import com.ky_2;
import com.yt_0;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/*
 * Renamed from com.py
 */
public class py_2
implements Comparator,
Serializable {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int I(File var1_1, File var2_2) {
        var3_3 = yt_0.C();
        v0 = cz_0.z(var1_1);
        if (var3_3 != 0) {
            if (v0 != 0) {
                v0 = cz_0.z(var2_2);
                if (var3_3 != 0) {
                    if (v0 == 0) {
                        return -1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = cz_0.z(var1_1);
            }
        }
        if (var3_3 != 0) {
            if (v0 == 0) {
                v0 = cz_0.z(var2_2);
                if (var3_3 != 0) {
                    if (v0 != 0) {
                        return 1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = cz_0.v(var1_1);
            }
        }
        if (var3_3 != 0) {
            if (v0 != 0) {
                v0 = cz_0.v(var2_2);
                if (var3_3 != 0) {
                    if (v0 == 0) {
                        return -1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = cz_0.v(var1_1);
            }
        }
        if (var3_3 != 0) {
            if (v0 == 0) {
                v0 = cz_0.v(var2_2);
                if (var3_3 != 0) {
                    if (v0 != 0) {
                        return 1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1.getName().compareToIgnoreCase(var2_2.getName());
            }
        }
        if (ky_2.F() != null) {
            yt_0.A(++var3_3);
        }
        return v0;
    }

    public int compare(Object object, Object object2) {
        return this.I((File)object, (File)object2);
    }
}

