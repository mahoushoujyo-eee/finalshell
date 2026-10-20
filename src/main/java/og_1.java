/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/*
 * Renamed from oG
 */
public class og_1
extends JComponent {
    J6 V;
    xv_0 c;
    JComponent U;
    JComponent B;
    MouseMotionListener i;
    private static int[] S;

    public og_1() {
        this.V = new J6();
        try {
            this.V.P(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setLayout((J6)this.V);
    }

    public xv_0 x() {
        return (xv_0)this.c;
    }

    public void n(xv_0 xv_02, JComponent jComponent) {
        int[] nArray = og_1.T();
        JComponent jComponent2 = jComponent;
        if (nArray != null) {
            if (jComponent2 != null) {
                this.remove(jComponent);
            }
            this.B = jComponent;
            this.add(jComponent);
            jComponent2 = (JComponent)this.U;
        }
        if (nArray != null) {
            if (jComponent2 != null) {
                this.remove((JComponent)this.U);
                ((JComponent)this.U).removeMouseMotionListener((MouseMotionListener)this.i);
            }
            this.c = xv_02;
            this.U = (JComponent)((Object)xv_02);
            this.add((JComponent)this.U);
            this.i = new vl_0(this);
            ((JComponent)this.U).addMouseMotionListener((MouseMotionListener)this.i);
            jComponent2 = (JComponent)this.U;
        }
        jComponent2.addMouseListener(new aa_0(this));
        if (nArray == null) {
            ky_2.K(new String[5]);
        }
    }

    public void O() {
        JComponent jComponent;
        Rectangle rectangle;
        Point point = MouseInfo.getPointerInfo().getLocation();
        SwingUtilities.convertPointFromScreen(point, (JComponent)this.U);
        try {
            rectangle = (Rectangle)this.c.m(point);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Rectangle rectangle2 = rectangle;
        int[] nArray = og_1.T();
        try {
            this.V.i(rectangle2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int[] nArray2 = nArray;
        try {
            jComponent = (JComponent)this.c.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (nArray2 != null) {
            if (!jComponent.isVisible()) {
                try {
                    jComponent = (JComponent)this.c.K();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            jComponent.setVisible(true);
        }
    }

    void U() {
        Point point = this.getMousePosition();
        ((JComponent)this.B).setVisible(point != null);
        ((JComponent)this.U).repaint();
    }

    public JComponent t() {
        return (JComponent)this.U;
    }

    public JComponent g() {
        return (JComponent)this.B;
    }

    public static void B(int[] nArray) {
        S = nArray;
    }

    public static int[] T() {
        return S;
    }

    static {
        if (og_1.T() == null) {
            og_1.B(new int[2]);
        }
    }
}

