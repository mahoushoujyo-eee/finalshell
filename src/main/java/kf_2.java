/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from kf
 */
class kf_2
implements Runnable {
    final int a;
    final aM w;

    kf_2(aM aM2, int n10) {
        this.w = aM2;
        this.a = n10;
    }

    @Override
    public void run() {
        block7: {
            kf_2 kf_22;
            block8: {
                ArrayList arrayList;
                int n10;
                block6: {
                    String[] stringArray = aM.s();
                    n10 = this.a;
                    if (stringArray != null) break block6;
                    if (n10 <= 0) break block7;
                    kf_22 = this;
                    if (stringArray != null) break block8;
                    n10 = kf_22.a;
                }
                try {
                    arrayList = (ArrayList)this.w.v.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (n10 != arrayList.size() - 1) break block7;
                kf_22 = this;
            }
            try {
                kf_22.w.v.l(this.a - 1);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

