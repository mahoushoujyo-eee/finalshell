/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.at_0;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/*
 * Renamed from com.lL
 */
public class ll_1
implements Transferable {
    public static final DataFlavor q;
    public static final DataFlavor[] c;
    private final at_0 V;

    public ll_1(at_0 at_02) {
        this.V = at_02;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return c;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return q.equals(dataFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        return this.V;
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
                char[] cArray3 = "T\u0018[@N\u001a&d3YAB".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 69;
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
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 125;
                            break;
                        }
                        case 3: {
                            n17 = 112;
                            break;
                        }
                        case 4: {
                            n17 = 102;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 13;
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
        String string = new String(cArray).intern();
        q = new DataFlavor(at_0.class, string);
        c = new DataFlavor[]{q};
    }
}

