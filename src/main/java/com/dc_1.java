/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B2;
import com.KB;
import com.YP;
import com.bf_0;
import com.bs_0;
import com.j_0;
import com.lf_0;
import com.lu_2;
import com.q_0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.dC
 */
public final class dc_1 {
    private static final Logger d;
    private bf_0 Q = new bf_0(null);
    private boolean p = false;
    private final List R = new ArrayList();
    dc_1 N;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public dc_1() {
    }

    public dc_1(@NotNull lu_2 lu_22) {
        this.Q.n(lu_22);
    }

    public static dc_1 v() {
        return new dc_1();
    }

    @NotNull
    public String V() {
        StringBuilder stringBuilder = new StringBuilder(bf_0.h(this.Q));
        Iterator iterator = this.Q.iterator();
        boolean bl = j_0.g();
        while (iterator.hasNext()) {
            lu_2 lu_22 = (lu_2)iterator.next();
            if (bl) {
                if (lu_22.v().Y() && bl) break;
                stringBuilder.append(lu_22.v());
            }
            if (bl) continue;
        }
        return stringBuilder.toString();
    }

    @NotNull
    public dc_1 X() {
        dc_1 dc_12;
        block2: {
            dc_12 = new dc_1();
            boolean bl = j_0.g();
            for (lu_2 lu_22 : this.Q) {
                dc_12.Q.n(lu_22);
                if (bl) {
                    if (bl) continue;
                }
                break block2;
            }
            dc_12.p = this.p;
        }
        return dc_12;
    }

    public char N(int n10) {
        dc_1 dc_12 = this.N;
        boolean bl = j_0.g();
        dc_1 dc_13 = dc_12;
        if (bl) {
            if (dc_13 != null) {
                return dc_12.N(n10);
            }
            dc_13 = this;
        }
        String string = dc_13.V();
        int n11 = n10;
        if (bl) {
            n11 = n11 < string.length() ? string.charAt(n10) : dc_1.a(21195, 6518221519311044562L);
        }
        return (char)n11;
    }

    public boolean G() {
        return this.p;
    }

    public void M(boolean bl) {
        this.p = bl;
    }

    public synchronized void c(@NotNull lu_2 lu_22) {
        this.Q.e();
        this.Q.n(lu_22);
        this.M(false);
    }

    public void W(int n10, @NotNull j_0 j_02, @NotNull YP yP) {
        this.j(n10, yP, j_02);
    }

    public void V(int n10, @NotNull j_0 j_02, @NotNull YP yP) {
        this.R(n10, yP, j_02);
    }

    private synchronized void j(int n10, @NotNull YP yP, @NotNull j_0 j_02) {
        block6: {
            int n11;
            int n12;
            int n13;
            block4: {
                block5: {
                    n13 = this.Q.o();
                    boolean bl = j_0.P();
                    n12 = n10;
                    n11 = n13;
                    if (bl) break block4;
                    if (n12 < n11) break block5;
                    if (n10 - n13 > 0) {
                        this.Q.n(new lu_2(YP.r, new j_0('\u0000', n10 - n13)));
                    }
                    this.Q.n(new lu_2(yP, j_02));
                    if (!bl) break block6;
                }
                n12 = n13;
                n11 = n10 + j_02.length();
            }
            n13 = Math.max(n12, n11);
            this.Q = dc_1.U(n10, j_02, yP, this.Q, n13);
        }
    }

    private synchronized void R(int n10, @NotNull YP yP, @NotNull j_0 j_02) {
        block9: {
            int n11;
            KB kB;
            boolean bl;
            block8: {
                int n12;
                block11: {
                    block10: {
                        n12 = this.Q.o();
                        bl = j_0.P();
                        if (bl) break block10;
                        if (n10 <= n12) break block11;
                        this.j(n10, yP, j_02);
                    }
                    return;
                }
                kB = dc_1.w(this.Q, n12 + j_02.length());
                for (n11 = n12 - 1; n11 >= n10; --n11) {
                    ((char[])kB.X)[n11 + j_02.length()] = ((char[])kB.X)[n11];
                    ((YP[])kB.S)[n11 + j_02.length()] = ((YP[])kB.S)[n11];
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block8;
                }
                n11 = 0;
            }
            while (n11 < j_02.length()) {
                ((char[])kB.X)[n11 + n10] = j_02.charAt(n11);
                ((YP[])kB.S)[n11 + n10] = yP;
                ++n11;
                if (!bl) {
                    if (!bl) continue;
                }
                break block9;
            }
            this.Q = dc_1.b((char[])kB.X, (YP[])kB.S);
        }
    }

