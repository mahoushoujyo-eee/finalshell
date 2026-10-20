/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FO;
import com.P;
import com.QT;
import com.cj_2;
import com.dx_2;
import com.y4_0;
import java.io.IOException;

/*
 * Renamed from com.p_
 */
public abstract class p__0
implements FO {
    protected final y4_0 a;
    protected final QT w;
    private boolean n = false;
    int B = 0;
    private static final long[] i;
    private static final Integer[] j;

    public p__0(y4_0 y4_02, QT qT) {
        this.a = y4_02;
        this.w = qT;
    }

    @Override
    public boolean u() {
        String string = dx_2.g();
        boolean bl = this.n;
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public void I() {
        this.n = false;
    }

    public abstract cj_2 r();

    public abstract boolean Q();

    protected abstract void C(char var1, QT var2) throws IOException;

    /*
     * Unable to fully structure code
     */
    @Override
    public void C() throws IOException {
        block23: {
            var1_1 = dx_2.g();
            try {
                block25: {
                    block26: {
                        block24: {
                            block28: {
                                block27: {
                                    block22: {
                                        try {
                                            v0 = this.a.O();
                                            if (var1_1 != null) break block22;
                                            if (v0 == 0) {
                                            }
                                            ** GOTO lbl15
                                        }
                                        catch (P v1) {
                                            throw p__0.a(v1);
                                        }
                                        var2_2 = this.a.C();
                                        try {
                                            this.o((char)var2_2, this.w);
                                            if (var1_1 == null) break block23;
lbl15:
                                            // 2 sources

                                            v0 = this.a.O();
                                        }
                                        catch (P v2) {
                                            throw p__0.a(v2);
                                        }
                                    }
                                    if (var1_1 != null) break block24;
                                    if (v0 == p__0.a(9316, 5918974700195754420L)) ** GOTO lbl40
                                    break block27;
                                    catch (P v3) {
                                        throw p__0.a(v3);
                                    }
                                }
                                v0 = this.a.O();
                                if (var1_1 != null) break block24;
                                break block28;
                                catch (P v4) {
                                    throw p__0.a(v4);
                                }
                            }
                            try {
                                block29: {
                                    if (v0 != p__0.a(32691, 7223682465914448482L)) break block23;
                                    break block29;
                                    catch (P v5) {
                                        throw p__0.a(v5);
                                    }
                                }
                                v0 = 0;
                            }
                            catch (P v6) {
                                throw p__0.a(v6);
                            }
                        }
                        var2_2 = v0;
                        try {
                            v7 = this.B;
                            if (var1_1 != null) break block25;
                            if (v7 != 0) break block26;
                        }
                        catch (P v8) {
                            throw p__0.a(v8);
                        }
                        var3_4 = this.r();
                        var4_5 = var3_4.f();
                        var5_6 = var4_5.W();
                        try {
                            v7 = (int)var5_6;
                            if (var1_1 != null) break block25;
                            if (v7 == 0) break block26;
                        }
                        catch (P v9) {
                            throw p__0.a(v9);
                        }
                        var2_2 = (int)this.Q();
                        this.a.o(0);
                        var4_5.U(false);
                    }
                    this.B = this.a.O();
                    v7 = var2_2;
                }
                try {
                    if (v7 == 0) {
                        throw new P();
                    }
                }
                catch (P v10) {
                    throw p__0.a(v10);
                }
            }
            catch (P var2_3) {
                this.n = true;
            }
        }
    }

    protected abstract void o(char var1, QT var2) throws IOException;

    private static P a(P p2) {
        return p2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2246546256365630860L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00e9\u00fe:\u000b\u00c9$_\u00fa\u00d1|\u00b4J\u00e9\u0099\u00042";
        int n11 = "\u00e9\u00fe:\u000b\u00c9$_\u00fa\u00d1|\u00b4J\u00e9\u0099\u00042".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        i = lArray;
        j = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x15D1;
        if (j[n11] == null) {
            p__0.j[n11] = (int)(i[n11] ^ l2);
        }
        return j[n11];
    }
}

