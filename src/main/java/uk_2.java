/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uk
 */
public class uk_2
implements Transferable {
    Object[] j;
    DataFlavor G;
    DataFlavor[] A;
    final yd_0 R;
    private static final String a;

    public uk_2(yd_0 yd_02, Object[] objectArray) {
        this.R = yd_02;
        this.A = new DataFlavor[1];
        this.j = objectArray;
        String string = a + Object.class.getName() + "\"";
        try {
            this.G = new DataFlavor(string);
            ((DataFlavor[])c.c((long)340773235516701023L).get((Object)this))[0] = (DataFlavor)this.G;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        uk_2 uk_22;
        block6: {
            block7: {
                String string = km_0.U();
                try {
                    try {
                        boolean bl;
                        uk_22 = this;
                        if (string != null) break block6;
                        try {
                            bl = (Boolean)uk_22.isDataFlavorSupported(dataFlavor);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) break block7;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw uk_2.a(unsupportedFlavorException);
                    }
                    throw new UnsupportedFlavorException(dataFlavor);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw uk_2.a(unsupportedFlavorException);
                }
            }
            uk_22 = this;
        }
        return (Object[])uk_22.j;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[])this.A;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return ((DataFlavor)this.G).equals(dataFlavor);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
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
                char[] cArray3 = "1:8Z\u001e?t$#'XX$8:+>WZ6c=g$Y\u0014=y}%*\\\u0012?a\"/.\r\u00140t#9u\u0014".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 38;
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
                            n17 = 118;
                            break;
                        }
                        case 1: {
                            n17 = 108;
                            break;
                        }
                        case 2: {
                            n17 = 110;
                            break;
                        }
                        case 3: {
                            n17 = 16;
                            break;
                        }
                        case 4: {
                            n17 = 81;
                            break;
                        }
                        case 5: {
                            n17 = 122;
                            break;
                        }
                        default: {
                            n17 = 51;
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