    private static bf_0 U(int n10, @NotNull j_0 j_02, @NotNull YP yP, @NotNull bf_0 bf_02, int n11) {
        YP[] yPArray;
        KB kB;
        block2: {
            kB = dc_1.w(bf_02, n11);
            boolean bl = j_0.g();
            for (int i2 = 0; i2 < j_02.length(); ++i2) {
                ((char[])kB.X)[i2 + n10] = j_02.charAt(i2);
                yPArray = (YP[])kB.S;
                if (bl) {
                    yPArray[i2 + n10] = yP;
                    if (bl) continue;
                }
                break block2;
            }
            yPArray = kB.X;
        }
        return dc_1.b((char[])yPArray, (YP[])kB.S);
    }

    private static KB w(bf_0 bf_02, int n10) {
        KB kB = KB.Z(new char[n10], new YP[n10]);
        boolean bl = j_0.g();
        int n11 = 0;
        for (lu_2 lu_22 : bf_02) {
            block3: {
                for (int i2 = 0; i2 < lu_22.s(); ++i2) {
                    ((char[])kB.X)[n11 + i2] = lu_22.v().charAt(i2);
                    ((YP[])kB.S)[n11 + i2] = lu_22.j();
                    if (bl) {
                        if (bl) continue;
                    }
                    break block3;
                }
                n11 += lu_22.s();
            }
            if (bl) continue;
        }
        return kB;
    }

    private static bf_0 b(char[] cArray, @NotNull YP[] yPArray) {
        bf_0 bf_02;
        block3: {
            bf_02 = new bf_0(null);
            YP yP = yPArray[0];
            boolean bl = j_0.g();
            int n10 = 0;
            for (int i2 = 1; i2 < cArray.length; ++i2) {
                if (bl) {
                    YP yP2 = yPArray[i2];
                    if (bl) {
                        if (yP2 == yP) continue;
                        bf_02.n(new lu_2(yP, new j_0(cArray, n10, i2 - n10)));
                        yP2 = yPArray[i2];
                    }
                    yP = yP2;
                    n10 = i2;
                    if (bl) continue;
                }
                break block3;
            }
            bf_02.n(new lu_2(yP, new j_0(cArray, n10, cArray.length - n10)));
        }
        return bf_02;
    }

    public synchronized void d(int n10) {
        this.F(n10, YP.r);
    }

    public synchronized void F(int n10, @NotNull YP yP) {
        this.R(n10, this.Q.o() - n10, yP);
        this.M(false);
    }

