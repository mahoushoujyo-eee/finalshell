/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class VC {
    String h;
    String f;
    String x;

    public VC(String string) {
        this.h = string;
    }

    public void P(KV kV) {
        block120: {
            boolean bl;
            block138: {
                String[] stringArray;
                block137: {
                    block135: {
                        block136: {
                            Object object;
                            block134: {
                                block132: {
                                    block133: {
                                        Object object2;
                                        block130: {
                                            block131: {
                                                long l2;
                                                long l3;
                                                long l4;
                                                long l5;
                                                long l6;
                                                long l7;
                                                long l8;
                                                block128: {
                                                    block129: {
                                                        long l9;
                                                        long l10;
                                                        long l11;
                                                        long l12;
                                                        long l13;
                                                        long l14;
                                                        long l15;
                                                        long l16;
                                                        long l17;
                                                        long l18;
                                                        Object object3;
                                                        block126: {
                                                            block127: {
                                                                block121: {
                                                                    block122: {
                                                                        ArrayList arrayList;
                                                                        aB aB2;
                                                                        aB aB3;
                                                                        stringArray = KV.b();
                                                                        String string = (String)this.x;
                                                                        if (stringArray == null) {
                                                                            if (string == null) {
                                                                                return;
                                                                            }
                                                                            string = (String)this.h;
                                                                        }
                                                                        bl = string.equals((String)tb_1.z);
                                                                        if (stringArray != null) break block121;
                                                                        if (!bl) break block122;
                                                                        object = new c0_0((String)this.f);
                                                                        object3 = new c0_0((String)this.x);
                                                                        try {
                                                                            aB3 = (aB)object3.H();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        aB aB4 = aB3;
                                                                        try {
                                                                            aB2 = (aB)object.H();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        aB aB5 = aB2;
                                                                        try {
                                                                            arrayList = (ArrayList)aB4.q();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        ArrayList arrayList2 = arrayList;
                                                                        for (N n10 : arrayList2) {
                                                                            block123: {
                                                                                long l19;
                                                                                ui_1 ui_12;
                                                                                N n11;
                                                                                String string2;
                                                                                block125: {
                                                                                    ArrayList arrayList3;
                                                                                    ui_1 ui_13;
                                                                                    block124: {
                                                                                        ui_1 ui_14;
                                                                                        N n12;
                                                                                        String string3;
                                                                                        try {
                                                                                            string3 = (String)n10.o();
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        string2 = string3;
                                                                                        try {
                                                                                            n12 = (N)aB5.q(string2);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        n11 = n12;
                                                                                        if (stringArray != null) break block120;
                                                                                        if (n11 == null) break block123;
                                                                                        try {
                                                                                            ui_14 = (ui_1)kV.h(string2);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        ui_13 = ui_12 = ui_14;
                                                                                        if (stringArray != null) break block124;
                                                                                        if (ui_13 != null) break block125;
                                                                                        ui_13 = ui_12 = new ui_1();
                                                                                    }
                                                                                    try {
                                                                                        ui_13.y(string2);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        arrayList3 = (ArrayList)kV.E();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    arrayList3.add(ui_12);
                                                                                }
                                                                                long l20 = n10.d - n11.d;
                                                                                long l21 = n10.V - n11.V;
                                                                                try {
                                                                                    ui_12.Y(l21);
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                                try {
                                                                                    ui_12.e(l20);
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                                try {
                                                                                    l19 = (Long)ui_12.T();
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                                long l22 = l19 - 0L;
                                                                                long l23 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                                                                                if (stringArray == null) {
                                                                                    long l24;
                                                                                    if (l23 == false) {
                                                                                        try {
                                                                                            ui_12.h(n11.V);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        ui_12.T(n10.V);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        l24 = (Long)ui_12.Y();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    long l25 = l24 - 0L;
                                                                                    l23 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                                                                                }
                                                                                if (stringArray == null) {
                                                                                    String string4;
                                                                                    Object object4;
                                                                                    if (l23 == false) {
                                                                                        try {
                                                                                            ui_12.o(n11.d);
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        ui_12.y(n10.d);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        object4 = aB4.x();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        string4 = (String)object4.o();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    l23 = (long)string4.equals(string2);
                                                                                }
                                                                                if (l23 != false) {
                                                                                    try {
                                                                                        kV.j(ui_12);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (stringArray == null) continue;
                                                                        }
                                                                        if (stringArray == null) break block120;
                                                                    }
                                                                    bl = ((String)this.h).equals((String)tb_1.L);
                                                                }
                                                                if (stringArray != null) break block126;
                                                                if (!bl) break block127;
                                                                object = new fv_0((String)this.f);
                                                                try {
                                                                    kV.m(object.e);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                try {
                                                                    kV.t(object.g);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                if (stringArray == null) break block120;
                                                            }
                                                            bl = ((String)this.h).equals((String)tb_1.u);
                                                        }
                                                        if (stringArray != null) break block128;
                                                        if (!bl) break block129;
                                                        object = new L6((String)this.f);
                                                        object3 = new L6((String)this.x);
                                                        try {
                                                            l18 = (Long)object3.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l17 = (Long)object.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l16 = (Long)object3.x();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l15 = (Long)object.x();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l14 = (Long)object3.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l13 = (Long)object.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        float f10 = (float)(l18 - l17 - (l16 - l15)) / (float)(l14 - l13);
                                                        try {
                                                            l12 = (Long)object3.Q();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l11 = (Long)object.Q();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l10 = (Long)object3.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            l9 = (Long)object.M();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        float f11 = (float)(l12 - l11) / (float)(l10 - l9);
                                                        try {
                                                            kV.g(f10);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            kV.x(f11);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        if (stringArray == null) break block120;
                                                    }
                                                    bl = ((String)this.h).equals((String)tb_1.p);
                                                }
                                                if (stringArray != null) break block130;
                                                if (!bl) break block131;
                                                object = new W4((String)this.x);
                                                try {
                                                    l8 = (Long)object.r();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    kV.g(l8);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l7 = (Long)object.a();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    kV.f(l7);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l6 = (Long)object.a();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l5 = (Long)object.r();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                float f12 = (float)l6 / (float)l5;
                                                try {
                                                    kV.S(f12);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l4 = (Long)object.R();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    kV.i(l4);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l3 = (Long)object.Z();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    kV.E(l3);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    l2 = (Long)object.R();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (stringArray == null) {
                                                    if (l2 > 0L) {
                                                        try {
                                                            l2 = (Long)object.Z();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                } else {
                                                    long l26;
                                                    try {
                                                        l26 = (Long)object.R();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    float f13 = (float)l2 / (float)l26;
                                                    try {
                                                        kV.b(f13);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                }
                                                if (stringArray == null) break block120;
                                            }
                                            bl = ((String)this.h).equals((String)tb_1.U);
                                        }
                                        if (stringArray != null) break block132;
                                        if (!bl) break block133;
                                        object = new e_0((String)this.x);
                                        try {
                                            object2 = object.a();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            kV.Q(object2);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (stringArray == null) break block120;
                                    }
                                    bl = ((String)this.h).equals((String)tb_1.d);
                                }
                                if (stringArray != null) break block134;
                                if (bl) break block120;
                                bl = ((String)this.h).equals((String)tb_1.v);
                            }
                            if (stringArray != null) break block135;
                            if (!bl) break block136;
                            object = new nz_0((String)this.x);
                            if (stringArray == null) break block120;
                        }
                        bl = ((String)this.h).equals((String)tb_1.X);
                    }
                    if (stringArray != null) break block137;
                    if (bl) break block120;
                    bl = ((String)this.h).equals((String)tb_1.X);
                }
                if (stringArray != null) break block138;
                if (bl) break block120;
                bl = ((String)this.h).equals((String)tb_1.T);
            }
            if (bl) {
                // empty if block
            }
        }
    }

    public String d() {
        return (String)this.h;
    }

    public void N(String string) {
        this.h = string;
    }

    public String E() {
        return (String)this.f;
    }

    public void I(String string) {
        this.f = string;
    }

    public String g() {
        return (String)this.x;
    }

    public void i(String string) {
        this.x = string;
    }
}

