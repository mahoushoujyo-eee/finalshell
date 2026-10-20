/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lU
 */
class lu_1
implements ActionListener {
    final cg_0 t;

    lu_1(cg_0 cg_02) {
        this.t = cg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            KV kV;
            block4: {
                String[] stringArray = KV.b();
                kV = (KV)this.t.r;
                if (stringArray != null) break block4;
                if (kV == null) break block5;
                kV = (KV)this.t.r;
            }
            try {
                kV.y();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

