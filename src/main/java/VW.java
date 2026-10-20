/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

class VW
implements Runnable {
    final KV C;

    VW(KV kV) {
        this.C = kV;
    }

    @Override
    public void run() {
        KV kV;
        block13: {
            ui_1 ui_12;
            block10: {
                ArrayList arrayList = (ArrayList)((ArrayList)this.C.e).clone();
                String[] stringArray = KV.b();
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    block12: {
                        ui_1 ui_13;
                        block11: {
                            ui_1 ui_14;
                            ui_12 = ui_14 = (ui_1)iterator.next();
                            if (stringArray != null) break block10;
                            if (stringArray != null) break block11;
                            if (ui_12 == null) break block12;
                            ui_13 = ui_14;
                        }
                        try {
                            ui_13.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (stringArray == null) continue;
                }
                kV = (KV)this.C;
                if (stringArray != null) break block13;
                ui_12 = (ui_1)kV.KR;
            }
            if (ui_12 != null) {
                try {
                    this.C.KR.t();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            kV = (KV)this.C;
        }
        ((ArrayList)kV.e).clear();
    }
}

