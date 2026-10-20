/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Kp
 */
class kp_0
implements ActionListener {
    final aM d;
    final t3_0 o;
    final bq_0 a;

    kp_0(bq_0 bq_02, aM aM2, t3_0 t3_02) {
        this.a = bq_02;
        this.d = aM2;
        this.o = t3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CW cW;
        String[] stringArray = aM.s();
        try {
            cW = (CW)this.d.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (stringArray == null) {
            if (cW != null) {
                try {
                    cW = (CW)this.d.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            Object object;
            yb_1 yb_12;
            try {
                yb_12 = (yb_1)cW.H();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            yb_1 yb_13 = yb_12;
            try {
                object = this.o.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            lj_2 lj_22 = (lj_2)object;
            try {
                yb_13.f(lj_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

