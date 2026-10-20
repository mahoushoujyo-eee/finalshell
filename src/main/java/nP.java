/*
 * Decompiled with CFR 0.152.
 */
import com.FN;
import com.T4;
import com._1;
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class nP
extends T4
implements SwingConstants {
    protected Map E;
    protected Insets H;
    protected Insets r;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    public nP() {
        this.E = new HashMap();
        this.H = null;
        this.r = null;
    }

    public Insets H() {
        return (Insets)this.H;
    }

    public void A(int n10) {
        try {
            this.w(n10, n10, n10, n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void w(int n10, int n11, int n12, int n13) {
        try {
            this.x(new Insets(n10, n11, n12, n13));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void x(Insets insets) {
        this.H = insets;
    }

    public Insets w() {
        return (Insets)this.r;
    }

    public void V(int n10) {
        try {
            this.F(n10, n10, n10, n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void F(int n10, int n11, int n12, int n13) {
        try {
            this.q(new Insets(n10, n11, n12, n13));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void q(Insets insets) {
        this.r = insets;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void A(Component component, Object object) {
        String string;
        String string2;
        block11: {
            String[] stringArray;
            block10: {
                string2 = (String)object;
                stringArray = F8.y();
                try {
                    string = string2;
                    if (stringArray != null) break block10;
                    if (string == null) throw new IllegalArgumentException("Cannot add to layout: constraint must be 'COMPONENT' or 'OVERLAY' string");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw nP.a(illegalArgumentException);
                }
                string = string2;
            }
            try {
                try {
                    try {
                        try {
                            if (stringArray != null) return;
                            if (string.equals("COMPONENT")) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw nP.a(illegalArgumentException);
                        }
                        string = string2;
                        if (stringArray != null) return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw nP.a(illegalArgumentException);
                    }
                    if (string.equals("OVERLAY")) break block11;
                    throw new IllegalArgumentException("Cannot add to layout: constraint must be 'COMPONENT' or 'OVERLAY' string");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw nP.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw nP.a(illegalArgumentException);
            }
        }
        string = ((Map)this.E).put(component, string2);
    }

    @Override
    public void F(Component component) {
        ((Map)this.E).remove(component);
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Insets insets;
        Insets insets2 = container.getInsets();
        try {
            insets = (Insets)this.J(container);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Insets insets3 = insets;
        Dimension dimension = new Dimension();
        Component[] componentArray = container.getComponents();
        int n10 = componentArray.length;
        String[] stringArray = F8.y();
        int n11 = 0;
        while (n11 < n10) {
            block7: {
                block8: {
                    Component component = componentArray[n11];
                    String string = (String)((Map)this.E).get(component);
                    try {
                        try {
                            if (stringArray != null) break block7;
                            if (string == null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw nP.a(illegalArgumentException);
                        }
                        if (!string.equals("COMPONENT")) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw nP.a(illegalArgumentException);
                    }
                    Dimension dimension2 = component.getPreferredSize();
                    dimension = FN.h(dimension, new Dimension(insets2.left + insets3.left + dimension2.width + insets3.right + insets2.right, insets2.top + insets3.top + dimension2.height + insets3.bottom + insets2.bottom));
                }
                ++n11;
            }
            if (stringArray == null) continue;
        }
        return dimension;
    }

    protected Insets J(Container container) {
        Insets insets;
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if ((Insets)this.H == null) break block4;
                            if (!container.getComponentOrientation().isLeftToRight()) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw nP.a(illegalArgumentException);
                        }
                        insets = (Insets)this.H;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw nP.a(illegalArgumentException);
                    }
                }
                insets = FN.p((Insets)this.H);
                break block6;
            }
            insets = new Insets(0, 0, 0, 0);
        }
        return insets;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void layoutContainer(Container var1_1) {
        var3_2 = var1_1.getInsets();
        try {
            v0 = (Insets)this.J(var1_1);
        }
        catch (InvocationTargetException v1) {
            throw v1.getTargetException();
        }
        var4_3 = v0;
        var5_4 = var1_1.getComponents();
        var6_5 = var5_4.length;
        var7_6 = 0;
        var2_7 = F8.y();
        while (var7_6 < var6_5) {
            block68: {
                block69: {
                    block91: {
                        block89: {
                            block88: {
                                block90: {
                                    block87: {
                                        block86: {
                                            block84: {
                                                block85: {
                                                    block83: {
                                                        block81: {
                                                            block79: {
                                                                block80: {
                                                                    block78: {
                                                                        block76: {
                                                                            block74: {
                                                                                block72: {
                                                                                    block73: {
                                                                                        block70: {
                                                                                            var8_8 = var5_4[var7_6];
                                                                                            var9_9 = (String)((Map)this.E).get(var8_8);
                                                                                            try {
                                                                                                if (var2_7 != null) break block68;
                                                                                                if (var9_9 == null) break block69;
                                                                                            }
                                                                                            catch (IllegalArgumentException v2) {
                                                                                                throw nP.a(v2);
                                                                                            }
                                                                                            var10_10 = var1_1.getWidth();
                                                                                            var11_11 = var1_1.getHeight();
                                                                                            try {
                                                                                                block71: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v3 = var9_9.equals("COMPONENT");
                                                                                                            if (var2_7 != null) break block70;
                                                                                                            if (!v3) break block71;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v4) {
                                                                                                            throw nP.a(v4);
                                                                                                        }
                                                                                                        var8_8.setBounds(var3_2.left + var4_3.left, var3_2.top + var4_3.top, var10_10 - var3_2.left - var3_2.right - var4_3.left - var4_3.right, var11_11 - var3_2.top - var3_2.bottom - var4_3.top - var4_3.bottom);
                                                                                                        if (var2_7 == null) break block69;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v5) {
                                                                                                        throw nP.a(v5);
                                                                                                    }
                                                                                                }
                                                                                                v3 = var9_9.equals("OVERLAY");
                                                                                            }
                                                                                            catch (IllegalArgumentException v6) {
                                                                                                throw nP.a(v6);
                                                                                            }
                                                                                        }
                                                                                        if (!v3) break block69;
                                                                                        var12_12 = (mj_0)var1_1;
                                                                                        try {
                                                                                            v7 = (_1)var12_12.y(var8_8);
                                                                                        }
                                                                                        catch (InvocationTargetException v8) {
                                                                                            throw v8.getTargetException();
                                                                                        }
                                                                                        var13_13 = v7;
                                                                                        try {
                                                                                            try {
                                                                                                v9 = (Insets)this.r;
                                                                                                if (var2_7 != null) break block72;
                                                                                                if (v9 == null) break block73;
                                                                                            }
                                                                                            catch (IllegalArgumentException v10) {
                                                                                                throw nP.a(v10);
                                                                                            }
                                                                                            v9 = (Insets)this.r;
                                                                                            break block72;
                                                                                        }
                                                                                        catch (IllegalArgumentException v11) {
                                                                                            throw nP.a(v11);
                                                                                        }
                                                                                    }
                                                                                    v9 = new Insets(0, 0, 0, 0);
                                                                                }
                                                                                var14_14 = v9;
                                                                                try {
                                                                                    block75: {
                                                                                        try {
                                                                                            try {
                                                                                                v12 = var13_13.c().equals((Object)((ci_2)ci_2.fill));
                                                                                                if (var2_7 != null) break block74;
                                                                                                if (!v12) break block75;
                                                                                            }
                                                                                            catch (IllegalArgumentException v13) {
                                                                                                throw nP.a(v13);
                                                                                            }
                                                                                            var8_8.setBounds(var3_2.left + var14_14.left, var3_2.top + var14_14.top, var10_10 - var3_2.left - var14_14.left - var3_2.right - var14_14.right, var11_11 - var3_2.top - var14_14.top - var3_2.bottom - var14_14.bottom);
                                                                                            if (var2_7 == null) break block69;
                                                                                        }
                                                                                        catch (IllegalArgumentException v14) {
                                                                                            throw nP.a(v14);
                                                                                        }
                                                                                    }
                                                                                    v12 = var13_13.c().equals((Object)((ci_2)ci_2.align));
                                                                                }
                                                                                catch (IllegalArgumentException v15) {
                                                                                    throw nP.a(v15);
                                                                                }
                                                                            }
                                                                            if (!v12) ** GOTO lbl257
                                                                            var15_15 = var8_8.getPreferredSize();
                                                                            try {
                                                                                v16 = (Integer)this.W((Object)var8_8, (Object)var13_13);
                                                                            }
                                                                            catch (InvocationTargetException v17) {
                                                                                throw v17.getTargetException();
                                                                            }
                                                                            var17_17 = v16;
                                                                            try {
                                                                                block77: {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v18 = var17_17;
                                                                                                v19 = 2;
                                                                                                if (var2_7 != null) break block76;
                                                                                                if (v18 == v19) break block77;
                                                                                            }
                                                                                            catch (IllegalArgumentException v20) {
                                                                                                throw nP.a(v20);
                                                                                            }
                                                                                            v21 = var17_17;
                                                                                            v22 = -1;
                                                                                            if (var2_7 != null) break block78;
                                                                                        }
                                                                                        catch (IllegalArgumentException v23) {
                                                                                            throw nP.a(v23);
                                                                                        }
                                                                                        if (v21 == v22) {
                                                                                        }
                                                                                        ** GOTO lbl130
                                                                                    }
                                                                                    catch (IllegalArgumentException v24) {
                                                                                        throw nP.a(v24);
                                                                                    }
                                                                                }
                                                                                v18 = var3_2.left;
                                                                                v19 = var14_14.left;
                                                                            }
                                                                            catch (IllegalArgumentException v25) {
                                                                                throw nP.a(v25);
                                                                            }
                                                                        }
                                                                        var16_16 = v18 + v19;
                                                                        try {
                                                                            if (var2_7 == null) break block79;
lbl130:
                                                                            // 2 sources

                                                                            v21 = var17_17;
                                                                            v22 = 4;
                                                                        }
                                                                        catch (IllegalArgumentException v26) {
                                                                            throw nP.a(v26);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var2_7 != null) break block80;
                                                                        if (v21 == v22) {
                                                                        }
                                                                        ** GOTO lbl146
                                                                    }
                                                                    catch (IllegalArgumentException v27) {
                                                                        throw nP.a(v27);
                                                                    }
                                                                    var16_16 = var10_10 - var3_2.right - var14_14.right - var15_15.width;
                                                                    try {
                                                                        if (var2_7 == null) break block79;
lbl146:
                                                                        // 2 sources

                                                                        v21 = var10_10 / 2;
                                                                        v22 = var15_15.width / 2;
                                                                    }
                                                                    catch (IllegalArgumentException v28) {
                                                                        throw nP.a(v28);
                                                                    }
                                                                }
                                                                var16_16 = v21 - v22;
                                                            }
                                                            var19_19 = var13_13.X();
                                                            try {
                                                                block82: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v29 = var19_19;
                                                                                v30 = 1;
                                                                                if (var2_7 != null) break block81;
                                                                                if (v29 == v30) break block82;
                                                                            }
                                                                            catch (IllegalArgumentException v31) {
                                                                                throw nP.a(v31);
                                                                            }
                                                                            v32 = var19_19;
                                                                            v33 = -1;
                                                                            if (var2_7 != null) break block83;
                                                                        }
                                                                        catch (IllegalArgumentException v34) {
                                                                            throw nP.a(v34);
                                                                        }
                                                                        if (v32 == v33) {
                                                                        }
                                                                        ** GOTO lbl187
                                                                    }
                                                                    catch (IllegalArgumentException v35) {
                                                                        throw nP.a(v35);
                                                                    }
                                                                }
                                                                v29 = var3_2.top;
                                                                v30 = var14_14.top;
                                                            }
                                                            catch (IllegalArgumentException v36) {
                                                                throw nP.a(v36);
                                                            }
                                                        }
                                                        var18_18 = v29 + v30;
                                                        try {
                                                            if (var2_7 == null) break block84;
lbl187:
                                                            // 2 sources

                                                            v32 = var19_19;
                                                            v33 = 3;
                                                        }
                                                        catch (IllegalArgumentException v37) {
                                                            throw nP.a(v37);
                                                        }
                                                    }
                                                    try {
                                                        if (var2_7 != null) break block85;
                                                        if (v32 == v33) {
                                                        }
                                                        ** GOTO lbl203
                                                    }
                                                    catch (IllegalArgumentException v38) {
                                                        throw nP.a(v38);
                                                    }
                                                    var18_18 = var11_11 - var3_2.bottom - var14_14.bottom - var15_15.height;
                                                    try {
                                                        if (var2_7 == null) break block84;
lbl203:
                                                        // 2 sources

                                                        v32 = var11_11 / 2;
                                                        v33 = var15_15.height / 2;
                                                    }
                                                    catch (IllegalArgumentException v39) {
                                                        throw nP.a(v39);
                                                    }
                                                }
                                                var18_18 = v32 - v33;
                                            }
                                            try {
                                                try {
                                                    v40 = var8_8;
                                                    v41 = var16_16;
                                                    v42 = var18_18;
                                                    v43 = var17_17;
                                                    v44 = -1;
                                                    if (var2_7 != null) break block86;
                                                    if (v43 != v44) break block87;
                                                }
                                                catch (IllegalArgumentException v45) {
                                                    throw nP.a(v45);
                                                }
                                                v43 = var10_10 - var3_2.left - var14_14.left - var3_2.right;
                                                v44 = var14_14.right;
                                            }
                                            catch (IllegalArgumentException v46) {
                                                throw nP.a(v46);
                                            }
                                        }
                                        v47 = v43 - v44;
                                        break block90;
                                    }
                                    v47 = var15_15.width;
                                }
                                try {
                                    try {
                                        v48 = var19_19;
                                        v49 = -1;
                                        if (var2_7 != null) break block88;
                                        if (v48 != v49) break block89;
                                    }
                                    catch (IllegalArgumentException v50) {
                                        throw nP.a(v50);
                                    }
                                    v48 = var11_11 - var3_2.top - var14_14.top - var3_2.bottom;
                                    v49 = var14_14.bottom;
                                }
                                catch (IllegalArgumentException v51) {
                                    throw nP.a(v51);
                                }
                            }
                            v52 = v48 - v49;
                            break block91;
                        }
                        v52 = var15_15.height;
                    }
                    try {
                        v40.setBounds(v41, v42, v47, v52);
                        if (var2_7 == null) break block69;
lbl257:
                        // 2 sources

                        var8_8.setBounds((Rectangle)var13_13.Q().J());
                    }
                    catch (IllegalArgumentException v53) {
                        throw nP.a(v53);
                    }
                }
                ++var7_6;
            }
            if (var2_7 == null) continue;
        }
    }

    protected int W(Component component, _1 _12) {
        int n10;
        block16: {
            block17: {
                int n11;
                block18: {
                    block19: {
                        int n12;
                        String[] stringArray;
                        int n13;
                        block12: {
                            block13: {
                                int n14;
                                block14: {
                                    block15: {
                                        n13 = component.getComponentOrientation().isLeftToRight();
                                        stringArray = F8.y();
                                        try {
                                            try {
                                                try {
                                                    n10 = _12.r();
                                                    n12 = nP.b(8371, 7981408119552749152L);
                                                    if (stringArray != null) break block12;
                                                    if (n10 != n12) break block13;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw nP.a(illegalArgumentException);
                                                }
                                                n14 = n13;
                                                if (stringArray != null) break block14;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw nP.a(illegalArgumentException);
                                            }
                                            if (n14 == 0) break block15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw nP.a(illegalArgumentException);
                                        }
                                        n14 = 2;
                                        break block14;
                                    }
                                    n14 = 4;
                                }
                                return n14;
                            }
                            try {
                                n10 = _12.r();
                                if (stringArray != null) break block16;
                                n12 = nP.b(26253, 6556506702773315679L);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw nP.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (n10 != n12) break block17;
                                n11 = n13;
                                if (stringArray != null) break block18;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw nP.a(illegalArgumentException);
                            }
                            if (n11 == 0) break block19;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw nP.a(illegalArgumentException);
                        }
                        n11 = 4;
                        break block18;
                    }
                    n11 = 2;
                }
                return n11;
            }
            n10 = _12.r();
        }
        return n10;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u00f1\u00df\u00b7\u00e7\u0098\u0013\u0087\u00a1\u0000\u00d1\u00f7\u0004\u008dl\u0007x\u00b4\u0012\u0017\u008c5\u0013\b\u00e5_\u00ef\u0004\u00a4Cq\u0087!\u00d1\u008b]\u009a\u00b4\u00a21\u00b7\u0010.=\u00f9\r\u00f6\u00a8\u00f2\u00c0\u00cf\u0011\u0095\u00e3\u00bc\u0012\u0003\u0001\u00bby\u00abC\u00ec\u0007Y\u001e\u00b5LD\u00de-\u00d16\t\u00cf\u00fdSvc\u00e2\u00b9\u00cd>\u0007f\u00ee\u00e3,\u007f\u00e4E";
                        var12_3 = "\u00f1\u00df\u00b7\u00e7\u0098\u0013\u0087\u00a1\u0000\u00d1\u00f7\u0004\u008dl\u0007x\u00b4\u0012\u0017\u008c5\u0013\b\u00e5_\u00ef\u0004\u00a4Cq\u0087!\u00d1\u008b]\u009a\u00b4\u00a21\u00b7\u0010.=\u00f9\r\u00f6\u00a8\u00f2\u00c0\u00cf\u0011\u0095\u00e3\u00bc\u0012\u0003\u0001\u00bby\u00abC\u00ec\u0007Y\u001e\u00b5LD\u00de-\u00d16\t\u00cf\u00fdSvc\u00e2\u00b9\u00cd>\u0007f\u00ee\u00e3,\u007f\u00e4E".length();
                        var9_4 = 72;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 88;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u008c\u00d4\u0099L\u0017\u00cfo\tRO\u00c7\u0007\u00d6\u00eb(\u00cb+";
                            var12_3 = "\u008c\u00d4\u0099L\u0017\u00cfo\tRO\u00c7\u0007\u00d6\u00eb(\u00cb+".length();
                            var9_4 = 7;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 50;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 70;
                                    break;
                                }
                                case 1: {
                                    v15 = 35;
                                    break;
                                }
                                case 2: {
                                    v15 = 87;
                                    break;
                                }
                                case 3: {
                                    v15 = 8;
                                    break;
                                }
                                case 4: {
                                    v15 = 27;
                                    break;
                                }
                                case 5: {
                                    v15 = 106;
                                    break;
                                }
                                default: {
                                    v15 = 6;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                nP.a = var13;
                nP.b = new String[5];
                var0_7 = 7011778143450801173L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "?;\u0012\u00ed\u00f6~\u00ccA\u00b3&\u0085\u0003\u00f1g\u008a\u007f";
                var5_11 = "?;\u0012\u00ed\u00f6~\u00ccA\u00b3&\u0085\u0003\u00f1g\u008a\u007f".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        nP.d = var6_8;
        nP.e = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAA92) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 173;
                    break;
                }
                case 1: {
                    n14 = 211;
                    break;
                }
                case 2: {
                    n14 = 4;
                    break;
                }
                case 3: {
                    n14 = 195;
                    break;
                }
                case 4: {
                    n14 = 118;
                    break;
                }
                case 5: {
                    n14 = 79;
                    break;
                }
                case 6: {
                    n14 = 38;
                    break;
                }
                case 7: {
                    n14 = 16;
                    break;
                }
                case 8: {
                    n14 = 99;
                    break;
                }
                case 9: {
                    n14 = 166;
                    break;
                }
                case 10: {
                    n14 = 33;
                    break;
                }
                case 11: {
                    n14 = 234;
                    break;
                }
                case 12: {
                    n14 = 127;
                    break;
                }
                case 13: {
                    n14 = 218;
                    break;
                }
                case 14: {
                    n14 = 3;
                    break;
                }
                case 15: {
                    n14 = 110;
                    break;
                }
                case 16: {
                    n14 = 102;
                    break;
                }
                case 17: {
                    n14 = 36;
                    break;
                }
                case 18: {
                    n14 = 53;
                    break;
                }
                case 19: {
                    n14 = 57;
                    break;
                }
                case 20: {
                    n14 = 154;
                    break;
                }
                case 21: {
                    n14 = 117;
                    break;
                }
                case 22: {
                    n14 = 1;
                    break;
                }
                case 23: {
                    n14 = 65;
                    break;
                }
                case 24: {
                    n14 = 55;
                    break;
                }
                case 25: {
                    n14 = 84;
                    break;
                }
                case 26: {
                    n14 = 119;
                    break;
                }
                case 27: {
                    n14 = 58;
                    break;
                }
                case 28: {
                    n14 = 245;
                    break;
                }
                case 29: {
                    n14 = 164;
                    break;
                }
                case 30: {
                    n14 = 39;
                    break;
                }
                case 31: {
                    n14 = 229;
                    break;
                }
                case 32: {
                    n14 = 196;
                    break;
                }
                case 33: {
                    n14 = 188;
                    break;
                }
                case 34: {
                    n14 = 248;
                    break;
                }
                case 35: {
                    n14 = 70;
                    break;
                }
                case 36: {
                    n14 = 9;
                    break;
                }
                case 37: {
                    n14 = 230;
                    break;
                }
                case 38: {
                    n14 = 44;
                    break;
                }
                case 39: {
                    n14 = 148;
                    break;
                }
                case 40: {
                    n14 = 8;
                    break;
                }
                case 41: {
                    n14 = 242;
                    break;
                }
                case 42: {
                    n14 = 125;
                    break;
                }
                case 43: {
                    n14 = 29;
                    break;
                }
                case 44: {
                    n14 = 204;
                    break;
                }
                case 45: {
                    n14 = 143;
                    break;
                }
                case 46: {
                    n14 = 206;
                    break;
                }
                case 47: {
                    n14 = 181;
                    break;
                }
                case 48: {
                    n14 = 56;
                    break;
                }
                case 49: {
                    n14 = 30;
                    break;
                }
                case 50: {
                    n14 = 46;
                    break;
                }
                case 51: {
                    n14 = 205;
                    break;
                }
                case 52: {
                    n14 = 168;
                    break;
                }
                case 53: {
                    n14 = 74;
                    break;
                }
                case 54: {
                    n14 = 26;
                    break;
                }
                case 55: {
                    n14 = 48;
                    break;
                }
                case 56: {
                    n14 = 52;
                    break;
                }
                case 57: {
                    n14 = 86;
                    break;
                }
                case 58: {
                    n14 = 15;
                    break;
                }
                case 59: {
                    n14 = 122;
                    break;
                }
                case 60: {
                    n14 = 177;
                    break;
                }
                case 61: {
                    n14 = 250;
                    break;
                }
                case 62: {
                    n14 = 128;
                    break;
                }
                case 63: {
                    n14 = 232;
                    break;
                }
                case 64: {
                    n14 = 106;
                    break;
                }
                case 65: {
                    n14 = 223;
                    break;
                }
                case 66: {
                    n14 = 150;
                    break;
                }
                case 67: {
                    n14 = 5;
                    break;
                }
                case 68: {
                    n14 = 175;
                    break;
                }
                case 69: {
                    n14 = 191;
                    break;
                }
                case 70: {
                    n14 = 184;
                    break;
                }
                case 71: {
                    n14 = 222;
                    break;
                }
                case 72: {
                    n14 = 88;
                    break;
                }
                case 73: {
                    n14 = 236;
                    break;
                }
                case 74: {
                    n14 = 161;
                    break;
                }
                case 75: {
                    n14 = 146;
                    break;
                }
                case 76: {
                    n14 = 201;
                    break;
                }
                case 77: {
                    n14 = 247;
                    break;
                }
                case 78: {
                    n14 = 237;
                    break;
                }
                case 79: {
                    n14 = 96;
                    break;
                }
                case 80: {
                    n14 = 113;
                    break;
                }
                case 81: {
                    n14 = 231;
                    break;
                }
                case 82: {
                    n14 = 202;
                    break;
                }
                case 83: {
                    n14 = 149;
                    break;
                }
                case 84: {
                    n14 = 24;
                    break;
                }
                case 85: {
                    n14 = 121;
                    break;
                }
                case 86: {
                    n14 = 179;
                    break;
                }
                case 87: {
                    n14 = 253;
                    break;
                }
                case 88: {
                    n14 = 227;
                    break;
                }
                case 89: {
                    n14 = 95;
                    break;
                }
                case 90: {
                    n14 = 75;
                    break;
                }
                case 91: {
                    n14 = 112;
                    break;
                }
                case 92: {
                    n14 = 209;
                    break;
                }
                case 93: {
                    n14 = 137;
                    break;
                }
                case 94: {
                    n14 = 108;
                    break;
                }
                case 95: {
                    n14 = 152;
                    break;
                }
                case 96: {
                    n14 = 0;
                    break;
                }
                case 97: {
                    n14 = 187;
                    break;
                }
                case 98: {
                    n14 = 194;
                    break;
                }
                case 99: {
                    n14 = 47;
                    break;
                }
                case 100: {
                    n14 = 189;
                    break;
                }
                case 101: {
                    n14 = 165;
                    break;
                }
                case 102: {
                    n14 = 115;
                    break;
                }
                case 103: {
                    n14 = 193;
                    break;
                }
                case 104: {
                    n14 = 254;
                    break;
                }
                case 105: {
                    n14 = 37;
                    break;
                }
                case 106: {
                    n14 = 144;
                    break;
                }
                case 107: {
                    n14 = 31;
                    break;
                }
                case 108: {
                    n14 = 17;
                    break;
                }
                case 109: {
                    n14 = 235;
                    break;
                }
                case 110: {
                    n14 = 178;
                    break;
                }
                case 111: {
                    n14 = 216;
                    break;
                }
                case 112: {
                    n14 = 73;
                    break;
                }
                case 113: {
                    n14 = 186;
                    break;
                }
                case 114: {
                    n14 = 132;
                    break;
                }
                case 115: {
                    n14 = 228;
                    break;
                }
                case 116: {
                    n14 = 91;
                    break;
                }
                case 117: {
                    n14 = 19;
                    break;
                }
                case 118: {
                    n14 = 210;
                    break;
                }
                case 119: {
                    n14 = 198;
                    break;
                }
                case 120: {
                    n14 = 109;
                    break;
                }
                case 121: {
                    n14 = 87;
                    break;
                }
                case 122: {
                    n14 = 62;
                    break;
                }
                case 123: {
                    n14 = 120;
                    break;
                }
                case 124: {
                    n14 = 60;
                    break;
                }
                case 125: {
                    n14 = 169;
                    break;
                }
                case 126: {
                    n14 = 14;
                    break;
                }
                case 127: {
                    n14 = 83;
                    break;
                }
                case 128: {
                    n14 = 220;
                    break;
                }
                case 129: {
                    n14 = 42;
                    break;
                }
                case 130: {
                    n14 = 151;
                    break;
                }
                case 131: {
                    n14 = 107;
                    break;
                }
                case 132: {
                    n14 = 54;
                    break;
                }
                case 133: {
                    n14 = 35;
                    break;
                }
                case 134: {
                    n14 = 224;
                    break;
                }
                case 135: {
                    n14 = 124;
                    break;
                }
                case 136: {
                    n14 = 67;
                    break;
                }
                case 137: {
                    n14 = 185;
                    break;
                }
                case 138: {
                    n14 = 251;
                    break;
                }
                case 139: {
                    n14 = 22;
                    break;
                }
                case 140: {
                    n14 = 182;
                    break;
                }
                case 141: {
                    n14 = 142;
                    break;
                }
                case 142: {
                    n14 = 133;
                    break;
                }
                case 143: {
                    n14 = 92;
                    break;
                }
                case 144: {
                    n14 = 141;
                    break;
                }
                case 145: {
                    n14 = 156;
                    break;
                }
                case 146: {
                    n14 = 163;
                    break;
                }
                case 147: {
                    n14 = 43;
                    break;
                }
                case 148: {
                    n14 = 13;
                    break;
                }
                case 149: {
                    n14 = 213;
                    break;
                }
                case 150: {
                    n14 = 183;
                    break;
                }
                case 151: {
                    n14 = 239;
                    break;
                }
                case 152: {
                    n14 = 40;
                    break;
                }
                case 153: {
                    n14 = 82;
                    break;
                }
                case 154: {
                    n14 = 147;
                    break;
                }
                case 155: {
                    n14 = 90;
                    break;
                }
                case 156: {
                    n14 = 153;
                    break;
                }
                case 157: {
                    n14 = 111;
                    break;
                }
                case 158: {
                    n14 = 241;
                    break;
                }
                case 159: {
                    n14 = 85;
                    break;
                }
                case 160: {
                    n14 = 139;
                    break;
                }
                case 161: {
                    n14 = 100;
                    break;
                }
                case 162: {
                    n14 = 78;
                    break;
                }
                case 163: {
                    n14 = 126;
                    break;
                }
                case 164: {
                    n14 = 50;
                    break;
                }
                case 165: {
                    n14 = 176;
                    break;
                }
                case 166: {
                    n14 = 135;
                    break;
                }
                case 167: {
                    n14 = 240;
                    break;
                }
                case 168: {
                    n14 = 171;
                    break;
                }
                case 169: {
                    n14 = 77;
                    break;
                }
                case 170: {
                    n14 = 208;
                    break;
                }
                case 171: {
                    n14 = 140;
                    break;
                }
                case 172: {
                    n14 = 200;
                    break;
                }
                case 173: {
                    n14 = 252;
                    break;
                }
                case 174: {
                    n14 = 66;
                    break;
                }
                case 175: {
                    n14 = 114;
                    break;
                }
                case 176: {
                    n14 = 28;
                    break;
                }
                case 177: {
                    n14 = 192;
                    break;
                }
                case 178: {
                    n14 = 138;
                    break;
                }
                case 179: {
                    n14 = 63;
                    break;
                }
                case 180: {
                    n14 = 10;
                    break;
                }
                case 181: {
                    n14 = 172;
                    break;
                }
                case 182: {
                    n14 = 170;
                    break;
                }
                case 183: {
                    n14 = 98;
                    break;
                }
                case 184: {
                    n14 = 103;
                    break;
                }
                case 185: {
                    n14 = 2;
                    break;
                }
                case 186: {
                    n14 = 130;
                    break;
                }
                case 187: {
                    n14 = 71;
                    break;
                }
                case 188: {
                    n14 = 174;
                    break;
                }
                case 189: {
                    n14 = 155;
                    break;
                }
                case 190: {
                    n14 = 6;
                    break;
                }
                case 191: {
                    n14 = 167;
                    break;
                }
                case 192: {
                    n14 = 134;
                    break;
                }
                case 193: {
                    n14 = 23;
                    break;
                }
                case 194: {
                    n14 = 190;
                    break;
                }
                case 195: {
                    n14 = 238;
                    break;
                }
                case 196: {
                    n14 = 246;
                    break;
                }
                case 197: {
                    n14 = 101;
                    break;
                }
                case 198: {
                    n14 = 27;
                    break;
                }
                case 199: {
                    n14 = 158;
                    break;
                }
                case 200: {
                    n14 = 219;
                    break;
                }
                case 201: {
                    n14 = 7;
                    break;
                }
                case 202: {
                    n14 = 197;
                    break;
                }
                case 203: {
                    n14 = 131;
                    break;
                }
                case 204: {
                    n14 = 157;
                    break;
                }
                case 205: {
                    n14 = 217;
                    break;
                }
                case 206: {
                    n14 = 72;
                    break;
                }
                case 207: {
                    n14 = 215;
                    break;
                }
                case 208: {
                    n14 = 51;
                    break;
                }
                case 209: {
                    n14 = 162;
                    break;
                }
                case 210: {
                    n14 = 221;
                    break;
                }
                case 211: {
                    n14 = 41;
                    break;
                }
                case 212: {
                    n14 = 214;
                    break;
                }
                case 213: {
                    n14 = 89;
                    break;
                }
                case 214: {
                    n14 = 226;
                    break;
                }
                case 215: {
                    n14 = 129;
                    break;
                }
                case 216: {
                    n14 = 21;
                    break;
                }
                case 217: {
                    n14 = 212;
                    break;
                }
                case 218: {
                    n14 = 68;
                    break;
                }
                case 219: {
                    n14 = 20;
                    break;
                }
                case 220: {
                    n14 = 94;
                    break;
                }
                case 221: {
                    n14 = 180;
                    break;
                }
                case 222: {
                    n14 = 244;
                    break;
                }
                case 223: {
                    n14 = 45;
                    break;
                }
                case 224: {
                    n14 = 160;
                    break;
                }
                case 225: {
                    n14 = 203;
                    break;
                }
                case 226: {
                    n14 = 69;
                    break;
                }
                case 227: {
                    n14 = 145;
                    break;
                }
                case 228: {
                    n14 = 97;
                    break;
                }
                case 229: {
                    n14 = 116;
                    break;
                }
                case 230: {
                    n14 = 93;
                    break;
                }
                case 231: {
                    n14 = 136;
                    break;
                }
                case 232: {
                    n14 = 104;
                    break;
                }
                case 233: {
                    n14 = 18;
                    break;
                }
                case 234: {
                    n14 = 199;
                    break;
                }
                case 235: {
                    n14 = 34;
                    break;
                }
                case 236: {
                    n14 = 61;
                    break;
                }
                case 237: {
                    n14 = 81;
                    break;
                }
                case 238: {
                    n14 = 25;
                    break;
                }
                case 239: {
                    n14 = 159;
                    break;
                }
                case 240: {
                    n14 = 123;
                    break;
                }
                case 241: {
                    n14 = 12;
                    break;
                }
                case 242: {
                    n14 = 249;
                    break;
                }
                case 243: {
                    n14 = 105;
                    break;
                }
                case 244: {
                    n14 = 255;
                    break;
                }
                case 245: {
                    n14 = 80;
                    break;
                }
                case 246: {
                    n14 = 59;
                    break;
                }
                case 247: {
                    n14 = 76;
                    break;
                }
                case 248: {
                    n14 = 32;
                    break;
                }
                case 249: {
                    n14 = 243;
                    break;
                }
                case 250: {
                    n14 = 225;
                    break;
                }
                case 251: {
                    n14 = 233;
                    break;
                }
                case 252: {
                    n14 = 11;
                    break;
                }
                case 253: {
                    n14 = 64;
                    break;
                }
                case 254: {
                    n14 = 207;
                    break;
                }
                default: {
                    n14 = 49;
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
            nP.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xED2;
        if (e[n11] == null) {
            nP.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

