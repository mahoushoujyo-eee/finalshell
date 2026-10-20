/*
 * Decompiled with CFR 0.152.
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

/*
 * Renamed from Lz
 */
public class lz_0
extends ByteToMessageDecoder {
    public final int P = lz_0.a(943, 6257116824906351519L);
    static int d;
    static int D;
    static int F;
    static int i;
    static int x;
    int p = d;
    int t = 0;
    int I;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4590530025213234999L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u0014u\u00f6\u0011;o\u0091\u00bb\u0097K\u0018\u001b\u00b90L\u00a0#\u00f2\u00b2!`\u0087\u00c3\u0007a\u0095\u009e\u0092\u0098K\u00cfq";
                var5_4 = "\u0014u\u00f6\u0011;o\u0091\u00bb\u0097K\u0018\u001b\u00b90L\u00a0#\u00f2\u00b2!`\u0087\u00c3\u0007a\u0095\u009e\u0092\u0098K\u00cfq".length();
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
                    var4_3 = "\u00b1n0r?w\u009d\u0097\u00f2\u00c9\u008d\u0082S\u0087%3";
                    var5_4 = "\u00b1n0r?w\u009d\u0097\u00f2\u00c9\u008d\u0082S\u0087%3".length();
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
        lz_0.a = var6_1;
        lz_0.b = new Integer[6];
        lz_0.d = lz_0.a(3081, 8184612348273511482L);
        lz_0.D = lz_0.a(127, 9069897809625497677L);
        lz_0.F = lz_0.a(27552, 6434105922001218452L);
        lz_0.i = lz_0.a(21149, 3495315532774511272L);
        lz_0.x = lz_0.a(24253, 3209757171674914444L);
    }

    /*
     * Unable to fully structure code
     */
    protected void decode(ChannelHandlerContext var1_1, ByteBuf var2_2, List var3_3) throws Exception {
        block31: {
            block36: {
                block35: {
                    block29: {
                        block32: {
                            block33: {
                                block30: {
                                    var5_4 = var2_2.readableBytes();
                                    var4_5 = xU.t();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = this.p;
                                                        v1 = lz_0.d;
                                                        if (var4_5 == null) break block29;
                                                        if (v0 == v1) {
                                                        }
                                                        ** GOTO lbl66
                                                    }
                                                    catch (Exception v2) {
                                                        throw lz_0.a(v2);
                                                    }
                                                    v3 = var5_4;
                                                    if (var4_5 == null) break block30;
                                                }
                                                catch (Exception v4) {
                                                    throw lz_0.a(v4);
                                                }
                                                if (v3 < lz_0.i) break block31;
                                            }
                                            catch (Exception v5) {
                                                throw lz_0.a(v5);
                                            }
                                            this.I = var2_2.readInt();
                                            if (var4_5 == null) break block32;
                                        }
                                        catch (Exception v6) {
                                            throw lz_0.a(v6);
                                        }
                                        v3 = (int)ai_0.k.contains(this.I);
                                    }
                                    catch (Exception v7) {
                                        throw lz_0.a(v7);
                                    }
                                }
                                if (v3 == 0) ** GOTO lbl59
                                var6_6 = var2_2.readInt();
                                try {
                                    block34: {
                                        try {
                                            try {
                                                if (var4_5 == null) break block33;
                                                if (var6_6 > lz_0.x) break block34;
                                            }
                                            catch (Exception v8) {
                                                throw lz_0.a(v8);
                                            }
                                            this.t = var6_6;
                                            this.p = lz_0.D;
                                            if (var4_5 != null) break block31;
                                        }
                                        catch (Exception v9) {
                                            throw lz_0.a(v9);
                                        }
                                    }
                                    this.p = lz_0.F;
                                }
                                catch (Exception v10) {
                                    throw lz_0.a(v10);
                                }
                            }
                            try {
                                if (var4_5 != null) break block31;
lbl59:
                                // 2 sources

                                this.p = lz_0.F;
                            }
                            catch (Exception v11) {
                                throw lz_0.a(v11);
                            }
                        }
                        try {
                            if (var4_5 != null) break block31;
lbl66:
                            // 2 sources

                            v0 = this.p;
                            v1 = lz_0.D;
                        }
                        catch (Exception v12) {
                            throw lz_0.a(v12);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var4_5 == null) break block35;
                                if (v0 != v1) break block31;
                            }
                            catch (Exception v13) {
                                throw lz_0.a(v13);
                            }
                            v0 = var5_4;
                            if (var4_5 == null) break block36;
                        }
                        catch (Exception v14) {
                            throw lz_0.a(v14);
                        }
                        v1 = this.t;
                    }
                    catch (Exception v15) {
                        throw lz_0.a(v15);
                    }
                }
                try {
                    if (v0 < v1) break block31;
                    v0 = this.t;
                }
                catch (Exception v16) {
                    throw lz_0.a(v16);
                }
            }
            var6_7 = new byte[v0];
            var2_2.readBytes(var6_7);
            var7_8 = new xU(this.I, var6_7);
            var3_3.add(var7_8);
            this.p = lz_0.d;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4031;
        if (b[n11] == null) {
            lz_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

