/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lm
 */
class lm_2
implements MouseListener {
    final boolean T;
    final ka_1 t;

    lm_2(ka_1 ka_12, boolean bl) {
        this.t = ka_12;
        this.T = bl;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block7: {
            int n10;
            block6: {
                ky_2[] ky_2Array = ka_1.y();
                n10 = mouseEvent.getButton();
                if (ky_2Array != null) break block6;
                if (n10 != 1) break block7;
                n10 = this.T ? 1 : 0;
            }
            if (n10 == 0) {
                try {
                    yt_1.F.J(new DM(this));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.t.M = false;
        try {
            this.t.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.t.M = true;
        try {
            this.t.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

