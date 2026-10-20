/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

/*
 * Renamed from dR
 */
class dr_1
implements FocusListener {
    boolean r;
    final JTextComponent O;

    dr_1(JTextComponent jTextComponent) {
        this.O = jTextComponent;
        this.r = false;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        block6: {
            block5: {
                String[] stringArray;
                block4: {
                    YJ yJ;
                    stringArray = F8.y();
                    if (stringArray != null) break block4;
                    try {
                        yJ = (YJ)YJ.o();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (yJ.isVisible()) break block5;
                    this.r = false;
                }
                if (stringArray == null) break block6;
            }
            this.r = true;
        }
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        block19: {
            boolean bl;
            block20: {
                String[] stringArray;
                block18: {
                    block17: {
                        boolean bl2;
                        block16: {
                            Component component;
                            block15: {
                                bl2 = false;
                                stringArray = F8.y();
                                component = focusEvent.getOppositeComponent();
                                if (stringArray != null) break block15;
                                if (component == null) break block16;
                                component = focusEvent.getOppositeComponent();
                            }
                            bl = component.getClass().equals(JRootPane.class);
                            if (stringArray != null) break block17;
                            if (!bl) {
                                bl2 = true;
                            }
                        }
                        bl = bl2;
                    }
                    if (stringArray != null) break block18;
                    if (bl) {
                        try {
                            bl = (Boolean)YJ.b(this.O);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block19;
                }
                if (stringArray != null) break block20;
                if (!bl) break block19;
                bl = this.r;
            }
            if (!bl) {
                SwingUtilities.invokeLater(new tk_0(this));
            }
        }
    }
}

