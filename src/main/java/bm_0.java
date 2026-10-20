/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Bm
 */
class bm_0
implements ActionListener {
    final av_0 g;

    bm_0(av_0 av_02) {
        this.g = av_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.g.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.g.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

