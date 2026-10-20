/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.TreePath;

/*
 * Renamed from oP
 */
class op_1
implements Transferable {
    public static DataFlavor w;
    DataFlavor[] H;
    TreePath v;

    public op_1(TreePath treePath) {
        this.H = new DataFlavor[]{(DataFlavor)op_1.w};
        this.v = treePath;
    }

    @Override
    public synchronized DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[])this.H;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return dataFlavor.getRepresentationClass() == TreePath.class;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        block7: {
            op_1 op_12;
            block6: {
                int[] nArray = a3.I();
                try {
                    try {
                        boolean bl;
                        op_12 = this;
                        if (nArray == null) break block6;
                        try {
                            bl = (Boolean)op_12.isDataFlavorSupported(dataFlavor);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (!bl) break block7;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw op_1.a(unsupportedFlavorException);
                    }
                    op_12 = this;
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw op_1.a(unsupportedFlavorException);
                }
            }
            return (TreePath)op_12.v;
        }
        throw new UnsupportedFlavorException(dataFlavor);
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
                char[] cArray3 = "\u0005q7c\u0002/T%k".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 106;
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 105;
                            break;
                        }
                        case 2: {
                            n17 = 56;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 72;
                            break;
                        }
                        case 5: {
                            n17 = 21;
                            break;
                        }
                        default: {
                            n17 = 95;
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
        op_1.w = new DataFlavor(TreePath.class, string);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

