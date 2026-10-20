/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O_;
import com.cs_0;
import java.awt.event.KeyEvent;

public class OL
extends O_ {
    private static final String a;

    public OL() {
        this.h();
    }

    public OL(int n10) {
        super(KeyEvent.getKeyText(n10));
        this.h();
    }

    public OL(int n10, int n11) {
        super(KeyEvent.getKeyModifiersText(n11) + "+" + KeyEvent.getKeyText(n10));
        this.h();
    }

    public OL(cs_0 cs_02) {
        super(cs_02.toString());
        this.h();
    }

    public OL(String string) {
        super(string);
        this.h();
    }

    private void h() {
        this.S(a);
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
                char[] cArray3 = "QuO%\u0013nVU{Y+\u001a".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 108;
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
                            n17 = 85;
                            break;
                        }
                        case 1: {
                            n17 = 118;
                            break;
                        }
                        case 2: {
                            n17 = 87;
                            break;
                        }
                        case 3: {
                            n17 = 34;
                            break;
                        }
                        case 4: {
                            n17 = 26;
                            break;
                        }
                        case 5: {
                            n17 = 123;
                            break;
                        }
                        default: {
                            n17 = 23;
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

