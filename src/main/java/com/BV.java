/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I4;
import com.kj_2;
import com.ky_2;
import com.p4_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BV {
    protected int d;
    protected int I;
    protected Color a = null;
    protected int E;
    protected int f = -1;
    public int Y = 0;
    protected boolean Z = false;
    protected OutputStream F;
    protected BufferedImage u;
    protected byte[] P;
    protected byte[] X;
    protected int j;
    protected byte[] U;
    protected boolean[] z = new boolean[BV.a(12222, 2512083220319857117L)];
    protected int W = BV.a(6869, 5064530814061698232L);
    protected int K = -1;
    protected boolean p = false;
    protected boolean l = true;
    protected boolean A = false;
    protected int w = BV.a(17269, 4243177942814000404L);
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] g;

    public void K(int n10) {
        this.Y = Math.round((float)n10 / 10.0f);
    }

    public void n(int n10) {
        if (n10 >= 0) {
            this.K = n10;
        }
    }

    public void B(int n10) {
        if (n10 >= 0) {
            this.f = n10;
        }
    }

    public void g(Color color) {
        this.a = color;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean V(BufferedImage bufferedImage) {
        boolean bl;
        ky_2[] ky_2Array;
        block25: {
            block26: {
                block32: {
                    ky_2Array = kj_2.d();
                    if (bufferedImage == null) return false;
                    bl = this.Z;
                    if (ky_2Array == null) break block25;
                    break block32;
                    catch (IOException iOException) {
                        throw BV.a(iOException);
                    }
                }
                try {
                    if (bl) break block26;
                    return false;
                    catch (IOException iOException) {
                        throw BV.a(iOException);
                    }
                }
                catch (IOException iOException) {
                    throw BV.a(iOException);
                }
            }
            bl = true;
        }
        boolean bl2 = bl;
        try {
            block31: {
                BV bV;
                int n10;
                block29: {
                    block30: {
                        block35: {
                            block34: {
                                block27: {
                                    block28: {
                                        n10 = this.A;
                                        if (ky_2Array == null) break block27;
                                        try {
                                            block33: {
                                                if (n10 != 0) break block28;
                                                break block33;
                                                catch (IOException iOException) {
                                                    throw BV.a(iOException);
                                                }
                                            }
                                            this.f(bufferedImage.getWidth(), bufferedImage.getHeight());
                                        }
                                        catch (IOException iOException) {
                                            throw BV.a(iOException);
                                        }
                                    }
                                    this.u = bufferedImage;
                                    this.f();
                                    this.F();
                                    n10 = this.l;
                                }
                                if (ky_2Array == null) break block29;
                                if (n10 == 0) break block30;
                                break block34;
                                catch (IOException iOException) {
                                    throw BV.a(iOException);
                                }
                            }
                            this.v();
                            this.S();
                            n10 = this.f;
                            if (ky_2Array == null) break block29;
                            break block35;
                            catch (IOException iOException) {
                                throw BV.a(iOException);
                            }
                        }
                        try {
                            block36: {
                                if (n10 < 0) break block30;
                                break block36;
                                catch (IOException iOException) {
                                    throw BV.a(iOException);
                                }
                            }
                            this.A();
                        }
                        catch (IOException iOException) {
                            throw BV.a(iOException);
                        }
                    }
                    try {
                        this.t();
                        this.X();
                        bV = this;
                        if (ky_2Array == null) break block31;
                        n10 = bV.l ? 1 : 0;
                    }
                    catch (IOException iOException) {
                        throw BV.a(iOException);
                    }
                }
                try {
                    if (n10 == 0) {
                        this.S();
                    }
                }
                catch (IOException iOException) {
                    throw BV.a(iOException);
                }
                this.w();
                bV = this;
            }
            bV.l = false;
            return bl2;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    /*
     * Loose catch block
     */
    public boolean G() {
        boolean bl;
        block11: {
            boolean bl2;
            ky_2[] ky_2Array;
            block9: {
                block10: {
                    ky_2Array = kj_2.d();
                    bl2 = this.Z;
                    if (ky_2Array == null) break block9;
                    try {
                        block12: {
                            if (bl2) break block10;
                            break block12;
                            catch (IOException iOException) {
                                throw BV.a(iOException);
                            }
                        }
                        return false;
                    }
                    catch (IOException iOException) {
                        throw BV.a(iOException);
                    }
                }
                bl2 = true;
            }
            bl = bl2;
            this.Z = false;
            try {
                this.F.write(BV.a(8075, 5913776848330414574L));
                this.F.flush();
                BV bV = this;
                if (ky_2Array != null) {
                    try {
                        if (!bV.p) break block11;
                        bV = this;
                    }
                    catch (IOException iOException) {
                        throw BV.a(iOException);
                    }
                }
                bV.F.close();
            }
            catch (IOException iOException) {
                bl = false;
            }
        }
        this.E = 0;
        this.F = null;
        this.u = null;
        this.P = null;
        this.X = null;
        this.U = null;
        this.p = false;
        this.l = true;
        return bl;
    }

    public void L(float f10) {
        if (f10 != 0.0f) {
            this.Y = Math.round(100.0f / f10);
        }
    }

    public void S(int n10) {
        ky_2[] ky_2Array = kj_2.d();
        if (ky_2Array != null) {
            if (n10 < 1) {
                n10 = 1;
            }
            this.w = n10;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(int var1_1, int var2_2) {
        block12: {
            block11: {
                var3_3 = kj_2.d();
                v0 = this.Z;
                if (var3_3 != null) {
                    if (v0 != 0) {
                        v0 = this.l;
                        if (var3_3 != null) {
                            if (v0 == 0) {
                                return;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        this.d = var1_1;
                        this.I = var2_2;
                        v0 = this.d;
                    }
                }
                v1 = 1;
                if (var3_3 == null) break block11;
                if (v0 < v1) {
                    this.d = BV.a(16471, 6515942925113820704L);
                }
                v2 = this;
                if (var3_3 == null) break block12;
                v0 = v2.I;
                v1 = 1;
            }
            if (v0 < v1) {
                this.I = BV.a(1510, 3743167882498098061L);
            }
            v2 = this;
        }
        v2.A = true;
    }

    public boolean f(OutputStream outputStream) {
        try {
            if (outputStream == null) {
                return false;
            }
        }
        catch (IOException iOException) {
            throw BV.a(iOException);
        }
        boolean bl = true;
        this.p = false;
        this.F = outputStream;
        try {
            this.V(BV.a(-24477, 10340));
        }
        catch (IOException iOException) {
            bl = false;
        }
        this.Z = bl;
        return this.Z;
    }

    public boolean F(String string) {
        boolean bl;
        try {
            this.F = new BufferedOutputStream(new FileOutputStream(string));
            bl = this.f(this.F);
            this.p = true;
        }
        catch (IOException iOException) {
            bl = false;
        }
        this.Z = bl;
        return this.Z;
    }

    protected void F() {
        block11: {
            block10: {
                ky_2[] ky_2Array;
                block9: {
                    int n10;
                    int n11;
                    I4 i4;
                    int n12;
                    block8: {
                        int n13 = this.P.length;
                        n12 = n13 / 3;
                        this.X = new byte[n12];
                        ky_2Array = kj_2.d();
                        i4 = new I4(this.P, n13, this.w);
                        this.U = i4.Q();
                        for (n11 = 0; n11 < this.U.length; n11 += 3) {
                            n10 = this.U[n11];
                            this.U[n11] = this.U[n11 + 2];
                            this.U[n11 + 2] = n10;
                            this.z[n11 / 3] = false;
                            if (ky_2Array != null) {
                                if (ky_2Array != null) continue;
                            }
                            break block8;
                        }
                        n11 = 0;
                    }
                    for (n10 = 0; n10 < n12; ++n10) {
                        int n14 = i4.Q(this.P[n11++] & BV.a(18193, 5401151161789874555L), this.P[n11++] & BV.a(18193, 5401151161789874555L), this.P[n11++] & BV.a(18193, 5401151161789874555L));
                        this.z[n14] = true;
                        this.X[n10] = (byte)n14;
                        if (ky_2Array != null) {
                            if (ky_2Array != null) continue;
                        }
                        break block9;
                    }
                    this.P = null;
                    this.j = BV.a(5041, 8696970219010971101L);
                    this.W = BV.a(6869, 5064530814061698232L);
                }
                BV bV = this;
                if (ky_2Array == null) break block10;
                if (bV.a == null) break block11;
                bV = this;
            }
            bV.E = this.N(this.a);
        }
    }

    protected int N(Color color) {
        int n10;
        block5: {
            ky_2[] ky_2Array = kj_2.d();
            if (this.U == null) {
                return -1;
            }
            int n11 = color.getRed();
            int n12 = color.getGreen();
            int n13 = color.getBlue();
            int n14 = 0;
            int n15 = BV.a(25812, 4606499669004231355L);
            int n16 = this.U.length;
            int n17 = 0;
            while (n17 < n16) {
                block6: {
                    block7: {
                        int n18;
                        block8: {
                            int n19 = n11 - (this.U[n17++] & BV.a(18193, 5401151161789874555L));
                            int n20 = n12 - (this.U[n17++] & BV.a(18193, 5401151161789874555L));
                            int n21 = n13 - (this.U[n17] & BV.a(18193, 5401151161789874555L));
                            int n22 = n19 * n19 + n20 * n20 + n21 * n21;
                            int n23 = n17 / 3;
                            if (ky_2Array == null) break block6;
                            n10 = this.z[n23];
                            if (ky_2Array == null) break block5;
                            if (n10 == 0) break block7;
                            n18 = n22;
                            if (ky_2Array == null) break block8;
                            if (n18 >= n15) break block7;
                            n15 = n22;
                            n18 = n23;
                        }
                        n14 = n18;
                    }
                    ++n17;
                }
                if (ky_2Array != null) continue;
            }
            n10 = n14;
        }
        return n10;
    }

    protected void f() {
        block5: {
            block3: {
                int n10;
                int n11;
                block4: {
                    int n12;
                    ky_2[] ky_2Array;
                    block2: {
                        int n13 = this.u.getWidth();
                        int n14 = this.u.getHeight();
                        ky_2Array = kj_2.d();
                        n12 = this.u.getType();
                        n11 = n13;
                        n10 = this.d;
                        if (ky_2Array == null) break block2;
                        if (n11 != n10) break block3;
                        n11 = n14;
                        n10 = this.I;
                    }
                    if (ky_2Array == null) break block4;
                    if (n11 != n10) break block3;
                    n11 = n12;
                    n10 = 5;
                }
                if (n11 == n10) break block5;
            }
            BufferedImage bufferedImage = new BufferedImage(this.d, this.I, 5);
            Graphics2D graphics2D = bufferedImage.createGraphics();
            graphics2D.drawImage((Image)this.u, 0, 0, null);
            graphics2D.dispose();
            this.u = bufferedImage;
        }
        this.P = ((DataBufferByte)this.u.getRaster().getDataBuffer()).getData();
    }

    protected void t() throws IOException {
        int n10;
        int n11;
        int n12;
        block4: {
            block5: {
                ky_2[] ky_2Array;
                block7: {
                    block6: {
                        this.F.write(BV.a(25612, 4567985777393377913L));
                        this.F.write(BV.a(15407, 787364067449403993L));
                        ky_2[] ky_2Array2 = kj_2.d();
                        this.F.write(4);
                        ky_2Array = ky_2Array2;
                        if (this.a != null) break block6;
                        n12 = 0;
                        n11 = 0;
                        if (ky_2Array != null) break block7;
                    }
                    n12 = 1;
                    n11 = 2;
                }
                try {
                    n10 = this.K;
                    if (ky_2Array == null) break block4;
                    if (n10 < 0) break block5;
                }
                catch (IOException iOException) {
                    throw BV.a(iOException);
                }
                n11 = this.K & BV.a(14257, 4457853080547881425L);
            }
            n10 = n11 << 2;
        }
        n11 = n10;
        this.F.write(n11 | n12);
        this.L(this.Y);
        this.F.write(this.E);
        this.F.write(0);
    }

    protected void X() throws IOException {
        block8: {
            BV bV;
            block6: {
                ky_2[] ky_2Array = kj_2.d();
                this.F.write(BV.a(25510, 1391381961491129806L));
                this.L(0);
                ky_2[] ky_2Array2 = ky_2Array;
                try {
                    block7: {
                        try {
                            try {
                                this.L(0);
                                this.L(this.d);
                                this.L(this.I);
                                bV = this;
                                if (ky_2Array2 == null) break block6;
                                if (!bV.l) break block7;
                            }
                            catch (IOException iOException) {
                                throw BV.a(iOException);
                            }
                            this.F.write(0);
                            if (ky_2Array2 != null) break block8;
                        }
                        catch (IOException iOException) {
                            throw BV.a(iOException);
                        }
                    }
                    bV = this;
                }
                catch (IOException iOException) {
                    throw BV.a(iOException);
                }
            }
            bV.F.write(BV.a(21681, 6653928719075414751L) | this.W);
        }
    }

    protected void v() throws IOException {
        this.L(this.d);
        this.L(this.I);
        this.F.write(BV.a(1134, 5459830961340269063L) | this.W);
        this.F.write(0);
        this.F.write(0);
    }

    protected void A() throws IOException {
        this.F.write(BV.a(32730, 8417048310966925742L));
        this.F.write(BV.a(18193, 5401151161789874555L));
        this.F.write(BV.a(938, 7622916308936476104L));
        this.V(BV.a(-24478, 19437));
        this.F.write(3);
        this.F.write(1);
        this.L(this.f);
        this.F.write(0);
    }

    protected void S() throws IOException {
        ky_2[] ky_2Array = kj_2.d();
        this.F.write(this.U, 0, this.U.length);
        int n10 = BV.a(19839, 2206132999955090200L) - this.U.length;
        ky_2[] ky_2Array2 = ky_2Array;
        for (int i2 = 0; i2 < n10; ++i2) {
            this.F.write(0);
            if (ky_2Array2 != null) continue;
        }
    }

    protected void w() throws IOException {
        p4_0 p4_02 = new p4_0(this.d, this.I, this.X, this.j);
        p4_02.e(this.F);
    }

    protected void L(int n10) throws IOException {
        this.F.write(n10 & BV.a(19609, 4617887921443867391L));
        this.F.write(n10 >> BV.a(25059, 4380381630871545735L) & BV.a(18193, 5401151161789874555L));
    }

    protected void V(String string) throws IOException {
        ky_2[] ky_2Array = kj_2.d();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            this.F.write((byte)string.charAt(i2));
            if (ky_2Array != null) continue;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00c9\u00ea\u00df\u0000H\u00c2\u000b\u00efk!\u00d6\u00bd>\u00c2\u0019\u00e9\u00ef|";
                    var12_3 = "\u00c9\u00ea\u00df\u0000H\u00c2\u000b\u00efk!\u00d6\u00bd>\u00c2\u0019\u00e9\u00ef|".length();
                    var9_4 = 6;
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
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 40;
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
                                    v11 = 81;
                                    break;
                                }
                                case 1: {
                                    v11 = 48;
                                    break;
                                }
                                case 2: {
                                    v11 = 8;
                                    break;
                                }
                                case 3: {
                                    v11 = 46;
                                    break;
                                }
                                case 4: {
                                    v11 = 40;
                                    break;
                                }
                                case 5: {
                                    v11 = 116;
                                    break;
                                }
                                default: {
                                    v11 = 38;
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
                BV.b = var13;
                BV.c = new String[2];
                var0_7 = 8997721363387538592L;
                var6_8 = new long[20];
                var3_9 = 0;
                var4_10 = "\u00c2\u00fb\u00e4\u0018\u00e4\u0016\u00fb/cy\u000fTq\u0001\u0085uiwETf\u0092\u00d6\u00a0\u00bd\u00b0\u00e4\u00da)?T\u00b8\u00ae\u00eeT?zG\u00adv\u0004\u0013a\f\u00e4\u009b\u00d9\u00beA\u0001:\u009b\u00ce\u0018\u0099c s.\u007fm\u00ca4}\u00d2Q8\u00f8\u009a\u00e4\u0089u\u00ec~\u00f7\u00e8J\u0082\u0080\u001f\u00cb\u008bH\u00b8\t\u00ea\u00ce\u00ff\u00be#\u00ed@\u0099[\u00fe\u001b\u00a5\u0082;\u00ed\u00dd8\u00f9BmQ\u008d\u00f2\u008c\u00f5\u009eWIE\u00c0B\f\u0004\u00dd$\u00e1Z\u008e\u0082\u0016[\u001f\u00dd\u00a0\u0099\u0002q\u009c\u00d4e/\u00cf\u0085\u00bc\u00cc\u00b49\u00fe\u00f8";
                var5_11 = "\u00c2\u00fb\u00e4\u0018\u00e4\u0016\u00fb/cy\u000fTq\u0001\u0085uiwETf\u0092\u00d6\u00a0\u00bd\u00b0\u00e4\u00da)?T\u00b8\u00ae\u00eeT?zG\u00adv\u0004\u0013a\f\u00e4\u009b\u00d9\u00beA\u0001:\u009b\u00ce\u0018\u0099c s.\u007fm\u00ca4}\u00d2Q8\u00f8\u009a\u00e4\u0089u\u00ec~\u00f7\u00e8J\u0082\u0080\u001f\u00cb\u008bH\u00b8\t\u00ea\u00ce\u00ff\u00be#\u00ed@\u0099[\u00fe\u001b\u00a5\u0082;\u00ed\u00dd8\u00f9BmQ\u008d\u00f2\u008c\u00f5\u009eWIE\u00c0B\f\u0004\u00dd$\u00e1Z\u008e\u0082\u0016[\u001f\u00dd\u00a0\u0099\u0002q\u009c\u00d4e/\u00cf\u0085\u00bc\u00cc\u00b49\u00fe\u00f8".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "m\u00b5\u0004.\u00e9\u0092&\u0000\u0091\u00c5\u00f2$0\u0089[\u00c0";
                    var5_11 = "m\u00b5\u0004.\u00e9\u0092&\u0000\u0091\u00c5\u00f2$0\u0089[\u00c0".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        BV.e = var6_8;
        BV.g = new Integer[20];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFA063) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 238;
                    break;
                }
                case 1: {
                    n14 = 207;
                    break;
                }
                case 2: {
                    n14 = 112;
                    break;
                }
                case 3: {
                    n14 = 136;
                    break;
                }
                case 4: {
                    n14 = 29;
                    break;
                }
                case 5: {
                    n14 = 39;
                    break;
                }
                case 6: {
                    n14 = 205;
                    break;
                }
                case 7: {
                    n14 = 185;
                    break;
                }
                case 8: {
                    n14 = 87;
                    break;
                }
                case 9: {
                    n14 = 161;
                    break;
                }
                case 10: {
                    n14 = 129;
                    break;
                }
                case 11: {
                    n14 = 5;
                    break;
                }
                case 12: {
                    n14 = 96;
                    break;
                }
                case 13: {
                    n14 = 128;
                    break;
                }
                case 14: {
                    n14 = 53;
                    break;
                }
                case 15: {
                    n14 = 76;
                    break;
                }
                case 16: {
                    n14 = 124;
                    break;
                }
                case 17: {
                    n14 = 166;
                    break;
                }
                case 18: {
                    n14 = 24;
                    break;
                }
                case 19: {
                    n14 = 170;
                    break;
                }
                case 20: {
                    n14 = 72;
                    break;
                }
                case 21: {
                    n14 = 226;
                    break;
                }
                case 22: {
                    n14 = 234;
                    break;
                }
                case 23: {
                    n14 = 239;
                    break;
                }
                case 24: {
                    n14 = 179;
                    break;
                }
                case 25: {
                    n14 = 1;
                    break;
                }
                case 26: {
                    n14 = 220;
                    break;
                }
                case 27: {
                    n14 = 145;
                    break;
                }
                case 28: {
                    n14 = 113;
                    break;
                }
                case 29: {
                    n14 = 254;
                    break;
                }
                case 30: {
                    n14 = 208;
                    break;
                }
                case 31: {
                    n14 = 157;
                    break;
                }
                case 32: {
                    n14 = 143;
                    break;
                }
                case 33: {
                    n14 = 184;
                    break;
                }
                case 34: {
                    n14 = 155;
                    break;
                }
                case 35: {
                    n14 = 103;
                    break;
                }
                case 36: {
                    n14 = 81;
                    break;
                }
                case 37: {
                    n14 = 214;
                    break;
                }
                case 38: {
                    n14 = 61;
                    break;
                }
                case 39: {
                    n14 = 130;
                    break;
                }
                case 40: {
                    n14 = 58;
                    break;
                }
                case 41: {
                    n14 = 188;
                    break;
                }
                case 42: {
                    n14 = 60;
                    break;
                }
                case 43: {
                    n14 = 253;
                    break;
                }
                case 44: {
                    n14 = 98;
                    break;
                }
                case 45: {
                    n14 = 173;
                    break;
                }
                case 46: {
                    n14 = 46;
                    break;
                }
                case 47: {
                    n14 = 201;
                    break;
                }
                case 48: {
                    n14 = 6;
                    break;
                }
                case 49: {
                    n14 = 156;
                    break;
                }
                case 50: {
                    n14 = 119;
                    break;
                }
                case 51: {
                    n14 = 117;
                    break;
                }
                case 52: {
                    n14 = 203;
                    break;
                }
                case 53: {
                    n14 = 140;
                    break;
                }
                case 54: {
                    n14 = 7;
                    break;
                }
                case 55: {
                    n14 = 237;
                    break;
                }
                case 56: {
                    n14 = 2;
                    break;
                }
                case 57: {
                    n14 = 216;
                    break;
                }
                case 58: {
                    n14 = 121;
                    break;
                }
                case 59: {
                    n14 = 93;
                    break;
                }
                case 60: {
                    n14 = 183;
                    break;
                }
                case 61: {
                    n14 = 118;
                    break;
                }
                case 62: {
                    n14 = 255;
                    break;
                }
                case 63: {
                    n14 = 36;
                    break;
                }
                case 64: {
                    n14 = 152;
                    break;
                }
                case 65: {
                    n14 = 160;
                    break;
                }
                case 66: {
                    n14 = 215;
                    break;
                }
                case 67: {
                    n14 = 194;
                    break;
                }
                case 68: {
                    n14 = 142;
                    break;
                }
                case 69: {
                    n14 = 38;
                    break;
                }
                case 70: {
                    n14 = 193;
                    break;
                }
                case 71: {
                    n14 = 241;
                    break;
                }
                case 72: {
                    n14 = 211;
                    break;
                }
                case 73: {
                    n14 = 132;
                    break;
                }
                case 74: {
                    n14 = 108;
                    break;
                }
                case 75: {
                    n14 = 107;
                    break;
                }
                case 76: {
                    n14 = 219;
                    break;
                }
                case 77: {
                    n14 = 41;
                    break;
                }
                case 78: {
                    n14 = 3;
                    break;
                }
                case 79: {
                    n14 = 28;
                    break;
                }
                case 80: {
                    n14 = 89;
                    break;
                }
                case 81: {
                    n14 = 153;
                    break;
                }
                case 82: {
                    n14 = 88;
                    break;
                }
                case 83: {
                    n14 = 115;
                    break;
                }
                case 84: {
                    n14 = 101;
                    break;
                }
                case 85: {
                    n14 = 82;
                    break;
                }
                case 86: {
                    n14 = 199;
                    break;
                }
                case 87: {
                    n14 = 249;
                    break;
                }
                case 88: {
                    n14 = 120;
                    break;
                }
                case 89: {
                    n14 = 197;
                    break;
                }
                case 90: {
                    n14 = 236;
                    break;
                }
                case 91: {
                    n14 = 176;
                    break;
                }
                case 92: {
                    n14 = 23;
                    break;
                }
                case 93: {
                    n14 = 227;
                    break;
                }
                case 94: {
                    n14 = 71;
                    break;
                }
                case 95: {
                    n14 = 148;
                    break;
                }
                case 96: {
                    n14 = 75;
                    break;
                }
                case 97: {
                    n14 = 131;
                    break;
                }
                case 98: {
                    n14 = 94;
                    break;
                }
                case 99: {
                    n14 = 111;
                    break;
                }
                case 100: {
                    n14 = 79;
                    break;
                }
                case 101: {
                    n14 = 66;
                    break;
                }
                case 102: {
                    n14 = 17;
                    break;
                }
                case 103: {
                    n14 = 73;
                    break;
                }
                case 104: {
                    n14 = 57;
                    break;
                }
                case 105: {
                    n14 = 147;
                    break;
                }
                case 106: {
                    n14 = 144;
                    break;
                }
                case 107: {
                    n14 = 177;
                    break;
                }
                case 108: {
                    n14 = 192;
                    break;
                }
                case 109: {
                    n14 = 246;
                    break;
                }
                case 110: {
                    n14 = 175;
                    break;
                }
                case 111: {
                    n14 = 59;
                    break;
                }
                case 112: {
                    n14 = 20;
                    break;
                }
                case 113: {
                    n14 = 232;
                    break;
                }
                case 114: {
                    n14 = 33;
                    break;
                }
                case 115: {
                    n14 = 91;
                    break;
                }
                case 116: {
                    n14 = 230;
                    break;
                }
                case 117: {
                    n14 = 67;
                    break;
                }
                case 118: {
                    n14 = 77;
                    break;
                }
                case 119: {
                    n14 = 69;
                    break;
                }
                case 120: {
                    n14 = 0;
                    break;
                }
                case 121: {
                    n14 = 229;
                    break;
                }
                case 122: {
                    n14 = 31;
                    break;
                }
                case 123: {
                    n14 = 186;
                    break;
                }
                case 124: {
                    n14 = 200;
                    break;
                }
                case 125: {
                    n14 = 50;
                    break;
                }
                case 126: {
                    n14 = 126;
                    break;
                }
                case 127: {
                    n14 = 40;
                    break;
                }
                case 128: {
                    n14 = 164;
                    break;
                }
                case 129: {
                    n14 = 83;
                    break;
                }
                case 130: {
                    n14 = 163;
                    break;
                }
                case 131: {
                    n14 = 135;
                    break;
                }
                case 132: {
                    n14 = 34;
                    break;
                }
                case 133: {
                    n14 = 212;
                    break;
                }
                case 134: {
                    n14 = 55;
                    break;
                }
                case 135: {
                    n14 = 9;
                    break;
                }
                case 136: {
                    n14 = 95;
                    break;
                }
                case 137: {
                    n14 = 80;
                    break;
                }
                case 138: {
                    n14 = 54;
                    break;
                }
                case 139: {
                    n14 = 231;
                    break;
                }
                case 140: {
                    n14 = 137;
                    break;
                }
                case 141: {
                    n14 = 245;
                    break;
                }
                case 142: {
                    n14 = 84;
                    break;
                }
                case 143: {
                    n14 = 228;
                    break;
                }
                case 144: {
                    n14 = 64;
                    break;
                }
                case 145: {
                    n14 = 167;
                    break;
                }
                case 146: {
                    n14 = 225;
                    break;
                }
                case 147: {
                    n14 = 68;
                    break;
                }
                case 148: {
                    n14 = 43;
                    break;
                }
                case 149: {
                    n14 = 125;
                    break;
                }
                case 150: {
                    n14 = 21;
                    break;
                }
                case 151: {
                    n14 = 48;
                    break;
                }
                case 152: {
                    n14 = 11;
                    break;
                }
                case 153: {
                    n14 = 102;
                    break;
                }
                case 154: {
                    n14 = 209;
                    break;
                }
                case 155: {
                    n14 = 247;
                    break;
                }
                case 156: {
                    n14 = 65;
                    break;
                }
                case 157: {
                    n14 = 92;
                    break;
                }
                case 158: {
                    n14 = 45;
                    break;
                }
                case 159: {
                    n14 = 151;
                    break;
                }
                case 160: {
                    n14 = 233;
                    break;
                }
                case 161: {
                    n14 = 248;
                    break;
                }
                case 162: {
                    n14 = 27;
                    break;
                }
                case 163: {
                    n14 = 56;
                    break;
                }
                case 164: {
                    n14 = 123;
                    break;
                }
                case 165: {
                    n14 = 206;
                    break;
                }
                case 166: {
                    n14 = 122;
                    break;
                }
                case 167: {
                    n14 = 178;
                    break;
                }
                case 168: {
                    n14 = 158;
                    break;
                }
                case 169: {
                    n14 = 116;
                    break;
                }
                case 170: {
                    n14 = 224;
                    break;
                }
                case 171: {
                    n14 = 100;
                    break;
                }
                case 172: {
                    n14 = 244;
                    break;
                }
                case 173: {
                    n14 = 141;
                    break;
                }
                case 174: {
                    n14 = 127;
                    break;
                }
                case 175: {
                    n14 = 195;
                    break;
                }
                case 176: {
                    n14 = 109;
                    break;
                }
                case 177: {
                    n14 = 10;
                    break;
                }
                case 178: {
                    n14 = 35;
                    break;
                }
                case 179: {
                    n14 = 49;
                    break;
                }
                case 180: {
                    n14 = 187;
                    break;
                }
                case 181: {
                    n14 = 169;
                    break;
                }
                case 182: {
                    n14 = 15;
                    break;
                }
                case 183: {
                    n14 = 19;
                    break;
                }
                case 184: {
                    n14 = 52;
                    break;
                }
                case 185: {
                    n14 = 223;
                    break;
                }
                case 186: {
                    n14 = 25;
                    break;
                }
                case 187: {
                    n14 = 174;
                    break;
                }
                case 188: {
                    n14 = 138;
                    break;
                }
                case 189: {
                    n14 = 32;
                    break;
                }
                case 190: {
                    n14 = 252;
                    break;
                }
                case 191: {
                    n14 = 180;
                    break;
                }
                case 192: {
                    n14 = 165;
                    break;
                }
                case 193: {
                    n14 = 104;
                    break;
                }
                case 194: {
                    n14 = 198;
                    break;
                }
                case 195: {
                    n14 = 210;
                    break;
                }
                case 196: {
                    n14 = 4;
                    break;
                }
                case 197: {
                    n14 = 162;
                    break;
                }
                case 198: {
                    n14 = 139;
                    break;
                }
                case 199: {
                    n14 = 22;
                    break;
                }
                case 200: {
                    n14 = 149;
                    break;
                }
                case 201: {
                    n14 = 70;
                    break;
                }
                case 202: {
                    n14 = 150;
                    break;
                }
                case 203: {
                    n14 = 78;
                    break;
                }
                case 204: {
                    n14 = 242;
                    break;
                }
                case 205: {
                    n14 = 85;
                    break;
                }
                case 206: {
                    n14 = 182;
                    break;
                }
                case 207: {
                    n14 = 221;
                    break;
                }
                case 208: {
                    n14 = 37;
                    break;
                }
                case 209: {
                    n14 = 191;
                    break;
                }
                case 210: {
                    n14 = 51;
                    break;
                }
                case 211: {
                    n14 = 97;
                    break;
                }
                case 212: {
                    n14 = 154;
                    break;
                }
                case 213: {
                    n14 = 189;
                    break;
                }
                case 214: {
                    n14 = 47;
                    break;
                }
                case 215: {
                    n14 = 196;
                    break;
                }
                case 216: {
                    n14 = 133;
                    break;
                }
                case 217: {
                    n14 = 106;
                    break;
                }
                case 218: {
                    n14 = 168;
                    break;
                }
                case 219: {
                    n14 = 146;
                    break;
                }
                case 220: {
                    n14 = 213;
                    break;
                }
                case 221: {
                    n14 = 171;
                    break;
                }
                case 222: {
                    n14 = 110;
                    break;
                }
                case 223: {
                    n14 = 62;
                    break;
                }
                case 224: {
                    n14 = 172;
                    break;
                }
                case 225: {
                    n14 = 86;
                    break;
                }
                case 226: {
                    n14 = 99;
                    break;
                }
                case 227: {
                    n14 = 218;
                    break;
                }
                case 228: {
                    n14 = 250;
                    break;
                }
                case 229: {
                    n14 = 18;
                    break;
                }
                case 230: {
                    n14 = 42;
                    break;
                }
                case 231: {
                    n14 = 74;
                    break;
                }
                case 232: {
                    n14 = 235;
                    break;
                }
                case 233: {
                    n14 = 14;
                    break;
                }
                case 234: {
                    n14 = 217;
                    break;
                }
                case 235: {
                    n14 = 90;
                    break;
                }
                case 236: {
                    n14 = 190;
                    break;
                }
                case 237: {
                    n14 = 159;
                    break;
                }
                case 238: {
                    n14 = 181;
                    break;
                }
                case 239: {
                    n14 = 134;
                    break;
                }
                case 240: {
                    n14 = 63;
                    break;
                }
                case 241: {
                    n14 = 105;
                    break;
                }
                case 242: {
                    n14 = 202;
                    break;
                }
                case 243: {
                    n14 = 26;
                    break;
                }
                case 244: {
                    n14 = 204;
                    break;
                }
                case 245: {
                    n14 = 8;
                    break;
                }
                case 246: {
                    n14 = 251;
                    break;
                }
                case 247: {
                    n14 = 44;
                    break;
                }
                case 248: {
                    n14 = 114;
                    break;
                }
                case 249: {
                    n14 = 30;
                    break;
                }
                case 250: {
                    n14 = 240;
                    break;
                }
                case 251: {
                    n14 = 243;
                    break;
                }
                case 252: {
                    n14 = 222;
                    break;
                }
                case 253: {
                    n14 = 12;
                    break;
                }
                case 254: {
                    n14 = 13;
                    break;
                }
                default: {
                    n14 = 16;
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
            BV.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4664;
        if (g[n11] == null) {
            BV.g[n11] = (int)(e[n11] ^ l2);
        }
        return g[n11];
    }
}

