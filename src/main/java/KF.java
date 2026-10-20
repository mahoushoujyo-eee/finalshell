/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

class KF
implements Runnable {
    final U I;
    private static final String a;

    KF(U u10) {
        this.I = u10;
    }

    @Override
    public void run() {
        try {
            this.I.l(this.I);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JPanel)this.I.a).add((Component)((aE)this.I.d), a);
        ((JSplitPane)this.I.r).setRightComponent((JPanel)this.I.a);
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
                char[] cArray3 = "0H%~\u0014MY}\u0001mm\u000e\u0002\u0014?\r&x\u0013\u001a\u001akV3k\f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 61;
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
                            n17 = 122;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 124;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 65;
                            break;
                        }
                        case 5: {
                            n17 = 80;
                            break;
                        }
                        default: {
                            n17 = 94;
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

