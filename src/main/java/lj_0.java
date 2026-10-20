/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.RowFilter;

/*
 * Renamed from Lj
 */
class lj_0
extends RowFilter.Entry {
    int h;
    final dm_1 n;

    private lj_0(dm_1 dm_12) {
        this.n = dm_12;
    }

    public Object getModel() {
        Object object;
        Object object2;
        try {
            object2 = this.n.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return object;
    }

    @Override
    public int getValueCount() {
        int n10;
        Object object;
        try {
            object = this.n.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    @Override
    public Object getValue(int n10) {
        Object object;
        Object object2;
        try {
            object2 = this.n.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.o(this.h, n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return object;
    }

    @Override
    public String getStringValue(int n10) {
        String string;
        Object object;
        try {
            object = this.n.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)object.L(this.h, n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }

    public Object getIdentifier() {
        Object object;
        Object object2;
        try {
            object2 = this.n.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.U(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return object;
    }

    lj_0(dm_1 dm_12, ut_2 ut_22) {
        this(dm_12);
    }
}

