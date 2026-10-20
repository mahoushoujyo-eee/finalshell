/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

class Y4
implements MouseListener {
    final y1_0 H;
    final C_ S;
    final U Z;

    Y4(U u10, y1_0 y1_02, C_ c_) {
        this.Z = u10;
        this.H = y1_02;
        this.S = c_;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block14: {
            Y4 y4;
            block15: {
                block16: {
                    int n10;
                    String[] stringArray;
                    block13: {
                        Object object;
                        String[] stringArray2 = F8.y();
                        try {
                            object = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object.P();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        stringArray = stringArray2;
                        n10 = mouseEvent.getButton();
                        if (stringArray != null) break block13;
                        if (n10 != 1) break block14;
                        y4 = this;
                        if (stringArray == null) {
                            try {
                                n10 = ((Boolean)y4.H.i()).booleanValue() ? 1 : 0;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        break block15;
                    }
                    if (n10 != 0) break block16;
                    if (mouseEvent.getButton() != 1) break block14;
                    try {
                        this.Z.o();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((JPopupMenu)this.Z.hb).show((C_)this.S, 0 - ((JPopupMenu)c.c((long)337860688004803931L).get((Object)c.c((long)359109830162541260L).get((Object)this))).getPreferredSize().width + ((C_)this.S).getWidth() - 2, ((C_)this.S).getHeight() + 3);
                    if (stringArray == null) break block14;
                }
                y4 = this;
            }
            ((JPopupMenu)y4.Z.hb).setVisible(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
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

