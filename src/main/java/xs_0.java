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
 * Renamed from xs
 */
public class xs_0
implements Transferable {
    DefaultMutableTreeNode[] L;
    final T8 F;

    public xs_0(T8 t8, DefaultMutableTreeNode[] defaultMutableTreeNodeArray) {
        this.F = t8;
        this.L = defaultMutableTreeNodeArray;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        xs_0 xs_02;
        block6: {
            block7: {
                String[] stringArray = F8.y();
                try {
                    try {
                        boolean bl;
                        xs_02 = this;
                        if (stringArray != null) break block6;
                        try {
                            bl = (Boolean)xs_02.isDataFlavorSupported(dataFlavor);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) break block7;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw xs_0.a(unsupportedFlavorException);
                    }
                    throw new UnsupportedFlavorException(dataFlavor);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw xs_0.a(unsupportedFlavorException);
                }
            }
            xs_02 = this;
        }
        return (DefaultMutableTreeNode[])xs_02.L;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[])this.F.M;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return ((DataFlavor)this.F.u).equals(dataFlavor);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

