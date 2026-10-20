/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from kT
 */
class kt_1
implements AWTEventListener {
    final FK F;
    private static final long a;

    kt_1(FK fK2) {
        this.F = fK2;
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block5: {
            boolean bl;
            block9: {
                Component component;
                Window window;
                Window window2;
                String[] stringArray;
                block8: {
                    Object object;
                    block7: {
                        int n10;
                        MouseEvent mouseEvent;
                        block6: {
                            AWTEvent aWTEvent2;
                            block4: {
                                stringArray = FK.i();
                                aWTEvent2 = aWTEvent;
                                if (stringArray != null) break block4;
                                if (!(aWTEvent2 instanceof MouseEvent)) break block5;
                                aWTEvent2 = aWTEvent;
                            }
                            mouseEvent = (MouseEvent)aWTEvent2;
                            n10 = mouseEvent.getID();
                            if (stringArray != null) break block6;
                            if (n10 != (int)a) break block5;
                            object = aWTEvent.getSource();
                            if (stringArray != null) break block7;
                            n10 = object instanceof Component;
                        }
                        if (n10 == 0) break block5;
                        object = mouseEvent.getSource();
                    }
                    Component component2 = (Component)object;
                    window2 = SwingUtilities.getWindowAncestor(component2);
                    window = SwingUtilities.getWindowAncestor((tq_2)this.F.s);
                    component = window2;
                    if (stringArray != null) break block8;
                    if (component == null) break block5;
                    component = component2;
                }
                bl = component.equals((dv_0)this.F.lD);
                if (stringArray != null) break block9;
                if (bl) break block5;
                bl = window2.equals(window);
            }
            if (!bl) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1894109234482483448L;
        a = 0x5F501A3A371D910DL ^ l2;
    }
}

