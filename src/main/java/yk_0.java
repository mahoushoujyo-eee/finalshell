/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Renamed from Yk
 */
class yk_0
implements Runnable {
    final KR Z;
    private static final long a;

    yk_0(KR kR) {
        this.Z = kR;
    }

    @Override
    public void run() {
        int[] nArray = DU.u();
        ((JTextField)this.Z.d.C).setText(((JTextField)this.Z.d.C).getText().toLowerCase());
        int[] nArray2 = nArray;
        String string = new String(((JPasswordField)this.Z.d.d).getPassword());
        if (nArray2 != null) {
            Object object;
            String string2;
            try {
                string2 = (String)this.Z.d.Y.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!string.equals(string2)) {
                String string3;
                try {
                    string3 = (String)lk_0.Q(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string4 = string3;
                ((JPasswordField)this.Z.d.d).setText(string4);
            }
            try {
                this.Z.d.Y.t(((JTextField)this.Z.d.C).getText());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.Z.d.Y.g(new String(((JPasswordField)this.Z.d.d).getPassword()));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            _y_0.b();
            try {
                yt_1.F.W((Object)new T9(this), (int)a);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.Z.d.K.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7614969788393075630L;
        a = 0xC2D99EEA3C803816L ^ l2;
    }
}

