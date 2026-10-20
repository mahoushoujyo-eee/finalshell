/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class TA
extends T4
implements SwingConstants {
    protected Map L = new HashMap();
    protected int T = GO.FJ;
    protected int i = GO.F_;
    protected int R = 0;
    protected Insets I = null;
    private static final String[] a;
    private static final String[] b;

    public TA() {
    }

    public TA(int n10) {
        this.T = n10;
    }

    public TA(int n10, int n11) {
        this.T = n10;
        this.R = n11;
    }

    public TA(int n10, int n11, int n12) {
        this.T = n10;
        this.i = n11;
        this.R = n12;
    }

    public Map C() {
        return this.L;
    }

    public void w(Map map) {
        this.L = map;
    }

    public int Q() {
        return this.T;
    }

    public void H(int n10) {
        this.T = n10;
    }

    public int h() {
        return this.i;
    }

    public void f(int n10) {
        this.i = n10;
    }

    public int N() {
        return this.R;
    }

    public void c(int n10) {
        this.R = n10;
    }

    public Insets x() {
        return this.I;
    }

    public void M(Insets insets) {
        this.I = insets;
    }

    @Override
    public void A(Component component, Object object) {
        String string;
        Component component2;
        Map map;
        block37: {
            String string2;
            block39: {
                int n10;
                block32: {
                    boolean bl;
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    String string3;
                                    block31: {
                                        string2 = (String)object;
                                        n10 = T4.b();
                                        try {
                                            try {
                                                string3 = string2;
                                                if (n10 == 0) break block31;
                                                if (string3 == null) break block32;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw TA.a(illegalArgumentException);
                                            }
                                            string3 = string2.trim();
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw TA.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        try {
                                            bl = string3.equals("");
                                            if (n10 == 0) break block33;
                                            if (bl) break block32;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw TA.a(illegalArgumentException);
                                        }
                                        bl = string2.equals(TA.a(18976, -32644));
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw TA.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n10 == 0) break block34;
                                        if (bl) break block32;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw TA.a(illegalArgumentException);
                                    }
                                    bl = string2.equals(TA.a(18990, -9011));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw TA.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (n10 == 0) break block35;
                                    if (bl) break block32;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw TA.a(illegalArgumentException);
                                }
                                bl = string2.equals(TA.a(18984, 3581));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw TA.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (n10 == 0) break block36;
                                if (bl) break block32;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw TA.a(illegalArgumentException);
                            }
                            bl = string2.equals(TA.a(18989, 26262));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw TA.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (!bl) {
                            throw new IllegalArgumentException(TA.a(18988, -30915));
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw TA.a(illegalArgumentException);
                    }
                }
                try {
                    block38: {
                        try {
                            try {
                                try {
                                    map = this.L;
                                    component2 = component;
                                    string = string2;
                                    if (n10 == 0) break block37;
                                    if (string == null) break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw TA.a(illegalArgumentException);
                                }
                                string = string2.trim();
                                if (n10 == 0) break block37;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw TA.a(illegalArgumentException);
                            }
                            if (!string.equals("")) break block39;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw TA.a(illegalArgumentException);
                        }
                    }
                    string = TA.a(18976, -32644);
                    break block37;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw TA.a(illegalArgumentException);
                }
            }
            string = string2;
        }
        map.put(component2, string);
    }

    @Override
    public void F(Component component) {
        this.L.remove(component);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Dimension preferredLayoutSize(Container var1_1) {
        block56: {
            block54: {
                block53: {
                    block50: {
                        block52: {
                            block51: {
                                block49: {
                                    block44: {
                                        var3_2 = this.Y(var1_1);
                                        var4_3 = new Dimension(var3_2.left + var3_2.right, var3_2.top + var3_2.bottom);
                                        var2_4 = T4.O();
                                        var5_5 = var1_1.getComponentCount();
                                        for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                                            block47: {
                                                block48: {
                                                    block43: {
                                                        block45: {
                                                            block46: {
                                                                var7_7 = var1_1.getComponent(var6_6);
                                                                var8_8 = var7_7.getPreferredSize();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var2_4 != 0) break block43;
                                                                                    v0 = this.R;
                                                                                    if (var2_4 != 0) break block44;
                                                                                }
                                                                                catch (IllegalArgumentException v1) {
                                                                                    throw TA.a(v1);
                                                                                }
                                                                                if (v0 == 0) {
                                                                                }
                                                                                ** GOTO lbl48
                                                                            }
                                                                            catch (IllegalArgumentException v2) {
                                                                                throw TA.a(v2);
                                                                            }
                                                                            v3 = var4_3;
                                                                            v4 = v3;
                                                                            v5 = v3.width;
                                                                            v6 = var8_8.width;
                                                                            v7 = var6_6;
                                                                            if (var2_4 != 0) break block45;
                                                                        }
                                                                        catch (IllegalArgumentException v8) {
                                                                            throw TA.a(v8);
                                                                        }
                                                                        if (v7 >= var5_5 - 1) break block46;
                                                                    }
                                                                    catch (IllegalArgumentException v9) {
                                                                        throw TA.a(v9);
                                                                    }
                                                                    v7 = this.T;
                                                                    break block45;
                                                                }
                                                                catch (IllegalArgumentException v10) {
                                                                    throw TA.a(v10);
                                                                }
                                                            }
                                                            v7 = 0;
                                                        }
                                                        try {
                                                            v4.width = v5 + (v6 + v7);
                                                            var4_3.height = Math.max(var4_3.height, var8_8.height + var3_2.top + var3_2.bottom);
                                                            if (var2_4 == 0) continue;
lbl48:
                                                            // 2 sources

                                                            var4_3.width = Math.max(var4_3.width, var8_8.width + var3_2.left + var3_2.right);
                                                        }
                                                        catch (IllegalArgumentException v11) {
                                                            throw TA.a(v11);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v12 = var4_3;
                                                            v13 = v12;
                                                            v14 = v12.height;
                                                            v15 = var8_8.height;
                                                            v16 = var6_6;
                                                            if (var2_4 != 0) break block47;
                                                            if (v16 >= var5_5 - 1) break block48;
                                                        }
                                                        catch (IllegalArgumentException v17) {
                                                            throw TA.a(v17);
                                                        }
                                                        v16 = this.T;
                                                        break block47;
                                                    }
                                                    catch (IllegalArgumentException v18) {
                                                        throw TA.a(v18);
                                                    }
                                                }
                                                v16 = 0;
                                            }
                                            v13.height = v14 + (v15 + v16);
                                            if (var2_4 == 0) continue;
                                        }
                                        v0 = this.A(TA.a(18976, -32644));
                                    }
                                    try {
                                        try {
                                            if (var2_4 != 0) break block49;
                                            if (v0 == 0) break block50;
                                        }
                                        catch (IllegalArgumentException v19) {
                                            throw TA.a(v19);
                                        }
                                        v0 = (int)this.A(TA.a(18989, 26262));
                                    }
                                    catch (IllegalArgumentException v20) {
                                        throw TA.a(v20);
                                    }
                                }
                                try {
                                    try {
                                        if (var2_4 != 0) break block51;
                                        if (v0 == 0) break block50;
                                    }
                                    catch (IllegalArgumentException v21) {
                                        throw TA.a(v21);
                                    }
                                    v0 = (int)this.A(TA.a(18990, -9011));
                                }
                                catch (IllegalArgumentException v22) {
                                    throw TA.a(v22);
                                }
                            }
                            try {
                                try {
                                    if (var2_4 != 0) break block52;
                                    if (v0 != 0) break block50;
                                }
                                catch (IllegalArgumentException v23) {
                                    throw TA.a(v23);
                                }
                                v0 = (int)this.A(TA.a(18984, 3581));
                            }
                            catch (IllegalArgumentException v24) {
                                throw TA.a(v24);
                            }
                        }
                        try {
                            if (var2_4 != 0) break block53;
                            if (v0 != 0) break block50;
                        }
                        catch (IllegalArgumentException v25) {
                            throw TA.a(v25);
                        }
                        v0 = 1;
                        break block53;
                    }
                    v0 = 0;
                }
                var6_6 = v0;
                try {
                    block55: {
                        try {
                            try {
                                try {
                                    v26 = this.R;
                                    if (var2_4 != 0) break block54;
                                    if (v26 != 0) break block55;
                                }
                                catch (IllegalArgumentException v27) {
                                    throw TA.a(v27);
                                }
                                if (var6_6 == 0) break block56;
                            }
                            catch (IllegalArgumentException v28) {
                                throw TA.a(v28);
                            }
                            var4_3.width += this.i;
                            if (var2_4 == 0) break block56;
                        }
                        catch (IllegalArgumentException v29) {
                            throw TA.a(v29);
                        }
                    }
                    v26 = var6_6;
                }
                catch (IllegalArgumentException v30) {
                    throw TA.a(v30);
                }
            }
            try {
                if (v26 != 0) {
                    var4_3.height += this.i;
                }
            }
            catch (IllegalArgumentException v31) {
                throw TA.a(v31);
            }
        }
        return var4_3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block150: {
            block180: {
                block179: {
                    block178: {
                        block176: {
                            block173: {
                                block174: {
                                    block170: {
                                        block135: {
                                            block164: {
                                                block166: {
                                                    block165: {
                                                        block163: {
                                                            block159: {
                                                                block156: {
                                                                    block154: {
                                                                        block155: {
                                                                            block136: {
                                                                                block147: {
                                                                                    block149: {
                                                                                        block148: {
                                                                                            block146: {
                                                                                                block144: {
                                                                                                    block141: {
                                                                                                        block142: {
                                                                                                            block137: {
                                                                                                                var3_2 = this.Y(var1_1);
                                                                                                                var2_3 = T4.b();
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v0 = this.R;
                                                                                                                            if (var2_3 == 0) break block135;
                                                                                                                            if (v0 == 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl345
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v1) {
                                                                                                                            throw TA.a(v1);
                                                                                                                        }
                                                                                                                        v2 = var1_1.getComponentOrientation().isLeftToRight();
                                                                                                                        if (var2_3 == 0) break block136;
                                                                                                                    }
                                                                                                                    catch (IllegalArgumentException v3) {
                                                                                                                        throw TA.a(v3);
                                                                                                                    }
                                                                                                                    if (v2 != 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl182
                                                                                                                }
                                                                                                                catch (IllegalArgumentException v4) {
                                                                                                                    throw TA.a(v4);
                                                                                                                }
                                                                                                                var4_4 = var3_2.left;
                                                                                                                for (var5_5 = 0; var5_5 < var1_1.getComponentCount(); ++var5_5) {
                                                                                                                    block139: {
                                                                                                                        block140: {
                                                                                                                            block138: {
                                                                                                                                var6_6 = var1_1.getComponent(var5_5);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v5 = this;
                                                                                                                                            if (var2_3 == 0) break block137;
                                                                                                                                            v6 = v5.L.get(var6_6);
                                                                                                                                            if (var2_3 == 0) break block138;
                                                                                                                                        }
                                                                                                                                        catch (IllegalArgumentException v7) {
                                                                                                                                            throw TA.a(v7);
                                                                                                                                        }
                                                                                                                                        if (v6 == null) break block139;
                                                                                                                                    }
                                                                                                                                    catch (IllegalArgumentException v8) {
                                                                                                                                        throw TA.a(v8);
                                                                                                                                    }
                                                                                                                                    v6 = this.L.get(var6_6);
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException v9) {
                                                                                                                                    throw TA.a(v9);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v10 = ((String)v6).trim().equals("");
                                                                                                                                    if (var2_3 == 0) break block140;
                                                                                                                                    if (v10) break block139;
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException v11) {
                                                                                                                                    throw TA.a(v11);
                                                                                                                                }
                                                                                                                                v10 = ((String)this.L.get(var6_6)).equals(TA.a(18985, 26538));
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException v12) {
                                                                                                                                throw TA.a(v12);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!v10) continue;
                                                                                                                    }
                                                                                                                    var7_15 = var6_6.getPreferredSize();
                                                                                                                    var6_6.setBounds(var4_4, var3_2.top, var7_15.width, var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                                                                    var4_4 += var7_15.width + this.T;
                                                                                                                    if (var2_3 != 0) continue;
                                                                                                                }
                                                                                                                var5_5 = var1_1.getWidth() - var3_2.right;
                                                                                                                v5 = this;
                                                                                                            }
                                                                                                            try {
                                                                                                                v13 = v5.A(TA.a(18987, 7225));
                                                                                                                if (var2_3 == 0) break block141;
                                                                                                                if (v13 == 0) break block142;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v14) {
                                                                                                                throw TA.a(v14);
                                                                                                            }
                                                                                                            var6_7 = var1_1.getComponentCount() - 1;
                                                                                                            while (var6_7 >= 0) {
                                                                                                                block143: {
                                                                                                                    block145: {
                                                                                                                        var7_15 = var1_1.getComponent(var6_7);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var2_3 == 0) break block143;
                                                                                                                                    v15 = this;
                                                                                                                                    if (var2_3 == 0) break block144;
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException v16) {
                                                                                                                                    throw TA.a(v16);
                                                                                                                                }
                                                                                                                                if (v15.L.get(var7_15) == null) break block145;
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException v17) {
                                                                                                                                throw TA.a(v17);
                                                                                                                            }
                                                                                                                            if (!((String)this.L.get(var7_15)).equals(TA.a(18989, 26262))) break block145;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v18) {
                                                                                                                            throw TA.a(v18);
                                                                                                                        }
                                                                                                                        var8_23 = var7_15.getPreferredSize();
                                                                                                                        var7_15.setBounds(var5_5 -= var8_23.width, var3_2.top, var8_23.width, var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                                                                        var5_5 -= this.T;
                                                                                                                    }
                                                                                                                    --var6_7;
                                                                                                                }
                                                                                                                if (var2_3 != 0) continue;
                                                                                                            }
                                                                                                        }
                                                                                                        v13 = var5_5;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var2_3 == 0) break block146;
                                                                                                            if (v13 <= var4_4) break block147;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v19) {
                                                                                                            throw TA.a(v19);
                                                                                                        }
                                                                                                        v15 = this;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v20) {
                                                                                                        throw TA.a(v20);
                                                                                                    }
                                                                                                }
                                                                                                v13 = (int)v15.A(TA.a(18991, 11984));
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (var2_3 == 0) break block148;
                                                                                                    if (v13 != 0) break block149;
                                                                                                }
                                                                                                catch (IllegalArgumentException v21) {
                                                                                                    throw TA.a(v21);
                                                                                                }
                                                                                                v13 = (int)this.A(TA.a(18986, 11805));
                                                                                            }
                                                                                            catch (IllegalArgumentException v22) {
                                                                                                throw TA.a(v22);
                                                                                            }
                                                                                        }
                                                                                        if (v13 == 0) break block147;
                                                                                    }
                                                                                    var6_8 = var1_1.getComponents();
                                                                                    var7_16 = var6_8.length;
                                                                                    var8_24 = 0;
                                                                                    while (var8_24 < var7_16) {
                                                                                        block151: {
                                                                                            block152: {
                                                                                                block153: {
                                                                                                    var9_29 = var6_8[var8_24];
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var2_3 == 0) break block150;
                                                                                                                    if (var2_3 == 0) break block151;
                                                                                                                }
                                                                                                                catch (IllegalArgumentException v23) {
                                                                                                                    throw TA.a(v23);
                                                                                                                }
                                                                                                                if (this.L.get(var9_29) == null) break block152;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v24) {
                                                                                                                throw TA.a(v24);
                                                                                                            }
                                                                                                            v25 = ((String)this.L.get(var9_29)).equals(TA.a(18990, -9011));
                                                                                                            if (var2_3 == 0) break block153;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v26) {
                                                                                                            throw TA.a(v26);
                                                                                                        }
                                                                                                        if (v25) {
                                                                                                        }
                                                                                                        ** GOTO lbl164
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v27) {
                                                                                                        throw TA.a(v27);
                                                                                                    }
                                                                                                    var10_30 = var9_29.getPreferredSize();
                                                                                                    try {
                                                                                                        var9_29.setBounds(Math.max(var4_4, (var4_4 + var5_5) / 2 - var10_30.width / 2), var3_2.top, Math.min(var10_30.width, var5_5 - var4_4), var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                                                        if (var2_3 != 0) break block152;
lbl164:
                                                                                                        // 2 sources

                                                                                                        v25 = ((String)this.L.get(var9_29)).equals(TA.a(18984, 3581));
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v28) {
                                                                                                        throw TA.a(v28);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (v25) {
                                                                                                        var9_29.setBounds(var4_4, var3_2.top, Math.max(0, var5_5 - var4_4), var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                                                    }
                                                                                                }
                                                                                                catch (IllegalArgumentException v29) {
                                                                                                    throw TA.a(v29);
                                                                                                }
                                                                                            }
                                                                                            ++var8_24;
                                                                                        }
                                                                                        if (var2_3 != 0) continue;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var2_3 != 0) break block150;
lbl182:
                                                                                    // 2 sources

                                                                                    v2 = var3_2.left;
                                                                                }
                                                                                catch (IllegalArgumentException v30) {
                                                                                    throw TA.a(v30);
                                                                                }
                                                                            }
                                                                            var4_4 = v2;
                                                                            try {
                                                                                v31 = this.A(TA.a(18989, 26262));
                                                                                if (var2_3 == 0) break block154;
                                                                                if (v31 == 0) break block155;
                                                                            }
                                                                            catch (IllegalArgumentException v32) {
                                                                                throw TA.a(v32);
                                                                            }
                                                                            var5_5 = var1_1.getComponentCount() - 1;
                                                                            while (var5_5 >= 0) {
                                                                                block157: {
                                                                                    block158: {
                                                                                        var6_9 = var1_1.getComponent(var5_5);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var2_3 == 0) break block156;
                                                                                                    if (var2_3 == 0) break block157;
                                                                                                }
                                                                                                catch (IllegalArgumentException v33) {
                                                                                                    throw TA.a(v33);
                                                                                                }
                                                                                                if (this.L.get(var6_9) == null) break block158;
                                                                                            }
                                                                                            catch (IllegalArgumentException v34) {
                                                                                                throw TA.a(v34);
                                                                                            }
                                                                                            if (!((String)this.L.get(var6_9)).equals(TA.a(18989, 26262))) break block158;
                                                                                        }
                                                                                        catch (IllegalArgumentException v35) {
                                                                                            throw TA.a(v35);
                                                                                        }
                                                                                        var7_17 = var6_9.getPreferredSize();
                                                                                        var6_9.setBounds(var4_4, var3_2.top, var7_17.width, var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                                        var4_4 += var7_17.width + this.T;
                                                                                    }
                                                                                    --var5_5;
                                                                                }
                                                                                if (var2_3 != 0) continue;
                                                                            }
                                                                        }
                                                                        v31 = var1_1.getWidth() - var3_2.right;
                                                                    }
                                                                    var5_5 = v31;
                                                                }
                                                                for (var6_10 = 0; var6_10 < var1_1.getComponentCount(); ++var6_10) {
                                                                    block161: {
                                                                        block162: {
                                                                            block160: {
                                                                                var7_18 = var1_1.getComponent(var6_10);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v36 = this;
                                                                                            if (var2_3 == 0) break block159;
                                                                                            v37 = v36.L.get(var7_18);
                                                                                            if (var2_3 == 0) break block160;
                                                                                        }
                                                                                        catch (IllegalArgumentException v38) {
                                                                                            throw TA.a(v38);
                                                                                        }
                                                                                        if (v37 == null) break block161;
                                                                                    }
                                                                                    catch (IllegalArgumentException v39) {
                                                                                        throw TA.a(v39);
                                                                                    }
                                                                                    v37 = this.L.get(var7_18);
                                                                                }
                                                                                catch (IllegalArgumentException v40) {
                                                                                    throw TA.a(v40);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    v41 = ((String)v37).trim().equals("");
                                                                                    if (var2_3 == 0) break block162;
                                                                                    if (v41) break block161;
                                                                                }
                                                                                catch (IllegalArgumentException v42) {
                                                                                    throw TA.a(v42);
                                                                                }
                                                                                v41 = ((String)this.L.get(var7_18)).equals(TA.a(18976, -32644));
                                                                            }
                                                                            catch (IllegalArgumentException v43) {
                                                                                throw TA.a(v43);
                                                                            }
                                                                        }
                                                                        if (!v41) continue;
                                                                    }
                                                                    var8_25 = var7_18.getPreferredSize();
                                                                    var7_18.setBounds(var5_5 -= var8_25.width, var3_2.top, var8_25.width, var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                    var5_5 -= this.T;
                                                                    if (var2_3 != 0) continue;
                                                                }
                                                                try {
                                                                    try {
                                                                        v44 = var5_5;
                                                                        if (var2_3 == 0) break block163;
                                                                        if (v44 <= var4_4) break block164;
                                                                    }
                                                                    catch (IllegalArgumentException v45) {
                                                                        throw TA.a(v45);
                                                                    }
                                                                    v36 = this;
                                                                }
                                                                catch (IllegalArgumentException v46) {
                                                                    throw TA.a(v46);
                                                                }
                                                            }
                                                            v44 = (int)v36.A(TA.a(18990, -9011));
                                                        }
                                                        try {
                                                            try {
                                                                if (var2_3 == 0) break block165;
                                                                if (v44 != 0) break block166;
                                                            }
                                                            catch (IllegalArgumentException v47) {
                                                                throw TA.a(v47);
                                                            }
                                                            v44 = (int)this.A(TA.a(18984, 3581));
                                                        }
                                                        catch (IllegalArgumentException v48) {
                                                            throw TA.a(v48);
                                                        }
                                                    }
                                                    if (v44 == 0) break block164;
                                                }
                                                var6_11 = var1_1.getComponents();
                                                var7_19 = var6_11.length;
                                                var8_26 = 0;
                                                while (var8_26 < var7_19) {
                                                    block167: {
                                                        block168: {
                                                            block169: {
                                                                var9_29 = var6_11[var8_26];
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var2_3 == 0) break block150;
                                                                                if (var2_3 == 0) break block167;
                                                                            }
                                                                            catch (IllegalArgumentException v49) {
                                                                                throw TA.a(v49);
                                                                            }
                                                                            if (this.L.get(var9_29) == null) break block168;
                                                                        }
                                                                        catch (IllegalArgumentException v50) {
                                                                            throw TA.a(v50);
                                                                        }
                                                                        v51 = ((String)this.L.get(var9_29)).equals(TA.a(18990, -9011));
                                                                        if (var2_3 == 0) break block169;
                                                                    }
                                                                    catch (IllegalArgumentException v52) {
                                                                        throw TA.a(v52);
                                                                    }
                                                                    if (v51) {
                                                                    }
                                                                    ** GOTO lbl327
                                                                }
                                                                catch (IllegalArgumentException v53) {
                                                                    throw TA.a(v53);
                                                                }
                                                                var10_30 = var9_29.getPreferredSize();
                                                                try {
                                                                    var9_29.setBounds(Math.max(var4_4, (var4_4 + var5_5) / 2 - var10_30.width / 2), var3_2.top, Math.min(var10_30.width, var5_5 - var4_4), var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                    if (var2_3 != 0) break block168;
lbl327:
                                                                    // 2 sources

                                                                    v51 = ((String)this.L.get(var9_29)).equals(TA.a(18984, 3581));
                                                                }
                                                                catch (IllegalArgumentException v54) {
                                                                    throw TA.a(v54);
                                                                }
                                                            }
                                                            try {
                                                                if (v51) {
                                                                    var9_29.setBounds(var4_4, var3_2.top, Math.max(0, var5_5 - var4_4), var1_1.getHeight() - var3_2.top - var3_2.bottom);
                                                                }
                                                            }
                                                            catch (IllegalArgumentException v55) {
                                                                throw TA.a(v55);
                                                            }
                                                        }
                                                        ++var8_26;
                                                    }
                                                    if (var2_3 != 0) continue;
                                                }
                                            }
                                            try {
                                                if (var2_3 != 0) break block150;
lbl345:
                                                // 2 sources

                                                v0 = var3_2.top;
                                            }
                                            catch (IllegalArgumentException v56) {
                                                throw TA.a(v56);
                                            }
                                        }
                                        var4_4 = v0;
                                        for (var5_5 = 0; var5_5 < var1_1.getComponentCount(); ++var5_5) {
                                            block172: {
                                                block171: {
                                                    var6_12 = var1_1.getComponent(var5_5);
                                                    try {
                                                        try {
                                                            try {
                                                                v57 = this;
                                                                if (var2_3 == 0) break block170;
                                                                v58 = v57.L.get(var6_12);
                                                                if (var2_3 == 0) break block171;
                                                            }
                                                            catch (IllegalArgumentException v59) {
                                                                throw TA.a(v59);
                                                            }
                                                            if (v58 == null) break block172;
                                                        }
                                                        catch (IllegalArgumentException v60) {
                                                            throw TA.a(v60);
                                                        }
                                                        v58 = this.L.get(var6_12);
                                                    }
                                                    catch (IllegalArgumentException v61) {
                                                        throw TA.a(v61);
                                                    }
                                                }
                                                if (!((String)v58).equals(TA.a(18976, -32644))) continue;
                                            }
                                            var7_20 = var6_12.getPreferredSize();
                                            var6_12.setBounds(var3_2.left, var4_4, var1_1.getWidth() - var3_2.left - var3_2.right, var7_20.height);
                                            var4_4 += var7_20.height + this.T;
                                            if (var2_3 != 0) continue;
                                        }
                                        var5_5 = var1_1.getHeight() - var3_2.bottom;
                                        v57 = this;
                                    }
                                    try {
                                        v62 = v57.A(TA.a(18989, 26262));
                                        if (var2_3 == 0) break block173;
                                        if (v62 == 0) break block174;
                                    }
                                    catch (IllegalArgumentException v63) {
                                        throw TA.a(v63);
                                    }
                                    var6_13 = var1_1.getComponentCount() - 1;
                                    while (var6_13 >= 0) {
                                        block175: {
                                            block177: {
                                                var7_21 = var1_1.getComponent(var6_13);
                                                try {
                                                    try {
                                                        try {
                                                            if (var2_3 == 0) break block175;
                                                            v64 = this;
                                                            if (var2_3 == 0) break block176;
                                                        }
                                                        catch (IllegalArgumentException v65) {
                                                            throw TA.a(v65);
                                                        }
                                                        if (v64.L.get(var7_21) == null) break block177;
                                                    }
                                                    catch (IllegalArgumentException v66) {
                                                        throw TA.a(v66);
                                                    }
                                                    if (!((String)this.L.get(var7_21)).equals(TA.a(18989, 26262))) break block177;
                                                }
                                                catch (IllegalArgumentException v67) {
                                                    throw TA.a(v67);
                                                }
                                                var8_27 = var7_21.getPreferredSize();
                                                var7_21.setBounds(var3_2.left, var5_5 -= var8_27.height, var1_1.getWidth() - var3_2.left - var3_2.right, var8_27.height);
                                                var5_5 -= this.T;
                                            }
                                            --var6_13;
                                        }
                                        if (var2_3 != 0) continue;
                                    }
                                }
                                v62 = var5_5;
                            }
                            try {
                                try {
                                    if (var2_3 == 0) break block178;
                                    if (v62 <= var4_4) break block150;
                                }
                                catch (IllegalArgumentException v68) {
                                    throw TA.a(v68);
                                }
                                v64 = this;
                            }
                            catch (IllegalArgumentException v69) {
                                throw TA.a(v69);
                            }
                        }
                        v62 = (int)v64.A(TA.a(18990, -9011));
                    }
                    try {
                        try {
                            if (var2_3 == 0) break block179;
                            if (v62 != 0) break block180;
                        }
                        catch (IllegalArgumentException v70) {
                            throw TA.a(v70);
                        }
                        v62 = (int)this.A(TA.a(18984, 3581));
                    }
                    catch (IllegalArgumentException v71) {
                        throw TA.a(v71);
                    }
                }
                if (v62 == 0) break block150;
            }
            var6_14 = var1_1.getComponents();
            var7_22 = var6_14.length;
            var8_28 = 0;
            while (var8_28 < var7_22) {
                block181: {
                    block182: {
                        block183: {
                            var9_29 = var6_14[var8_28];
                            try {
                                try {
                                    try {
                                        if (var2_3 == 0) break block181;
                                        if (this.L.get(var9_29) == null) break block182;
                                    }
                                    catch (IllegalArgumentException v72) {
                                        throw TA.a(v72);
                                    }
                                    v73 = ((String)this.L.get(var9_29)).equals(TA.a(18990, -9011));
                                    if (var2_3 == 0) break block183;
                                }
                                catch (IllegalArgumentException v74) {
                                    throw TA.a(v74);
                                }
                                if (v73) {
                                }
                                ** GOTO lbl473
                            }
                            catch (IllegalArgumentException v75) {
                                throw TA.a(v75);
                            }
                            var10_30 = var9_29.getPreferredSize();
                            try {
                                var9_29.setBounds(var3_2.left, Math.max(var4_4, (var4_4 + var5_5) / 2 - var10_30.height / 2), var1_1.getWidth() - var3_2.left - var3_2.right, Math.min(var10_30.height, var5_5 - var4_4));
                                if (var2_3 != 0) break block182;
lbl473:
                                // 2 sources

                                v73 = ((String)this.L.get(var9_29)).equals(TA.a(18984, 3581));
                            }
                            catch (IllegalArgumentException v76) {
                                throw TA.a(v76);
                            }
                        }
                        try {
                            if (v73) {
                                var9_29.setBounds(var3_2.left, var4_4, var1_1.getWidth() - var3_2.left - var3_2.right, Math.max(0, var5_5 - var4_4));
                            }
                        }
                        catch (IllegalArgumentException v77) {
                            throw TA.a(v77);
                        }
                    }
                    ++var8_28;
                }
                if (var2_3 != 0) continue;
            }
        }
    }

    protected boolean A(String string) {
        return this.L.containsValue(string);
    }

    protected Insets Y(Container container) {
        Insets insets;
        block2: {
            block3: {
                int n10 = T4.b();
                try {
                    insets = this.I;
                    if (n10 == 0) break block2;
                    if (insets == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw TA.a(illegalArgumentException);
                }
                Insets insets2 = container.getInsets();
                insets2.top += this.I.top;
                insets2.left += this.I.left;
                insets2.bottom += this.I.bottom;
                insets2.right += this.I.right;
                return insets2;
            }
            insets = container.getInsets();
        }
        return insets;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "R\"\u00c3\u00e7\u0005h\u00c3>{N\u0004\u00c4\u00d5\u0011\u0019\u0003\u00fc}}^\u0091\u0002<\u00ec\u00ff\u00f7\u00ba\u007fH\u008dN\u0099?\u000e\u0013\u00db\u00b1\u00d6\u00a1\u00912\u00f2\u0007^\u000e\u008e\u00abY\u00f4!\u00f6\u009b\u00e9Y\u008b\u0082\u0081&'1Wf\u00a1\\\u00c8\u00c5#S!-1\u0083o\u008d\u00e9\u00e2 \u00d6>\u00cc\u00e4\\\u00f7\u00ac\u009e/\u00b8\u00d6 \u009d:l\u0085\u00e0\u00c6E\u00b38\u00eb`\u0010R[\"\u00fc\u00b2t5\u008aK\u00d9\u00e06t\u0003\u00dan\u00b9\u0006\u001ed('1\u00d0";
                var4_3 = "R\"\u00c3\u00e7\u0005h\u00c3>{N\u0004\u00c4\u00d5\u0011\u0019\u0003\u00fc}}^\u0091\u0002<\u00ec\u00ff\u00f7\u00ba\u007fH\u008dN\u0099?\u000e\u0013\u00db\u00b1\u00d6\u00a1\u00912\u00f2\u0007^\u000e\u008e\u00abY\u00f4!\u00f6\u009b\u00e9Y\u008b\u0082\u0081&'1Wf\u00a1\\\u00c8\u00c5#S!-1\u0083o\u008d\u00e9\u00e2 \u00d6>\u00cc\u00e4\\\u00f7\u00ac\u009e/\u00b8\u00d6 \u009d:l\u0085\u00e0\u00c6E\u00b38\u00eb`\u0010R[\"\u00fc\u00b2t5\u008aK\u00d9\u00e06t\u0003\u00dan\u00b9\u0006\u001ed('1\u00d0".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 93;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00c5\f\u0095\u00ec@o\u0005\u00a0\u00d4\u00e1_s";
                    var4_3 = "\u00c5\f\u0095\u00ec@o\u0005\u00a0\u00d4\u00e1_s".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 91;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 101;
                            break;
                        }
                        case 1: {
                            v15 = 10;
                            break;
                        }
                        case 2: {
                            v15 = 17;
                            break;
                        }
                        case 3: {
                            v15 = 56;
                            break;
                        }
                        case 4: {
                            v15 = 96;
                            break;
                        }
                        case 5: {
                            v15 = 76;
                            break;
                        }
                        default: {
                            v15 = 29;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        TA.a = var5;
        TA.b = new String[9];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4A28) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 32;
                    break;
                }
                case 1: {
                    n14 = 2;
                    break;
                }
                case 2: {
                    n14 = 73;
                    break;
                }
                case 3: {
                    n14 = 235;
                    break;
                }
                case 4: {
                    n14 = 131;
                    break;
                }
                case 5: {
                    n14 = 80;
                    break;
                }
                case 6: {
                    n14 = 140;
                    break;
                }
                case 7: {
                    n14 = 191;
                    break;
                }
                case 8: {
                    n14 = 30;
                    break;
                }
                case 9: {
                    n14 = 41;
                    break;
                }
                case 10: {
                    n14 = 137;
                    break;
                }
                case 11: {
                    n14 = 222;
                    break;
                }
                case 12: {
                    n14 = 169;
                    break;
                }
                case 13: {
                    n14 = 145;
                    break;
                }
                case 14: {
                    n14 = 205;
                    break;
                }
                case 15: {
                    n14 = 84;
                    break;
                }
                case 16: {
                    n14 = 242;
                    break;
                }
                case 17: {
                    n14 = 39;
                    break;
                }
                case 18: {
                    n14 = 197;
                    break;
                }
                case 19: {
                    n14 = 135;
                    break;
                }
                case 20: {
                    n14 = 162;
                    break;
                }
                case 21: {
                    n14 = 240;
                    break;
                }
                case 22: {
                    n14 = 152;
                    break;
                }
                case 23: {
                    n14 = 97;
                    break;
                }
                case 24: {
                    n14 = 115;
                    break;
                }
                case 25: {
                    n14 = 44;
                    break;
                }
                case 26: {
                    n14 = 51;
                    break;
                }
                case 27: {
                    n14 = 70;
                    break;
                }
                case 28: {
                    n14 = 204;
                    break;
                }
                case 29: {
                    n14 = 253;
                    break;
                }
                case 30: {
                    n14 = 114;
                    break;
                }
                case 31: {
                    n14 = 206;
                    break;
                }
                case 32: {
                    n14 = 116;
                    break;
                }
                case 33: {
                    n14 = 201;
                    break;
                }
                case 34: {
                    n14 = 165;
                    break;
                }
                case 35: {
                    n14 = 34;
                    break;
                }
                case 36: {
                    n14 = 120;
                    break;
                }
                case 37: {
                    n14 = 28;
                    break;
                }
                case 38: {
                    n14 = 98;
                    break;
                }
                case 39: {
                    n14 = 49;
                    break;
                }
                case 40: {
                    n14 = 33;
                    break;
                }
                case 41: {
                    n14 = 13;
                    break;
                }
                case 42: {
                    n14 = 218;
                    break;
                }
                case 43: {
                    n14 = 88;
                    break;
                }
                case 44: {
                    n14 = 164;
                    break;
                }
                case 45: {
                    n14 = 173;
                    break;
                }
                case 46: {
                    n14 = 252;
                    break;
                }
                case 47: {
                    n14 = 213;
                    break;
                }
                case 48: {
                    n14 = 146;
                    break;
                }
                case 49: {
                    n14 = 78;
                    break;
                }
                case 50: {
                    n14 = 134;
                    break;
                }
                case 51: {
                    n14 = 66;
                    break;
                }
                case 52: {
                    n14 = 117;
                    break;
                }
                case 53: {
                    n14 = 176;
                    break;
                }
                case 54: {
                    n14 = 20;
                    break;
                }
                case 55: {
                    n14 = 48;
                    break;
                }
                case 56: {
                    n14 = 219;
                    break;
                }
                case 57: {
                    n14 = 108;
                    break;
                }
                case 58: {
                    n14 = 3;
                    break;
                }
                case 59: {
                    n14 = 96;
                    break;
                }
                case 60: {
                    n14 = 69;
                    break;
                }
                case 61: {
                    n14 = 237;
                    break;
                }
                case 62: {
                    n14 = 15;
                    break;
                }
                case 63: {
                    n14 = 75;
                    break;
                }
                case 64: {
                    n14 = 25;
                    break;
                }
                case 65: {
                    n14 = 127;
                    break;
                }
                case 66: {
                    n14 = 154;
                    break;
                }
                case 67: {
                    n14 = 128;
                    break;
                }
                case 68: {
                    n14 = 63;
                    break;
                }
                case 69: {
                    n14 = 40;
                    break;
                }
                case 70: {
                    n14 = 233;
                    break;
                }
                case 71: {
                    n14 = 21;
                    break;
                }
                case 72: {
                    n14 = 158;
                    break;
                }
                case 73: {
                    n14 = 156;
                    break;
                }
                case 74: {
                    n14 = 56;
                    break;
                }
                case 75: {
                    n14 = 6;
                    break;
                }
                case 76: {
                    n14 = 147;
                    break;
                }
                case 77: {
                    n14 = 163;
                    break;
                }
                case 78: {
                    n14 = 139;
                    break;
                }
                case 79: {
                    n14 = 85;
                    break;
                }
                case 80: {
                    n14 = 167;
                    break;
                }
                case 81: {
                    n14 = 125;
                    break;
                }
                case 82: {
                    n14 = 67;
                    break;
                }
                case 83: {
                    n14 = 95;
                    break;
                }
                case 84: {
                    n14 = 53;
                    break;
                }
                case 85: {
                    n14 = 236;
                    break;
                }
                case 86: {
                    n14 = 221;
                    break;
                }
                case 87: {
                    n14 = 112;
                    break;
                }
                case 88: {
                    n14 = 92;
                    break;
                }
                case 89: {
                    n14 = 245;
                    break;
                }
                case 90: {
                    n14 = 141;
                    break;
                }
                case 91: {
                    n14 = 254;
                    break;
                }
                case 92: {
                    n14 = 122;
                    break;
                }
                case 93: {
                    n14 = 142;
                    break;
                }
                case 94: {
                    n14 = 133;
                    break;
                }
                case 95: {
                    n14 = 22;
                    break;
                }
                case 96: {
                    n14 = 189;
                    break;
                }
                case 97: {
                    n14 = 150;
                    break;
                }
                case 98: {
                    n14 = 52;
                    break;
                }
                case 99: {
                    n14 = 43;
                    break;
                }
                case 100: {
                    n14 = 220;
                    break;
                }
                case 101: {
                    n14 = 177;
                    break;
                }
                case 102: {
                    n14 = 37;
                    break;
                }
                case 103: {
                    n14 = 91;
                    break;
                }
                case 104: {
                    n14 = 224;
                    break;
                }
                case 105: {
                    n14 = 119;
                    break;
                }
                case 106: {
                    n14 = 209;
                    break;
                }
                case 107: {
                    n14 = 212;
                    break;
                }
                case 108: {
                    n14 = 121;
                    break;
                }
                case 109: {
                    n14 = 42;
                    break;
                }
                case 110: {
                    n14 = 86;
                    break;
                }
                case 111: {
                    n14 = 185;
                    break;
                }
                case 112: {
                    n14 = 103;
                    break;
                }
                case 113: {
                    n14 = 230;
                    break;
                }
                case 114: {
                    n14 = 57;
                    break;
                }
                case 115: {
                    n14 = 62;
                    break;
                }
                case 116: {
                    n14 = 196;
                    break;
                }
                case 117: {
                    n14 = 211;
                    break;
                }
                case 118: {
                    n14 = 203;
                    break;
                }
                case 119: {
                    n14 = 61;
                    break;
                }
                case 120: {
                    n14 = 178;
                    break;
                }
                case 121: {
                    n14 = 248;
                    break;
                }
                case 122: {
                    n14 = 149;
                    break;
                }
                case 123: {
                    n14 = 59;
                    break;
                }
                case 124: {
                    n14 = 71;
                    break;
                }
                case 125: {
                    n14 = 171;
                    break;
                }
                case 126: {
                    n14 = 138;
                    break;
                }
                case 127: {
                    n14 = 199;
                    break;
                }
                case 128: {
                    n14 = 227;
                    break;
                }
                case 129: {
                    n14 = 113;
                    break;
                }
                case 130: {
                    n14 = 226;
                    break;
                }
                case 131: {
                    n14 = 217;
                    break;
                }
                case 132: {
                    n14 = 110;
                    break;
                }
                case 133: {
                    n14 = 247;
                    break;
                }
                case 134: {
                    n14 = 35;
                    break;
                }
                case 135: {
                    n14 = 168;
                    break;
                }
                case 136: {
                    n14 = 38;
                    break;
                }
                case 137: {
                    n14 = 188;
                    break;
                }
                case 138: {
                    n14 = 12;
                    break;
                }
                case 139: {
                    n14 = 234;
                    break;
                }
                case 140: {
                    n14 = 89;
                    break;
                }
                case 141: {
                    n14 = 180;
                    break;
                }
                case 142: {
                    n14 = 58;
                    break;
                }
                case 143: {
                    n14 = 10;
                    break;
                }
                case 144: {
                    n14 = 207;
                    break;
                }
                case 145: {
                    n14 = 136;
                    break;
                }
                case 146: {
                    n14 = 250;
                    break;
                }
                case 147: {
                    n14 = 190;
                    break;
                }
                case 148: {
                    n14 = 19;
                    break;
                }
                case 149: {
                    n14 = 111;
                    break;
                }
                case 150: {
                    n14 = 100;
                    break;
                }
                case 151: {
                    n14 = 172;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 102;
                    break;
                }
                case 154: {
                    n14 = 106;
                    break;
                }
                case 155: {
                    n14 = 132;
                    break;
                }
                case 156: {
                    n14 = 166;
                    break;
                }
                case 157: {
                    n14 = 200;
                    break;
                }
                case 158: {
                    n14 = 175;
                    break;
                }
                case 159: {
                    n14 = 82;
                    break;
                }
                case 160: {
                    n14 = 202;
                    break;
                }
                case 161: {
                    n14 = 194;
                    break;
                }
                case 162: {
                    n14 = 231;
                    break;
                }
                case 163: {
                    n14 = 246;
                    break;
                }
                case 164: {
                    n14 = 238;
                    break;
                }
                case 165: {
                    n14 = 229;
                    break;
                }
                case 166: {
                    n14 = 17;
                    break;
                }
                case 167: {
                    n14 = 155;
                    break;
                }
                case 168: {
                    n14 = 47;
                    break;
                }
                case 169: {
                    n14 = 83;
                    break;
                }
                case 170: {
                    n14 = 60;
                    break;
                }
                case 171: {
                    n14 = 118;
                    break;
                }
                case 172: {
                    n14 = 198;
                    break;
                }
                case 173: {
                    n14 = 109;
                    break;
                }
                case 174: {
                    n14 = 50;
                    break;
                }
                case 175: {
                    n14 = 107;
                    break;
                }
                case 176: {
                    n14 = 0;
                    break;
                }
                case 177: {
                    n14 = 23;
                    break;
                }
                case 178: {
                    n14 = 36;
                    break;
                }
                case 179: {
                    n14 = 225;
                    break;
                }
                case 180: {
                    n14 = 31;
                    break;
                }
                case 181: {
                    n14 = 159;
                    break;
                }
                case 182: {
                    n14 = 126;
                    break;
                }
                case 183: {
                    n14 = 255;
                    break;
                }
                case 184: {
                    n14 = 148;
                    break;
                }
                case 185: {
                    n14 = 183;
                    break;
                }
                case 186: {
                    n14 = 243;
                    break;
                }
                case 187: {
                    n14 = 143;
                    break;
                }
                case 188: {
                    n14 = 68;
                    break;
                }
                case 189: {
                    n14 = 93;
                    break;
                }
                case 190: {
                    n14 = 77;
                    break;
                }
                case 191: {
                    n14 = 4;
                    break;
                }
                case 192: {
                    n14 = 193;
                    break;
                }
                case 193: {
                    n14 = 241;
                    break;
                }
                case 194: {
                    n14 = 223;
                    break;
                }
                case 195: {
                    n14 = 7;
                    break;
                }
                case 196: {
                    n14 = 184;
                    break;
                }
                case 197: {
                    n14 = 232;
                    break;
                }
                case 198: {
                    n14 = 195;
                    break;
                }
                case 199: {
                    n14 = 130;
                    break;
                }
                case 200: {
                    n14 = 170;
                    break;
                }
                case 201: {
                    n14 = 151;
                    break;
                }
                case 202: {
                    n14 = 46;
                    break;
                }
                case 203: {
                    n14 = 1;
                    break;
                }
                case 204: {
                    n14 = 174;
                    break;
                }
                case 205: {
                    n14 = 105;
                    break;
                }
                case 206: {
                    n14 = 160;
                    break;
                }
                case 207: {
                    n14 = 251;
                    break;
                }
                case 208: {
                    n14 = 5;
                    break;
                }
                case 209: {
                    n14 = 94;
                    break;
                }
                case 210: {
                    n14 = 18;
                    break;
                }
                case 211: {
                    n14 = 179;
                    break;
                }
                case 212: {
                    n14 = 161;
                    break;
                }
                case 213: {
                    n14 = 186;
                    break;
                }
                case 214: {
                    n14 = 24;
                    break;
                }
                case 215: {
                    n14 = 45;
                    break;
                }
                case 216: {
                    n14 = 29;
                    break;
                }
                case 217: {
                    n14 = 104;
                    break;
                }
                case 218: {
                    n14 = 72;
                    break;
                }
                case 219: {
                    n14 = 157;
                    break;
                }
                case 220: {
                    n14 = 244;
                    break;
                }
                case 221: {
                    n14 = 216;
                    break;
                }
                case 222: {
                    n14 = 187;
                    break;
                }
                case 223: {
                    n14 = 153;
                    break;
                }
                case 224: {
                    n14 = 81;
                    break;
                }
                case 225: {
                    n14 = 144;
                    break;
                }
                case 226: {
                    n14 = 239;
                    break;
                }
                case 227: {
                    n14 = 9;
                    break;
                }
                case 228: {
                    n14 = 64;
                    break;
                }
                case 229: {
                    n14 = 210;
                    break;
                }
                case 230: {
                    n14 = 101;
                    break;
                }
                case 231: {
                    n14 = 215;
                    break;
                }
                case 232: {
                    n14 = 124;
                    break;
                }
                case 233: {
                    n14 = 208;
                    break;
                }
                case 234: {
                    n14 = 76;
                    break;
                }
                case 235: {
                    n14 = 79;
                    break;
                }
                case 236: {
                    n14 = 228;
                    break;
                }
                case 237: {
                    n14 = 192;
                    break;
                }
                case 238: {
                    n14 = 27;
                    break;
                }
                case 239: {
                    n14 = 182;
                    break;
                }
                case 240: {
                    n14 = 11;
                    break;
                }
                case 241: {
                    n14 = 123;
                    break;
                }
                case 242: {
                    n14 = 214;
                    break;
                }
                case 243: {
                    n14 = 8;
                    break;
                }
                case 244: {
                    n14 = 87;
                    break;
                }
                case 245: {
                    n14 = 90;
                    break;
                }
                case 246: {
                    n14 = 249;
                    break;
                }
                case 247: {
                    n14 = 14;
                    break;
                }
                case 248: {
                    n14 = 74;
                    break;
                }
                case 249: {
                    n14 = 16;
                    break;
                }
                case 250: {
                    n14 = 55;
                    break;
                }
                case 251: {
                    n14 = 26;
                    break;
                }
                case 252: {
                    n14 = 99;
                    break;
                }
                case 253: {
                    n14 = 129;
                    break;
                }
                case 254: {
                    n14 = 65;
                    break;
                }
                default: {
                    n14 = 181;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            TA.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

