/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.rt_2;
import com.xa_1;
import javax.swing.JCheckBox;

/*
 * Renamed from com.xI
 */
class xi_1
extends xa_1 {
    final JCheckBox N;
    final rt_2 V;
    private static final String a;

    xi_1(rt_2 rt_22, JCheckBox jCheckBox) {
        this.V = rt_22;
        this.N = jCheckBox;
        super(rt_22);
    }

    @Override
    public void y(Object object) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                int[] nArray;
                block2: {
                    block3: {
                        bl = false;
                        nArray = WC.V();
                        bl2 = object instanceof Boolean;
                        if (nArray != null) break block2;
                        if (!bl2) break block3;
                        bl = (Boolean)object;
                        if (nArray == null) break block4;
                    }
                    bl2 = object instanceof String;
                }
                if (nArray != null) break block5;
                if (!bl2) break block4;
                bl2 = object.equals(a);
            }
            bl = bl2;
        }
        this.N.setSelected(bl);
    }

    @Override
    public Object G() {
        return this.N.isSelected();
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
                char[] cArray3 = "^VN\u001b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 5;
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
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 62;
                            break;
                        }
                        case 3: {
                            n17 = 123;
                            break;
                        }
                        case 4: {
                            n17 = 21;
                            break;
                        }
                        case 5: {
                            n17 = 92;
                            break;
                        }
                        default: {
                            n17 = 124;
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

