/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

/*
 * Renamed from tt
 */
class tt_2
implements ActionListener {
    final aW w;

    tt_2(aW aW2) {
        this.w = aW2;
    }

    /*
     * Loose catch block
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block9: {
            int[] nArray = DU.u();
            try {
                String string;
                DataFlavor dataFlavor;
                Clipboard clipboard;
                block8: {
                    Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard = clipboard2;
                    dataFlavor = DataFlavor.stringFlavor;
                    if (nArray == null) break block8;
                    try {
                        block10: {
                            if (!clipboard.isDataFlavorAvailable(dataFlavor)) break block9;
                            break block10;
                            catch (Exception exception) {
                                throw tt_2.a(exception);
                            }
                        }
                        clipboard = clipboard2;
                        dataFlavor = DataFlavor.stringFlavor;
                    }
                    catch (Exception exception) {
                        throw tt_2.a(exception);
                    }
                }
                String string2 = (String)clipboard.getData(dataFlavor);
                try {
                    string = (String)lk_0.E(string2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JTextField)this.w.k).setText(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

