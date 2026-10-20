/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JTextField;

public class JJ {
    private static final String a;
    private static final long b;

    public static int N(String string) throws Exception {
        int n10;
        block22: {
            int n11;
            block23: {
                String[] stringArray;
                block20: {
                    int n12;
                    block21: {
                        int n13;
                        int n14;
                        block18: {
                            block19: {
                                block16: {
                                    block17: {
                                        n12 = 1;
                                        n11 = 0;
                                        stringArray = F8.y();
                                        try {
                                            n11 = Integer.parseInt(string);
                                        }
                                        catch (Exception exception) {
                                            n12 = 0;
                                        }
                                        try {
                                            try {
                                                n14 = n11;
                                                if (stringArray != null) break block16;
                                                if (n14 >= 1) break block17;
                                            }
                                            catch (Exception exception) {
                                                throw JJ.a(exception);
                                            }
                                            n14 = 1;
                                            break block16;
                                        }
                                        catch (Exception exception) {
                                            throw JJ.a(exception);
                                        }
                                    }
                                    n14 = 0;
                                }
                                try {
                                    try {
                                        n13 = n11;
                                        if (stringArray != null) break block18;
                                        if (n13 <= (int)b) break block19;
                                    }
                                    catch (Exception exception) {
                                        throw JJ.a(exception);
                                    }
                                    n13 = 1;
                                    break block18;
                                }
                                catch (Exception exception) {
                                    throw JJ.a(exception);
                                }
                            }
                            n13 = 0;
                        }
                        try {
                            n10 = n14 | n13;
                            if (stringArray != null) break block20;
                            if (n10 == 0) break block21;
                        }
                        catch (Exception exception) {
                            throw JJ.a(exception);
                        }
                        n12 = 0;
                    }
                    n10 = n12;
                }
                try {
                    try {
                        if (stringArray != null) break block22;
                        if (n10 != 0) break block23;
                    }
                    catch (Exception exception) {
                        throw JJ.a(exception);
                    }
                    throw new Exception(a);
                }
                catch (Exception exception) {
                    throw JJ.a(exception);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public static void n(JTextField jTextField) {
        jTextField.setText(jTextField.getText().trim());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u7abc\u538f\u686d\u5f16\u9535\u8b908".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 90;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 9;
                            break;
                        }
                        case 1: {
                            n17 = 54;
                            break;
                        }
                        case 2: {
                            n17 = 11;
                            break;
                        }
                        case 3: {
                            n17 = 67;
                            break;
                        }
                        case 4: {
                            n17 = 118;
                            break;
                        }
                        case 5: {
                            n17 = 37;
                            break;
                        }
                        default: {
                            n17 = 67;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 753486037508985668L;
        b = 0xB60A514318F19344L ^ l2;
    }
}

