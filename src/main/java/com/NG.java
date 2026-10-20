/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I3;
import com.XW;
import com.dr_1;
import com.du_0;
import com.eg_2;
import com.gw_0;
import com.o6_0;
import com.ov_1;

public final class NG {
    public static dr_1 q(dr_1 dr_12) {
        dr_1 dr_13;
        block8: {
            boolean bl;
            block7: {
                String[] stringArray = XW.w();
                bl = dr_12.equals((Object)dr_1.random);
                if (stringArray == null) {
                    if (bl) {
                        dr_1[] dr_1Array = dr_1.values();
                        return dr_1Array[gw_0.K(dr_1Array.length - 3) + 3];
                    }
                    bl = dr_12.equals((Object)dr_1.horizontal);
                }
                if (stringArray != null) break block7;
                if (bl) {
                    return (new dr_1[]{dr_1.left, dr_1.right})[gw_0.K(2)];
                }
                dr_13 = dr_12;
                if (stringArray != null) break block8;
                bl = dr_13.equals((Object)dr_1.vertical);
            }
            if (bl) {
                return (new dr_1[]{dr_1.up, dr_1.down})[gw_0.K(2)];
            }
            dr_13 = dr_12;
        }
        return dr_13;
    }

    public static I3 R(I3 i3) {
        String[] stringArray = XW.w();
        I3 i32 = i3;
        if (stringArray == null) {
            if (i32.equals((Object)I3.random)) {
                I3[] i3Array = I3.values();
                return i3Array[gw_0.K(i3Array.length - 1) + 1];
            }
            i32 = i3;
        }
        return i32;
    }

    public static du_0 R(du_0 du_02) {
        String[] stringArray = XW.w();
        du_0 du_03 = du_02;
        if (stringArray == null) {
            if (du_03.equals((Object)du_0.random)) {
                du_0[] du_0Array = du_0.values();
                return du_0Array[gw_0.K(du_0Array.length - 1) + 1];
            }
            du_03 = du_02;
        }
        return du_03;
    }

    public static o6_0 F(o6_0 o6_02) {
        String[] stringArray = XW.w();
        o6_0 o6_03 = o6_02;
        if (stringArray == null) {
            if (o6_03.equals((Object)o6_0.random)) {
                o6_0[] o6_0Array = o6_0.values();
                return o6_0Array[gw_0.K(o6_0Array.length - 1) + 1];
            }
            o6_03 = o6_02;
        }
        return o6_03;
    }

    public static eg_2 y(eg_2 eg_22) {
        String[] stringArray = XW.w();
        eg_2 eg_23 = eg_22;
        if (stringArray == null) {
            if (eg_23.equals((Object)eg_2.random)) {
                eg_2[] eg_2Array = eg_2.values();
                return eg_2Array[gw_0.K(eg_2Array.length - 1) + 1];
            }
            eg_23 = eg_22;
        }
        return eg_23;
    }

    public static ov_1 P(ov_1 ov_12) {
        String[] stringArray = XW.w();
        ov_1 ov_13 = ov_12;
        if (stringArray == null) {
            if (ov_13.equals((Object)ov_1.random)) {
                ov_1[] ov_1Array = ov_1.values();
                return ov_1Array[gw_0.K(ov_1Array.length - 1) + 1];
            }
            ov_13 = ov_12;
        }
        return ov_13;
    }
}

