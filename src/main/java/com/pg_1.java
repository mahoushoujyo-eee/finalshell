/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pa_2;
import com.pb_1;
import com.pe_2;
import com.pg_2;
import com.pm_2;
import com.pq_1;
import com.pq_2;
import com.pr_2;
import com.ps_1;
import com.pt_2;
import com.px_1;
import com.px_2;
import com.py_1;
import com.pz_1;

/*
 * Renamed from com.pG
 */
public abstract class pg_1
extends Enum {
    public static final pg_1 ASCII;
    public static final pg_1 BRITISH;
    public static final pg_1 DANISH;
    public static final pg_1 DEC_SPECIAL_GRAPHICS;
    public static final pg_1 DEC_SUPPLEMENTAL;
    public static final pg_1 DUTCH;
    public static final pg_1 FINNISH;
    public static final pg_1 FRENCH;
    public static final pg_1 FRENCH_CANADIAN;
    public static final pg_1 GERMAN;
    public static final pg_1 ITALIAN;
    public static final pg_1 SPANISH;
    public static final pg_1 SWEDISH;
    public static final pg_1 SWISS;
    private final int[] B;
    private static final pg_1[] v;
    private static final long[] a;
    private static final Integer[] b;

    public static pg_1[] values() {
        return (pg_1[])v.clone();
    }

    public static pg_1 valueOf(String string) {
        return Enum.valueOf(pg_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pg_1() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.B = var3_1;
    }

    public static pg_1 T(char c2) {
        pg_1 pg_12;
        block4: {
            pg_1[] pg_1Array = pg_1.values();
            int[] nArray = XP.j();
            int n10 = pg_1Array.length;
            int n11 = 0;
            while (n11 < n10) {
                pg_1 pg_13 = pg_1Array[n11];
                if (nArray == null) {
                    pg_12 = pg_13;
                    if (nArray != null) break block4;
                    if (pg_12.a(c2)) {
                        return pg_13;
                    }
                    ++n11;
                }
                if (nArray == null) continue;
            }
            pg_12 = ASCII;
        }
        return pg_12;
    }

    public abstract int Q(int var1);

    private boolean a(char c2) {
        int n10;
        block4: {
            int[] nArray = this.B;
            int n11 = nArray.length;
            int n12 = 0;
            int[] nArray2 = XP.j();
            while (n12 < n11) {
                int n13 = nArray[n12];
                if (nArray2 == null) {
                    n10 = n13;
                    if (nArray2 != null) break block4;
                    if (n10 == c2) {
                        return true;
                    }
                    ++n12;
                }
                if (nArray2 == null) continue;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private static pg_1[] q() {
        pg_1[] pg_1Array = new pg_1[pg_1.a(27810, 1398539271998518538L)];
        pg_1Array[0] = ASCII;
        pg_1Array[1] = BRITISH;
        pg_1Array[2] = DANISH;
        pg_1Array[3] = DEC_SPECIAL_GRAPHICS;
        pg_1Array[4] = DEC_SUPPLEMENTAL;
        pg_1Array[5] = DUTCH;
        pg_1Array[pg_1.a((int)2096, (long)4884989575338217873L)] = FINNISH;
        pg_1Array[pg_1.a((int)26420, (long)3446572921797590670L)] = FRENCH;
        pg_1Array[pg_1.a((int)22526, (long)6615742181234675269L)] = FRENCH_CANADIAN;
        pg_1Array[pg_1.a((int)31079, (long)6377440228195999972L)] = GERMAN;
        pg_1Array[pg_1.a((int)26267, (long)5568086236201172781L)] = ITALIAN;
        pg_1Array[pg_1.a((int)28324, (long)3686192053778986775L)] = SPANISH;
        pg_1Array[pg_1.a((int)9662, (long)5641102963996883993L)] = SWEDISH;
        pg_1Array[pg_1.a((int)17086, (long)8980027335563582208L)] = SWISS;
        return pg_1Array;
    }

    /*
     * WARNING - void declaration
     */
    pg_1() {
        this((String)var1_-1, (int)pm_22, (int[])var3_2);
        void var3_2;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[14];
                        var12_1 = 0;
                        var11_2 = "M4\u0011;}{\u0014N4\u0000)oe\u0010I8\u0002:cr\u0007K!\u000b?\u007ff\u0007Y&\u00062uf\u001d\u0005N$\u00175t\u0007Y!\u00028uf\u001d\u0010N4\u0000)o`\u0005Z=\u0006;y{\u0001K=\u0006N0\r?o}\u0006L#\u00068\u007f}\u0007H#\n\"uf\u001d\u000fL#\u00068\u007f}\nI0\r7x|\u0014D\u0007C%\u0002:ut\u001b\u0005K\"\u0000?u";
                        var13_3 = "M4\u0011;}{\u0014N4\u0000)oe\u0010I8\u0002:cr\u0007K!\u000b?\u007ff\u0007Y&\u00062uf\u001d\u0005N$\u00175t\u0007Y!\u00028uf\u001d\u0010N4\u0000)o`\u0005Z=\u0006;y{\u0001K=\u0006N0\r?o}\u0006L#\u00068\u007f}\u0007H#\n\"uf\u001d\u000fL#\u00068\u007f}\nI0\r7x|\u0014D\u0007C%\u0002:ut\u001b\u0005K\"\u0000?u".length();
                        var10_4 = 6;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 64;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "F2\u00072\u007fl\u0017\u0005S,\u0000/e";
                            var13_3 = "F2\u00072\u007fl\u0017\u0005S,\u0000/e".length();
                            var10_4 = 7;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 74;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 74;
                                    break;
                                }
                                case 1: {
                                    v15 = 49;
                                    break;
                                }
                                case 2: {
                                    v15 = 3;
                                    break;
                                }
                                case 3: {
                                    v15 = 54;
                                    break;
                                }
                                case 4: {
                                    v15 = 124;
                                    break;
                                }
                                case 5: {
                                    v15 = 117;
                                    break;
                                }
                                default: {
                                    v15 = 21;
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
                var0_7 = 2587482213544743571L;
                var6_8 = new long[36];
                var3_9 = 0;
                var4_10 = "A\u00b3\u008bH\u00cd\u0012\u00b8X\u00d9?I\u0097)|\u0083\u0004\u00d3\u00b6\u0002\u00d9\u00c6\u0001\u00c0\u00c6\u00c9X\u00d4\u0090\u0004\u00a3\u00df\u00ce\u0082rXqK\u00c8\u00b754\u00a8\u00a69\u00d2K=\tjJ\u00ba^\u008ev\u00b6\u00ded\u0080\u00bf\n>\u0096.\u0086\u00806\u00e4\u0004\u00e7\u001eg\u0097&\u0088l\r\u00e4\u00ef\u0099D]\u00fa\u0089Q\u008eM\u00db!\u00fd9\u00daeI\u000e\u00c4\u0006w\u00827C\u0087_\u0087\u00afb\u0097?#\u00a6\u0096\u0088/\u00b9\u00970\u0001\u0088\\\u00d7\u00807=\u00d1\u00bc\u008d,\u00d3\u009c\u00969sI\u00ce\u0089K\u00c9\u009f\u008c -:\u00e4\u00b84\n$\u0096\u00bd+r\u0017\u009e\r\u000bVM\u00bb\u00a4\u00e5\u008f#\u0018E\u00f2\u0091\u00fe(\u00f1`\u009e\u00a6\u009e\u00d1\u00cc\u0092-\u00f8\u0000\u00ab\u007fsz\u00ed\u00b4\r\u00df\u00bf-\"+j\u00cb3W\fY~\b\u0080\u00bd\u00f2\u009aa\u008e\u009c\u00a6\u00db\u000f\u00d1\u0095@\u00fe\u00f0\u00c0l\u001a$\u008c_\u00a3v\u00f6\\\u00de\u00a9^\u00b1\u00dc\u00bd\u00e8\u0018\u00ebI\u00cc\b\u008b\u00911\u00b4\u000fuB\u0087+\u00a9iI\u009e\u00fa\u008a{w\u00fbJ\u00c437\u008c\u00a5>\u00f2j\u0096F\u0093\u0094\u00d7v\u0081S\u008e\u001e";
                var5_11 = "A\u00b3\u008bH\u00cd\u0012\u00b8X\u00d9?I\u0097)|\u0083\u0004\u00d3\u00b6\u0002\u00d9\u00c6\u0001\u00c0\u00c6\u00c9X\u00d4\u0090\u0004\u00a3\u00df\u00ce\u0082rXqK\u00c8\u00b754\u00a8\u00a69\u00d2K=\tjJ\u00ba^\u008ev\u00b6\u00ded\u0080\u00bf\n>\u0096.\u0086\u00806\u00e4\u0004\u00e7\u001eg\u0097&\u0088l\r\u00e4\u00ef\u0099D]\u00fa\u0089Q\u008eM\u00db!\u00fd9\u00daeI\u000e\u00c4\u0006w\u00827C\u0087_\u0087\u00afb\u0097?#\u00a6\u0096\u0088/\u00b9\u00970\u0001\u0088\\\u00d7\u00807=\u00d1\u00bc\u008d,\u00d3\u009c\u00969sI\u00ce\u0089K\u00c9\u009f\u008c -:\u00e4\u00b84\n$\u0096\u00bd+r\u0017\u009e\r\u000bVM\u00bb\u00a4\u00e5\u008f#\u0018E\u00f2\u0091\u00fe(\u00f1`\u009e\u00a6\u009e\u00d1\u00cc\u0092-\u00f8\u0000\u00ab\u007fsz\u00ed\u00b4\r\u00df\u00bf-\"+j\u00cb3W\fY~\b\u0080\u00bd\u00f2\u009aa\u008e\u009c\u00a6\u00db\u000f\u00d1\u0095@\u00fe\u00f0\u00c0l\u001a$\u008c_\u00a3v\u00f6\\\u00de\u00a9^\u00b1\u00dc\u00bd\u00e8\u0018\u00ebI\u00cc\b\u008b\u00911\u00b4\u000fuB\u0087+\u00a9iI\u009e\u00fa\u008a{w\u00fbJ\u00c437\u008c\u00a5>\u00f2j\u0096F\u0093\u0094\u00d7v\u0081S\u008e\u001e".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00d2\u00c4\u00a8\u00ef\u009e\u0096\u00bc#\u00f1\u00e0\u00d9\u00c6\t\u0011r~";
                    var5_11 = "\u00d2\u00c4\u00a8\u00ef\u009e\u0096\u00bc#\u00f1\u00e0\u00d9\u00c6\t\u0011r~".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        pg_1.a = var6_8;
        pg_1.b = new Integer[36];
        pg_1.ASCII = new pm_2(new int[]{pg_1.a(4998, 6881934243594881594L)});
        pg_1.BRITISH = new pb_1(new int[]{pg_1.a(23804, 8491587291358496082L)});
        pg_1.DANISH = new py_1(new int[]{pg_1.a(13946, 1711278217780981727L), pg_1.a(20232, 625546999138555555L)});
        pg_1.DEC_SPECIAL_GRAPHICS = new pq_1(new int[]{pg_1.a(15410, 5613211770323821974L), pg_1.a(2980, 710378873165009436L)});
        pg_1.DEC_SUPPLEMENTAL = new pg_2(new int[]{pg_1.a(16244, 1522404998330738377L), pg_1.a(15831, 3803445391963153521L)});
        pg_1.DUTCH = new pe_2(new int[]{pg_1.a(20497, 5843302304591055272L)});
        pg_1.FINNISH = new px_2(new int[]{pg_1.a(1359, 8099832294965664974L), pg_1.a(804, 6379981042474769033L)});
        pg_1.FRENCH = new pa_2(new int[]{pg_1.a(9092, 2998770495597836848L)});
        pg_1.FRENCH_CANADIAN = new pr_2(new int[]{pg_1.a(4655, 6523734664058129286L)});
        pg_1.GERMAN = new pt_2(new int[]{pg_1.a(22763, 7185362877737664836L)});
        pg_1.ITALIAN = new pz_1(new int[]{pg_1.a(20545, 4730777149554035179L)});
        pg_1.SPANISH = new px_1(new int[]{pg_1.a(20293, 607896596183717626L)});
        pg_1.SWEDISH = new ps_1(new int[]{pg_1.a(19391, 2474915088293171741L), pg_1.a(13148, 314736753764952828L)});
        pg_1.SWISS = new pq_2(new int[]{pg_1.a(6454, 5550097528536776835L)});
        pg_1.v = pg_1.q();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x59A0;
        if (b[n11] == null) {
            pg_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

