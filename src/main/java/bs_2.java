/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from bs
 */
class bs_2
implements MouseListener {
    final JButton Q;
    final tv_0 g;

    bs_2(tv_0 tv_02, JButton jButton) {
        this.g = tv_02;
        this.Q = jButton;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        int n10;
        ((aJ)this.g.f).stopEditing();
        Point point = SwingUtilities.convertPoint((JButton)this.Q, mouseEvent.getPoint(), (aJ)this.g.f);
        this.g.V = null;
        try {
            n10 = (Integer)this.g.f.U(point);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.g.f.i(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
        try {
            this.g.r(defaultMutableTreeNode2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