    /*
     * WARNING - void declaration
     */
    public synchronized void R(int n10, int n11, @NotNull YP yP) {
        int n12;
        bf_0 bf_02;
        block11: {
            int n13 = 0;
            bf_02 = new bf_0(null);
            boolean bl = j_0.g();
            int n14 = n11;
            for (lu_2 lu_22 : this.Q) {
                block14: {
                    void v5;
                    int n15;
                    block12: {
                        int n16;
                        void var10_10;
                        block13: {
                            int n17;
                            n12 = n14;
                            if (!bl) break block11;
                            if (bl) {
                                if (n12 == 0) {
                                    bf_02.n(lu_22);
                                    if (bl) continue;
                                }
                                n17 = lu_22.s();
                            }
                            var10_10 = n17;
                            int n18 = n13 + var10_10;
                            int n19 = n10;
                            if (bl) {
                                if (n18 <= n19) {
                                    n13 += var10_10;
                                    bf_02.n(lu_22);
                                    if (bl) continue;
                                }
                                n18 = n10;
                                n19 = n13;
                            }
                            n15 = n16 = n18 - n19;
                            if (bl) {
                                if (n15 > 0) {
                                    bf_02.n(new lu_2(lu_22.j(), lu_22.v().Y(0, n16)));
                                    n13 = n10;
                                }
                                n15 = n16 + n14;
                            }
                            v5 = var10_10;
                            if (!bl) break block12;
                            if (n15 >= v5) break block13;
                            bf_02.n(new lu_2(lu_22.j(), lu_22.v().Y(n16 + n14, (int)(var10_10 - (n16 + n14)))));
                            n14 = 0;
                            if (bl) break block14;
                        }
                        n15 = n14;
                        v5 = var10_10 - n16;
                    }
                    n14 = n15 - v5;
                    n13 = n10;
                }
                if (bl) continue;
            }
            n12 = n11;
        }
        if (n12 > 0 && yP != YP.r) {
            bf_02.n(new lu_2(yP, new j_0('\u0000', n11)));
        }
        this.Q = bf_02;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void j(int var1_1, int var2_2, int var3_3, @NotNull YP var4_4) {
        var6_5 = this.Q.o();
        var6_5 = Math.min(var6_5 + var2_2, var3_3);
        var7_6 = new char[var6_5];
        var8_7 = new YP[var6_5];
        var5_8 = j_0.g();
        var9_9 = 0;
        for (lu_2 var11_11 : this.Q) {
            v0 = 0;
            if (var5_8) {
                block11: {
                    for (var12_12 = v6130204; var12_12 < var11_11.s(); ++var12_12) {
                        v1 = var9_9;
                        v2 = var6_5;
                        if (var5_8 && var5_8) {
                            if (v1 >= v2) break;
                            v3 = var9_9;
                            v4 = var1_1;
                            if (var5_8) {
                                if (v3 == v4) {
                                    for (var13_13 = 0; var13_13 < var2_2; ++var13_13) {
                                        v3 = var9_9;
                                        v4 = var6_5;
                                        if (var5_8 && var5_8) {
                                            if (v3 >= v4) break;
                                            var7_6[var9_9] = dc_1.a(21195, 6518221519311044562L);
                                            var8_7[var9_9] = var4_4;
                                            ++var9_9;
                                            if (var5_8) continue;
                                        }
                                        break;
                                    }
                                } else {
                                    v3 = var9_9;
                                    v4 = var6_5;
                                }
                            }
                            if (v3 >= v4) continue;
                            var7_6[var9_9] = var11_11.v().charAt(var12_12);
                            var8_7[var9_9] = var11_11.j();
                            ++var9_9;
                            if (var5_8) continue;
                        }
                        break block11;
                    }
                    v1 = var9_9;
                    v2 = var6_5;
                }
                if ((v1 < v2 || !var5_8) && var5_8) continue;
            }
            ** GOTO lbl44
        }
        do {
            v0 = var9_9;
lbl44:
            // 2 sources

            if (v0 >= var1_1) break;
            v5 = var9_9;
            v6 = var6_5;
            if (!var5_8 || !var5_8) ** GOTO lbl57
            if (v5 >= v6) break;
            var7_6[var9_9] = dc_1.a(21195, 6518221519311044562L);
            var8_7[var9_9] = YP.r;
            ++var9_9;
            ++var9_9;
        } while (var5_8);
        do {
            v5 = var9_9;
            v6 = var1_1 + var2_2;
lbl57:
            // 2 sources

            if (v5 >= v6 || var9_9 >= var6_5) break;
            var7_6[var9_9] = dc_1.a(21195, 6518221519311044562L);
            var8_7[var9_9] = var4_4;
            ++var9_9;
            ++var9_9;
        } while (var5_8);
        this.Q = dc_1.b(var7_6, var8_7);
    }

    public synchronized void A(int n10, int n11, @NotNull YP yP) {
        block3: {
            int n12;
            int n13;
            block2: {
                boolean bl = j_0.g();
                n13 = n11;
                n12 = -1;
                if (!bl) break block2;
                if (n13 != n12) break block3;
                n13 = this.Q.o();
                n12 = n10;
            }
            n11 = Math.max(n13, n12);
        }
        this.j(n10, yP, new j_0((char)(n11 >= this.Q.o() ? 0 : dc_1.a(17651, 2446164316241324523L)), n11 - n10));
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public synchronized YP x(int var1_1) {
        var3_2 = 0;
        var2_3 = j_0.g();
        for (lu_2 var5_5 : this.Q) {
            v0 = var1_1;
            v1 = var3_2;
            if (var2_3) {
                if (v0 >= v1) {
                    v0 = var1_1;
                    v1 = var3_2 + var5_5.s();
                    if (var2_3) {
                        if (v0 < v1) {
                            return var5_5.j();
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = var3_2;
                    v1 = var5_5.s();
                }
            }
            var3_2 = v0 + v1;
            if (var2_3) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void l(int var1_1, lf_0 var2_2, int var3_3) {
        block10: {
            var5_4 = 0;
            var4_5 = j_0.P();
            var6_6 = -1;
            var7_7 = this.R.stream().findFirst().orElse(null);
            v0 = var8_8 = this.N;
            if (var4_5) ** GOTO lbl11
            if (v0 != null) {
                v1 = var8_8.Q;
            } else {
                v0 = this;
lbl11:
                // 2 sources

                v1 = v0.Q;
            }
            var9_9 = v1;
            for (lu_2 var11_11 : var9_9) {
                block15: {
                    block16: {
                        block17: {
                            block12: {
                                block14: {
                                    block13: {
                                        block11: {
                                            if (var4_5) break block10;
                                            v2 = var11_11.v().Y();
                                            if (var4_5) break block11;
                                            if (v2 == 0) break block12;
                                            v2 = var6_6;
                                        }
                                        if (var4_5) break block13;
                                        if (v2 >= 0) break block14;
                                        v2 = var5_4;
                                    }
                                    var6_6 = v2;
                                }
                                var2_2.r(var5_4, var1_1, var6_6, var11_11.j(), var11_11.v(), var3_3);
                                if (!var4_5) break block15;
                            }
                            if (var7_7 == null) break block16;
                            v3 = var11_11.s();
                            if (var4_5) break block17;
                            if (v3 <= 0) break block16;
                            v3 = (int)var7_7.v(var5_4, var5_4 + var11_11.s());
                        }
                        if (v3 == 0) break block16;
                        this.G(var5_4, var1_1, var11_11, var2_2, var3_3, var7_7);
                        if (!var4_5) break block15;
                    }
                    var2_2.N(var5_4, var1_1, var11_11.j(), var11_11.v(), var3_3);
                }
                var5_4 += var11_11.s();
                if (!var4_5) continue;
            }
            v4 = var6_6;
            if (!var4_5) {
                v4 = v4 < 0 ? var5_4 : var6_6;
            }
            var2_2.K(var5_4, var1_1, v4, var3_3);
        }
    }

    private void G(int n10, int n11, @NotNull lu_2 lu_22, @NotNull lf_0 lf_02, int n12, @NotNull bs_0 bs_02) {
        int n13;
        int n14;
        boolean bl;
        int[] nArray;
        j_0 j_02;
        block7: {
            int n15;
            int n16;
            block8: {
                block5: {
                    int n17;
                    block6: {
                        j_02 = lu_22.v();
                        n17 = n10 + j_02.length();
                        nArray = new int[]{n10, n17, bs_02.m(), bs_02.r()};
                        boolean bl2 = j_0.P();
                        Arrays.sort(nArray);
                        bl = bl2;
                        n16 = Arrays.binarySearch(nArray, n10);
                        n14 = Arrays.binarySearch(nArray, n17);
                        if (bl) break block5;
                        if (n16 < 0) break block6;
                        n15 = n14;
                        if (bl) break block7;
                        if (n15 >= 0) break block8;
                    }
                    d.error("\u0000ERR:ArrayIndexOutOfBoundsException:Index 26559 out of bounds for length 41" + Arrays.toString(new int[]{n10, n17}) + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 26552 out of bounds for length 41" + Arrays.toString(nArray) + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 26553 out of bounds for length 41" + Arrays.toString(new int[]{n16, n14}));
                    lf_02.N(n10, n11, lu_22.j(), j_02, n12);
                }
                return;
            }
            n15 = n13 = n16;
        }
        while (n13 < n14) {
            block9: {
                q_0 q_02;
                block11: {
                    block10: {
                        int n18 = nArray[n13 + 1] - nArray[n13];
                        if (n18 == 0) break block9;
                        q_02 = new q_0(j_02, nArray[n13] - n10, n18);
                        if (bl) break block10;
                        if (!bs_02.v(nArray[n13], nArray[n13 + 1])) break block11;
                        lf_02.N(nArray[n13], n11, bs_02.A(lu_22.j()), q_02, n12);
                    }
                    if (!bl) break block9;
                }
                lf_02.N(nArray[n13], n11, lu_22.j(), q_02, n12);
            }
            ++n13;
            if (!bl) continue;
        }
    }

    public synchronized boolean V() {
        boolean bl;
        block3: {
            Iterator iterator = this.Q.iterator();
            boolean bl2 = j_0.P();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        lu_2 lu_22 = (lu_2)iterator.next();
                        bl = lu_22.V();
                        if (bl2) break block3;
                        if (bl2) break block4;
                        if (bl) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (!bl2) continue;
            }
            bl = true;
        }
        return bl;
    }

    void R(@NotNull Consumer consumer) {
        this.Q.forEach(consumer);
    }

    public List e() {
        return Collections.unmodifiableList(bf_0.T(this.Q));
    }

    void s(@NotNull lu_2 lu_22) {
        this.Q.n(lu_22);
    }

    @NotNull
    public synchronized bs_0 s(int n10, int n11, @NotNull YP yP) {
        B2 b2 = new B2(this, this, n10, n11, yP);
        this.R.add(b2);
        return b2;
    }

    public String toString() {
        boolean bl = j_0.P();
        StringBuilder stringBuilder = new StringBuilder().append(this.Q.o());
        String string = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 26556 out of bounds for length 41";
        if (!bl) {
            stringBuilder = stringBuilder.append(string);
            string = this.p ? "\u0000ERR:ArrayIndexOutOfBoundsException:Index 26558 out of bounds for length 41" : "";
        }
        return stringBuilder.append(string).append(bf_0.I(this.Q).size()).append("\u0000ERR:ArrayIndexOutOfBoundsException:Index 26557 out of bounds for length 41").append(bf_0.I(this.Q).stream().map(dc_1::lambda$toString$0).collect(Collectors.joining("|"))).toString();
    }

    private static String lambda$toString$0(lu_2 lu_22) {
        return lu_22.v().toString();
    }

    static List G(dc_1 dc_12) {
        return dc_12.R;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\u0014A\u0016\u0012\u00ce.\u00ef!t\u00c7\b\n\r\u00d3H\u00b0\u00c8i\u00f7\f\n\u0084\u00da4J\u00ae\u0084\u009a\u00a7ISw\t\u00cc\u009f\u00bf8\u0017\u00e3\u0097J@";
                        var12_3 = "\u0014A\u0016\u0012\u00ce.\u00ef!t\u00c7\b\n\r\u00d3H\u00b0\u00c8i\u00f7\f\n\u0084\u00da4J\u00ae\u0084\u009a\u00a7ISw\t\u00cc\u009f\u00bf8\u0017\u00e3\u0097J@".length();
                        var9_4 = 10;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 62;
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
                            var10_2 = "\u0091\u00d4\u0004-\u0091\u00a1A";
                            var12_3 = "\u0091\u00d4\u0004-\u0091\u00a1A".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 65;
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
                                    v15 = 35;
                                    break;
                                }
                                case 1: {
                                    v15 = 96;
                                    break;
                                }
                                case 2: {
                                    v15 = 67;
                                    break;
                                }
                                case 3: {
                                    v15 = 114;
                                    break;
                                }
                                case 4: {
                                    v15 = 76;
                                    break;
                                }
                                case 5: {
                                    v15 = 72;
                                    break;
                                }
                                default: {
                                    v15 = 31;
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
                dc_1.a = var13;
                dc_1.b = new String[6];
                var0_7 = 3823329142471612116L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u0017:9\u00be\u00f5\u00bc)&\u00dc\u0093\u0093\u0093\u001f\u00a7\u00bf\u001f";
                var5_11 = "\u0017:9\u00be\u00f5\u00bc)&\u00dc\u0093\u0093\u0093\u001f\u00a7\u00bf\u001f".length();
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
        dc_1.c = var6_8;
        dc_1.e = new Integer[2];
        dc_1.d = LoggerFactory.getLogger(dc_1.class);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x5576) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 25;
                    break;
                }
                case 1: {
                    n14 = 192;
                    break;
                }
                case 2: {
                    n14 = 144;
                    break;
                }
                case 3: {
                    n14 = 170;
                    break;
                }
                case 4: {
                    n14 = 20;
                    break;
                }
                case 5: {
                    n14 = 65;
                    break;
                }
                case 6: {
                    n14 = 197;
                    break;
                }
                case 7: {
                    n14 = 230;
                    break;
                }
                case 8: {
                    n14 = 98;
                    break;
                }
                case 9: {
                    n14 = 44;
                    break;
                }
                case 10: {
                    n14 = 48;
                    break;
                }
                case 11: {
                    n14 = 35;
                    break;
                }
                case 12: {
                    n14 = 232;
                    break;
                }
                case 13: {
                    n14 = 17;
                    break;
                }
                case 14: {
                    n14 = 165;
                    break;
                }
                case 15: {
                    n14 = 107;
                    break;
                }
                case 16: {
                    n14 = 46;
                    break;
                }
                case 17: {
                    n14 = 61;
                    break;
                }
                case 18: {
                    n14 = 3;
                    break;
                }
                case 19: {
                    n14 = 160;
                    break;
                }
                case 20: {
                    n14 = 31;
                    break;
                }
                case 21: {
                    n14 = 128;
                    break;
                }
                case 22: {
                    n14 = 122;
                    break;
                }
                case 23: {
                    n14 = 70;
                    break;
                }
                case 24: {
                    n14 = 27;
                    break;
                }
                case 25: {
                    n14 = 196;
                    break;
                }
                case 26: {
                    n14 = 114;
                    break;
                }
                case 27: {
                    n14 = 23;
                    break;
                }
                case 28: {
                    n14 = 109;
                    break;
                }
                case 29: {
                    n14 = 221;
                    break;
                }
                case 30: {
                    n14 = 105;
                    break;
                }
                case 31: {
                    n14 = 6;
                    break;
                }
                case 32: {
                    n14 = 41;
                    break;
                }
                case 33: {
                    n14 = 231;
                    break;
                }
                case 34: {
                    n14 = 218;
                    break;
                }
                case 35: {
                    n14 = 50;
                    break;
                }
                case 36: {
                    n14 = 129;
                    break;
                }
                case 37: {
                    n14 = 83;
                    break;
                }
                case 38: {
                    n14 = 91;
                    break;
                }
                case 39: {
                    n14 = 177;
                    break;
                }
                case 40: {
                    n14 = 26;
                    break;
                }
                case 41: {
                    n14 = 90;
                    break;
                }
                case 42: {
                    n14 = 152;
                    break;
                }
                case 43: {
                    n14 = 244;
                    break;
                }
                case 44: {
                    n14 = 59;
                    break;
                }
                case 45: {
                    n14 = 36;
                    break;
                }
                case 46: {
                    n14 = 174;
                    break;
                }
                case 47: {
                    n14 = 80;
                    break;
                }
                case 48: {
                    n14 = 251;
                    break;
                }
                case 49: {
                    n14 = 137;
                    break;
                }
                case 50: {
                    n14 = 181;
                    break;
                }
                case 51: {
                    n14 = 141;
                    break;
                }
                case 52: {
                    n14 = 246;
                    break;
                }
                case 53: {
                    n14 = 45;
                    break;
                }
                case 54: {
                    n14 = 254;
                    break;
                }
                case 55: {
                    n14 = 86;
                    break;
                }
                case 56: {
                    n14 = 189;
                    break;
                }
                case 57: {
                    n14 = 40;
                    break;
                }
                case 58: {
                    n14 = 63;
                    break;
                }
                case 59: {
                    n14 = 156;
                    break;
                }
                case 60: {
                    n14 = 167;
                    break;
                }
                case 61: {
                    n14 = 52;
                    break;
                }
                case 62: {
                    n14 = 11;
                    break;
                }
                case 63: {
                    n14 = 30;
                    break;
                }
                case 64: {
                    n14 = 243;
                    break;
                }
                case 65: {
                    n14 = 159;
                    break;
                }
                case 66: {
                    n14 = 209;
                    break;
                }
                case 67: {
                    n14 = 208;
                    break;
                }
                case 68: {
                    n14 = 106;
                    break;
                }
                case 69: {
                    n14 = 168;
                    break;
                }
                case 70: {
                    n14 = 173;
                    break;
                }
                case 71: {
                    n14 = 233;
                    break;
                }
                case 72: {
                    n14 = 68;
                    break;
                }
                case 73: {
                    n14 = 253;
                    break;
                }
                case 74: {
                    n14 = 204;
                    break;
                }
                case 75: {
                    n14 = 151;
                    break;
                }
                case 76: {
                    n14 = 66;
                    break;
                }
                case 77: {
                    n14 = 245;
                    break;
                }
                case 78: {
                    n14 = 88;
                    break;
                }
                case 79: {
                    n14 = 77;
                    break;
                }
                case 80: {
                    n14 = 9;
                    break;
                }
                case 81: {
                    n14 = 178;
                    break;
                }
                case 82: {
                    n14 = 216;
                    break;
                }
                case 83: {
                    n14 = 183;
                    break;
                }
                case 84: {
                    n14 = 148;
                    break;
                }
                case 85: {
                    n14 = 205;
                    break;
                }
                case 86: {
                    n14 = 24;
                    break;
                }
                case 87: {
                    n14 = 47;
                    break;
                }
                case 88: {
                    n14 = 62;
                    break;
                }
                case 89: {
                    n14 = 133;
                    break;
                }
                case 90: {
                    n14 = 239;
                    break;
                }
                case 91: {
                    n14 = 117;
                    break;
                }
                case 92: {
                    n14 = 172;
                    break;
                }
                case 93: {
                    n14 = 84;
                    break;
                }
                case 94: {
                    n14 = 215;
                    break;
                }
                case 95: {
                    n14 = 79;
                    break;
                }
                case 96: {
                    n14 = 134;
                    break;
                }
                case 97: {
                    n14 = 64;
                    break;
                }
                case 98: {
                    n14 = 248;
                    break;
                }
                case 99: {
                    n14 = 21;
                    break;
                }
                case 100: {
                    n14 = 96;
                    break;
                }
                case 101: {
                    n14 = 206;
                    break;
                }
                case 102: {
                    n14 = 145;
                    break;
                }
                case 103: {
                    n14 = 153;
                    break;
                }
                case 104: {
                    n14 = 146;
                    break;
                }
                case 105: {
                    n14 = 176;
                    break;
                }
                case 106: {
                    n14 = 72;
                    break;
                }
                case 107: {
                    n14 = 56;
                    break;
                }
                case 108: {
                    n14 = 250;
                    break;
                }
                case 109: {
                    n14 = 95;
                    break;
                }
                case 110: {
                    n14 = 7;
                    break;
                }
                case 111: {
                    n14 = 236;
                    break;
                }
                case 112: {
                    n14 = 123;
                    break;
                }
                case 113: {
                    n14 = 118;
                    break;
                }
                case 114: {
                    n14 = 29;
                    break;
                }
                case 115: {
                    n14 = 191;
                    break;
                }
                case 116: {
                    n14 = 142;
                    break;
                }
                case 117: {
                    n14 = 58;
                    break;
                }
                case 118: {
                    n14 = 67;
                    break;
                }
                case 119: {
                    n14 = 16;
                    break;
                }
                case 120: {
                    n14 = 158;
                    break;
                }
                case 121: {
                    n14 = 150;
                    break;
                }
                case 122: {
                    n14 = 238;
                    break;
                }
                case 123: {
                    n14 = 10;
                    break;
                }
                case 124: {
                    n14 = 38;
                    break;
                }
                case 125: {
                    n14 = 164;
                    break;
                }
                case 126: {
                    n14 = 186;
                    break;
                }
                case 127: {
                    n14 = 54;
                    break;
                }
                case 128: {
                    n14 = 171;
                    break;
                }
                case 129: {
                    n14 = 219;
                    break;
                }
                case 130: {
                    n14 = 110;
                    break;
                }
                case 131: {
                    n14 = 4;
                    break;
                }
                case 132: {
                    n14 = 147;
                    break;
                }
                case 133: {
                    n14 = 89;
                    break;
                }
                case 134: {
                    n14 = 103;
                    break;
                }
                case 135: {
                    n14 = 184;
                    break;
                }
                case 136: {
                    n14 = 175;
                    break;
                }
                case 137: {
                    n14 = 229;
                    break;
                }
                case 138: {
                    n14 = 163;
                    break;
                }
                case 139: {
                    n14 = 76;
                    break;
                }
                case 140: {
                    n14 = 255;
                    break;
                }
                case 141: {
                    n14 = 94;
                    break;
                }
                case 142: {
                    n14 = 138;
                    break;
                }
                case 143: {
                    n14 = 39;
                    break;
                }
                case 144: {
                    n14 = 124;
                    break;
                }
                case 145: {
                    n14 = 33;
                    break;
                }
                case 146: {
                    n14 = 119;
                    break;
                }
                case 147: {
                    n14 = 212;
                    break;
                }
                case 148: {
                    n14 = 74;
                    break;
                }
                case 149: {
                    n14 = 92;
                    break;
                }
                case 150: {
                    n14 = 241;
                    break;
                }
                case 151: {
                    n14 = 185;
                    break;
                }
                case 152: {
                    n14 = 235;
                    break;
                }
                case 153: {
                    n14 = 193;
                    break;
                }
                case 154: {
                    n14 = 195;
                    break;
                }
                case 155: {
                    n14 = 116;
                    break;
                }
                case 156: {
                    n14 = 225;
                    break;
                }
                case 157: {
                    n14 = 166;
                    break;
                }
                case 158: {
                    n14 = 32;
                    break;
                }
                case 159: {
                    n14 = 203;
                    break;
                }
                case 160: {
                    n14 = 228;
                    break;
                }
                case 161: {
                    n14 = 252;
                    break;
                }
                case 162: {
                    n14 = 222;
                    break;
                }
                case 163: {
                    n14 = 42;
                    break;
                }
                case 164: {
                    n14 = 60;
                    break;
                }
                case 165: {
                    n14 = 2;
                    break;
                }
                case 166: {
                    n14 = 180;
                    break;
                }
                case 167: {
                    n14 = 53;
                    break;
                }
                case 168: {
                    n14 = 139;
                    break;
                }
                case 169: {
                    n14 = 210;
                    break;
                }
                case 170: {
                    n14 = 200;
                    break;
                }
                case 171: {
                    n14 = 85;
                    break;
                }
                case 172: {
                    n14 = 214;
                    break;
                }
                case 173: {
                    n14 = 87;
                    break;
                }
                case 174: {
                    n14 = 49;
                    break;
                }
                case 175: {
                    n14 = 14;
                    break;
                }
                case 176: {
                    n14 = 213;
                    break;
                }
                case 177: {
                    n14 = 113;
                    break;
                }
                case 178: {
                    n14 = 22;
                    break;
                }
                case 179: {
                    n14 = 149;
                    break;
                }
                case 180: {
                    n14 = 136;
                    break;
                }
                case 181: {
                    n14 = 249;
                    break;
                }
                case 182: {
                    n14 = 247;
                    break;
                }
                case 183: {
                    n14 = 132;
                    break;
                }
                case 184: {
                    n14 = 57;
                    break;
                }
                case 185: {
                    n14 = 125;
                    break;
                }
                case 186: {
                    n14 = 198;
                    break;
                }
                case 187: {
                    n14 = 207;
                    break;
                }
                case 188: {
                    n14 = 104;
                    break;
                }
                case 189: {
                    n14 = 161;
                    break;
                }
                case 190: {
                    n14 = 237;
                    break;
                }
                case 191: {
                    n14 = 43;
                    break;
                }
                case 192: {
                    n14 = 135;
                    break;
                }
                case 193: {
                    n14 = 81;
                    break;
                }
                case 194: {
                    n14 = 190;
                    break;
                }
                case 195: {
                    n14 = 69;
                    break;
                }
                case 196: {
                    n14 = 55;
                    break;
                }
                case 197: {
                    n14 = 51;
                    break;
                }
                case 198: {
                    n14 = 112;
                    break;
                }
                case 199: {
                    n14 = 121;
                    break;
                }
                case 200: {
                    n14 = 201;
                    break;
                }
                case 201: {
                    n14 = 73;
                    break;
                }
                case 202: {
                    n14 = 28;
                    break;
                }
                case 203: {
                    n14 = 240;
                    break;
                }
                case 204: {
                    n14 = 34;
                    break;
                }
                case 205: {
                    n14 = 182;
                    break;
                }
                case 206: {
                    n14 = 82;
                    break;
                }
                case 207: {
                    n14 = 75;
                    break;
                }
                case 208: {
                    n14 = 202;
                    break;
                }
                case 209: {
                    n14 = 227;
                    break;
                }
                case 210: {
                    n14 = 0;
                    break;
                }
                case 211: {
                    n14 = 115;
                    break;
                }
                case 212: {
                    n14 = 188;
                    break;
                }
                case 213: {
                    n14 = 155;
                    break;
                }
                case 214: {
                    n14 = 220;
                    break;
                }
                case 215: {
                    n14 = 8;
                    break;
                }
                case 216: {
                    n14 = 102;
                    break;
                }
                case 217: {
                    n14 = 37;
                    break;
                }
                case 218: {
                    n14 = 211;
                    break;
                }
                case 219: {
                    n14 = 97;
                    break;
                }
                case 220: {
                    n14 = 242;
                    break;
                }
                case 221: {
                    n14 = 140;
                    break;
                }
                case 222: {
                    n14 = 93;
                    break;
                }
                case 223: {
                    n14 = 5;
                    break;
                }
                case 224: {
                    n14 = 111;
                    break;
                }
                case 225: {
                    n14 = 199;
                    break;
                }
                case 226: {
                    n14 = 1;
                    break;
                }
                case 227: {
                    n14 = 157;
                    break;
                }
                case 228: {
                    n14 = 217;
                    break;
                }
                case 229: {
                    n14 = 127;
                    break;
                }
                case 230: {
                    n14 = 234;
                    break;
                }
                case 231: {
                    n14 = 101;
                    break;
                }
                case 232: {
                    n14 = 100;
                    break;
                }
                case 233: {
                    n14 = 223;
                    break;
                }
                case 234: {
                    n14 = 143;
                    break;
                }
                case 235: {
                    n14 = 18;
                    break;
                }
                case 236: {
                    n14 = 169;
                    break;
                }
                case 237: {
                    n14 = 12;
                    break;
                }
                case 238: {
                    n14 = 120;
                    break;
                }
                case 239: {
                    n14 = 194;
                    break;
                }
                case 240: {
                    n14 = 71;
                    break;
                }
                case 241: {
                    n14 = 179;
                    break;
                }
                case 242: {
                    n14 = 224;
                    break;
                }
                case 243: {
                    n14 = 126;
                    break;
                }
                case 244: {
                    n14 = 78;
                    break;
                }
                case 245: {
                    n14 = 99;
                    break;
                }
                case 246: {
                    n14 = 15;
                    break;
                }
                case 247: {
                    n14 = 162;
                    break;
                }
                case 248: {
                    n14 = 19;
                    break;
                }
                case 249: {
                    n14 = 226;
                    break;
                }
                case 250: {
                    n14 = 130;
                    break;
                }
                case 251: {
                    n14 = 131;
                    break;
                }
                case 252: {
                    n14 = 13;
                    break;
                }
                case 253: {
                    n14 = 108;
                    break;
                }
                case 254: {
                    n14 = 187;
                    break;
                }
                default: {
                    n14 = 154;
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
            dc_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2D19;
        if (e[n11] == null) {
            dc_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

