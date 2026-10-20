/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.Y;
import com.YU;
import com.cv_0;
import com.dm_2;
import com.nn_2;
import com.pc_0;
import com.uJ;

abstract class CG
extends cv_0 {
    int e;
    int B;
    int y;
    private int O;
    nn_2 S;
    byte[] m;
    byte[] Y;
    byte[] l;
    byte[] s;
    private uJ w;
    private YU X;
    private byte[] D;
    private byte[] j;
    private byte[] u;
    protected String U;
    private static final String[] d;
    private static final String[] f;
    private static final long[] o;
    private static final Integer[] p;

    CG() {
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void x(DI dI, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) throws Exception {
        block34: {
            Class<Object> clazz;
            this.m = byArray;
            this.Y = byArray2;
            boolean bl = dm_2.J();
            this.l = byArray3;
            this.s = byArray4;
            try {
                clazz = Class.forName(dI.T(this.U)).asSubclass(Y.class);
                this.L = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                this.L.t();
            }
            catch (Exception exception) {
                throw new pc_0(exception.toString(), exception);
            }
            this.w = new uJ();
            this.X = new YU(this.w);
            try {
                CG cG;
                block33: {
                    int n10;
                    int n11;
                    block32: {
                        block38: {
                            block31: {
                                block30: {
                                    block29: {
                                        clazz = Class.forName(dI.T("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48007 out of bounds for length 7")).asSubclass(nn_2.class);
                                        this.e = Integer.parseInt(dI.T("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48004 out of bounds for length 7"));
                                        this.y = Integer.parseInt(dI.T("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48015 out of bounds for length 7"));
                                        this.B = Integer.parseInt(dI.T("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48009 out of bounds for length 7"));
                                        n11 = CG.o(this.e);
                                        if (bl) break block29;
                                        try {
                                            block35: {
                                                if (n11 != 0) throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48013 out of bounds for length 7" + this.e + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48011 out of bounds for length 7" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48012 out of bounds for length 7" + this.B);
                                                break block35;
                                                catch (Exception exception) {
                                                    throw CG.a(exception);
                                                }
                                            }
                                            n11 = CG.o(this.y);
                                        }
                                        catch (Exception exception) {
                                            throw CG.a(exception);
                                        }
                                    }
                                    if (bl) break block30;
                                    try {
                                        block36: {
                                            if (n11 != 0) throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48013 out of bounds for length 7" + this.e + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48011 out of bounds for length 7" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48012 out of bounds for length 7" + this.B);
                                            break block36;
                                            catch (Exception exception) {
                                                throw CG.a(exception);
                                            }
                                        }
                                        n11 = CG.o(this.B);
                                    }
                                    catch (Exception exception) {
                                        throw CG.a(exception);
                                    }
                                }
                                if (bl) break block31;
                                try {
                                    block37: {
                                        if (n11 != 0) throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48013 out of bounds for length 7" + this.e + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48011 out of bounds for length 7" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48012 out of bounds for length 7" + this.B);
                                        break block37;
                                        catch (Exception exception) {
                                            throw CG.a(exception);
                                        }
                                    }
                                    n11 = this.B;
                                }
                                catch (Exception exception) {
                                    throw CG.a(exception);
                                }
                            }
                            n10 = this.e;
                            if (bl) break block32;
                            if (n11 < n10) throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48013 out of bounds for length 7" + this.e + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48011 out of bounds for length 7" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48012 out of bounds for length 7" + this.B);
                            break block38;
                            catch (Exception exception) {
                                throw CG.a(exception);
                            }
                        }
                        try {
                            block39: {
                                cG = this;
                                if (bl) break block33;
                                break block39;
                                catch (Exception exception) {
                                    throw CG.a(exception);
                                }
                            }
                            int n10 = cG.y;
                            n10 = this.B;
                        }
                        catch (Exception exception) {
                            throw CG.a(exception);
                        }
                    }
                    try {
                        if (n11 < n10) {
                            throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 48013 out of bounds for length 7" + this.e + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48011 out of bounds for length 7" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48012 out of bounds for length 7" + this.B);
                        }
                    }
                    catch (Exception exception) {
                        throw CG.a(exception);
                    }
                    this.S = (nn_2)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    cG = this;
                }
                cG.S.J();
            }
            catch (Exception exception) {
                throw new pc_0(exception.toString(), exception);
            }
            try {
                try {
                    this.X.M();
                    this.w.V((byte)CG.b(3021, 6825857402996121714L));
                    this.w.u(this.e);
                    this.w.u(this.B);
                    this.w.u(this.y);
                    dI.D(this.X);
                    if (bl) return;
                    if (!dI.W().K(1)) break block34;
                }
                catch (Exception exception) {
                    throw CG.a(exception);
                }
                dI.W().t(1, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48000 out of bounds for length 7" + this.e + "<" + this.B + "<" + this.y + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48008 out of bounds for length 7");
                dI.W().t(1, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48010 out of bounds for length 7");
            }
            catch (Exception exception) {
                throw CG.a(exception);
            }
        }
        this.O = CG.b(30027, 6113358796981903099L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean f(uJ var1_1) throws Exception {
        block33: {
            var2_2 = dm_2.J();
            try {
                v0 = this.O;
                if (var2_2) break block33;
            }
            catch (Exception v1) {
                throw CG.a(v1);
            }
            {
                ** switch (v0)
            }
lbl-1000:
            // 1 sources

            {
                case 31: {
                    var1_1.d();
                    var1_1.r();
                    var4_3 = var1_1.r();
                    try {
                        try {
                            try {
                                try {
                                    v2 = var4_3;
                                    if (var2_2) ** GOTO lbl53
                                    if (v2 != CG.b(2111, 8079302063409062790L)) {
                                    }
                                    ** GOTO lbl43
                                }
                                catch (Exception v3) {
                                    throw CG.a(v3);
                                }
                                v4 = this.a.W().K(3);
                                if (!var2_2) {
                                }
                                ** GOTO lbl42
                            }
                            catch (Exception v5) {
                                throw CG.a(v5);
                            }
                            if (v4) {
                            }
                            ** GOTO lbl41
                        }
                        catch (Exception v6) {
                            throw CG.a(v6);
                        }
                        this.a.W().t(3, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48014 out of bounds for length 7" + var4_3);
                    }
                    catch (Exception v7) {
                        throw CG.a(v7);
                    }
lbl41:
                    // 2 sources

                    v4 = false;
lbl42:
                    // 2 sources

                    return v4;
lbl43:
                    // 1 sources

                    this.D = var1_1.e();
                    this.j = var1_1.e();
                    this.S.H(this.D);
                    this.S.j(this.j);
                    this.u = this.S.t();
                    this.X.M();
                    this.w.V((byte)CG.b(4158, 104265062556433283L));
                    this.w.x(this.u);
                    this.a.D(this.X);
                    v2 = (int)this.a.W().K(1);
lbl53:
                    // 2 sources

                    try {
                        try {
                            if (var2_2) ** GOTO lbl68
                            if (v2 != 0) {
                            }
                            ** GOTO lbl66
                        }
                        catch (Exception v8) {
                            throw CG.a(v8);
                        }
                        this.a.W().t(1, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48001 out of bounds for length 7");
                        this.a.W().t(1, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48006 out of bounds for length 7");
                    }
                    catch (Exception v9) {
                        throw CG.a(v9);
                    }
lbl66:
                    // 2 sources

                    this.O = CG.b(25256, 4302582045250128156L);
                    v2 = 1;
lbl68:
                    // 2 sources

                    return (boolean)v2;
                }
lbl69:
                // 1 sources

                case 33: {
                    var4_4 = var1_1.d();
                    var4_4 = var1_1.r();
                    var4_4 = var1_1.r();
                    try {
                        try {
                            try {
                                try {
                                    if (var2_2) ** GOTO lbl101
                                    if (var4_4 != CG.b(14008, 1148524996693875971L)) {
                                    }
                                    ** GOTO lbl100
                                }
                                catch (Exception v10) {
                                    throw CG.a(v10);
                                }
                                v11 = this.a.W().K(3);
                                if (!var2_2) {
                                }
                                ** GOTO lbl99
                            }
                            catch (Exception v12) {
                                throw CG.a(v12);
                            }
                            if (v11) {
                            }
                            ** GOTO lbl98
                        }
                        catch (Exception v13) {
                            throw CG.a(v13);
                        }
                        this.a.W().t(3, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 48005 out of bounds for length 7" + var4_4);
                    }
                    catch (Exception v14) {
                        throw CG.a(v14);
                    }
lbl98:
                    // 2 sources

                    v11 = false;
lbl99:
                    // 2 sources

                    return v11;
lbl100:
                    // 1 sources

                    this.k = var1_1.S();
lbl101:
                    // 2 sources

                    var5_5 = var1_1.e();
                    var6_6 = var1_1.S();
                    this.S.D(var5_5);
                    this.S.Z();
                    this.E = this.D(this.S.R());
                    this.w.m();
                    this.w.q(this.Y);
                    this.w.q(this.m);
                    this.w.q(this.s);
                    this.w.q(this.l);
                    this.w.q(this.k);
                    this.w.u(this.e);
                    this.w.u(this.B);
                    this.w.u(this.y);
                    this.w.x(this.D);
                    this.w.x(this.j);
                    this.w.x(this.u);
                    this.w.x(var5_5);
                    this.w.x(this.E);
                    var7_7 = new byte[this.w.P()];
                    this.w.W(var7_7);
                    this.L.p(var7_7, 0, var7_7.length);
                    this.b = this.L.O();
                    var3_8 = 0;
                    var4_4 = 0;
                    var4_4 = this.k[var3_8++] << CG.b(19202, 7870336158671024L) & CG.b(31019, 1415180787041243797L) | this.k[var3_8++] << CG.b(13208, 4925689549265262639L) & CG.b(27068, 4151108601908232708L) | this.k[var3_8++] << CG.b(3303, 3695953469647546194L) & CG.b(26028, 1990643846208294429L) | this.k[var3_8++] & CG.b(15939, 3442489187129054709L);
                    var8_9 = E8.O(this.k, var3_8, var4_4);
                    var9_10 = this.x(var8_9, this.k, var3_8 += var4_4, var6_6);
                    this.O = 0;
                    return var9_10;
                }
            }
lbl131:
            // 1 sources

            v0 = false;
        }
        return v0;
    }

    @Override
    public int j() {
        return this.O;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean o(int n10) {
        boolean bl = dm_2.F();
        int n11 = n10;
        if (!bl) return n11 != 0;
        if (n11 < CG.b(26471, 6477043492399877332L)) return 1 != 0;
        n11 = n10;
        if (!bl) return n11 != 0;
        if (n11 > CG.b(27352, 3704674362121552226L)) return 1 != 0;
        n11 = n10 % CG.b(30878, 8687391331070382882L);
        if (!bl) return n11 != 0;
        if (n11 == 0) return 0 != 0;
        return 1 != 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[14];
                        var11_1 = 0;
                        var10_2 = "\u00f3pq\u0015\u00a2>\u00fa)\u009aP\u0001Vo,G\u00a1\u0096\u00cc\u00cc\u00d2\u008f\u00c0\u00d5\u00af\u001a\u000b\u008eV\u009e\b\u00d1\u0015\u00c9\u0093\t3\f\t\u0001\u00e8\u00b6\u00c4}\u00b6\u009e\u0089\u0002'\u008d\u00fe\"5X\u00f70%\u00dc\u0012\u007f\u0082\u0016u\u00d2\u00b02\u00a9\u0012j\u00ca\u00a1\u00d4\u00dc9q\u0088\u00f9\bP\u00e9$\u00d7(7o\u00c2\u0002^\u000f\u001f+u\u00bc\u0005\u00b9\u008c{\u00e3,\t\u0005\"\u00d2\u0096\u0006N\u00f9\u00af\u00a7\u00de\u00f1\u0005#*8$/\"\u00afQU\u00e1\u00ef9\u00b09\\\u00bd\u008a\u0098\u0098^\u0095E\b\u0017\u00bd\u00ab\u00e6M\u00a2L\u001e\u00d7\u008a&i\u00b9\u00d2\u000eO\u008f'\u00d5\u00d2)\u00b09G\u001c3Y\u00d0\u00cf\u00da\u0000~\u0010\u00d1j\u0085\u0019\u00ef\u00ab\u0011\u00f8\u00ca\u00bc\u00b38\u00a1\u001e[+E\u008f\u0011+\u00e0\u00ad\u0006\u0089\t\u00faM\u00c9p\u0092 cS\u00ab\u0002\u00efA\"\u00bb\u0084\u00d7[\u00bfn\u00ba\u00d3\u001d\u00e0\u00a23\u009d+5\u00eb\u001c\u00c2?\u0011\u00b6\u001a\u00a8\u00a6_\u008a\u00a2\u008dl\u00d9e\u00aaU\u00ee";
                        var12_3 = "\u00f3pq\u0015\u00a2>\u00fa)\u009aP\u0001Vo,G\u00a1\u0096\u00cc\u00cc\u00d2\u008f\u00c0\u00d5\u00af\u001a\u000b\u008eV\u009e\b\u00d1\u0015\u00c9\u0093\t3\f\t\u0001\u00e8\u00b6\u00c4}\u00b6\u009e\u0089\u0002'\u008d\u00fe\"5X\u00f70%\u00dc\u0012\u007f\u0082\u0016u\u00d2\u00b02\u00a9\u0012j\u00ca\u00a1\u00d4\u00dc9q\u0088\u00f9\bP\u00e9$\u00d7(7o\u00c2\u0002^\u000f\u001f+u\u00bc\u0005\u00b9\u008c{\u00e3,\t\u0005\"\u00d2\u0096\u0006N\u00f9\u00af\u00a7\u00de\u00f1\u0005#*8$/\"\u00afQU\u00e1\u00ef9\u00b09\\\u00bd\u008a\u0098\u0098^\u0095E\b\u0017\u00bd\u00ab\u00e6M\u00a2L\u001e\u00d7\u008a&i\u00b9\u00d2\u000eO\u008f'\u00d5\u00d2)\u00b09G\u001c3Y\u00d0\u00cf\u00da\u0000~\u0010\u00d1j\u0085\u0019\u00ef\u00ab\u0011\u00f8\u00ca\u00bc\u00b38\u00a1\u001e[+E\u008f\u0011+\u00e0\u00ad\u0006\u0089\t\u00faM\u00c9p\u0092 cS\u00ab\u0002\u00efA\"\u00bb\u0084\u00d7[\u00bfn\u00ba\u00d3\u001d\u00e0\u00a23\u009d+5\u00eb\u001c\u00c2?\u0011\u00b6\u001a\u00a8\u00a6_\u008a\u00a2\u008dl\u00d9e\u00aaU\u00ee".length();
                        var9_4 = 25;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 45;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
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
                            var10_2 = "\u00d0u.M\u00cd\u00aam\u00e5|\bp\u00b7\u00fd}\u00fa\u009c\u00eb\u00e1\u00cb\u00c2\u00f4\u00a7x\u00f1'{s\u00a5\u001bM\u0010\u009d\u00e1\u00bb?\u00a3W\u00a5^K}\u009a$\u0016\u00b7v\u0084xu\u00891\u00bc]\u00be\u0016\"";
                            var12_3 = "\u00d0u.M\u00cd\u00aam\u00e5|\bp\u00b7\u00fd}\u00fa\u009c\u00eb\u00e1\u00cb\u00c2\u00f4\u00a7x\u00f1'{s\u00a5\u001bM\u0010\u009d\u00e1\u00bb?\u00a3W\u00a5^K}\u009a$\u0016\u00b7v\u0084xu\u00891\u00bc]\u00be\u0016\"".length();
                            var9_4 = 28;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 22;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
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
                            break block27;
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
                                    v15 = 101;
                                    break;
                                }
                                case 1: {
                                    v15 = 72;
                                    break;
                                }
                                case 2: {
                                    v15 = 61;
                                    break;
                                }
                                case 3: {
                                    v15 = 88;
                                    break;
                                }
                                case 4: {
                                    v15 = 119;
                                    break;
                                }
                                case 5: {
                                    v15 = 59;
                                    break;
                                }
                                default: {
                                    v15 = 77;
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
                CG.d = var13;
                CG.f = new String[14];
                var0_7 = 2391573921684395095L;
                var6_8 = new long[16];
                var3_9 = 0;
                var4_10 = "\u00d1\u00b1\u00b81:\u0085\u00f7\u00ce\u0085\r\t\u009d &\u0016SM|\u00ec\u0016\u00b3\u008eIu\u00cdg+\u00dd\u00ca\u00d6\u00b55\u00ba\u0098,k(>\u00ef\u00f4\u00b2\u00b6\u00f31\u00c1T\u0003u\u00ba\u00b5w\u0016)\u001b\u00f4\u0007\u009f\u00b2]\\\u00ff\u009b\u0006\u00c2\u00ac\u00fafcw\u0086\u00e5Jx*H\u00a1\u001e\u008b\u008a\u00b3=\u00c8\u00ab\u00bd\u00c7V\u001c\u0083\u00ee\u00ea\u007f\u00e1\u00e7\u00164\u00ff\u0095\u0084g\u00ae\u00c8\u00a0\u00f3\rr\u0000kip\r\u009dj";
                var5_11 = "\u00d1\u00b1\u00b81:\u0085\u00f7\u00ce\u0085\r\t\u009d &\u0016SM|\u00ec\u0016\u00b3\u008eIu\u00cdg+\u00dd\u00ca\u00d6\u00b55\u00ba\u0098,k(>\u00ef\u00f4\u00b2\u00b6\u00f31\u00c1T\u0003u\u00ba\u00b5w\u0016)\u001b\u00f4\u0007\u009f\u00b2]\\\u00ff\u009b\u0006\u00c2\u00ac\u00fafcw\u0086\u00e5Jx*H\u00a1\u001e\u008b\u008a\u00b3=\u00c8\u00ab\u00bd\u00c7V\u001c\u0083\u00ee\u00ea\u007f\u00e1\u00e7\u00164\u00ff\u0095\u0084g\u00ae\u00c8\u00a0\u00f3\rr\u0000kip\r\u009dj".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0099z2b\u00b9\u00d9Lh\u00fb\u00e4\u00f7\u008e\u00bd\u00e5A]";
                    var5_11 = "\u0099z2b\u00b9\u00d9Lh\u00fb\u00e4\u00f7\u008e\u00bd\u00e5A]".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        CG.o = var6_8;
        CG.p = new Integer[16];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFEB6D) & 0xFFFF;
        if (f[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 235;
                    break;
                }
                case 1: {
                    n14 = 72;
                    break;
                }
                case 2: {
                    n14 = 212;
                    break;
                }
                case 3: {
                    n14 = 128;
                    break;
                }
                case 4: {
                    n14 = 157;
                    break;
                }
                case 5: {
                    n14 = 10;
                    break;
                }
                case 6: {
                    n14 = 3;
                    break;
                }
                case 7: {
                    n14 = 100;
                    break;
                }
                case 8: {
                    n14 = 48;
                    break;
                }
                case 9: {
                    n14 = 189;
                    break;
                }
                case 10: {
                    n14 = 49;
                    break;
                }
                case 11: {
                    n14 = 209;
                    break;
                }
                case 12: {
                    n14 = 201;
                    break;
                }
                case 13: {
                    n14 = 206;
                    break;
                }
                case 14: {
                    n14 = 67;
                    break;
                }
                case 15: {
                    n14 = 238;
                    break;
                }
                case 16: {
                    n14 = 247;
                    break;
                }
                case 17: {
                    n14 = 175;
                    break;
                }
                case 18: {
                    n14 = 220;
                    break;
                }
                case 19: {
                    n14 = 196;
                    break;
                }
                case 20: {
                    n14 = 39;
                    break;
                }
                case 21: {
                    n14 = 118;
                    break;
                }
                case 22: {
                    n14 = 57;
                    break;
                }
                case 23: {
                    n14 = 153;
                    break;
                }
                case 24: {
                    n14 = 40;
                    break;
                }
                case 25: {
                    n14 = 186;
                    break;
                }
                case 26: {
                    n14 = 248;
                    break;
                }
                case 27: {
                    n14 = 167;
                    break;
                }
                case 28: {
                    n14 = 183;
                    break;
                }
                case 29: {
                    n14 = 197;
                    break;
                }
                case 30: {
                    n14 = 178;
                    break;
                }
                case 31: {
                    n14 = 216;
                    break;
                }
                case 32: {
                    n14 = 182;
                    break;
                }
                case 33: {
                    n14 = 19;
                    break;
                }
                case 34: {
                    n14 = 64;
                    break;
                }
                case 35: {
                    n14 = 251;
                    break;
                }
                case 36: {
                    n14 = 131;
                    break;
                }
                case 37: {
                    n14 = 105;
                    break;
                }
                case 38: {
                    n14 = 59;
                    break;
                }
                case 39: {
                    n14 = 155;
                    break;
                }
                case 40: {
                    n14 = 122;
                    break;
                }
                case 41: {
                    n14 = 165;
                    break;
                }
                case 42: {
                    n14 = 16;
                    break;
                }
                case 43: {
                    n14 = 114;
                    break;
                }
                case 44: {
                    n14 = 254;
                    break;
                }
                case 45: {
                    n14 = 221;
                    break;
                }
                case 46: {
                    n14 = 234;
                    break;
                }
                case 47: {
                    n14 = 92;
                    break;
                }
                case 48: {
                    n14 = 229;
                    break;
                }
                case 49: {
                    n14 = 205;
                    break;
                }
                case 50: {
                    n14 = 120;
                    break;
                }
                case 51: {
                    n14 = 35;
                    break;
                }
                case 52: {
                    n14 = 17;
                    break;
                }
                case 53: {
                    n14 = 140;
                    break;
                }
                case 54: {
                    n14 = 125;
                    break;
                }
                case 55: {
                    n14 = 93;
                    break;
                }
                case 56: {
                    n14 = 63;
                    break;
                }
                case 57: {
                    n14 = 30;
                    break;
                }
                case 58: {
                    n14 = 181;
                    break;
                }
                case 59: {
                    n14 = 123;
                    break;
                }
                case 60: {
                    n14 = 95;
                    break;
                }
                case 61: {
                    n14 = 87;
                    break;
                }
                case 62: {
                    n14 = 124;
                    break;
                }
                case 63: {
                    n14 = 85;
                    break;
                }
                case 64: {
                    n14 = 198;
                    break;
                }
                case 65: {
                    n14 = 23;
                    break;
                }
                case 66: {
                    n14 = 121;
                    break;
                }
                case 67: {
                    n14 = 110;
                    break;
                }
                case 68: {
                    n14 = 141;
                    break;
                }
                case 69: {
                    n14 = 82;
                    break;
                }
                case 70: {
                    n14 = 77;
                    break;
                }
                case 71: {
                    n14 = 149;
                    break;
                }
                case 72: {
                    n14 = 13;
                    break;
                }
                case 73: {
                    n14 = 6;
                    break;
                }
                case 74: {
                    n14 = 242;
                    break;
                }
                case 75: {
                    n14 = 58;
                    break;
                }
                case 76: {
                    n14 = 230;
                    break;
                }
                case 77: {
                    n14 = 156;
                    break;
                }
                case 78: {
                    n14 = 245;
                    break;
                }
                case 79: {
                    n14 = 200;
                    break;
                }
                case 80: {
                    n14 = 54;
                    break;
                }
                case 81: {
                    n14 = 239;
                    break;
                }
                case 82: {
                    n14 = 98;
                    break;
                }
                case 83: {
                    n14 = 174;
                    break;
                }
                case 84: {
                    n14 = 94;
                    break;
                }
                case 85: {
                    n14 = 146;
                    break;
                }
                case 86: {
                    n14 = 237;
                    break;
                }
                case 87: {
                    n14 = 4;
                    break;
                }
                case 88: {
                    n14 = 97;
                    break;
                }
                case 89: {
                    n14 = 2;
                    break;
                }
                case 90: {
                    n14 = 204;
                    break;
                }
                case 91: {
                    n14 = 228;
                    break;
                }
                case 92: {
                    n14 = 90;
                    break;
                }
                case 93: {
                    n14 = 7;
                    break;
                }
                case 94: {
                    n14 = 127;
                    break;
                }
                case 95: {
                    n14 = 194;
                    break;
                }
                case 96: {
                    n14 = 164;
                    break;
                }
                case 97: {
                    n14 = 129;
                    break;
                }
                case 98: {
                    n14 = 108;
                    break;
                }
                case 99: {
                    n14 = 116;
                    break;
                }
                case 100: {
                    n14 = 151;
                    break;
                }
                case 101: {
                    n14 = 99;
                    break;
                }
                case 102: {
                    n14 = 150;
                    break;
                }
                case 103: {
                    n14 = 53;
                    break;
                }
                case 104: {
                    n14 = 1;
                    break;
                }
                case 105: {
                    n14 = 168;
                    break;
                }
                case 106: {
                    n14 = 55;
                    break;
                }
                case 107: {
                    n14 = 89;
                    break;
                }
                case 108: {
                    n14 = 8;
                    break;
                }
                case 109: {
                    n14 = 171;
                    break;
                }
                case 110: {
                    n14 = 217;
                    break;
                }
                case 111: {
                    n14 = 81;
                    break;
                }
                case 112: {
                    n14 = 135;
                    break;
                }
                case 113: {
                    n14 = 218;
                    break;
                }
                case 114: {
                    n14 = 192;
                    break;
                }
                case 115: {
                    n14 = 117;
                    break;
                }
                case 116: {
                    n14 = 130;
                    break;
                }
                case 117: {
                    n14 = 12;
                    break;
                }
                case 118: {
                    n14 = 88;
                    break;
                }
                case 119: {
                    n14 = 244;
                    break;
                }
                case 120: {
                    n14 = 38;
                    break;
                }
                case 121: {
                    n14 = 202;
                    break;
                }
                case 122: {
                    n14 = 66;
                    break;
                }
                case 123: {
                    n14 = 119;
                    break;
                }
                case 124: {
                    n14 = 41;
                    break;
                }
                case 125: {
                    n14 = 162;
                    break;
                }
                case 126: {
                    n14 = 45;
                    break;
                }
                case 127: {
                    n14 = 109;
                    break;
                }
                case 128: {
                    n14 = 73;
                    break;
                }
                case 129: {
                    n14 = 163;
                    break;
                }
                case 130: {
                    n14 = 138;
                    break;
                }
                case 131: {
                    n14 = 50;
                    break;
                }
                case 132: {
                    n14 = 18;
                    break;
                }
                case 133: {
                    n14 = 179;
                    break;
                }
                case 134: {
                    n14 = 147;
                    break;
                }
                case 135: {
                    n14 = 170;
                    break;
                }
                case 136: {
                    n14 = 46;
                    break;
                }
                case 137: {
                    n14 = 15;
                    break;
                }
                case 138: {
                    n14 = 9;
                    break;
                }
                case 139: {
                    n14 = 252;
                    break;
                }
                case 140: {
                    n14 = 231;
                    break;
                }
                case 141: {
                    n14 = 145;
                    break;
                }
                case 142: {
                    n14 = 144;
                    break;
                }
                case 143: {
                    n14 = 113;
                    break;
                }
                case 144: {
                    n14 = 188;
                    break;
                }
                case 145: {
                    n14 = 34;
                    break;
                }
                case 146: {
                    n14 = 139;
                    break;
                }
                case 147: {
                    n14 = 203;
                    break;
                }
                case 148: {
                    n14 = 112;
                    break;
                }
                case 149: {
                    n14 = 172;
                    break;
                }
                case 150: {
                    n14 = 132;
                    break;
                }
                case 151: {
                    n14 = 107;
                    break;
                }
                case 152: {
                    n14 = 215;
                    break;
                }
                case 153: {
                    n14 = 80;
                    break;
                }
                case 154: {
                    n14 = 137;
                    break;
                }
                case 155: {
                    n14 = 84;
                    break;
                }
                case 156: {
                    n14 = 224;
                    break;
                }
                case 157: {
                    n14 = 180;
                    break;
                }
                case 158: {
                    n14 = 184;
                    break;
                }
                case 159: {
                    n14 = 68;
                    break;
                }
                case 160: {
                    n14 = 226;
                    break;
                }
                case 161: {
                    n14 = 78;
                    break;
                }
                case 162: {
                    n14 = 5;
                    break;
                }
                case 163: {
                    n14 = 111;
                    break;
                }
                case 164: {
                    n14 = 74;
                    break;
                }
                case 165: {
                    n14 = 211;
                    break;
                }
                case 166: {
                    n14 = 27;
                    break;
                }
                case 167: {
                    n14 = 69;
                    break;
                }
                case 168: {
                    n14 = 241;
                    break;
                }
                case 169: {
                    n14 = 236;
                    break;
                }
                case 170: {
                    n14 = 176;
                    break;
                }
                case 171: {
                    n14 = 31;
                    break;
                }
                case 172: {
                    n14 = 158;
                    break;
                }
                case 173: {
                    n14 = 65;
                    break;
                }
                case 174: {
                    n14 = 126;
                    break;
                }
                case 175: {
                    n14 = 32;
                    break;
                }
                case 176: {
                    n14 = 227;
                    break;
                }
                case 177: {
                    n14 = 160;
                    break;
                }
                case 178: {
                    n14 = 33;
                    break;
                }
                case 179: {
                    n14 = 154;
                    break;
                }
                case 180: {
                    n14 = 225;
                    break;
                }
                case 181: {
                    n14 = 76;
                    break;
                }
                case 182: {
                    n14 = 0;
                    break;
                }
                case 183: {
                    n14 = 102;
                    break;
                }
                case 184: {
                    n14 = 61;
                    break;
                }
                case 185: {
                    n14 = 79;
                    break;
                }
                case 186: {
                    n14 = 28;
                    break;
                }
                case 187: {
                    n14 = 24;
                    break;
                }
                case 188: {
                    n14 = 161;
                    break;
                }
                case 189: {
                    n14 = 249;
                    break;
                }
                case 190: {
                    n14 = 86;
                    break;
                }
                case 191: {
                    n14 = 115;
                    break;
                }
                case 192: {
                    n14 = 20;
                    break;
                }
                case 193: {
                    n14 = 56;
                    break;
                }
                case 194: {
                    n14 = 207;
                    break;
                }
                case 195: {
                    n14 = 42;
                    break;
                }
                case 196: {
                    n14 = 70;
                    break;
                }
                case 197: {
                    n14 = 253;
                    break;
                }
                case 198: {
                    n14 = 177;
                    break;
                }
                case 199: {
                    n14 = 173;
                    break;
                }
                case 200: {
                    n14 = 104;
                    break;
                }
                case 201: {
                    n14 = 62;
                    break;
                }
                case 202: {
                    n14 = 96;
                    break;
                }
                case 203: {
                    n14 = 193;
                    break;
                }
                case 204: {
                    n14 = 195;
                    break;
                }
                case 205: {
                    n14 = 47;
                    break;
                }
                case 206: {
                    n14 = 14;
                    break;
                }
                case 207: {
                    n14 = 29;
                    break;
                }
                case 208: {
                    n14 = 83;
                    break;
                }
                case 209: {
                    n14 = 133;
                    break;
                }
                case 210: {
                    n14 = 199;
                    break;
                }
                case 211: {
                    n14 = 222;
                    break;
                }
                case 212: {
                    n14 = 51;
                    break;
                }
                case 213: {
                    n14 = 185;
                    break;
                }
                case 214: {
                    n14 = 43;
                    break;
                }
                case 215: {
                    n14 = 60;
                    break;
                }
                case 216: {
                    n14 = 91;
                    break;
                }
                case 217: {
                    n14 = 223;
                    break;
                }
                case 218: {
                    n14 = 243;
                    break;
                }
                case 219: {
                    n14 = 213;
                    break;
                }
                case 220: {
                    n14 = 101;
                    break;
                }
                case 221: {
                    n14 = 75;
                    break;
                }
                case 222: {
                    n14 = 190;
                    break;
                }
                case 223: {
                    n14 = 36;
                    break;
                }
                case 224: {
                    n14 = 103;
                    break;
                }
                case 225: {
                    n14 = 152;
                    break;
                }
                case 226: {
                    n14 = 246;
                    break;
                }
                case 227: {
                    n14 = 44;
                    break;
                }
                case 228: {
                    n14 = 21;
                    break;
                }
                case 229: {
                    n14 = 26;
                    break;
                }
                case 230: {
                    n14 = 255;
                    break;
                }
                case 231: {
                    n14 = 208;
                    break;
                }
                case 232: {
                    n14 = 187;
                    break;
                }
                case 233: {
                    n14 = 159;
                    break;
                }
                case 234: {
                    n14 = 106;
                    break;
                }
                case 235: {
                    n14 = 148;
                    break;
                }
                case 236: {
                    n14 = 169;
                    break;
                }
                case 237: {
                    n14 = 136;
                    break;
                }
                case 238: {
                    n14 = 214;
                    break;
                }
                case 239: {
                    n14 = 250;
                    break;
                }
                case 240: {
                    n14 = 232;
                    break;
                }
                case 241: {
                    n14 = 134;
                    break;
                }
                case 242: {
                    n14 = 210;
                    break;
                }
                case 243: {
                    n14 = 142;
                    break;
                }
                case 244: {
                    n14 = 25;
                    break;
                }
                case 245: {
                    n14 = 240;
                    break;
                }
                case 246: {
                    n14 = 233;
                    break;
                }
                case 247: {
                    n14 = 166;
                    break;
                }
                case 248: {
                    n14 = 52;
                    break;
                }
                case 249: {
                    n14 = 37;
                    break;
                }
                case 250: {
                    n14 = 191;
                    break;
                }
                case 251: {
                    n14 = 71;
                    break;
                }
                case 252: {
                    n14 = 219;
                    break;
                }
                case 253: {
                    n14 = 143;
                    break;
                }
                case 254: {
                    n14 = 11;
                    break;
                }
                default: {
                    n14 = 22;
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
            CG.f[n12] = new String(cArray).intern();
        }
        return f[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6BB9;
        if (p[n11] == null) {
            CG.p[n11] = (int)(o[n11] ^ l2);
        }
        return p[n11];
    }
}

