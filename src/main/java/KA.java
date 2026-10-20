/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JScrollPane;

class KA
implements ComponentListener {
    final as_0 e;
    final nj_0 X;
    final uv_1 t;

    KA(uv_1 uv_12, as_0 as_02, nj_0 nj_02) {
        this.t = uv_12;
        this.e = as_02;
        this.X = nj_02;
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        Dimension dimension;
        try {
            dimension = (Dimension)this.e.getPreferredSize();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JScrollPane)this.t.F).setPreferredSize(dimension);
        ((uv_1)this.t).getParent().validate();
        try {
            yt_1.F.J(new g_(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
    }
}

