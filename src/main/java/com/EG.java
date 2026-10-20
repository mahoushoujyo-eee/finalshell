/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com.ay_0;
import com.dc_1;
import com.im_2;
import com.j_0;
import com.ky_2;
import com.lu_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class EG {
    private static final Logger E;
    private final im_2 L;
    private final int I;
    private final int V;
    private final Map Y = new HashMap();
    private final List J = new ArrayList();
    private dc_1 a;
    private int B;
    private static final String[] b;
    private static final String[] c;

    EG(@NotNull im_2 im_22, int n10, int n11) {
        this.L = im_22;
        this.I = n10;
        this.V = n11;
    }

    void W(@NotNull XE xE2) {
        this.Y.put(new ay_0(xE2, false), null);
    }

    void U(@NotNull XE xE2, boolean bl) {
        this.Y.put(new ay_0(xE2, bl), null);
    }

    @NotNull
    XE d(@NotNull XE xE2) {
        XE xE3;
        block10: {
            block11: {
                boolean bl;
                XE xE4;
                block8: {
                    block9: {
                        xE4 = (XE)this.Y.get(new ay_0(xE2, false));
                        bl = j_0.g();
                        try {
                            try {
                                xE3 = xE4;
                                if (!bl) break block8;
                                if (xE3 == null) break block9;
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                throw EG.a(indexOutOfBoundsException);
                            }
                            return xE4;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw EG.a(indexOutOfBoundsException);
                        }
                    }
                    xE3 = xE4 = (XE)this.Y.get(new ay_0(xE2, true));
                }
                try {
                    try {
                        if (!bl) break block10;
                        if (xE3 == null) break block11;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw EG.a(indexOutOfBoundsException);
                    }
                    return xE4;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
            }
            E.warn(EG.a(13500, -8636) + xE2);
            xE3 = xE2;
        }
        return xE3;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    void i() {
        block68: {
            block70: {
                block69: {
                    block62: {
                        block60: {
                            block56: {
                                block57: {
                                    block55: {
                                        block54: {
                                            block53: {
                                                block52: {
                                                    var2_1 = this.L.T();
                                                    var1_3 = j_0.g();
                                                    for (var3_2 = 0; var3_2 < var2_1.b(); ++var3_2) {
                                                        var4_4 = var2_1.t(var3_2);
                                                        try {
                                                            this.G((dc_1)var4_4);
                                                            if (var1_3) {
                                                                if (var1_3) continue;
                                                                break;
                                                            }
                                                            break block52;
                                                        }
                                                        catch (IndexOutOfBoundsException v0) {
                                                            throw EG.a(v0);
                                                        }
                                                    }
                                                    var3_2 = this.J.size() - 1;
                                                }
                                                try {
                                                    try {
                                                        v1 = this;
                                                        if (!var1_3) break block53;
                                                        if (v1.a == null) break block54;
                                                    }
                                                    catch (IndexOutOfBoundsException v2) {
                                                        throw EG.a(v2);
                                                    }
                                                    v1 = this;
                                                }
                                                catch (IndexOutOfBoundsException v3) {
                                                    throw EG.a(v3);
                                                }
                                            }
                                            try {
                                                try {
                                                    v4 = v1.B;
                                                    if (!var1_3) break block55;
                                                    if (v4 == this.I) {
                                                        // empty if block
                                                    }
                                                }
                                                catch (IndexOutOfBoundsException v5) {
                                                    throw EG.a(v5);
                                                }
                                            }
                                            catch (IndexOutOfBoundsException v6) {
                                                throw EG.a(v6);
                                            }
                                        }
                                        v4 = ++var3_2;
                                    }
                                    try {
                                        if (v4 < 0) {
                                            throw new IndexOutOfBoundsException(EG.a(13503, 21870) + var3_2);
                                        }
                                    }
                                    catch (IndexOutOfBoundsException v7) {
                                        throw EG.a(v7);
                                    }
                                    var4_4 = this.L.N();
                                    try {
                                        try {
                                            v8 = var4_4.b();
                                            v9 = this.L.O();
                                            if (!var1_3) break block56;
                                            if (v8 <= v9) break block57;
                                        }
                                        catch (IndexOutOfBoundsException v10) {
                                            throw EG.a(v10);
                                        }
                                        EG.E.warn(EG.a(13502, -25425) + this.L.O() + EG.a(13501, 8140) + var4_4.b());
                                    }
                                    catch (IndexOutOfBoundsException v11) {
                                        throw EG.a(v11);
                                    }
                                }
                                v8 = var4_4.b();
                                v9 = this.L.O();
                            }
                            var5_5 = Math.min(v8, v9);
                            for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                                var7_7 = this.M(var6_6);
                                v12 = var7_7.iterator();
                                if (!var1_3) ** GOTO lbl106
                                var8_9 = v12;
                                while (var8_9.hasNext()) {
                                    block58: {
                                        block59: {
                                            var9_10 = (ay_0)var8_9.next();
                                            var10_11 = (this.B + var9_10.S()) % this.I;
                                            var11_13 = this.J.size() + (this.B + var9_10.S()) / this.I;
                                            try {
                                                try {
                                                    v13 = this.a;
                                                    if (var1_3) {
                                                        if (!var1_3) break block58;
                                                    }
                                                    ** GOTO lbl112
                                                }
                                                catch (IndexOutOfBoundsException v14) {
                                                    throw EG.a(v14);
                                                }
                                                if (v13 == null) break block59;
                                            }
                                            catch (IndexOutOfBoundsException v15) {
                                                throw EG.a(v15);
                                            }
                                            --var11_13;
                                        }
                                        this.Y.put(var9_10, new XE(var10_11, var11_13));
                                    }
                                    if (var1_3) continue;
                                }
                                this.G(var4_4.t(var6_6));
                                if (var1_3) continue;
                            }
                            var6_6 = var5_5;
                            while (var6_6 < this.L.O()) {
                                block61: {
                                    var7_7 = this.M(var6_6);
                                    try {
                                        if (!var1_3) break block60;
                                        v12 = var7_7.iterator();
                                    }
                                    catch (IndexOutOfBoundsException v16) {
                                        throw EG.a(v16);
                                    }
lbl106:
                                    // 2 sources

                                    var8_9 = v12;
                                    while (var8_9.hasNext()) {
                                        var9_10 = (ay_0)var8_9.next();
                                        var10_11 = var9_10.S() % this.I;
                                        var11_13 = var6_6 - var5_5 + this.J.size() + var9_10.S() / this.I;
                                        v13 = this.Y.put(var9_10, new XE(var10_11, var11_13));
lbl112:
                                        // 2 sources

                                        try {
                                            if (var1_3) {
                                                if (var1_3) continue;
                                                break;
                                            }
                                            break block61;
                                        }
                                        catch (IndexOutOfBoundsException v17) {
                                            throw EG.a(v17);
                                        }
                                    }
                                    ++var6_6;
                                }
                                if (var1_3) continue;
                            }
                            var6_6 = this.K();
                        }
                        var7_8 = 0;
                        for (Object var9_10 : this.Y.entrySet()) {
                            block64: {
                                block63: {
                                    try {
                                        try {
                                            try {
                                                v18 = ((ay_0)var9_10.getKey()).p();
                                                if (!var1_3) break block62;
                                                if (!var1_3) break block63;
                                            }
                                            catch (IndexOutOfBoundsException v19) {
                                                throw EG.a(v19);
                                            }
                                            if (v18 == 0) break block64;
                                        }
                                        catch (IndexOutOfBoundsException v20) {
                                            throw EG.a(v20);
                                        }
                                        v21 = Math.max(var7_8, ((XE)var9_10.getValue()).r);
                                    }
                                    catch (IndexOutOfBoundsException v22) {
                                        throw EG.a(v22);
                                    }
                                }
                                var7_8 = v21;
                            }
                            if (var1_3) continue;
                        }
                        var3_2 = Math.max(var3_2, this.J.size() - Math.min(this.J.size(), this.V) - var6_6);
                        var3_2 = Math.min(var3_2, this.J.size() - Math.min(this.J.size(), this.V));
                        v18 = Math.max(var3_2, var7_8 - this.V + 1);
                    }
                    var3_2 = v18;
                    var2_1.D();
                    var2_1.O(this.J.subList(0, var3_2));
                    var4_4.D();
                    var4_4.O(this.J.subList(var3_2, Math.min(var3_2 + this.V, this.J.size())));
                    for (Object var9_10 : this.Y.entrySet()) {
                        block67: {
                            block65: {
                                var10_12 = (XE)var9_10.getValue();
                                try {
                                    block66: {
                                        try {
                                            try {
                                                v23 /* !! */  = var10_12;
                                                if (!var1_3) break block65;
                                                if (v23 /* !! */  == null) break block66;
                                            }
                                            catch (IndexOutOfBoundsException v24) {
                                                throw EG.a(v24);
                                            }
                                            var10_12.r -= var3_2;
                                            if (var1_3) break block67;
                                        }
                                        catch (IndexOutOfBoundsException v25) {
                                            throw EG.a(v25);
                                        }
                                    }
                                    v23 /* !! */  = var9_10.getKey();
                                }
                                catch (IndexOutOfBoundsException v26) {
                                    throw EG.a(v26);
                                }
                            }
                            var11_15 = (ay_0)v23 /* !! */ ;
                            var10_12 = new XE(var11_15.S(), var11_15.r());
                            var9_10.setValue(var10_12);
                        }
                        var10_12.q = Math.min(this.I, Math.max(0, var10_12.q));
                        var10_12.r = Math.min(this.V, Math.max(0, var10_12.r));
                        if (var1_3) continue;
                    }
                    try {
                        try {
                            if (ky_2.F() == null) break block68;
                            if (!var1_3) break block69;
                        }
                        catch (IndexOutOfBoundsException v27) {
                            throw EG.a(v27);
                        }
                        v28 = false;
                        break block70;
                    }
                    catch (IndexOutOfBoundsException v29) {
                        throw EG.a(v29);
                    }
                }
                v28 = true;
            }
            j_0.q(v28);
        }
    }

    private int K() {
        int n10;
        block7: {
            int n11;
            boolean bl = j_0.g();
            for (n11 = 0; n11 < this.J.size(); ++n11) {
                try {
                    try {
                        try {
                            n10 = ((dc_1)this.J.get(this.J.size() - n11 - 1)).V() ? 1 : 0;
                            if (!bl || !bl) break block7;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw EG.a(indexOutOfBoundsException);
                        }
                        if (n10 == 0) break;
                        continue;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw EG.a(indexOutOfBoundsException);
                    }
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    @NotNull
    private List M(int n10) {
        List list = Collections.emptyList();
        Iterator iterator = this.Y.keySet().iterator();
        boolean bl = j_0.g();
        while (iterator.hasNext()) {
            block8: {
                int n11;
                ay_0 ay_02;
                block9: {
                    block7: {
                        ay_02 = (ay_0)iterator.next();
                        try {
                            try {
                                n11 = ay_02.r();
                                if (!bl) break block7;
                                if (n11 != n10) break block8;
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                throw EG.a(indexOutOfBoundsException);
                            }
                            n11 = list.isEmpty() ? 1 : 0;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw EG.a(indexOutOfBoundsException);
                        }
                    }
                    try {
                        if (!bl) break block8;
                        if (n11 == 0) break block9;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw EG.a(indexOutOfBoundsException);
                    }
                    list = new ArrayList();
                }
                n11 = list.add(ay_02) ? 1 : 0;
            }
            if (bl) continue;
        }
        return list;
    }

    private void G(@NotNull dc_1 dc_12) {
        block17: {
            block16: {
                boolean bl;
                block12: {
                    boolean bl2;
                    block13: {
                        EG eG;
                        block14: {
                            block15: {
                                bl2 = j_0.P();
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = dc_12.V();
                                                if (bl2) break block12;
                                                if (!bl) break block13;
                                            }
                                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                                throw EG.a(indexOutOfBoundsException);
                                            }
                                            eG = this;
                                            if (bl2) break block14;
                                        }
                                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                            throw EG.a(indexOutOfBoundsException);
                                        }
                                        if (eG.a == null) break block15;
                                    }
                                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                        throw EG.a(indexOutOfBoundsException);
                                    }
                                    this.a = null;
                                    this.B = 0;
                                }
                                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                    throw EG.a(indexOutOfBoundsException);
                                }
                            }
                            eG = this;
                        }
                        eG.J.add(dc_1.v());
                        return;
                    }
                    try {
                        dc_12.R(this::lambda$addLine$0);
                        if (bl2) break block16;
                        bl = dc_12.G();
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw EG.a(indexOutOfBoundsException);
                    }
                }
                try {
                    if (bl) break block17;
                    this.a = null;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
            }
            this.B = 0;
        }
    }

    @NotNull
    private static lu_2 m(@NotNull lu_2 lu_22, int n10, int n11) {
        block6: {
            int n12;
            block5: {
                boolean bl = j_0.P();
                try {
                    n12 = n10;
                    if (bl) break block5;
                    if (n12 != 0) break block6;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
                n12 = n11;
            }
            try {
                if (n12 == lu_22.s()) {
                    return lu_22;
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw EG.a(indexOutOfBoundsException);
            }
        }
        return new lu_2(lu_22.j(), lu_22.v().Y(n10, n11));
    }

    private void lambda$addLine$0(lu_2 lu_22) {
        int n10;
        boolean bl;
        block16: {
            int n11;
            block17: {
                bl = j_0.g();
                try {
                    n11 = lu_22.V();
                    if (!bl) break block16;
                    if (n11 == 0) break block17;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
                return;
            }
            n11 = n10 = 0;
        }
        while (n10 < lu_22.s()) {
            EG eG;
            block21: {
                dc_1 dc_12;
                block18: {
                    block20: {
                        block19: {
                            try {
                                try {
                                    try {
                                        try {
                                            dc_12 = this.a;
                                            if (!bl) break block18;
                                            if (dc_12 == null) break block19;
                                        }
                                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                            throw EG.a(indexOutOfBoundsException);
                                        }
                                        eG = this;
                                        if (!bl) break block20;
                                    }
                                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                        throw EG.a(indexOutOfBoundsException);
                                    }
                                    if (eG.B != this.I) break block19;
                                }
                                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                    throw EG.a(indexOutOfBoundsException);
                                }
                                this.a.M(true);
                                this.a = null;
                                this.B = 0;
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                throw EG.a(indexOutOfBoundsException);
                            }
                        }
                        eG = this;
                    }
                    try {
                        if (!bl) break block21;
                        dc_12 = eG.a;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw EG.a(indexOutOfBoundsException);
                    }
                }
                try {
                    if (dc_12 == null) {
                        this.a = new dc_1();
                        this.B = 0;
                        this.J.add(this.a);
                    }
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw EG.a(indexOutOfBoundsException);
                }
                eG = this;
            }
            int n12 = Math.min(eG.I - this.B, lu_22.s() - n10);
            lu_2 lu_23 = EG.m(lu_22, n10, n12);
            this.a.s(lu_23);
            this.B += n12;
            n10 += n12;
            if (bl) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "\u00ac\b~6@\u0081NI\u00e4%\u00f8\u0007k8@\u00a6\u0088\u0002\u00d9\u00b6,F?\u00e0\u001e\u009f\u008d\n\u00d0Y\u001778\u00a8\u00f7D\u00ce\u00ca\u0080G\u00b7[2Ge\\\u00bb:\u00e3T\u00c6\u00d6l\\ \u00d8\u008b\u00ed_\u00abGy\u009b\u0018\u00dc";
                var4_3 = "\u00ac\b~6@\u0081NI\u00e4%\u00f8\u0007k8@\u00a6\u0088\u0002\u00d9\u00b6,F?\u00e0\u001e\u009f\u008d\n\u00d0Y\u001778\u00a8\u00f7D\u00ce\u00ca\u0080G\u00b7[2Ge\\\u00bb:\u00e3T\u00c6\u00d6l\\ \u00d8\u008b\u00ed_\u00abGy\u009b\u0018\u00dc".length();
                var1_4 = 20;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 67;
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
                    var2_2 = "\u001b\u0085\u00b6\u0013\u00d24x,\u0002fRhL\u00b6\u00e3\u00bcQU\u00c6f9]~";
                    var4_3 = "\u001b\u0085\u00b6\u0013\u00d24x,\u0002fRhL\u00b6\u00e3\u00bcQU\u00c6f9]~".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 112;
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
                            v15 = 13;
                            break;
                        }
                        case 1: {
                            v15 = 80;
                            break;
                        }
                        case 2: {
                            v15 = 14;
                            break;
                        }
                        case 3: {
                            v15 = 124;
                            break;
                        }
                        case 4: {
                            v15 = 60;
                            break;
                        }
                        case 5: {
                            v15 = 68;
                            break;
                        }
                        default: {
                            v15 = 112;
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
        EG.b = var5;
        EG.c = new String[4];
        EG.E = LoggerFactory.getLogger(im_2.class);
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x34BF) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 73;
                    break;
                }
                case 1: {
                    n14 = 234;
                    break;
                }
                case 2: {
                    n14 = 229;
                    break;
                }
                case 3: {
                    n14 = 43;
                    break;
                }
                case 4: {
                    n14 = 36;
                    break;
                }
                case 5: {
                    n14 = 232;
                    break;
                }
                case 6: {
                    n14 = 185;
                    break;
                }
                case 7: {
                    n14 = 241;
                    break;
                }
                case 8: {
                    n14 = 83;
                    break;
                }
                case 9: {
                    n14 = 143;
                    break;
                }
                case 10: {
                    n14 = 110;
                    break;
                }
                case 11: {
                    n14 = 245;
                    break;
                }
                case 12: {
                    n14 = 145;
                    break;
                }
                case 13: {
                    n14 = 239;
                    break;
                }
                case 14: {
                    n14 = 179;
                    break;
                }
                case 15: {
                    n14 = 205;
                    break;
                }
                case 16: {
                    n14 = 10;
                    break;
                }
                case 17: {
                    n14 = 24;
                    break;
                }
                case 18: {
                    n14 = 37;
                    break;
                }
                case 19: {
                    n14 = 184;
                    break;
                }
                case 20: {
                    n14 = 203;
                    break;
                }
                case 21: {
                    n14 = 189;
                    break;
                }
                case 22: {
                    n14 = 225;
                    break;
                }
                case 23: {
                    n14 = 181;
                    break;
                }
                case 24: {
                    n14 = 68;
                    break;
                }
                case 25: {
                    n14 = 114;
                    break;
                }
                case 26: {
                    n14 = 39;
                    break;
                }
                case 27: {
                    n14 = 8;
                    break;
                }
                case 28: {
                    n14 = 202;
                    break;
                }
                case 29: {
                    n14 = 89;
                    break;
                }
                case 30: {
                    n14 = 127;
                    break;
                }
                case 31: {
                    n14 = 29;
                    break;
                }
                case 32: {
                    n14 = 57;
                    break;
                }
                case 33: {
                    n14 = 95;
                    break;
                }
                case 34: {
                    n14 = 21;
                    break;
                }
                case 35: {
                    n14 = 140;
                    break;
                }
                case 36: {
                    n14 = 201;
                    break;
                }
                case 37: {
                    n14 = 135;
                    break;
                }
                case 38: {
                    n14 = 18;
                    break;
                }
                case 39: {
                    n14 = 240;
                    break;
                }
                case 40: {
                    n14 = 16;
                    break;
                }
                case 41: {
                    n14 = 177;
                    break;
                }
                case 42: {
                    n14 = 125;
                    break;
                }
                case 43: {
                    n14 = 49;
                    break;
                }
                case 44: {
                    n14 = 238;
                    break;
                }
                case 45: {
                    n14 = 86;
                    break;
                }
                case 46: {
                    n14 = 77;
                    break;
                }
                case 47: {
                    n14 = 90;
                    break;
                }
                case 48: {
                    n14 = 2;
                    break;
                }
                case 49: {
                    n14 = 218;
                    break;
                }
                case 50: {
                    n14 = 172;
                    break;
                }
                case 51: {
                    n14 = 32;
                    break;
                }
                case 52: {
                    n14 = 22;
                    break;
                }
                case 53: {
                    n14 = 192;
                    break;
                }
                case 54: {
                    n14 = 236;
                    break;
                }
                case 55: {
                    n14 = 146;
                    break;
                }
                case 56: {
                    n14 = 222;
                    break;
                }
                case 57: {
                    n14 = 151;
                    break;
                }
                case 58: {
                    n14 = 250;
                    break;
                }
                case 59: {
                    n14 = 139;
                    break;
                }
                case 60: {
                    n14 = 38;
                    break;
                }
                case 61: {
                    n14 = 252;
                    break;
                }
                case 62: {
                    n14 = 219;
                    break;
                }
                case 63: {
                    n14 = 7;
                    break;
                }
                case 64: {
                    n14 = 53;
                    break;
                }
                case 65: {
                    n14 = 153;
                    break;
                }
                case 66: {
                    n14 = 227;
                    break;
                }
                case 67: {
                    n14 = 48;
                    break;
                }
                case 68: {
                    n14 = 112;
                    break;
                }
                case 69: {
                    n14 = 5;
                    break;
                }
                case 70: {
                    n14 = 251;
                    break;
                }
                case 71: {
                    n14 = 54;
                    break;
                }
                case 72: {
                    n14 = 188;
                    break;
                }
                case 73: {
                    n14 = 244;
                    break;
                }
                case 74: {
                    n14 = 25;
                    break;
                }
                case 75: {
                    n14 = 6;
                    break;
                }
                case 76: {
                    n14 = 242;
                    break;
                }
                case 77: {
                    n14 = 119;
                    break;
                }
                case 78: {
                    n14 = 64;
                    break;
                }
                case 79: {
                    n14 = 228;
                    break;
                }
                case 80: {
                    n14 = 158;
                    break;
                }
                case 81: {
                    n14 = 224;
                    break;
                }
                case 82: {
                    n14 = 206;
                    break;
                }
                case 83: {
                    n14 = 42;
                    break;
                }
                case 84: {
                    n14 = 174;
                    break;
                }
                case 85: {
                    n14 = 47;
                    break;
                }
                case 86: {
                    n14 = 199;
                    break;
                }
                case 87: {
                    n14 = 175;
                    break;
                }
                case 88: {
                    n14 = 9;
                    break;
                }
                case 89: {
                    n14 = 155;
                    break;
                }
                case 90: {
                    n14 = 93;
                    break;
                }
                case 91: {
                    n14 = 76;
                    break;
                }
                case 92: {
                    n14 = 96;
                    break;
                }
                case 93: {
                    n14 = 253;
                    break;
                }
                case 94: {
                    n14 = 91;
                    break;
                }
                case 95: {
                    n14 = 148;
                    break;
                }
                case 96: {
                    n14 = 193;
                    break;
                }
                case 97: {
                    n14 = 166;
                    break;
                }
                case 98: {
                    n14 = 44;
                    break;
                }
                case 99: {
                    n14 = 23;
                    break;
                }
                case 100: {
                    n14 = 75;
                    break;
                }
                case 101: {
                    n14 = 124;
                    break;
                }
                case 102: {
                    n14 = 134;
                    break;
                }
                case 103: {
                    n14 = 150;
                    break;
                }
                case 104: {
                    n14 = 88;
                    break;
                }
                case 105: {
                    n14 = 128;
                    break;
                }
                case 106: {
                    n14 = 247;
                    break;
                }
                case 107: {
                    n14 = 20;
                    break;
                }
                case 108: {
                    n14 = 19;
                    break;
                }
                case 109: {
                    n14 = 173;
                    break;
                }
                case 110: {
                    n14 = 226;
                    break;
                }
                case 111: {
                    n14 = 61;
                    break;
                }
                case 112: {
                    n14 = 233;
                    break;
                }
                case 113: {
                    n14 = 164;
                    break;
                }
                case 114: {
                    n14 = 51;
                    break;
                }
                case 115: {
                    n14 = 74;
                    break;
                }
                case 116: {
                    n14 = 190;
                    break;
                }
                case 117: {
                    n14 = 56;
                    break;
                }
                case 118: {
                    n14 = 176;
                    break;
                }
                case 119: {
                    n14 = 161;
                    break;
                }
                case 120: {
                    n14 = 79;
                    break;
                }
                case 121: {
                    n14 = 220;
                    break;
                }
                case 122: {
                    n14 = 59;
                    break;
                }
                case 123: {
                    n14 = 133;
                    break;
                }
                case 124: {
                    n14 = 27;
                    break;
                }
                case 125: {
                    n14 = 26;
                    break;
                }
                case 126: {
                    n14 = 136;
                    break;
                }
                case 127: {
                    n14 = 254;
                    break;
                }
                case 128: {
                    n14 = 117;
                    break;
                }
                case 129: {
                    n14 = 113;
                    break;
                }
                case 130: {
                    n14 = 72;
                    break;
                }
                case 131: {
                    n14 = 98;
                    break;
                }
                case 132: {
                    n14 = 71;
                    break;
                }
                case 133: {
                    n14 = 171;
                    break;
                }
                case 134: {
                    n14 = 115;
                    break;
                }
                case 135: {
                    n14 = 183;
                    break;
                }
                case 136: {
                    n14 = 235;
                    break;
                }
                case 137: {
                    n14 = 178;
                    break;
                }
                case 138: {
                    n14 = 132;
                    break;
                }
                case 139: {
                    n14 = 30;
                    break;
                }
                case 140: {
                    n14 = 81;
                    break;
                }
                case 141: {
                    n14 = 196;
                    break;
                }
                case 142: {
                    n14 = 210;
                    break;
                }
                case 143: {
                    n14 = 198;
                    break;
                }
                case 144: {
                    n14 = 223;
                    break;
                }
                case 145: {
                    n14 = 231;
                    break;
                }
                case 146: {
                    n14 = 248;
                    break;
                }
                case 147: {
                    n14 = 154;
                    break;
                }
                case 148: {
                    n14 = 70;
                    break;
                }
                case 149: {
                    n14 = 35;
                    break;
                }
                case 150: {
                    n14 = 102;
                    break;
                }
                case 151: {
                    n14 = 82;
                    break;
                }
                case 152: {
                    n14 = 17;
                    break;
                }
                case 153: {
                    n14 = 34;
                    break;
                }
                case 154: {
                    n14 = 66;
                    break;
                }
                case 155: {
                    n14 = 1;
                    break;
                }
                case 156: {
                    n14 = 168;
                    break;
                }
                case 157: {
                    n14 = 182;
                    break;
                }
                case 158: {
                    n14 = 103;
                    break;
                }
                case 159: {
                    n14 = 207;
                    break;
                }
                case 160: {
                    n14 = 15;
                    break;
                }
                case 161: {
                    n14 = 85;
                    break;
                }
                case 162: {
                    n14 = 111;
                    break;
                }
                case 163: {
                    n14 = 204;
                    break;
                }
                case 164: {
                    n14 = 211;
                    break;
                }
                case 165: {
                    n14 = 62;
                    break;
                }
                case 166: {
                    n14 = 191;
                    break;
                }
                case 167: {
                    n14 = 97;
                    break;
                }
                case 168: {
                    n14 = 215;
                    break;
                }
                case 169: {
                    n14 = 123;
                    break;
                }
                case 170: {
                    n14 = 167;
                    break;
                }
                case 171: {
                    n14 = 131;
                    break;
                }
                case 172: {
                    n14 = 52;
                    break;
                }
                case 173: {
                    n14 = 106;
                    break;
                }
                case 174: {
                    n14 = 142;
                    break;
                }
                case 175: {
                    n14 = 99;
                    break;
                }
                case 176: {
                    n14 = 63;
                    break;
                }
                case 177: {
                    n14 = 156;
                    break;
                }
                case 178: {
                    n14 = 40;
                    break;
                }
                case 179: {
                    n14 = 195;
                    break;
                }
                case 180: {
                    n14 = 144;
                    break;
                }
                case 181: {
                    n14 = 213;
                    break;
                }
                case 182: {
                    n14 = 216;
                    break;
                }
                case 183: {
                    n14 = 157;
                    break;
                }
                case 184: {
                    n14 = 186;
                    break;
                }
                case 185: {
                    n14 = 237;
                    break;
                }
                case 186: {
                    n14 = 137;
                    break;
                }
                case 187: {
                    n14 = 120;
                    break;
                }
                case 188: {
                    n14 = 197;
                    break;
                }
                case 189: {
                    n14 = 60;
                    break;
                }
                case 190: {
                    n14 = 45;
                    break;
                }
                case 191: {
                    n14 = 33;
                    break;
                }
                case 192: {
                    n14 = 212;
                    break;
                }
                case 193: {
                    n14 = 46;
                    break;
                }
                case 194: {
                    n14 = 187;
                    break;
                }
                case 195: {
                    n14 = 80;
                    break;
                }
                case 196: {
                    n14 = 147;
                    break;
                }
                case 197: {
                    n14 = 108;
                    break;
                }
                case 198: {
                    n14 = 104;
                    break;
                }
                case 199: {
                    n14 = 170;
                    break;
                }
                case 200: {
                    n14 = 58;
                    break;
                }
                case 201: {
                    n14 = 194;
                    break;
                }
                case 202: {
                    n14 = 126;
                    break;
                }
                case 203: {
                    n14 = 141;
                    break;
                }
                case 204: {
                    n14 = 11;
                    break;
                }
                case 205: {
                    n14 = 0;
                    break;
                }
                case 206: {
                    n14 = 152;
                    break;
                }
                case 207: {
                    n14 = 105;
                    break;
                }
                case 208: {
                    n14 = 50;
                    break;
                }
                case 209: {
                    n14 = 67;
                    break;
                }
                case 210: {
                    n14 = 249;
                    break;
                }
                case 211: {
                    n14 = 230;
                    break;
                }
                case 212: {
                    n14 = 4;
                    break;
                }
                case 213: {
                    n14 = 69;
                    break;
                }
                case 214: {
                    n14 = 87;
                    break;
                }
                case 215: {
                    n14 = 101;
                    break;
                }
                case 216: {
                    n14 = 180;
                    break;
                }
                case 217: {
                    n14 = 163;
                    break;
                }
                case 218: {
                    n14 = 31;
                    break;
                }
                case 219: {
                    n14 = 12;
                    break;
                }
                case 220: {
                    n14 = 55;
                    break;
                }
                case 221: {
                    n14 = 107;
                    break;
                }
                case 222: {
                    n14 = 121;
                    break;
                }
                case 223: {
                    n14 = 209;
                    break;
                }
                case 224: {
                    n14 = 217;
                    break;
                }
                case 225: {
                    n14 = 94;
                    break;
                }
                case 226: {
                    n14 = 221;
                    break;
                }
                case 227: {
                    n14 = 14;
                    break;
                }
                case 228: {
                    n14 = 130;
                    break;
                }
                case 229: {
                    n14 = 160;
                    break;
                }
                case 230: {
                    n14 = 92;
                    break;
                }
                case 231: {
                    n14 = 116;
                    break;
                }
                case 232: {
                    n14 = 129;
                    break;
                }
                case 233: {
                    n14 = 169;
                    break;
                }
                case 234: {
                    n14 = 3;
                    break;
                }
                case 235: {
                    n14 = 78;
                    break;
                }
                case 236: {
                    n14 = 41;
                    break;
                }
                case 237: {
                    n14 = 200;
                    break;
                }
                case 238: {
                    n14 = 84;
                    break;
                }
                case 239: {
                    n14 = 243;
                    break;
                }
                case 240: {
                    n14 = 118;
                    break;
                }
                case 241: {
                    n14 = 208;
                    break;
                }
                case 242: {
                    n14 = 28;
                    break;
                }
                case 243: {
                    n14 = 159;
                    break;
                }
                case 244: {
                    n14 = 214;
                    break;
                }
                case 245: {
                    n14 = 246;
                    break;
                }
                case 246: {
                    n14 = 138;
                    break;
                }
                case 247: {
                    n14 = 65;
                    break;
                }
                case 248: {
                    n14 = 162;
                    break;
                }
                case 249: {
                    n14 = 100;
                    break;
                }
                case 250: {
                    n14 = 165;
                    break;
                }
                case 251: {
                    n14 = 13;
                    break;
                }
                case 252: {
                    n14 = 109;
                    break;
                }
                case 253: {
                    n14 = 149;
                    break;
                }
                case 254: {
                    n14 = 122;
                    break;
                }
                default: {
                    n14 = 255;
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
            EG.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

