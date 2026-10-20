/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from t0
 */
public class t0_0
implements Transferable {
    DefaultMutableTreeNode[] f;
    final nK M;

    public t0_0(nK nK2, DefaultMutableTreeNode[] defaultMutableTreeNodeArray) {
        this.M = nK2;
        this.f = defaultMutableTreeNodeArray;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        t0_0 t0_02;
        block6: {
            block7: {
                int[] nArray = a3.I();
                try {
                    try {
                        boolean bl;
                        t0_02 = this;
                        if (nArray == null) break block6;
                        try {
                            bl = (Boolean)t0_02.isDataFlavorSupported(dataFlavor);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) break block7;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw t0_0.a(unsupportedFlavorException);
                    }
                    throw new UnsupportedFlavorException(dataFlavor);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw t0_0.a(unsupportedFlavorException);
                }
            }
            t0_02 = this;
        }
        return (DefaultMutableTreeNode[])t0_02.f;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[])this.M.w;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return ((DataFlavor)this.M.J).equals(dataFlavor);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

