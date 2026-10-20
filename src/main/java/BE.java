/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class BE
implements ActionListener {
    final z2 W;
    private static final String a;

    BE(z2 z22) {
        this.W = z22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = lk_0.B(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lk_0.X(object);
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
                char[] cArray3 = "n!Fy!C3@\u001eox\nC\u0015h5bD\n|\u0010^)EK\u0000S\"#\f[c\u0003w\u000fz#Jv%@/;\u001d\u001e9\u001c7\u0007Vbayrh\"y?\u0019MoT\u0013Az^zr4*a\u000fzn#i,n\u000bt".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 73;
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
                            n17 = 4;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 73;
                            break;
                        }
                        case 4: {
                            n17 = 13;
                            break;
                        }
                        case 5: {
                            n17 = 76;
                            break;
                        }
                        default: {
                            n17 = 10;
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

