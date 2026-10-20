/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fw
 */
class fw_2
implements ActionListener {
    final zs_0 n;
    private static final String a;

    fw_2(zs_0 zs_02) {
        this.n = zs_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        File file = new File(a);
        try {
            lk_0.X(file);
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
                char[] cArray3 = " 'RW\"\u001e\u0017!".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
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
                            n17 = 95;
                            break;
                        }
                        case 1: {
                            n17 = 89;
                            break;
                        }
                        case 2: {
                            n17 = 119;
                            break;
                        }
                        case 3: {
                            n17 = 110;
                            break;
                        }
                        case 4: {
                            n17 = 22;
                            break;
                        }
                        case 5: {
                            n17 = 34;
                            break;
                        }
                        default: {
                            n17 = 35;
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

