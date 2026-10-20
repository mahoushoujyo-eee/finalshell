/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.YU;
import com.dm_2;
import com.qi_0;
import com.uJ;

/*
 * Renamed from com.Qk
 */
class qk_0
extends qi_0 {
    int M = qk_0.a(13042, 2469231811144375953L);
    int o = qk_0.a(26646, 2466085370004767856L);
    int C = qk_0.a(32220, 976909586951770557L);
    int L = qk_0.a(8224, 4816381615494908992L);
    private static final String a;
    private static final long[] d;
    private static final Integer[] e;

    qk_0() {
    }

    void u(int n10, int n11, int n12, int n13) {
        this.M = n10;
        this.o = n11;
        this.C = n12;
        this.L = n13;
    }

    @Override
    public void Q(DI dI, dm_2 dm_22) throws Exception {
        boolean bl;
        uJ uJ2;
        YU yU;
        uJ uJ3;
        block2: {
            block3: {
                boolean bl2 = dm_2.F();
                super.Q(dI, dm_22);
                uJ3 = new uJ();
                yU = new YU(uJ3);
                yU.M();
                boolean bl3 = bl2;
                try {
                    uJ3.V((byte)qk_0.a(25067, 2589648042755886473L));
                    uJ3.u(dm_22.J());
                    uJ3.q(E8.J(a));
                    uJ2 = uJ3;
                    bl = this.K();
                    if (!bl3) break block2;
                    if (!bl) break block3;
                }
                catch (Exception exception) {
                    throw qk_0.b(exception);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        uJ2.V((byte)(bl ? 1 : 0));
        uJ3.u(this.M);
        uJ3.u(this.o);
        uJ3.u(this.C);
        uJ3.u(this.L);
        this.C(yU);
    }

    private static Exception b(Exception exception) {
        return exception;
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
                v0 = "MN J\u001a]}YO/@\u0012O".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 91;
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
                                v9 = 97;
                                break;
                            }
                            case 1: {
                                v9 = 124;
                                break;
                            }
                            case 2: {
                                v9 = 21;
                                break;
                            }
                            case 3: {
                                v9 = 117;
                                break;
                            }
                            case 4: {
                                v9 = 46;
                                break;
                            }
                            case 5: {
                                v9 = 113;
                                break;
                            }
                            default: {
                                v9 = 11;
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
                qk_0.a = new String(v10).intern();
                var0_1 = 2466395029500059177L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\"O\u00c2\u0099\u0098\u00e3\u00d3\u00c2N\u00c8\u00ad\u00e6\u00d2y\u0000\u00e8\u00e1\u000f\u00c3\u0086\u00a7h\u0013\u0089";
                var5_5 = "\"O\u00c2\u0099\u0098\u00e3\u00d3\u00c2N\u00c8\u00ad\u00e6\u00d2y\u0000\u00e8\u00e1\u000f\u00c3\u0086\u00a7h\u0013\u0089".length();
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
                    var4_4 = "\u0098\u00ac\"\u009d\u00d2\u00cc\u00cd\u0014-\bF\u00fc9\u00cf\u00daA";
                    var5_5 = "\u0098\u00ac\"\u009d\u00d2\u00cc\u00cd\u0014-\bF\u00fc9\u00cf\u00daA".length();
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
        qk_0.d = var6_2;
        qk_0.e = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6C62;
        if (e[n11] == null) {
            qk_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

