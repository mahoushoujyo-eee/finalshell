/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

/*
 * Renamed from ue
 */
class ue_2
implements Runnable {
    final String v;
    final da_1 Z;
    private static final String a;

    ue_2(da_1 da_12, String string) {
        this.Z = da_12;
        this.v = string;
    }

    @Override
    public void run() {
        block10: {
            ue_2 ue_22;
            block9: {
                boolean bl;
                block8: {
                    String[] stringArray;
                    block6: {
                        block7: {
                            stringArray = da_1.q();
                            ue_22 = this;
                            if (stringArray != null) break block6;
                            if ((JTextArea)ue_22.Z.m == null) break block7;
                            ((JTextArea)this.Z.m).append((String)this.v);
                            try {
                                this.Z.s(this.Z.m);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            bl = this.Z.a;
                            if (stringArray != null) break block8;
                            if (bl) {
                                ((JTextArea)this.Z.m).setCaretPosition(((JTextArea)this.Z.m).getDocument().getLength());
                            }
                        }
                        ue_22 = this;
                    }
                    if (stringArray != null) break block9;
                    bl = ((String)ue_22.v).contains(a);
                }
                if (!bl) break block10;
                ue_22 = this;
            }
            ue_22.Z.M = true;
        }
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
                char[] cArray3 = "LM110\u001eOKD".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 74;
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
                            n17 = 111;
                            break;
                        }
                        case 1: {
                            n17 = 105;
                            break;
                        }
                        case 2: {
                            n17 = 29;
                            break;
                        }
                        case 3: {
                            n17 = 23;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 32;
                            break;
                        }
                        default: {
                            n17 = 108;
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
    }
}

