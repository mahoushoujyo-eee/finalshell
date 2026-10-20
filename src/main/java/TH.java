/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class TH
implements Transferable {
    DefaultMutableTreeNode[] M;
    final wa_0 e;

    public TH(wa_0 wa_02, DefaultMutableTreeNode[] defaultMutableTreeNodeArray) {
        this.e = wa_02;
        this.M = defaultMutableTreeNodeArray;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        TH tH;
        block6: {
            block7: {
                String string = aA.z();
                try {
                    try {
                        boolean bl;
                        tH = this;
                        if (string != null) break block6;
                        try {
                            bl = (Boolean)tH.isDataFlavorSupported(dataFlavor);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) break block7;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw TH.a(unsupportedFlavorException);
                    }
                    throw new UnsupportedFlavorException(dataFlavor);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw TH.a(unsupportedFlavorException);
                }
            }
            tH = this;
        }
        return (DefaultMutableTreeNode[])tH.M;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[])this.e.k;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return ((DataFlavor)this.e.Y).equals(dataFlavor);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

