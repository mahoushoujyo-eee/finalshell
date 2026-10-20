/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

class G
implements MouseListener {
    final y1_0 c;
    final tg_0 w;
    final F_ V;

    G(F_ f_2, y1_0 y1_02, tg_0 tg_02) {
        this.V = f_2;
        this.c = y1_02;
        this.w = tg_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block14: {
            G g10;
            block15: {
                block16: {
                    int n10;
                    String[] stringArray;
                    block13: {
                        Object object;
                        String[] stringArray2 = F_.F();
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
                        if (stringArray == null) break block13;
                        if (n10 != 1) break block14;
                        g10 = this;
                        if (stringArray != null) {
                            try {
                                n10 = ((Boolean)g10.c.i()).booleanValue() ? 1 : 0;
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
                        this.w.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((tg_0)this.w).show((JButton)this.V.hR, 0 - ((tg_0)com.c.c((long)129362754730391727L).get((Object)this)).getPreferredSize().width + ((JButton)this.V.hR).getWidth() - 2, 0 - (((tg_0)com.c.c((long)129362754730391727L).get((Object)this)).getPreferredSize().height + 1));
                    if (stringArray != null) break block14;
                }
                g10 = this;
            }
            ((tg_0)g10.w).setVisible(false);
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

