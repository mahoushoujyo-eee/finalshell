/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Renamed from xa
 */
class xa_0
implements DocumentListener {
    final FK u;

    xa_0(FK fK2) {
        this.u = fK2;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        block15: {
            FK fK2;
            block13: {
                block14: {
                    boolean bl;
                    String[] stringArray;
                    block12: {
                        stringArray = FK.i();
                        bl = this.u.B;
                        if (stringArray != null) break block12;
                        if (!bl) {
                            return;
                        }
                        this.u.K = true;
                        try {
                            this.u.Z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.u.Q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.u.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        fK2 = (FK)this.u;
                        if (stringArray != null) break block13;
                        bl = fK2.w;
                    }
                    if (!bl) break block14;
                    fK2 = (FK)this.u;
                    if (stringArray != null) break block13;
                    if (((dv_0)fK2.Z).getText().length() <= 0) break block15;
                }
                fK2 = (FK)this.u;
            }
            try {
                fK2.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        block20: {
            FK fK2;
            block18: {
                block19: {
                    boolean bl;
                    String[] stringArray;
                    block17: {
                        stringArray = FK.i();
                        bl = this.u.M;
                        if (stringArray == null) {
                            if (bl) {
                                this.u.M = false;
                                return;
                            }
                            bl = this.u.B;
                        }
                        if (stringArray == null) {
                            if (!bl) {
                                return;
                            }
                            this.u.K = true;
                            try {
                                this.u.Z();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            bl = this.u.a;
                        }
                        if (stringArray != null) break block17;
                        if (!bl) {
                            try {
                                this.u.Q();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        this.u.a = false;
                        try {
                            this.u.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        fK2 = (FK)this.u;
                        if (stringArray != null) break block18;
                        bl = fK2.w;
                    }
                    if (!bl) break block19;
                    fK2 = (FK)this.u;
                    if (stringArray != null) break block18;
                    if (((dv_0)fK2.Z).getText().length() <= 0) break block20;
                }
                fK2 = (FK)this.u;
            }
            try {
                fK2.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        block15: {
            FK fK2;
            block13: {
                block14: {
                    boolean bl;
                    String[] stringArray;
                    block12: {
                        stringArray = FK.i();
                        bl = this.u.B;
                        if (stringArray != null) break block12;
                        if (!bl) {
                            return;
                        }
                        this.u.K = true;
                        try {
                            this.u.Z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.u.Q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.u.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        fK2 = (FK)this.u;
                        if (stringArray != null) break block13;
                        bl = fK2.w;
                    }
                    if (!bl) break block14;
                    fK2 = (FK)this.u;
                    if (stringArray != null) break block13;
                    if (((dv_0)fK2.Z).getText().length() <= 0) break block15;
                }
                fK2 = (FK)this.u;
            }
            try {
                fK2.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

