/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

/*
 * Renamed from oE
 */
class oe_1
implements Runnable {
    final String Z;
    final nq_0 U;
    private static final String a;

    oe_1(nq_0 nq_02, String string) {
        this.U = nq_02;
        this.Z = string;
    }

    @Override
    public void run() {
        ((JTextArea)this.U.f).append((String)this.Z + "\n");
        try {
            this.U.p(this.U.f);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JTextArea)this.U.f).setCaretPosition(((JTextArea)this.U.f).getDocument().getLength());
        if (((String)this.Z).startsWith(a)) {
            try {
                yt_1.F.J(new QF(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
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
                char[] cArray3 = "\u53ad\u7f11\u5bdc\u6205".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 99;
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
                            n17 = 69;
                            break;
                        }
                        case 1: {
                            n17 = 91;
                            break;
                        }
                        case 2: {
                            n17 = 51;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 21;
                            break;
                        }
                        case 5: {
                            n17 = 106;
                            break;
                        }
                        default: {
                            n17 = 71;
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

