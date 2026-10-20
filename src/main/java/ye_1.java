/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yE
 */
class ye_1
implements Runnable {
    final String t;
    final aJ I;
    final nj_0 R;

    ye_1(nj_0 nj_02, String string, aJ aJ2) {
        this.R = nj_02;
        this.t = string;
        this.I = aJ2;
    }

    @Override
    public void run() {
        block11: {
            nj_0 nj_02;
            block10: {
                Object object;
                String string = (String)this.t;
                String[] stringArray = F8.y();
                try {
                    this.I.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((nj_0)this.R).repaint();
                try {
                    object = this.R.O.I.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                nj_02 = (nj_0)this.R;
                if (stringArray != null) break block10;
                nj_02.x = false;
                if (string.equals(((ne_2)this.R.B).getText().trim())) break block11;
                nj_02 = (nj_0)this.R;
            }
            try {
                nj_02.c();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

