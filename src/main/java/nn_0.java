/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.TextAction;

/*
 * Renamed from nn
 */
class nn_0
extends TextAction {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    nn_0() {
        super(a);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block36: {
            block34: {
                block35: {
                    block41: {
                        var3_2 = this.getTextComponent(var1_1);
                        var4_3 = 1;
                        var2_4 = F8.y();
                        if (var2_4 != null) break block34;
                        if (var3_2 == null) break block35;
                        break block41;
                        catch (BadLocationException v0) {
                            throw nn_0.a(v0);
                        }
                    }
                    try {
                        block42: {
                            v1 = var3_2.isEditable();
                            if (var2_4 != null) break block36;
                            break block42;
                            catch (BadLocationException v2) {
                                throw nn_0.a(v2);
                            }
                        }
                        if (v1 == 0) break block35;
                    }
                    catch (BadLocationException v3) {
                        throw nn_0.a(v3);
                    }
                    try {
                        block39: {
                            block40: {
                                block47: {
                                    block46: {
                                        block45: {
                                            block44: {
                                                block43: {
                                                    block38: {
                                                        block37: {
                                                            var5_5 = var3_2.getDocument();
                                                            var6_7 = var3_2.getCaret();
                                                            var7_8 = var6_7.getDot();
                                                            var8_9 = var6_7.getMark();
                                                            try {
                                                                v4 = var7_8;
                                                                if (var2_4 != null) break block37;
                                                                if (v4 != var8_9) {
                                                                }
                                                                ** GOTO lbl40
                                                            }
                                                            catch (BadLocationException v5) {
                                                                throw nn_0.a(v5);
                                                            }
                                                            var5_5.remove(Math.min(var7_8, var8_9), Math.abs(var7_8 - var8_9));
                                                            var4_3 = 0;
                                                            try {
                                                                if (var2_4 == null) break block35;
lbl40:
                                                                // 2 sources

                                                                v4 = var7_8;
                                                            }
                                                            catch (BadLocationException v6) {
                                                                throw nn_0.a(v6);
                                                            }
                                                        }
                                                        try {
                                                            if (var2_4 != null) break block38;
                                                            if (v4 <= 0) break block35;
                                                        }
                                                        catch (BadLocationException v7) {
                                                            throw nn_0.a(v7);
                                                        }
                                                        v4 = 1;
                                                    }
                                                    var9_10 = v4;
                                                    try {
                                                        v8 = var7_8;
                                                        if (var2_4 != null) break block39;
                                                        if (v8 <= 1) break block40;
                                                    }
                                                    catch (BadLocationException v9) {
                                                        throw nn_0.a(v9);
                                                    }
                                                    var10_11 = var5_5.getText(var7_8 - 2, 2);
                                                    var11_12 = var10_11.charAt(0);
                                                    var12_13 = var10_11.charAt(1);
                                                    v8 = var11_12;
                                                    if (var2_4 != null) break block39;
                                                    if (v8 < nn_0.a(18776, 130660890681459844L)) break block40;
                                                    break block43;
                                                    catch (BadLocationException v10) {
                                                        throw nn_0.a(v10);
                                                    }
                                                }
                                                v8 = var11_12;
                                                if (var2_4 != null) break block39;
                                                break block44;
                                                catch (BadLocationException v11) {
                                                    throw nn_0.a(v11);
                                                }
                                            }
                                            if (v8 > nn_0.a(2900, 185630937709119114L)) break block40;
                                            break block45;
                                            catch (BadLocationException v12) {
                                                throw nn_0.a(v12);
                                            }
                                        }
                                        v8 = var12_13;
                                        if (var2_4 != null) break block39;
                                        break block46;
                                        catch (BadLocationException v13) {
                                            throw nn_0.a(v13);
                                        }
                                    }
                                    if (v8 < nn_0.a(29123, 7448228665762708508L)) break block40;
                                    break block47;
                                    catch (BadLocationException v14) {
                                        throw nn_0.a(v14);
                                    }
                                }
                                try {
                                    block48: {
                                        v8 = var12_13;
                                        if (var2_4 != null) break block39;
                                        break block48;
                                        catch (BadLocationException v15) {
                                            throw nn_0.a(v15);
                                        }
                                    }
                                    if (v8 > nn_0.a(2301, 1903566571027399968L)) break block40;
                                }
                                catch (BadLocationException v16) {
                                    throw nn_0.a(v16);
                                }
                                var9_10 = 2;
                            }
                            var5_5.remove(var7_8 - var9_10, var9_10);
                            v8 = 0;
                        }
                        var4_3 = v8;
                    }
                    catch (BadLocationException var5_6) {
                        // empty catch block
                    }
                }
                var4_3 = 0;
            }
            v1 = var4_3;
        }
        try {
            if (v1 != 0) {
                UIManager.getLookAndFeel().provideErrorFeedback(var3_2);
            }
        }
        catch (BadLocationException v17) {
            throw nn_0.a(v17);
        }
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
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
                v0 = "0EtnMZ_$R}}PP\u0007'".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 25;
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
                                v9 = 77;
                                break;
                            }
                            case 1: {
                                v9 = 57;
                                break;
                            }
                            case 2: {
                                v9 = 1;
                                break;
                            }
                            case 3: {
                                v9 = 18;
                                break;
                            }
                            case 4: {
                                v9 = 32;
                                break;
                            }
                            case 5: {
                                v9 = 38;
                                break;
                            }
                            default: {
                                v9 = 107;
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
                nn_0.a = new String(v10).intern();
                var0_1 = 3284116613923233164L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u00dan\u00bf\u00e4\u00f5\u00bf\u0007S\u00e0\u00e8=oJ\u00c0A\b";
                var5_5 = "\u00dan\u00bf\u00e4\u00f5\u00bf\u0007S\u00e0\u00e8=oJ\u00c0A\b".length();
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
                    var4_4 = "\u0099E\u0000\u00a1Yp}\u0090\u00f2E:\u001a\u00b8\u00a3\u0000\u00f9";
                    var5_5 = "\u0099E\u0000\u00a1Yp}\u0090\u00f2E:\u001a\u00b8\u00a3\u0000\u00f9".length();
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
        nn_0.b = var6_2;
        nn_0.c = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xDDD;
        if (c[n11] == null) {
            nn_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

