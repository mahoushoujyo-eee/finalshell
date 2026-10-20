/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class O1
extends MouseInputAdapter {
    Toolkit k;
    Component e;
    JMenuBar n;
    QG F;
    Container M;

    public O1(Component component, JMenuBar jMenuBar, QG qG, Container container) {
        this.k = Toolkit.getDefaultToolkit();
        this.e = component;
        this.n = jMenuBar;
        this.F = qG;
        this.M = container;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        try {
            this.K((Object)mouseEvent, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void K(MouseEvent mouseEvent, boolean bl) {
        int n10;
        Point point;
        block12: {
            block13: {
                Component component;
                Component component2;
                String string;
                block14: {
                    Point point2;
                    Container container;
                    block11: {
                        block10: {
                            point = mouseEvent.getPoint();
                            container = (Container)this.M;
                            string = aA.z();
                            point2 = SwingUtilities.convertPoint((QG)this.F, point, (Container)this.M);
                            n10 = point2.y;
                            if (string != null) break block10;
                            if (n10 >= 0) break block11;
                            n10 = point2.y + ((JMenuBar)this.n).getHeight();
                        }
                        if (string != null) break block12;
                        if (n10 >= 0) {
                            // empty if block
                        }
                        break block13;
                    }
                    component = component2 = SwingUtilities.getDeepestComponentAt(container, point2.x, point2.y);
                    if (string != null) break block14;
                    if (component == null) break block13;
                    component = component2;
                }
                n10 = component.equals((Component)this.e) ? 1 : 0;
                if (string != null) break block12;
                if (n10 != 0) {
                    Point point3 = SwingUtilities.convertPoint((QG)this.F, point, component2);
                    component2.dispatchEvent(new MouseEvent(component2, mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiers(), point3.x, point3.y, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger()));
                }
            }
            n10 = bl ? 1 : 0;
        }
        if (n10 != 0) {
            try {
                this.F.T(point);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((QG)this.F).repaint();
        }
    }
}

