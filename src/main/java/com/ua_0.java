/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YP;
import com.dc_1;
import com.in_2;
import com.j_0;
import com.lf_0;
import com.lu_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from com.ua
 */
public class ua_0 {
    private static final Logger X;
    private int B;
    private ArrayList t;
    @Nullable
    private final in_2 s;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public ua_0(@Nullable in_2 in_22) {
        this.B = ua_0.a(31164, 1942292152647473124L);
        this.t = new ArrayList();
        this.s = in_22;
    }

    public ua_0(int n10, @Nullable in_2 in_22) {
        this.B = ua_0.a(16237, 5545974350394495284L);
        this.t = new ArrayList();
        this.B = n10;
        this.s = in_22;
    }

    public synchronized String O() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        Iterator iterator = this.t.iterator();
        boolean bl2 = j_0.g();
        while (iterator.hasNext()) {
            block5: {
                boolean bl3;
                dc_1 dc_12;
                block6: {
                    dc_12 = (dc_1)iterator.next();
                    try {
                        try {
                            bl3 = bl;
                            if (!bl2) break block5;
                            if (bl3) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        stringBuilder.append("\n");
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                }
                stringBuilder.append(dc_12.V());
                bl3 = bl = false;
            }
            if (bl2) continue;
        }
        return stringBuilder.toString();
    }

    public synchronized void M(@NotNull YP yP, @NotNull j_0 j_02) {
        this.N(new lu_2(yP, j_02));
    }

    private synchronized void N(@NotNull lu_2 lu_22) {
        this.P(new dc_1(lu_22));
    }

    private synchronized void P(@NotNull dc_1 dc_12) {
        block8: {
            int n10;
            block9: {
                boolean bl = j_0.g();
                try {
                    try {
                        try {
                            try {
                                n10 = this.B;
                                if (!bl) break block8;
                                if (n10 <= 0) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ua_0.a(illegalArgumentException);
                            }
                            n10 = this.t.size();
                            if (!bl) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        if (n10 < this.B) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    this.F(1);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            n10 = this.t.add(dc_12) ? 1 : 0;
        }
    }

    public synchronized int b() {
        return this.t.size();
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void F(int var1_1) {
        block9: {
            block8: {
                var2_2 = j_0.P();
                try {
                    try {
                        if (var2_2) break block8;
                        if (var1_1 >= this.t.size()) {
                        }
                        ** GOTO lbl17
                    }
                    catch (IllegalArgumentException v0) {
                        throw ua_0.a(v0);
                    }
                    this.t = new ArrayList<E>();
                }
                catch (IllegalArgumentException v1) {
                    throw ua_0.a(v1);
                }
            }
            try {
                if (!var2_2) break block9;
lbl17:
                // 2 sources

                this.t = new ArrayList<E>(this.t.subList(var1_1, this.t.size()));
            }
            catch (IllegalArgumentException v2) {
                throw ua_0.a(v2);
            }
        }
    }

    public String U(int n10) {
        dc_1 dc_12 = this.t(n10);
        return dc_12.V();
    }

    public synchronized void D(int n10, int n11, int n12, @NotNull lu_2 lu_22) {
        block13: {
            int n13;
            ua_0 ua_02;
            boolean bl;
            ua_0 ua_03;
            block11: {
                int n14;
                block12: {
                    ua_03 = new ua_0(this.s);
                    bl = j_0.g();
                    try {
                        if (n12 < this.b() - 1) {
                            this.U(this.b() - n12 - 1, ua_03);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    ua_02 = new ua_0(this.s);
                    try {
                        try {
                            n14 = n10;
                            if (!bl) break block11;
                            if (n14 <= 0) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        this.Q(n10, ua_02);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                }
                n14 = n13 = 0;
            }
            while (n13 < n11) {
                try {
                    ua_02.N(lu_22);
                    ++n13;
                    if (bl) {
                        if (bl) continue;
                        break;
                    }
                    break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            ua_02.U(ua_02.b(), this);
            this.z(n11);
            ua_03.Q(ua_03.b(), this);
        }
    }

    public synchronized ua_0 K(int n10, int n11, int n12, @NotNull lu_2 lu_22) {
        ua_0 ua_02;
        block13: {
            int n13;
            ua_0 ua_03;
            boolean bl;
            ua_0 ua_04;
            block11: {
                block12: {
                    ua_04 = new ua_0(this.s);
                    bl = j_0.g();
                    try {
                        if (n12 < this.b() - 1) {
                            this.U(this.b() - n12 - 1, ua_04);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    ua_03 = new ua_0(this.s);
                    try {
                        try {
                            n13 = n10;
                            if (!bl) break block11;
                            if (n13 <= 0) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        this.Q(n10, ua_03);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                }
                n13 = Math.min(n11, this.b());
            }
            int n14 = n13;
            ua_02 = new ua_0(this.s);
            this.Q(n14, ua_02);
            ua_03.U(ua_03.b(), this);
            for (int i2 = 0; i2 < n14; ++i2) {
                try {
                    this.N(lu_22);
                    if (bl) {
                        if (bl) continue;
                        break;
                    }
                    break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            ua_04.Q(ua_04.b(), this);
        }
        return ua_02;
    }

    public synchronized void S(int n10, int n11, j_0 j_02, @NotNull YP yP) {
        block5: {
            in_2 in_22;
            dc_1 dc_12;
            block4: {
                dc_12 = this.t(n11);
                boolean bl = j_0.g();
                dc_12.W(n10, j_02, yP);
                boolean bl2 = bl;
                try {
                    try {
                        in_22 = this.s;
                        if (!bl2) break block4;
                        if (in_22 == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    in_22 = this.s;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            in_22.U(this, dc_12);
        }
    }

    public synchronized void b(int n10, int n11, @NotNull lu_2 lu_22) {
        boolean bl = j_0.g();
        for (int i2 = n10; i2 <= n11; ++i2) {
            this.t(i2).c(lu_22);
            if (bl) continue;
        }
    }

    public synchronized void D() {
        this.t.clear();
    }

    public synchronized void Z(int n10, int n11, int n12, @NotNull YP yP) {
        dc_1 dc_12 = this.t(n11);
        dc_12.R(n10, n12, yP);
    }

    public synchronized void w(int n10, int n11, int n12, int n13, @NotNull YP yP) {
        dc_1 dc_12 = this.t(n11);
        dc_12.j(n10, n12, n13, yP);
    }

    public synchronized void k(int n10, int n11, int n12, int n13, @NotNull YP yP) {
        boolean bl = j_0.g();
        for (int i2 = n11; i2 < n13; ++i2) {
            dc_1 dc_12 = this.t(i2);
            dc_12.A(n10, n12, yP);
            if (bl) continue;
        }
    }

    public synchronized void A(int n10, int n11, @NotNull lf_0 lf_02) {
        this.t(n10, n11, lf_02, -this.b());
    }

    public synchronized void t(int n10, int n11, @NotNull lf_0 lf_02, int n12) {
        int n13;
        boolean bl;
        block5: {
            int n14;
            block6: {
                bl = j_0.g();
                try {
                    try {
                        n14 = n10;
                        if (!bl) break block5;
                        if (n14 >= 0) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(ua_0.a(4320, 6895) + n10 + ua_0.a(4323, -30427));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            n14 = n13 = n10;
        }
        while (n13 < Math.min(n10 + n11, this.t.size())) {
            ((dc_1)this.t.get(n13)).l(n13, lf_02, n12);
            ++n13;
            if (bl) continue;
        }
    }

    public synchronized void Q(int n10, @NotNull ua_0 ua_02) {
        n10 = Math.min(n10, this.b());
        ua_02.O(this.t.subList(0, n10));
        this.F(n10);
    }

    public synchronized void O(@NotNull List list) {
        block10: {
            int n10;
            block11: {
                int n11;
                int n12;
                boolean bl;
                block12: {
                    block13: {
                        bl = j_0.P();
                        try {
                            try {
                                try {
                                    n10 = this.B;
                                    if (bl) break block10;
                                    if (n10 <= 0) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ua_0.a(illegalArgumentException);
                                }
                                n12 = list.size();
                                n11 = this.B;
                                if (bl) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ua_0.a(illegalArgumentException);
                            }
                            if (n12 < n11) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        int n13 = list.size() - this.B;
                        this.t = new ArrayList(list.subList(n13, list.size()));
                        return;
                    }
                    n12 = this.t.size();
                    n11 = list.size();
                }
                int n14 = n12 + n11;
                try {
                    try {
                        n10 = n14;
                        if (bl) break block10;
                        if (n10 < this.B) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                    this.F(n14 - this.B);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            n10 = this.t.addAll(list) ? 1 : 0;
        }
    }

    @NotNull
    public synchronized dc_1 t(int n10) {
        ua_0 ua_02;
        block10: {
            int n11;
            boolean bl;
            block8: {
                int n12;
                block9: {
                    bl = j_0.g();
                    try {
                        try {
                            n12 = n10;
                            if (!bl) break block8;
                            if (n12 >= 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ua_0.a(illegalArgumentException);
                        }
                        X.error(ua_0.a(4322, 6255) + n10);
                        return dc_1.v();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                }
                n12 = n11 = this.b();
            }
            while (n11 <= n10) {
                try {
                    ua_02 = this;
                    if (bl) {
                        ua_02.P(dc_1.v());
                        ++n11;
                        if (bl) continue;
                        break;
                    }
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
            }
            ua_02 = this.t.get(n10);
        }
        return (dc_1)((Object)ua_02);
    }

    public synchronized void U(int n10, @NotNull ua_0 ua_02) {
        n10 = Math.min(n10, this.b());
        ua_02.F(this.t.subList(this.b() - n10, this.b()));
        this.z(n10);
    }

    private synchronized void F(@NotNull List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(this.t);
        this.t = new ArrayList(arrayList);
    }

    private synchronized void z(int n10) {
        this.t = new ArrayList(this.t.subList(0, this.b() - n10));
    }

    public int Q(int n10, int n11) {
        int n12;
        block14: {
            int n13 = 0;
            boolean bl = j_0.g();
            while (n11 - n13 > 0) {
                int n14;
                int n15;
                block15: {
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        try {
                                            n12 = n10;
                                            if (!bl) break block14;
                                            n15 = this.t.size();
                                            if (!bl) break block15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ua_0.a(illegalArgumentException);
                                        }
                                        if (n12 >= n15) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ua_0.a(illegalArgumentException);
                                    }
                                    n12 = ((dc_1)this.t.get(n10)).V() ? 1 : 0;
                                    if (!bl) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ua_0.a(illegalArgumentException);
                                }
                                if (n12 == 0) break;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ua_0.a(illegalArgumentException);
                            }
                        }
                        n14 = n10;
                        n15 = this.t.size();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ua_0.a(illegalArgumentException);
                    }
                }
                try {
                    if (n14 < n15) {
                        this.t.remove(n10);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ua_0.a(illegalArgumentException);
                }
                --n10;
                ++n13;
                if (bl) continue;
            }
            n12 = n13;
        }
        return n12;
    }

    synchronized int h(@NotNull dc_1 dc_12) {
        return this.t.indexOf(dc_12);
    }

    public synchronized void e() {
        Iterator iterator = this.t.iterator();
        boolean bl = j_0.g();
        while (iterator.hasNext()) {
            dc_1 dc_12 = (dc_1)iterator.next();
            dc_12.N = null;
            if (bl) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00ee\u008c\u001e==\u00d2\u00c96\u00b6@\u009f\u0086\u0083\u00b1\u009ap\u00be\u00b3s{\u007f>\u000e\u00b9\u0019\u00cek\u00aa,Yw\u00fdG\u00fa\u00e7\u00f9\n\n\u00a0\u00a4\u00ef\u00a7\u00b4\u00f4\u00e7x\u00ca\u00b2";
                    var12_3 = "\u00ee\u008c\u001e==\u00d2\u00c96\u00b6@\u009f\u0086\u0083\u00b1\u009ap\u00be\u00b3s{\u007f>\u000e\u00b9\u0019\u00cek\u00aa,Yw\u00fdG\u00fa\u00e7\u00f9\n\n\u00a0\u00a4\u00ef\u00a7\u00b4\u00f4\u00e7x\u00ca\u00b2".length();
                    var9_4 = 22;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block15;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 90;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 16;
                                    break;
                                }
                                case 1: {
                                    v11 = 32;
                                    break;
                                }
                                case 2: {
                                    v11 = 48;
                                    break;
                                }
                                case 3: {
                                    v11 = 17;
                                    break;
                                }
                                case 4: {
                                    v11 = 22;
                                    break;
                                }
                                case 5: {
                                    v11 = 98;
                                    break;
                                }
                                default: {
                                    v11 = 49;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                ua_0.a = var13;
                ua_0.b = new String[3];
                var0_7 = 734263515684718450L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "yZ\u00c2\u0090\u00e7~\u0003\u001e\u00c0-\u00cc\u00b9G[\u00c5\u00ce";
                var5_11 = "yZ\u00c2\u0090\u00e7~\u0003\u001e\u00c0-\u00cc\u00b9G[\u00c5\u00ce".length();
                var2_12 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        ua_0.c = var6_8;
        ua_0.d = new Integer[2];
        ua_0.X = LoggerFactory.getLogger(ua_0.class);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x10E2) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 157;
                    break;
                }
                case 1: {
                    n14 = 108;
                    break;
                }
                case 2: {
                    n14 = 131;
                    break;
                }
                case 3: {
                    n14 = 240;
                    break;
                }
                case 4: {
                    n14 = 164;
                    break;
                }
                case 5: {
                    n14 = 49;
                    break;
                }
                case 6: {
                    n14 = 181;
                    break;
                }
                case 7: {
                    n14 = 156;
                    break;
                }
                case 8: {
                    n14 = 182;
                    break;
                }
                case 9: {
                    n14 = 238;
                    break;
                }
                case 10: {
                    n14 = 22;
                    break;
                }
                case 11: {
                    n14 = 20;
                    break;
                }
                case 12: {
                    n14 = 9;
                    break;
                }
                case 13: {
                    n14 = 187;
                    break;
                }
                case 14: {
                    n14 = 62;
                    break;
                }
                case 15: {
                    n14 = 252;
                    break;
                }
                case 16: {
                    n14 = 67;
                    break;
                }
                case 17: {
                    n14 = 56;
                    break;
                }
                case 18: {
                    n14 = 54;
                    break;
                }
                case 19: {
                    n14 = 103;
                    break;
                }
                case 20: {
                    n14 = 34;
                    break;
                }
                case 21: {
                    n14 = 101;
                    break;
                }
                case 22: {
                    n14 = 63;
                    break;
                }
                case 23: {
                    n14 = 119;
                    break;
                }
                case 24: {
                    n14 = 77;
                    break;
                }
                case 25: {
                    n14 = 5;
                    break;
                }
                case 26: {
                    n14 = 205;
                    break;
                }
                case 27: {
                    n14 = 192;
                    break;
                }
                case 28: {
                    n14 = 17;
                    break;
                }
                case 29: {
                    n14 = 174;
                    break;
                }
                case 30: {
                    n14 = 58;
                    break;
                }
                case 31: {
                    n14 = 24;
                    break;
                }
                case 32: {
                    n14 = 221;
                    break;
                }
                case 33: {
                    n14 = 14;
                    break;
                }
                case 34: {
                    n14 = 179;
                    break;
                }
                case 35: {
                    n14 = 166;
                    break;
                }
                case 36: {
                    n14 = 214;
                    break;
                }
                case 37: {
                    n14 = 80;
                    break;
                }
                case 38: {
                    n14 = 13;
                    break;
                }
                case 39: {
                    n14 = 139;
                    break;
                }
                case 40: {
                    n14 = 138;
                    break;
                }
                case 41: {
                    n14 = 190;
                    break;
                }
                case 42: {
                    n14 = 27;
                    break;
                }
                case 43: {
                    n14 = 141;
                    break;
                }
                case 44: {
                    n14 = 112;
                    break;
                }
                case 45: {
                    n14 = 33;
                    break;
                }
                case 46: {
                    n14 = 255;
                    break;
                }
                case 47: {
                    n14 = 137;
                    break;
                }
                case 48: {
                    n14 = 114;
                    break;
                }
                case 49: {
                    n14 = 35;
                    break;
                }
                case 50: {
                    n14 = 125;
                    break;
                }
                case 51: {
                    n14 = 152;
                    break;
                }
                case 52: {
                    n14 = 30;
                    break;
                }
                case 53: {
                    n14 = 246;
                    break;
                }
                case 54: {
                    n14 = 73;
                    break;
                }
                case 55: {
                    n14 = 234;
                    break;
                }
                case 56: {
                    n14 = 74;
                    break;
                }
                case 57: {
                    n14 = 124;
                    break;
                }
                case 58: {
                    n14 = 215;
                    break;
                }
                case 59: {
                    n14 = 168;
                    break;
                }
                case 60: {
                    n14 = 61;
                    break;
                }
                case 61: {
                    n14 = 116;
                    break;
                }
                case 62: {
                    n14 = 44;
                    break;
                }
                case 63: {
                    n14 = 7;
                    break;
                }
                case 64: {
                    n14 = 85;
                    break;
                }
                case 65: {
                    n14 = 19;
                    break;
                }
                case 66: {
                    n14 = 76;
                    break;
                }
                case 67: {
                    n14 = 233;
                    break;
                }
                case 68: {
                    n14 = 3;
                    break;
                }
                case 69: {
                    n14 = 26;
                    break;
                }
                case 70: {
                    n14 = 154;
                    break;
                }
                case 71: {
                    n14 = 46;
                    break;
                }
                case 72: {
                    n14 = 118;
                    break;
                }
                case 73: {
                    n14 = 210;
                    break;
                }
                case 74: {
                    n14 = 12;
                    break;
                }
                case 75: {
                    n14 = 47;
                    break;
                }
                case 76: {
                    n14 = 4;
                    break;
                }
                case 77: {
                    n14 = 113;
                    break;
                }
                case 78: {
                    n14 = 115;
                    break;
                }
                case 79: {
                    n14 = 194;
                    break;
                }
                case 80: {
                    n14 = 60;
                    break;
                }
                case 81: {
                    n14 = 167;
                    break;
                }
                case 82: {
                    n14 = 241;
                    break;
                }
                case 83: {
                    n14 = 251;
                    break;
                }
                case 84: {
                    n14 = 107;
                    break;
                }
                case 85: {
                    n14 = 158;
                    break;
                }
                case 86: {
                    n14 = 52;
                    break;
                }
                case 87: {
                    n14 = 135;
                    break;
                }
                case 88: {
                    n14 = 42;
                    break;
                }
                case 89: {
                    n14 = 32;
                    break;
                }
                case 90: {
                    n14 = 110;
                    break;
                }
                case 91: {
                    n14 = 18;
                    break;
                }
                case 92: {
                    n14 = 111;
                    break;
                }
                case 93: {
                    n14 = 127;
                    break;
                }
                case 94: {
                    n14 = 96;
                    break;
                }
                case 95: {
                    n14 = 222;
                    break;
                }
                case 96: {
                    n14 = 220;
                    break;
                }
                case 97: {
                    n14 = 195;
                    break;
                }
                case 98: {
                    n14 = 173;
                    break;
                }
                case 99: {
                    n14 = 231;
                    break;
                }
                case 100: {
                    n14 = 78;
                    break;
                }
                case 101: {
                    n14 = 226;
                    break;
                }
                case 102: {
                    n14 = 236;
                    break;
                }
                case 103: {
                    n14 = 2;
                    break;
                }
                case 104: {
                    n14 = 66;
                    break;
                }
                case 105: {
                    n14 = 90;
                    break;
                }
                case 106: {
                    n14 = 245;
                    break;
                }
                case 107: {
                    n14 = 69;
                    break;
                }
                case 108: {
                    n14 = 84;
                    break;
                }
                case 109: {
                    n14 = 98;
                    break;
                }
                case 110: {
                    n14 = 228;
                    break;
                }
                case 111: {
                    n14 = 188;
                    break;
                }
                case 112: {
                    n14 = 37;
                    break;
                }
                case 113: {
                    n14 = 159;
                    break;
                }
                case 114: {
                    n14 = 169;
                    break;
                }
                case 115: {
                    n14 = 105;
                    break;
                }
                case 116: {
                    n14 = 196;
                    break;
                }
                case 117: {
                    n14 = 151;
                    break;
                }
                case 118: {
                    n14 = 88;
                    break;
                }
                case 119: {
                    n14 = 213;
                    break;
                }
                case 120: {
                    n14 = 8;
                    break;
                }
                case 121: {
                    n14 = 100;
                    break;
                }
                case 122: {
                    n14 = 102;
                    break;
                }
                case 123: {
                    n14 = 144;
                    break;
                }
                case 124: {
                    n14 = 95;
                    break;
                }
                case 125: {
                    n14 = 50;
                    break;
                }
                case 126: {
                    n14 = 128;
                    break;
                }
                case 127: {
                    n14 = 142;
                    break;
                }
                case 128: {
                    n14 = 93;
                    break;
                }
                case 129: {
                    n14 = 163;
                    break;
                }
                case 130: {
                    n14 = 212;
                    break;
                }
                case 131: {
                    n14 = 150;
                    break;
                }
                case 132: {
                    n14 = 184;
                    break;
                }
                case 133: {
                    n14 = 229;
                    break;
                }
                case 134: {
                    n14 = 243;
                    break;
                }
                case 135: {
                    n14 = 206;
                    break;
                }
                case 136: {
                    n14 = 48;
                    break;
                }
                case 137: {
                    n14 = 104;
                    break;
                }
                case 138: {
                    n14 = 89;
                    break;
                }
                case 139: {
                    n14 = 254;
                    break;
                }
                case 140: {
                    n14 = 165;
                    break;
                }
                case 141: {
                    n14 = 203;
                    break;
                }
                case 142: {
                    n14 = 53;
                    break;
                }
                case 143: {
                    n14 = 41;
                    break;
                }
                case 144: {
                    n14 = 11;
                    break;
                }
                case 145: {
                    n14 = 200;
                    break;
                }
                case 146: {
                    n14 = 176;
                    break;
                }
                case 147: {
                    n14 = 83;
                    break;
                }
                case 148: {
                    n14 = 218;
                    break;
                }
                case 149: {
                    n14 = 183;
                    break;
                }
                case 150: {
                    n14 = 68;
                    break;
                }
                case 151: {
                    n14 = 39;
                    break;
                }
                case 152: {
                    n14 = 170;
                    break;
                }
                case 153: {
                    n14 = 21;
                    break;
                }
                case 154: {
                    n14 = 178;
                    break;
                }
                case 155: {
                    n14 = 71;
                    break;
                }
                case 156: {
                    n14 = 81;
                    break;
                }
                case 157: {
                    n14 = 197;
                    break;
                }
                case 158: {
                    n14 = 250;
                    break;
                }
                case 159: {
                    n14 = 28;
                    break;
                }
                case 160: {
                    n14 = 10;
                    break;
                }
                case 161: {
                    n14 = 92;
                    break;
                }
                case 162: {
                    n14 = 143;
                    break;
                }
                case 163: {
                    n14 = 217;
                    break;
                }
                case 164: {
                    n14 = 133;
                    break;
                }
                case 165: {
                    n14 = 248;
                    break;
                }
                case 166: {
                    n14 = 216;
                    break;
                }
                case 167: {
                    n14 = 87;
                    break;
                }
                case 168: {
                    n14 = 31;
                    break;
                }
                case 169: {
                    n14 = 43;
                    break;
                }
                case 170: {
                    n14 = 6;
                    break;
                }
                case 171: {
                    n14 = 136;
                    break;
                }
                case 172: {
                    n14 = 72;
                    break;
                }
                case 173: {
                    n14 = 239;
                    break;
                }
                case 174: {
                    n14 = 55;
                    break;
                }
                case 175: {
                    n14 = 230;
                    break;
                }
                case 176: {
                    n14 = 130;
                    break;
                }
                case 177: {
                    n14 = 224;
                    break;
                }
                case 178: {
                    n14 = 244;
                    break;
                }
                case 179: {
                    n14 = 202;
                    break;
                }
                case 180: {
                    n14 = 140;
                    break;
                }
                case 181: {
                    n14 = 38;
                    break;
                }
                case 182: {
                    n14 = 193;
                    break;
                }
                case 183: {
                    n14 = 23;
                    break;
                }
                case 184: {
                    n14 = 94;
                    break;
                }
                case 185: {
                    n14 = 36;
                    break;
                }
                case 186: {
                    n14 = 185;
                    break;
                }
                case 187: {
                    n14 = 223;
                    break;
                }
                case 188: {
                    n14 = 242;
                    break;
                }
                case 189: {
                    n14 = 253;
                    break;
                }
                case 190: {
                    n14 = 153;
                    break;
                }
                case 191: {
                    n14 = 120;
                    break;
                }
                case 192: {
                    n14 = 109;
                    break;
                }
                case 193: {
                    n14 = 91;
                    break;
                }
                case 194: {
                    n14 = 161;
                    break;
                }
                case 195: {
                    n14 = 249;
                    break;
                }
                case 196: {
                    n14 = 207;
                    break;
                }
                case 197: {
                    n14 = 1;
                    break;
                }
                case 198: {
                    n14 = 204;
                    break;
                }
                case 199: {
                    n14 = 65;
                    break;
                }
                case 200: {
                    n14 = 59;
                    break;
                }
                case 201: {
                    n14 = 162;
                    break;
                }
                case 202: {
                    n14 = 209;
                    break;
                }
                case 203: {
                    n14 = 149;
                    break;
                }
                case 204: {
                    n14 = 121;
                    break;
                }
                case 205: {
                    n14 = 160;
                    break;
                }
                case 206: {
                    n14 = 82;
                    break;
                }
                case 207: {
                    n14 = 198;
                    break;
                }
                case 208: {
                    n14 = 186;
                    break;
                }
                case 209: {
                    n14 = 146;
                    break;
                }
                case 210: {
                    n14 = 29;
                    break;
                }
                case 211: {
                    n14 = 219;
                    break;
                }
                case 212: {
                    n14 = 227;
                    break;
                }
                case 213: {
                    n14 = 79;
                    break;
                }
                case 214: {
                    n14 = 97;
                    break;
                }
                case 215: {
                    n14 = 147;
                    break;
                }
                case 216: {
                    n14 = 51;
                    break;
                }
                case 217: {
                    n14 = 122;
                    break;
                }
                case 218: {
                    n14 = 45;
                    break;
                }
                case 219: {
                    n14 = 201;
                    break;
                }
                case 220: {
                    n14 = 117;
                    break;
                }
                case 221: {
                    n14 = 75;
                    break;
                }
                case 222: {
                    n14 = 129;
                    break;
                }
                case 223: {
                    n14 = 132;
                    break;
                }
                case 224: {
                    n14 = 106;
                    break;
                }
                case 225: {
                    n14 = 0;
                    break;
                }
                case 226: {
                    n14 = 126;
                    break;
                }
                case 227: {
                    n14 = 64;
                    break;
                }
                case 228: {
                    n14 = 25;
                    break;
                }
                case 229: {
                    n14 = 191;
                    break;
                }
                case 230: {
                    n14 = 40;
                    break;
                }
                case 231: {
                    n14 = 148;
                    break;
                }
                case 232: {
                    n14 = 15;
                    break;
                }
                case 233: {
                    n14 = 175;
                    break;
                }
                case 234: {
                    n14 = 99;
                    break;
                }
                case 235: {
                    n14 = 225;
                    break;
                }
                case 236: {
                    n14 = 199;
                    break;
                }
                case 237: {
                    n14 = 134;
                    break;
                }
                case 238: {
                    n14 = 180;
                    break;
                }
                case 239: {
                    n14 = 172;
                    break;
                }
                case 240: {
                    n14 = 57;
                    break;
                }
                case 241: {
                    n14 = 86;
                    break;
                }
                case 242: {
                    n14 = 247;
                    break;
                }
                case 243: {
                    n14 = 70;
                    break;
                }
                case 244: {
                    n14 = 16;
                    break;
                }
                case 245: {
                    n14 = 235;
                    break;
                }
                case 246: {
                    n14 = 171;
                    break;
                }
                case 247: {
                    n14 = 123;
                    break;
                }
                case 248: {
                    n14 = 237;
                    break;
                }
                case 249: {
                    n14 = 208;
                    break;
                }
                case 250: {
                    n14 = 177;
                    break;
                }
                case 251: {
                    n14 = 232;
                    break;
                }
                case 252: {
                    n14 = 155;
                    break;
                }
                case 253: {
                    n14 = 211;
                    break;
                }
                case 254: {
                    n14 = 145;
                    break;
                }
                default: {
                    n14 = 189;
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
            ua_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E58;
        if (d[n11] == null) {
            ua_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

