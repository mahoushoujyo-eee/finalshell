/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class TW
implements ActionListener {
    final aM o;
    private static final String a;

    TW(aM aM2) {
        this.o = aM2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        t3_0 t3_02;
        CL cL = new CL();
        try {
            t3_02 = (t3_0)this.o.l((Object)cL, (Object)a, ((ArrayList)this.o.c).size(), false, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            cL.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.o.X(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
                char[] cArray3 = "\u65aa\u681d\u7b36\u982e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 3;
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
                            n17 = 25;
                            break;
                        }
                        case 1: {
                            n17 = 25;
                            break;
                        }
                        case 2: {
                            n17 = 75;
                            break;
                        }
                        case 3: {
                            n17 = 88;
                            break;
                        }
                        case 4: {
                            n17 = 63;
                            break;
                        }
                        case 5: {
                            n17 = 47;
                            break;
                        }
                        default: {
                            n17 = 7;
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

