/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;
import com.iw_2;

/*
 * Renamed from com.g_
 */
public class g__0
extends hn_1 {
    private int[] E;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public g__0() {
        int[] nArray = new int[g__0.a(11891, 8397308480313123232L)];
        nArray[0] = 1;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[g__0.a((int)4574, (long)763333828420853276L)] = 1;
        nArray[g__0.a((int)19100, (long)1956097568640566619L)] = 0;
        nArray[g__0.a((int)20644, (long)1039814160337903486L)] = 0;
        nArray[g__0.a((int)17334, (long)3883127674782420092L)] = 0;
        nArray[g__0.a((int)14907, (long)5908455582839436792L)] = 0;
        nArray[g__0.a((int)29148, (long)1411841246483267082L)] = 0;
        nArray[g__0.a((int)15236, (long)5201243017982407748L)] = 1;
        nArray[g__0.a((int)22519, (long)6949851209988347966L)] = 0;
        nArray[g__0.a((int)4986, (long)5424091909362015422L)] = 0;
        nArray[g__0.a((int)13015, (long)3602941050774682908L)] = 0;
        nArray[g__0.a((int)5571, (long)7415305096018516504L)] = 0;
        nArray[g__0.a((int)10811, (long)2677582673191298550L)] = 0;
        nArray[g__0.a((int)6675, (long)1936513614058247638L)] = 1;
        nArray[g__0.a((int)21152, (long)415648393358024048L)] = 0;
        this.E = nArray;
    }

    public void Q(int[] nArray) {
        this.E = nArray;
    }

    public int[] G() {
        return this.E;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 >> g__0.a(11311, 6245185645590045665L) & g__0.a(6874, 8878013057653626133L);
        int n14 = n12 >> g__0.a(31876, 9098385503658259281L) & g__0.a(424, 3699306334797581929L);
        int n15 = n12 >> g__0.a(20802, 6522540814577868447L) & g__0.a(424, 3699306334797581929L);
        int n16 = n12 & g__0.a(424, 3699306334797581929L);
        n13 = this.E[0] * n13 + this.E[1] * n14 + this.E[2] * n15 + this.E[3] * n16 + this.E[4] * g__0.a(424, 3699306334797581929L);
        n14 = this.E[5] * n13 + this.E[g__0.a(23304, 5271870549885424854L)] * n14 + this.E[g__0.a(5668, 6419364256034609656L)] * n15 + this.E[g__0.a(20802, 6522540814577868447L)] * n16 + this.E[g__0.a(11665, 1055393780698931801L)] * g__0.a(424, 3699306334797581929L);
        n15 = this.E[g__0.a(28188, 3221326798532485602L)] * n13 + this.E[g__0.a(19791, 6492346649566577309L)] * n14 + this.E[g__0.a(12839, 7000469750574054911L)] * n15 + this.E[g__0.a(27418, 7059478692185384150L)] * n16 + this.E[g__0.a(18763, 3113528121016714911L)] * g__0.a(424, 3699306334797581929L);
        n16 = this.E[g__0.a(7893, 1002487744611242244L)] * n13 + this.E[g__0.a(31876, 9098385503658259281L)] * n14 + this.E[g__0.a(29601, 659166992087137383L)] * n15 + this.E[g__0.a(2286, 6100457894041536305L)] * n16 + this.E[g__0.a(7753, 1809768421133406608L)] * g__0.a(424, 3699306334797581929L);
        n13 = iw_2.e(n13);
        n14 = iw_2.e(n14);
        n15 = iw_2.e(n15);
        n16 = iw_2.e(n16);
        return n13 << g__0.a(24894, 5290672218575777513L) | n14 << g__0.a(31876, 9098385503658259281L) | n15 << g__0.a(20802, 6522540814577868447L) | n16;
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
                v0 = "{/\u0019.Lk=Kh+7Kt+T\"Vn\f".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 118;
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
                                v9 = 78;
                                break;
                            }
                            case 1: {
                                v9 = 49;
                                break;
                            }
                            case 2: {
                                v9 = 14;
                                break;
                            }
                            case 3: {
                                v9 = 54;
                                break;
                            }
                            case 4: {
                                v9 = 84;
                                break;
                            }
                            case 5: {
                                v9 = 120;
                                break;
                            }
                            default: {
                                v9 = 39;
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
                g__0.a = new String(v10).intern();
                var0_1 = 2363464753466451623L;
                var6_2 = new long[33];
                var3_3 = 0;
                var4_4 = "\u0004\u00a5\u0090\u0096\u00aeE\u00b2w)`\u00bd\u0015\u00c0\u0014\u00e1\u0084\u008e\u00f7g\u00adYN\u007fX3\u0086V\u00c3\u00d0`\u00b80xSP7\u00f6\u00da\u00b9\u00d1\u00b1\u00db\u0086\u00cc\u00a8\u00d5\u00fc\u00af\u00e7\u00cd@\u00e2*S[T\u008b\u00b1L\u00a5\u0096\u00e6w$L\u00d6\u00a4 \u00eag\u0018\u00a6\u0006\u00bb n\u00ce\u00ba\u0088V\u00ba\u00e2\u00d9\u00db\u00be\u00e2 6o\u00b0R\u00df\u00ca\u009b\u0015\u00e6_\u00e3\u00c2}\u00f3\u009b$1\u0088d\u00e5K\u00a3\u00f6G\u0013\u00f4\u00b9\u00ae\u00a28\u0017;\u00c4c\u0007\u00ed\u00b3\u0018\u00baw\u00ac\u009e\u00e7I\u0018TEE^I\u00d5\u00e5\u00f5Y?sM\u00a4\u00b3\u00b9\u00b2\u000e\u00a0\u0002|\u00ab\u00c7\u009b\u00fb\u00f1\u00c8\u00c3@\u009f\u0006\u008f\u00ea%c*\u00d2\u0097\u0098\u00e2\u008b+\u009e\u00db\u00b47G\u009b\u00c1\u00891D\u00f7\u00aa\u008b\u00f9}H\u00aa\u00be\u0094\u00b8g\u009c\u00b1\u00c6\u0082\u001a\u00d1\u00e9\u00be\u0098p9U\u00a3\u00fb\u009c\u00f1\u00e8\u0004\u00b3\u0011\u00fa\u0017\u00fa]XH\u00f9 sc\u00077\u00f9\u00eaU\u0096x\u00bd\u00b2Y\u0004\u00e5\u0097\u00d7SUc\u00d9\u00e11`\u00d4R\u00ef";
                var5_5 = "\u0004\u00a5\u0090\u0096\u00aeE\u00b2w)`\u00bd\u0015\u00c0\u0014\u00e1\u0084\u008e\u00f7g\u00adYN\u007fX3\u0086V\u00c3\u00d0`\u00b80xSP7\u00f6\u00da\u00b9\u00d1\u00b1\u00db\u0086\u00cc\u00a8\u00d5\u00fc\u00af\u00e7\u00cd@\u00e2*S[T\u008b\u00b1L\u00a5\u0096\u00e6w$L\u00d6\u00a4 \u00eag\u0018\u00a6\u0006\u00bb n\u00ce\u00ba\u0088V\u00ba\u00e2\u00d9\u00db\u00be\u00e2 6o\u00b0R\u00df\u00ca\u009b\u0015\u00e6_\u00e3\u00c2}\u00f3\u009b$1\u0088d\u00e5K\u00a3\u00f6G\u0013\u00f4\u00b9\u00ae\u00a28\u0017;\u00c4c\u0007\u00ed\u00b3\u0018\u00baw\u00ac\u009e\u00e7I\u0018TEE^I\u00d5\u00e5\u00f5Y?sM\u00a4\u00b3\u00b9\u00b2\u000e\u00a0\u0002|\u00ab\u00c7\u009b\u00fb\u00f1\u00c8\u00c3@\u009f\u0006\u008f\u00ea%c*\u00d2\u0097\u0098\u00e2\u008b+\u009e\u00db\u00b47G\u009b\u00c1\u00891D\u00f7\u00aa\u008b\u00f9}H\u00aa\u00be\u0094\u00b8g\u009c\u00b1\u00c6\u0082\u001a\u00d1\u00e9\u00be\u0098p9U\u00a3\u00fb\u009c\u00f1\u00e8\u0004\u00b3\u0011\u00fa\u0017\u00fa]XH\u00f9 sc\u00077\u00f9\u00eaU\u0096x\u00bd\u00b2Y\u0004\u00e5\u0097\u00d7SUc\u00d9\u00e11`\u00d4R\u00ef".length();
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
                    var4_4 = "QV'|\u00cdph1\u009c\u0084\u0086G&\u007f\u0087O";
                    var5_5 = "QV'|\u00cdph1\u009c\u0084\u0086G&\u007f\u0087O".length();
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
        g__0.b = var6_2;
        g__0.c = new Integer[33];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4FDE;
        if (c[n11] == null) {
            g__0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

