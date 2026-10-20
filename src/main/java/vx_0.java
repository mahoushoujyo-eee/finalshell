/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vx
 */
class vx_0
implements ActionListener {
    final av_0 N;

    vx_0(av_0 av_02) {
        this.N = av_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.N.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

