/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

/*
 * Renamed from au
 */
class au_0
implements Runnable {
    final String I;
    final WT j;
    private static final String a;

    au_0(WT wT, String string) {
        this.j = wT;
        this.I = string;
    }

    @Override
    public void run() {
        block10: {
            au_0 au_02;
            block9: {
                boolean bl;
                block8: {
                    String[] stringArray;
                    block6: {
                        block7: {
                            stringArray = WT.y();
                            au_02 = this;
                            if (stringArray != null) break block6;
                            if ((JTextArea)au_02.j.h == null) break block7;
                            ((JTextArea)this.j.h).append((String)this.I);
                            try {
                                this.j.I(this.j.h);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            bl = this.j.L;
                            if (stringArray != null) break block8;
                            if (bl) {
                                ((JTextArea)this.j.h).setCaretPosition(((JTextArea)this.j.h).getDocument().getLength());
                            }
                        }
                        au_02 = this;
                    }
                    if (stringArray != null) break block9;
                    bl = ((String)au_02.I).contains(a);
                }
                if (!bl) break block10;
                au_02 = this;
            }
            au_02.j.p = true;
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
                char[] cArray3 = "{+f\fIC0|\"".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 101;
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
                            n17 = 119;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 101;
                            break;
                        }
                        case 3: {
                            n17 = 5;
                            break;
                        }
                        case 4: {
                            n17 = 77;
                            break;
                        }
                        case 5: {
                            n17 = 82;
                            break;
                        }
                        default: {
                            n17 = 60;
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

