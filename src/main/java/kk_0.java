/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from Kk
 */
public class kk_0
implements ky_0 {
    private ByteBuffer V;
    private static final long[] a;
    private static final Integer[] b;

    protected kk_0(ByteBuffer byteBuffer) {
        this.V = byteBuffer;
    }

    public static kk_0 S(int n10) {
        return new kk_0(ByteBuffer.allocate(n10));
    }

    public static kk_0 v(int n10) {
        return new kk_0(ByteBuffer.allocateDirect(n10));
    }

    public ky_0 M() {
        return new kk_0(this.V.slice());
    }

    public ky_0 o() {
        return new kk_0(this.V.duplicate());
    }

    public ky_0 Y() {
        return new kk_0(this.V.asReadOnlyBuffer());
    }

    @Override
    public byte c() {
        return this.V.get();
    }

    @Override
    public ky_0 X(byte[] byArray, int n10, int n11) {
        boolean bl = DF.M();
        while (n10 < n11) {
            byArray[n10] = this.c();
            ++n10;
            if (bl) continue;
        }
        return this;
    }

    @Override
    public ky_0 A(byte[] byArray) {
        return this.X(byArray, 0, byArray.length);
    }

    @Override
    public ky_0 c(byte by) {
        this.V.put(by);
        return this;
    }

    @Override
    public ky_0 A(byte[] byArray, int n10, int n11) {
        kk_0 kk_02;
        block2: {
            boolean bl = DF.c();
            while (n10 < n11) {
                kk_02 = this;
                if (!bl) {
                    kk_02.c(byArray[n10]);
                    ++n10;
                    if (!bl) continue;
                }
                break block2;
            }
            kk_02 = this;
        }
        return kk_02;
    }

    @Override
    public ky_0 G(byte[] byArray) {
        return this.A(byArray, 0, byArray.length);
    }

    @Override
    public byte z(int n10) {
        return this.V.get(n10);
    }

    @Override
    public ky_0 I(int n10, byte[] byArray, int n11, int n12) {
        boolean bl = DF.c();
        while (n11 < n12) {
            byArray[n11] = this.z(n10++);
            ++n11;
            if (!bl) continue;
        }
        return this;
    }

    @Override
    public ky_0 v(int n10, byte[] byArray) {
        return this.I(n10, byArray, 0, byArray.length);
    }

    @Override
    public ky_0 m(int n10, byte by) {
        this.V.put(n10, by);
        return this;
    }

    @Override
    public ky_0 T(int n10, byte[] byArray, int n11, int n12) {
        kk_0 kk_02;
        block2: {
            boolean bl = DF.c();
            while (n11 < n12) {
                kk_02 = this;
                if (!bl) {
                    kk_02.m(n10++, byArray[n11]);
                    ++n11;
                    if (!bl) continue;
                }
                break block2;
            }
            kk_02 = this;
        }
        return kk_02;
    }

    @Override
    public ky_0 z(int n10, byte[] byArray) {
        return this.T(n10, byArray, 0, byArray.length);
    }

    public ky_0 I() {
        this.V.compact();
        return this;
    }

    public boolean H() {
        return this.V.isDirect();
    }

    public char I() {
        return (char)this.c();
    }

    public ky_0 G(char c2) {
        return this.c((byte)c2);
    }

    public char e(int n10) {
        return (char)this.z(n10);
    }

    public ky_0 q(int n10, char c2) {
        return this.m(n10, (byte)c2);
    }

    @Override
    public fu_2 A() {
        return new fu_2(this.V);
    }

    public short l() {
        return DF.I(new byte[]{this.c(), this.c()}, ks_0.Little);
    }

    public ky_0 h(short s2) {
        return this.G(DF.C(s2, ks_0.Little));
    }

    public short U(int n10) {
        return DF.I(new byte[]{this.z(n10), this.z(n10 + 1)}, ks_0.Little);
    }

    public ky_0 Q(int n10, short s2) {
        return this.z(n10, DF.C(s2, ks_0.Little));
    }

    public int F() {
        return DF.a(new byte[]{this.c(), this.c(), this.c(), this.c()}, ks_0.Little);
    }

    public ky_0 x(int n10) {
        return this.G(DF.U(n10, ks_0.Little));
    }

    public int O(int n10) {
        return DF.a(new byte[]{this.z(n10), this.z(n10 + 1), this.z(n10 + 2), this.z(n10 + 3)}, ks_0.Little);
    }

    public ky_0 z(int n10, int n11) {
        return this.z(n10, DF.U(n11, ks_0.Little));
    }

    public long t() {
        byte[] byArray = new byte[kk_0.a(10403, 1899986921767400761L)];
        byArray[0] = this.c();
        byArray[1] = this.c();
        byArray[2] = this.c();
        byArray[3] = this.c();
        byArray[4] = this.c();
        byArray[5] = this.c();
        byArray[kk_0.a((int)21128, (long)2411241309327822613L)] = this.c();
        byArray[kk_0.a((int)18897, (long)988527996455654477L)] = this.c();
        return DF.J(byArray, ks_0.Little);
    }

    public ky_0 o(long l2) {
        return this.G(DF.h(l2, ks_0.Little));
    }

    public long Z(int n10) {
        boolean bl = DF.c();
        byte[] byArray = new byte[kk_0.a(32434, 8345057160215044907L)];
        byArray[0] = this.z(n10);
        byArray[1] = this.z(n10 + 1);
        byArray[2] = this.z(n10 + 2);
        byArray[3] = this.z(n10 + 3);
        byArray[4] = this.z(n10 + 4);
        byArray[5] = this.z(n10 + 5);
        byArray[kk_0.a((int)9837, (long)6489608780255198197L)] = this.z(n10 + kk_0.a(21128, 2411241309327822613L));
        byArray[kk_0.a((int)28983, (long)7186235527141600428L)] = this.z(n10 + kk_0.a(18897, 988527996455654477L));
        long l2 = DF.J(byArray, ks_0.Little);
        if (bl) {
            ky_2.K(new String[4]);
        }
        return l2;
    }

    public ky_0 n(int n10, long l2) {
        return this.z(n10, DF.h(l2, ks_0.Little));
    }

    public boolean Y() {
        return this.V.isReadOnly();
    }

    @Override
    public void a() {
        this.V.flip();
    }

    @Override
    public int l() {
        return this.V.remaining();
    }

    @Override
    public boolean K() {
        boolean bl = DF.M();
        boolean bl2 = this.l();
        if (bl) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public kk_0 z() {
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7682121485210232262L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "jH\u008dr\u00f7\u00a8\u0086\u00e5r\u0019\u00c7nY\u0007\u00de5\u0093->\u0083<\u00cb\tmU\u0089g\u00ad\u00ea\u008fP\u00f7";
                var5_4 = "jH\u008dr\u00f7\u00a8\u0086\u00e5r\u0019\u00c7nY\u0007\u00de5\u0093->\u0083<\u00cb\tmU\u0089g\u00ad\u00ea\u008fP\u00f7".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "T\u00fc\u00f3\u00c8\ta\u00aa\u00d5;\u0090\u00f2\u00ff\u00a8\u001e\u00b1\u008c";
                    var5_4 = "T\u00fc\u00f3\u00c8\ta\u00aa\u00d5;\u0090\u00f2\u00ff\u00a8\u001e\u00b1\u008c".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        kk_0.a = var6_1;
        kk_0.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5D99;
        if (b[n11] == null) {
            kk_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

