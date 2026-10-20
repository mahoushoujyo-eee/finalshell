/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dI
 */
class di_1
implements ActionListener {
    final ty_0 f;
    final C4 h;

    di_1(C4 c4, ty_0 ty_02) {
        this.h = c4;
        this.f = ty_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block10: {
            Object object;
            di_1 di_12;
            block9: {
                long l2;
                Object object2;
                int[] nArray = C4.K();
                di_12 = this;
                if (nArray == null) break block9;
                try {
                    object2 = di_12.f.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    l2 = (Long)object2.m();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (l2 <= 0L) break block10;
                di_12 = this;
            }
            try {
                object = this.f.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                di_12.h.C(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

