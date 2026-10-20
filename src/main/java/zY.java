/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

class zY
implements MouseMotionListener {
    final JButton g;
    final tv_0 G;

    zY(tv_0 tv_02, JButton jButton) {
        this.G = tv_02;
        this.g = jButton;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Point point = SwingUtilities.convertPoint((JButton)this.g, mouseEvent.getPoint(), (aJ)this.G.f);
        ((aJ)this.G.f).dispatchEvent(new MouseEvent((aJ)this.G.f, mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiers(), point.x, point.y, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger()));
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
}

