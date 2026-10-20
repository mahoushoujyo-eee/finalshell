/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.KeyEventDispatcher;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.SwingUtilities;

/*
 * Renamed from Oz
 */
class oz_0
implements KeyEventDispatcher {
    final pG G;

    oz_0(pG pG2) {
        this.G = pG2;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl;
        block9: {
            try {
                this.G.W(keyEvent);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Window window = SwingUtilities.getWindowAncestor(keyEvent.getComponent());
            Iterator iterator = ((ArrayList)this.G.S).iterator();
            int[] nArray = zG.Z();
            while (iterator.hasNext()) {
                block11: {
                    qh_0 qh_02;
                    block10: {
                        Window window2;
                        qh_0 qh_03;
                        qh_02 = qh_03 = (qh_0)iterator.next();
                        if (nArray != null) break block10;
                        try {
                            window2 = (Window)qh_02.A();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl = window2.equals(window);
                        if (nArray != null) break block9;
                        if (!bl) break block11;
                        qh_02 = qh_03;
                    }
                    try {
                        qh_02.i(keyEvent);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                if (nArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

