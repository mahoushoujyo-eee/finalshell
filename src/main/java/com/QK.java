/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dy_0;
import com.rp_0;
import com.wq_0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QK {
    public dy_0 W;
    @Nullable
    private Character h = null;
    private static final Map l;
    private static final long[] a;
    private static final Integer[] b;

    public QK(dy_0 dy_02) {
        this.W = dy_02;
    }

    public QK(dy_0 dy_02, char c2) {
        this.W = dy_02;
        this.h = Character.valueOf(c2);
    }

    @NotNull
    public static List E(byte[] byArray) {
        block5: {
            String string;
            block4: {
                String string2;
                String[] stringArray = wq_0.y();
                if (byArray.length == 0) {
                    return Collections.emptyList();
                }
                string = string2 = new String(byArray);
                if (stringArray != null) break block4;
                if (!QK.B(string.charAt(0))) break block5;
                string = string2;
            }
            return QK.L(string);
        }
        return Collections.singletonList(QK.l(byArray));
    }

    @NotNull
    public static QK E(char c2) {
        if (QK.B(c2)) {
            return new QK(dy_0.Character, c2);
        }
        return new QK(dy_0.Unknown);
    }

    @NotNull
    public static List L(@NotNull String string) {
        ArrayList<QK> arrayList;
        block8: {
            String[] stringArray;
            block11: {
                String string2;
                block10: {
                    boolean bl;
                    block9: {
                        stringArray = wq_0.y();
                        bl = string.isEmpty();
                        if (stringArray != null) break block9;
                        if (bl) {
                            return Collections.emptyList();
                        }
                        string2 = string;
                        if (stringArray != null) break block10;
                        bl = QK.B(string2.charAt(0));
                    }
                    if (bl) break block11;
                    string2 = string;
                }
                return Collections.singletonList(QK.l(string2.getBytes()));
            }
            ArrayList<QK> arrayList2 = new ArrayList<QK>();
            char[] cArray = string.toCharArray();
            int n10 = cArray.length;
            int n11 = 0;
            while (n11 < n10) {
                char c2 = cArray[n11];
                QK qK = QK.E(c2);
                arrayList = arrayList2;
                if (stringArray == null) {
                    arrayList.add(qK);
                    if (stringArray == null) {
                        if (qK.W == dy_0.Unknown) break;
                        ++n11;
                    }
                    if (stringArray == null) continue;
                }
                break block8;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Nullable
    public Character Z() {
        return this.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Contract(pure=true)
    private static boolean B(char c2) {
        int n10 = Character.getType(c2);
        String[] stringArray = wq_0.y();
        int n11 = n10;
        if (stringArray == null) {
            if (n11 == 0) return 0 != 0;
            n11 = n10;
        }
        int n12 = QK.a(11580, 3856075470875138001L);
        if (stringArray == null) {
            if (n11 == n12) return 0 != 0;
            n11 = n10;
            n12 = QK.a(16264, 4793229648326591843L);
        }
        if (stringArray == null) {
            if (n11 == n12) return 0 != 0;
            n11 = n10;
            n12 = QK.a(3922, 5844801897105339778L);
        }
        if (stringArray == null) {
            if (n11 == n12) return 0 != 0;
            n11 = n10;
            n12 = QK.a(15786, 1273834449780770679L);
        }
        if (stringArray == null) {
            if (n11 == n12) return 0 != 0;
            n11 = n10;
            n12 = QK.a(21930, 1834731419254878076L);
        }
        if (stringArray == null) {
            if (n11 == n12) return 0 != 0;
            n11 = n10;
            if (stringArray != null) return n11 != 0;
            n12 = QK.a(31321, 2624397515676205196L);
        }
        if (n11 == n12) return 0 != 0;
        return 1 != 0;
    }

    @NotNull
    private static QK l(byte[] byArray) {
        return new QK(l.getOrDefault(new rp_0(byArray), dy_0.Unknown));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1116613458521949625L;
                var6_1 = new long[48];
                var3_2 = 0;
                var4_3 = "A\u0016\u008b\u0011RN\u00a4\u00c0\u00bc\u008cm\u00cfE\u00a9d\u009e\u0088qb\u00e9#\u00f1\u008e\u0016\u00b7\u00ea\u00d8G''GY\u00b2q\u00c9}\u001fhn\u00b1\u001e\u00a2\u00ef\u008e\u00f1\u00d1\u00e4\u00c4\u0084\u00ec\u008d4(2\u00f82\u00f8\rB\u00cb\u00bf\u00e0\u00a6f$\u00e4\u00e1},q\u0084e\u00b5\u00df2\u00ae\u009f\u00ab\u0003\u00f9\u009a#\u00b5\u00ac\u0085]D\u00fcd\u00a0\u00c4\u001a\u00c3Z.c\u00c7\u00e3\u00ec\u0084\u00f0\u00f6Rm\u00f4m\\\u00f0!R\u00a9\u0001\u00bd\u00c0\u00d33\u00a1BD\u00b0\u009a\u00fb\u00b7\u001c\u00d9\u00cb\u0007,C\u009a\u0016\u00c5\u00c2\u00e0\u00e2_\u0093\u00a3\u00ee)\u0084\u00fb\u0082\tb\u009b\u0019\u00af;\u00ee\u00b00Q\u00b7\u00ae\u001b3\u00a0\u009bv(wM\u008c1\u00e6sv\u00e1\u009c\u00a6\u00b8\u009b,U>(m\u00b7\u0012\u009bI\u0082\u00de<,\u008c\u00ad\u00aeK\u00ab\u0015Ry\u00c1Y(\u00e7|^\u00dau~\u009bF\u00e5\tT_\u00b4U\u00ef\u00af\u0018\u0002\u008cH\u00b0CF\u00f9\u00e104r\u0091\u00e5\u0091\u0097P\u00a6\u00dc\u00e5\u0001\u00bdd\u0004pj\u00d7\u0088(\u00baF\u0085\u00d3E&\u0099\u0092/L\u00ae.\u00b8\u00ceh\u0098\u00a4\u0085q\u00ff\u0080\u00d4\u008eh\u008c\u00ec\u000f\u00ef\u00e8\u00c1\u00d3\u00b3\u009d\u00f8\u00e6\u0096dq\u00e9\u00e3\u0098\u000fZ\u0081\\\u00e1\u0084&/\u0088\u00af\u00a8\u00cf\u00efPj\u00d9\u00b1\u0088%EhY\u00d1Bj\u009e\u0003\u0012e/4_=\u00b3\u008a.\u00ef\u00c0\u00a4\u00d2\u00bd\u0098\u0014\u00fcLw\b1\u00efP\u00ff\u00aa\u00ea\u001f\u00fd\u0089}\u00a7'\u00f1\u000b\u0083c^DF\u0000\u001bQ\u008f\u000b\u00ab\u0088qK\u00a3\u00d0W\u00d9-,\u00a3\u00ae\u001e\u0094";
                var5_4 = "A\u0016\u008b\u0011RN\u00a4\u00c0\u00bc\u008cm\u00cfE\u00a9d\u009e\u0088qb\u00e9#\u00f1\u008e\u0016\u00b7\u00ea\u00d8G''GY\u00b2q\u00c9}\u001fhn\u00b1\u001e\u00a2\u00ef\u008e\u00f1\u00d1\u00e4\u00c4\u0084\u00ec\u008d4(2\u00f82\u00f8\rB\u00cb\u00bf\u00e0\u00a6f$\u00e4\u00e1},q\u0084e\u00b5\u00df2\u00ae\u009f\u00ab\u0003\u00f9\u009a#\u00b5\u00ac\u0085]D\u00fcd\u00a0\u00c4\u001a\u00c3Z.c\u00c7\u00e3\u00ec\u0084\u00f0\u00f6Rm\u00f4m\\\u00f0!R\u00a9\u0001\u00bd\u00c0\u00d33\u00a1BD\u00b0\u009a\u00fb\u00b7\u001c\u00d9\u00cb\u0007,C\u009a\u0016\u00c5\u00c2\u00e0\u00e2_\u0093\u00a3\u00ee)\u0084\u00fb\u0082\tb\u009b\u0019\u00af;\u00ee\u00b00Q\u00b7\u00ae\u001b3\u00a0\u009bv(wM\u008c1\u00e6sv\u00e1\u009c\u00a6\u00b8\u009b,U>(m\u00b7\u0012\u009bI\u0082\u00de<,\u008c\u00ad\u00aeK\u00ab\u0015Ry\u00c1Y(\u00e7|^\u00dau~\u009bF\u00e5\tT_\u00b4U\u00ef\u00af\u0018\u0002\u008cH\u00b0CF\u00f9\u00e104r\u0091\u00e5\u0091\u0097P\u00a6\u00dc\u00e5\u0001\u00bdd\u0004pj\u00d7\u0088(\u00baF\u0085\u00d3E&\u0099\u0092/L\u00ae.\u00b8\u00ceh\u0098\u00a4\u0085q\u00ff\u0080\u00d4\u008eh\u008c\u00ec\u000f\u00ef\u00e8\u00c1\u00d3\u00b3\u009d\u00f8\u00e6\u0096dq\u00e9\u00e3\u0098\u000fZ\u0081\\\u00e1\u0084&/\u0088\u00af\u00a8\u00cf\u00efPj\u00d9\u00b1\u0088%EhY\u00d1Bj\u009e\u0003\u0012e/4_=\u00b3\u008a.\u00ef\u00c0\u00a4\u00d2\u00bd\u0098\u0014\u00fcLw\b1\u00efP\u00ff\u00aa\u00ea\u001f\u00fd\u0089}\u00a7'\u00f1\u000b\u0083c^DF\u0000\u001bQ\u008f\u000b\u00ab\u0088qK\u00a3\u00d0W\u00d9-,\u00a3\u00ae\u001e\u0094".length();
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
                    var4_3 = "\u00c1\u0089=\u00ea2\u00cfhn\u00d6W\u00113\u0013\u00c9\u00e7\u00c7";
                    var5_4 = "\u00c1\u0089=\u00ea2\u00cfhn\u00d6W\u00113\u0013\u00c9\u00e7\u00c7".length();
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
        QK.a = var6_1;
        QK.b = new Integer[48];
        v5 = new Map.Entry[QK.a(5741, 9053429790468320427L)];
        v5[0] = Map.entry(new rp_0(new int[]{QK.a(5227, 2069284929012018871L), QK.a(13924, 7853750280980663478L), QK.a(5506, 7258056321761587040L), QK.a(18232, 6650924870176472565L)}), dy_0.Delete);
        v5[1] = Map.entry(new rp_0(new int[]{QK.a(23390, 246513614960812471L)}), dy_0.Backspace);
        v5[2] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(12569, 7881560711177866192L)}), dy_0.AltBackspace);
        v5[3] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(30823, 8489789060309074607L), QK.a(15558, 3514368340966770180L)}), dy_0.LeftArrow);
        v5[4] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(17263, 7054740860733782460L), QK.a(22750, 8078548660089446970L)}), dy_0.LeftArrow);
        v5[5] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(6653, 49255603365716778L), QK.a(3859, 2733625920051066314L)}), dy_0.RightArrow);
        v5[QK.a((int)17168, (long)6754081954914367987L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(17263, 7054740860733782460L), QK.a(6480, 2775155348326032284L)}), dy_0.RightArrow);
        v5[QK.a((int)9232, (long)4196755917124902600L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(7404, 1426692711017391627L)}), dy_0.AltLeftArrow);
        v6 = new int[QK.a(22420, 3078705852688952702L)];
        v6[0] = QK.a(23464, 447462671001772390L);
        v6[1] = QK.a(17263, 7054740860733782460L);
        v6[2] = QK.a(4491, 1989761925970733927L);
        v6[3] = QK.a(14442, 572385019924054702L);
        v6[4] = QK.a(9275, 6726042016815193819L);
        v6[5] = QK.a(22750, 8078548660089446970L);
        v5[QK.a((int)28849, (long)6018506305423526494L)] = Map.entry(new rp_0(v6), dy_0.AltLeftArrow);
        v7 = new int[QK.a(22420, 3078705852688952702L)];
        v7[0] = QK.a(23464, 447462671001772390L);
        v7[1] = QK.a(17263, 7054740860733782460L);
        v7[2] = QK.a(20982, 4047210159191583545L);
        v7[3] = QK.a(23510, 1272856817201209628L);
        v7[4] = QK.a(31242, 2936110827439800548L);
        v7[5] = QK.a(22750, 8078548660089446970L);
        v5[QK.a((int)23860, (long)1059527301177272303L)] = Map.entry(new rp_0(v7), dy_0.AltLeftArrow);
        v5[QK.a((int)4368, (long)5300139638584060880L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(7124, 3546978297639444767L)}), dy_0.AltRightArrow);
        v8 = new int[QK.a(22420, 3078705852688952702L)];
        v8[0] = QK.a(23464, 447462671001772390L);
        v8[1] = QK.a(17263, 7054740860733782460L);
        v8[2] = QK.a(20982, 4047210159191583545L);
        v8[3] = QK.a(23510, 1272856817201209628L);
        v8[4] = QK.a(9275, 6726042016815193819L);
        v8[5] = QK.a(6480, 2775155348326032284L);
        v5[QK.a((int)25531, (long)5924308847184206163L)] = Map.entry(new rp_0(v8), dy_0.AltRightArrow);
        v9 = new int[QK.a(22420, 3078705852688952702L)];
        v9[0] = QK.a(23464, 447462671001772390L);
        v9[1] = QK.a(17263, 7054740860733782460L);
        v9[2] = QK.a(20982, 4047210159191583545L);
        v9[3] = QK.a(23510, 1272856817201209628L);
        v9[4] = QK.a(1942, 7630642023933001026L);
        v9[5] = QK.a(6480, 2775155348326032284L);
        v5[QK.a((int)8647, (long)4222848253348092705L)] = Map.entry(new rp_0(v9), dy_0.AltRightArrow);
        v5[QK.a((int)31625, (long)8574968545585283400L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(17263, 7054740860733782460L), QK.a(27153, 4123641865963786447L)}), dy_0.Home);
        v5[QK.a((int)15850, (long)8364390001957865275L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(6653, 49255603365716778L), QK.a(31620, 3667213166147617089L)}), dy_0.Home);
        v5[QK.a((int)15717, (long)7192101454069663679L)] = Map.entry(new rp_0(new int[]{1}), dy_0.Home);
        v5[QK.a((int)15119, (long)8764101788366176716L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(17263, 7054740860733782460L), QK.a(27989, 374080225566873490L)}), dy_0.End);
        v5[QK.a((int)20034, (long)7835377634438083747L)] = Map.entry(new rp_0(new int[]{QK.a(23464, 447462671001772390L), QK.a(6653, 49255603365716778L), QK.a(19542, 5005136652817495689L)}), dy_0.End);
        v5[QK.a((int)22304, (long)6537311414649908677L)] = Map.entry(new rp_0(new int[]{5}), dy_0.End);
        QK.l = Map.ofEntries(v5);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3ACB;
        if (b[n11] == null) {
            QK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

