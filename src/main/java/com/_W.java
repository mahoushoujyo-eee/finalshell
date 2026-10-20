/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KR;
import com.ac_0;
import com.kd_2;
import com.ke_1;
import com.py_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

class _W
implements ActionListener {
    final File a;
    final KR r;
    final kd_2 T;
    private static final String b;

    _W(kd_2 kd_22, File file, KR kR) {
        this.T = kd_22;
        this.a = file;
        this.r = kR;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            block3: {
                File[] fileArray;
                String string;
                File[] fileArray2;
                block4: {
                    block2: {
                        fileArray2 = this.a.listFiles();
                        string = ke_1.v();
                        fileArray = fileArray2;
                        if (string != null) break block2;
                        if (fileArray == null) break block3;
                        fileArray = fileArray2;
                    }
                    if (string != null) break block4;
                    if (fileArray.length <= 0) break block3;
                    fileArray = fileArray2;
                }
                Arrays.sort(fileArray, new py_2());
                kd_2.I(this.T, fileArray2, this.r);
                if (string == null) break block5;
            }
            ac_0.V(this.r, null, b);
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
                char[] cArray3 = "\u001aq\u0010QXi\u001b<|UMRi\u001c'u\u0010P\u001d \u0014=p\u0011F".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 93;
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
                            n17 = 19;
                            break;
                        }
                        case 1: {
                            n17 = 68;
                            break;
                        }
                        case 2: {
                            n17 = 40;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 96;
                            break;
                        }
                        case 5: {
                            n17 = 20;
                            break;
                        }
                        default: {
                            n17 = 39;
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
        b = new String(cArray).intern();
    }
}

