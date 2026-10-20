/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from fu
 */
public class fu_2
implements ky_0 {
    private static final byte[] u;
    private ByteBuffer U;
    private static final long[] a;
    private static final Integer[] b;

    public static byte[] J(byte[] byArray) {
        byte[] byArray2;
        block2: {
            byte[] byArray3 = new byte[byArray.length * 2];
            boolean bl = DF.c();
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                byArray2 = fu_2.b(byArray[i2]);
                if (!bl) {
                    System.arraycopy(byArray2, 0, byArray3, i2 * 2, 2);
                    if (!bl) continue;
                }
                break block2;
            }
            byArray2 = byArray3;
        }
        return byArray2;
    }

    public static byte[] i(byte[] byArray) {
        byte[] byArray2;
        block2: {
            byte[] byArray3 = new byte[byArray.length / 2];
            boolean bl = DF.M();
            for (int i2 = 0; i2 < byArray3.length; ++i2) {
                byte[] byArray4 = new byte[2];
                System.arraycopy(byArray, i2 * 2, byArray4, 0, 2);
                byArray2 = byArray3;
                if (bl) {
                    byArray2[i2] = fu_2.H(byArray4);
                    if (bl) continue;
                }
                break block2;
            }
            byArray2 = byArray3;
        }
        return byArray2;
    }

    private static byte H(byte[] byArray) {
        int n10 = Arrays.binarySearch(u, byArray[0]) * fu_2.a(22523, 2603451377351864266L);
        return (byte)(n10 += Arrays.binarySearch(u, byArray[1]));
    }

    private static byte[] b(byte by) {
        byte[] byArray = new byte[]{u[by >> 4 & fu_2.a(7873, 6849712489932089084L)], u[by & fu_2.a(1012, 8315339687666809812L)]};
        return byArray;
    }

    protected fu_2(ByteBuffer byteBuffer) {
        this.U = byteBuffer;
    }

    public static fu_2 y(int n10) {
        return new fu_2(ByteBuffer.allocate(n10 * 2));
    }

    public static fu_2 L(int n10) {
        return new fu_2(ByteBuffer.allocateDirect(n10 * 2));
    }

    public ky_0 m() {
        return new fu_2(this.U.slice());
    }

    public ky_0 R() {
        return new fu_2(this.U.duplicate());
    }

    public ky_0 Z() {
        return new fu_2(this.U.asReadOnlyBuffer());
    }

    @Override
    public byte c() {
        return fu_2.H(new byte[]{this.U.get(), this.U.get()});
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
        this.U.put(fu_2.b(by));
        return this;
    }

    @Override
    public ky_0 A(byte[] byArray, int n10, int n11) {
        fu_2 fu_22;
        block2: {
            boolean bl = DF.M();
            while (n10 < n11) {
                fu_22 = this;
                if (bl) {
                    fu_22.c(byArray[n10]);
                    ++n10;
                    if (bl) continue;
                }
                break block2;
            }
            fu_22 = this;
        }
        return fu_22;
    }

    @Override
    public ky_0 G(byte[] byArray) {
        return this.A(byArray, 0, byArray.length);
    }

    @Override
    public byte z(int n10) {
        return fu_2.H(new byte[]{this.U.get(n10 * 2), this.U.get(n10 * 2 + 1)});
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
        byte[] byArray = fu_2.b(by);
        this.U.put(n10 * 2, byArray[0]);
        this.U.put(n10 * 2 + 1, byArray[1]);
        return this;
    }

    @Override
    public ky_0 T(int n10, byte[] byArray, int n11, int n12) {
        fu_2 fu_22;
        block2: {
            boolean bl = DF.M();
            while (n11 < n12) {
                fu_22 = this;
                if (bl) {
                    fu_22.m(n10++, byArray[n11]);
                    ++n11;
                    if (bl) continue;
                }
                break block2;
            }
            fu_22 = this;
        }
        return fu_22;
    }

    @Override
    public ky_0 z(int n10, byte[] byArray) {
        return this.T(n10, byArray, 0, byArray.length);
    }

    public ky_0 P() {
        this.U.compact();
        return this;
    }

    public boolean E() {
        return this.U.isDirect();
    }

    public char R() {
        return (char)this.c();
    }

    public ky_0 B(char c2) {
        return this.c((byte)c2);
    }

    public char F(int n10) {
        return (char)this.z(n10);
    }

    public ky_0 P(int n10, char c2) {
        return this.m(n10, (byte)c2);
    }

    @Override
    public kk_0 z() {
        return new kk_0(this.U);
    }

    public short K() {
        return DF.I(new byte[]{this.c(), this.c()}, ks_0.Little);
    }

    public ky_0 P(short s2) {
        return this.G(DF.C(s2, ks_0.Little));
    }

    public short H(int n10) {
        return DF.I(new byte[]{this.z(n10), this.z(n10 + 1)}, ks_0.Little);
    }

    public ky_0 g(int n10, short s2) {
        return this.z(n10, DF.C(s2, ks_0.Little));
    }

    public int z() {
        return DF.a(new byte[]{this.c(), this.c(), this.c(), this.c()}, ks_0.Little);
    }

    public ky_0 P(int n10) {
        return this.G(DF.U(n10, ks_0.Little));
    }

    public int B(int n10) {
        return DF.a(new byte[]{this.z(n10), this.z(n10 + 1), this.z(n10 + 2), this.z(n10 + 3)}, ks_0.Little);
    }

    public ky_0 G(int n10, int n11) {
        return this.z(n10, DF.U(n11, ks_0.Little));
    }

    public long q() {
        byte[] byArray = new byte[fu_2.a(26838, 1235999945135886577L)];
        byArray[0] = this.c();
        byArray[1] = this.c();
        byArray[2] = this.c();
        byArray[3] = this.c();
        byArray[4] = this.c();
        byArray[5] = this.c();
        byArray[fu_2.a((int)22574, (long)2472483700774051857L)] = this.c();
        byArray[fu_2.a((int)6216, (long)9211536570294984820L)] = this.c();
        return DF.J(byArray, ks_0.Little);
    }

    public ky_0 v(long l2) {
        return this.G(DF.h(l2, ks_0.Little));
    }

    public long h(int n10) {
        boolean bl = DF.M();
        byte[] byArray = new byte[fu_2.a(5043, 375197524539534216L)];
        byArray[0] = this.z(n10);
        byArray[1] = this.z(n10 + 1);
        byArray[2] = this.z(n10 + 2);
        byArray[3] = this.z(n10 + 3);
        byArray[4] = this.z(n10 + 4);
        byArray[5] = this.z(n10 + 5);
        byArray[fu_2.a((int)21385, (long)8014350891915258800L)] = this.z(n10 + fu_2.a(21385, 8014350891915258800L));
        byArray[fu_2.a((int)11091, (long)6332614515620729697L)] = this.z(n10 + fu_2.a(11091, 6332614515620729697L));
        long l2 = DF.J(byArray, ks_0.Little);
        if (ky_2.F() != null) {
            DF.N(!bl);
        }
        return l2;
    }

    public ky_0 y(int n10, long l2) {
        return this.z(n10, DF.h(l2, ks_0.Little));
    }

    public boolean L() {
        return this.U.isReadOnly();
    }

    @Override
    public void a() {
        this.U.flip();
    }

    @Override
    public int l() {
        double d2 = (double)this.U.remaining() / 2.0;
        return (int)Math.floor(d2);
    }

    @Override
    public boolean K() {
        boolean bl = DF.c();
        boolean bl2 = this.U.remaining();
        if (!bl) {
            bl2 = bl2 > true;
        }
        return bl2;
    }

    @Override
    public fu_2 A() {
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 369021262838467090L;
                var6_1 = new long[32];
                var3_2 = 0;
                var4_3 = "\u00ad \u0098\u00ec\u00b4\"\u0088f]q)\u0083_#\u00b8`\u00baK\u0094\u00bd\u0093\u00d5\u009e\u00d9\u0088Q\u0011\u009d\u000f\u00b6\u00d0\u00e7m\u00bd,\u008e\u00e9f\u0019\u00ce)D\u00dd\u00d4\u00d8\u00b0F\u00f6V\u00c5^7\u00d6\nem\u0005\u00d3\u00a1n\u0093\u00f4\u008ab\u0004\u00fd\u00138\fht\u0083\r\u00a1\u001dD\u00f4s\u0087\u00fe\u000f\u0092\u008b\u00be\u00fa\u00a4\u0090\u00f2$\u00ba{\u00ae\u00ee7\u009a\u00eb\u00fe\u00c4\u00d4\u0019\u0088\u001b\u00f1\u00c9\u0010\u00cbd\u001d.\u00f6A\u008c\u00c0\u0080\u00e0\u00b5K-\u00a4~\u00d1\u00e5)\u0001\u00a0v\u0092\u00feS\u00dc_F\u0095\u00feja\u00c2\u00ff0\u0004\u00f9\u00f8\u00ec\u00e1\u00a9\u00cdG~\u00b4G2\u00d90\u00e6\u00e7\u00fe_\u0099*\u0005\u00d7?\n\u00a1\u00afr\u009a\f\u0098\u00a1\u00b44\u0087\u00fc!\u00a4a\u00dc\u0089{\u00ad\"\u00ff\u00c5m8\u00ac\u00b8\u0004\u00c5a\u0092}\u000eH\u008a\u00ea$p\bX2\u001c\u0083[\u00db\u00d9\u00f5\u0002\u0098\u00eb\u00d8a\u00de\u008f\u0019TI%\u00ea$\u00a2o%:O\u0016\u00ffl\u00bd\u00aa\u00d4\u001c` \u00e0\u00cf\u0002\u00a5\u00c8";
                var5_4 = "\u00ad \u0098\u00ec\u00b4\"\u0088f]q)\u0083_#\u00b8`\u00baK\u0094\u00bd\u0093\u00d5\u009e\u00d9\u0088Q\u0011\u009d\u000f\u00b6\u00d0\u00e7m\u00bd,\u008e\u00e9f\u0019\u00ce)D\u00dd\u00d4\u00d8\u00b0F\u00f6V\u00c5^7\u00d6\nem\u0005\u00d3\u00a1n\u0093\u00f4\u008ab\u0004\u00fd\u00138\fht\u0083\r\u00a1\u001dD\u00f4s\u0087\u00fe\u000f\u0092\u008b\u00be\u00fa\u00a4\u0090\u00f2$\u00ba{\u00ae\u00ee7\u009a\u00eb\u00fe\u00c4\u00d4\u0019\u0088\u001b\u00f1\u00c9\u0010\u00cbd\u001d.\u00f6A\u008c\u00c0\u0080\u00e0\u00b5K-\u00a4~\u00d1\u00e5)\u0001\u00a0v\u0092\u00feS\u00dc_F\u0095\u00feja\u00c2\u00ff0\u0004\u00f9\u00f8\u00ec\u00e1\u00a9\u00cdG~\u00b4G2\u00d90\u00e6\u00e7\u00fe_\u0099*\u0005\u00d7?\n\u00a1\u00afr\u009a\f\u0098\u00a1\u00b44\u0087\u00fc!\u00a4a\u00dc\u0089{\u00ad\"\u00ff\u00c5m8\u00ac\u00b8\u0004\u00c5a\u0092}\u000eH\u008a\u00ea$p\bX2\u001c\u0083[\u00db\u00d9\u00f5\u0002\u0098\u00eb\u00d8a\u00de\u008f\u0019TI%\u00ea$\u00a2o%:O\u0016\u00ffl\u00bd\u00aa\u00d4\u001c` \u00e0\u00cf\u0002\u00a5\u00c8".length();
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
                    var4_3 = "\u0003|yx\u0089\u0003\u00d9t\u0018\u00bf<^i\u000e\u00d8\u0092";
                    var5_4 = "\u0003|yx\u0089\u0003\u00d9t\u0018\u00bf<^i\u000e\u00d8\u0092".length();
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
        fu_2.a = var6_1;
        fu_2.b = new Integer[32];
        v5 = new byte[fu_2.a(10915, 351504462747226768L)];
        v5[0] = fu_2.a(8938, 463998017905318597L);
        v5[1] = fu_2.a(22143, 6532891781579681373L);
        v5[2] = fu_2.a(13567, 647814598748916950L);
        v5[3] = fu_2.a(30202, 1054889283334049247L);
        v5[4] = fu_2.a(27584, 5953834821979182056L);
        v5[5] = fu_2.a(1664, 3786862181579357860L);
        v5[fu_2.a((int)21385, (long)8014350891915258800L)] = fu_2.a(24825, 5862702349243062490L);
        v5[fu_2.a((int)11091, (long)6332614515620729697L)] = fu_2.a(25329, 2101708302578162391L);
        v5[fu_2.a((int)5043, (long)375197524539534216L)] = fu_2.a(32005, 5410834078839801139L);
        v5[fu_2.a((int)13238, (long)4754289515604724631L)] = fu_2.a(3540, 1071202036079359470L);
        v5[fu_2.a((int)22780, (long)2016264834922848460L)] = fu_2.a(19006, 6758586540750680595L);
        v5[fu_2.a((int)11225, (long)3154431182105891820L)] = fu_2.a(7522, 4549977994242811221L);
        v5[fu_2.a((int)26666, (long)9128184525816270866L)] = fu_2.a(589, 4964320368910793337L);
        v5[fu_2.a((int)31317, (long)7515365113074745977L)] = fu_2.a(16529, 4833187766488185007L);
        v5[fu_2.a((int)5979, (long)109090150415855473L)] = fu_2.a(27776, 2610540327388845230L);
        v5[fu_2.a((int)1012, (long)8315339687666809812L)] = fu_2.a(30781, 3766344850270126102L);
        fu_2.u = v5;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x782C;
        if (b[n11] == null) {
            fu_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

