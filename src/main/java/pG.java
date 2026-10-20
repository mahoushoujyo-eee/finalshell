/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class pG {
    KeyboardFocusManager H;
    ArrayList S;

    public pG() {
        this.S = new ArrayList();
        this.H = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        ((KeyboardFocusManager)this.H).addKeyEventDispatcher(new oz_0(this));
    }

    public void o(qh_0 qh_02) {
        ((ArrayList)this.S).add(qh_02);
    }

    void W(KeyEvent keyEvent) {
        block25: {
            U u10;
            block26: {
                U u11;
                block27: {
                    KQ kQ;
                    U u12;
                    Object object;
                    Object object2;
                    Object object3;
                    boolean bl;
                    int[] nArray;
                    block24: {
                        KeyStroke keyStroke;
                        Object object4;
                        u6_0 u6_02;
                        Object object5;
                        Window window = SwingUtilities.getWindowAncestor(keyEvent.getComponent());
                        nArray = zG.Z();
                        KeyStroke keyStroke2 = KeyStroke.getKeyStrokeForEvent(keyEvent);
                        try {
                            object5 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u6_02 = (u6_0)object5.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        u6_0 u6_03 = u6_02;
                        try {
                            object4 = u6_03.L(US.F);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            keyStroke = (KeyStroke)object4.f();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl = keyStroke2.equals(keyStroke);
                        if (nArray != null) break block24;
                        if (!bl) break block25;
                        bl = window.getClass().equals(o2_0.class);
                    }
                    if (bl) break block25;
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.O();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.G();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        u12 = (U)object.W();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    u10 = u11 = u12;
                    if (nArray != null) break block26;
                    try {
                        kQ = (KQ)u10.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (kQ.isVisible()) break block27;
                    try {
                        u11.v();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (nArray == null) break block25;
                }
                u10 = u11;
            }
            try {
                u10.c();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

