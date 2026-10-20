/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.iw_2;
import com.po_0;
import com.uZ;

/*
 * Renamed from com.hO
 */
public class ho_1
extends hn_1 {
    private float W = 32.0f;
    private float N = 1.0f;
    private float R = 0.0f;
    private float J = 1.0f;
    private float B = 0.5f;
    private po_0 l;
    private float z = 1.0f;
    private float C = 0.0f;
    private float e = 0.0f;
    private float Z = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void W(float f10) {
        this.W = f10;
    }

    public float z() {
        return this.W;
    }

    public void w(float f10) {
        this.N = f10;
    }

    public float A() {
        return this.N;
    }

    public void p(float f10) {
        this.R = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.z = f11;
        this.C = f12;
        this.e = -f12;
        this.Z = f11;
    }

    public float n() {
        return this.R;
    }

    public void Y(float f10) {
        this.J = f10;
    }

    public float S() {
        return this.J;
    }

    public void d(float f10) {
        this.B = f10;
    }

    public float Q() {
        return this.B;
    }

    public void h(po_0 po_02) {
        this.l = po_02;
    }

    public po_0 s() {
        return this.l;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10;
        float f11 = this.z * (float)n10 + this.C * (float)n11;
        float f12 = this.e * (float)n10 + this.Z * (float)n11;
        f11 /= this.W * this.N;
        String[] stringArray = W5.q();
        f12 /= this.W;
        int n13 = n12 & ho_1.a(25334, 1028721984713644582L);
        ho_1 ho_12 = this;
        if (stringArray != null) {
            if (ho_12.l != null) {
                float f13 = this.B * uZ.q(f11, f12, this.J);
                float f14 = 3.0f * this.B * f13 + f12;
                f14 = (float)Math.sin((double)f14 * Math.PI);
                float f15 = (float)Math.sin(40.0 * (double)f13);
                f14 = (float)((double)f14 + 0.2 * (double)f15);
                return this.l.D(f14);
            }
            ho_12 = this;
        }
        float f16 = ho_12.B * uZ.q(f11, f12, this.J);
        float f17 = (float)Math.sin(Math.sin(8.0 * (double)f16 + (double)(7.0f * f11) + 3.0 * (double)f12));
        float f18 = f10 = Math.abs(f17);
        float f19 = (float)Math.sin(40.0 * (double)f16);
        f19 = Math.abs(f19);
        float f20 = 0.6f * f19 + 0.3f;
        float f21 = 0.2f * f19 + 0.8f;
        float f22 = 0.15f * f19 + 0.85f;
        float f23 = 0.5f * (float)Math.pow(Math.abs(f10), 0.3);
        f10 = (float)Math.pow(0.5 * ((double)f10 + 1.0), 0.6) * f20;
        f18 = (float)Math.pow(0.5 * ((double)f18 + 1.0), 0.6) * f21;
        float f24 = (0.5f * f10 + 0.35f * f18) * 2.0f * f23;
        float f25 = (0.25f * f10 + 0.35f * f18) * 2.0f * f23;
        int n14 = n12 >> ho_1.a(18881, 2168288983485346068L) & ho_1.a(29119, 7212710557863987561L);
        int n15 = n12 >> ho_1.a(6391, 4947641888189161510L) & ho_1.a(11718, 3551606079213770004L);
        int n16 = n12 & ho_1.a(11718, 3551606079213770004L);
        n14 = iw_2.e((int)((float)n14 * f24));
        n15 = iw_2.e((int)((float)n15 * (f23 *= Math.max(f10, f18) * f22)));
        n16 = iw_2.e((int)((float)n16 * f25));
        return n12 & ho_1.a(4380, 7349978572798306763L) | n14 << ho_1.a(25177, 7250189380911749770L) | n15 << ho_1.a(26163, 7325551678194638567L) | n16;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u0003:h\u0019^\u001fkx\u0012q\u001fI\u0001kw\u000bu\u0015_\u0018|2q>C".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 116;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 35;
                                break;
                            }
                            case 1: {
                                v9 = 43;
                                break;
                            }
                            case 2: {
                                v9 = 100;
                                break;
                            }
                            case 3: {
                                v9 = 25;
                                break;
                            }
                            case 4: {
                                v9 = 95;
                                break;
                            }
                            case 5: {
                                v9 = 25;
                                break;
                            }
                            default: {
                                v9 = 122;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                ho_1.a = new String(v10).intern();
                var0_1 = 3855528974893136699L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "=\u00a1`&\u00b4\u001c\u00ae\u00d0\"\u00c8\u00edx\u00f26\u00e1\u00a1h,np\u00f1\u00c6\u00e1\u001d\u001d\u00b2\u0003\u00d0\u00bc\u00e0\u009b\u0015|\u00b3\u0089\u00d0t\u008ar\u00ad\u0097I\u00d2M\u00d4\u00db\u0012\u00f0";
                var5_5 = "=\u00a1`&\u00b4\u001c\u00ae\u00d0\"\u00c8\u00edx\u00f26\u00e1\u00a1h,np\u00f1\u00c6\u00e1\u001d\u001d\u00b2\u0003\u00d0\u00bc\u00e0\u009b\u0015|\u00b3\u0089\u00d0t\u008ar\u00ad\u0097I\u00d2M\u00d4\u00db\u0012\u00f0".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u0016\u008b\u0080\u001b\u00835\u00e5\u00d4\u009b\u00e8\u0089w~\u00b2J?";
                    var5_5 = "\u0016\u008b\u0080\u001b\u00835\u00e5\u00d4\u009b\u00e8\u0089w~\u00b2J?".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        ho_1.b = var6_2;
        ho_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x38D2;
        if (c[n11] == null) {
            ho_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

