/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import org.apache.hc.client5.http.classic.HttpClient;

/*
 * Renamed from uR
 */
public class ur_1 {
    WT b;
    fl_2 l;
    long x;
    u5_0 G;
    private static final long a;

    public ur_1() {
        HttpClient httpClient;
        String[] stringArray = WT.y();
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            if ((String)dd_1.j == null) {
                try {
                    dd_1.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            this.G = new u5_0();
        }
        try {
            httpClient = (HttpClient)this.G.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        HttpClient httpClient2 = httpClient;
        try {
            this.G.U(httpClient2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.l = new fl_2();
        try {
            this.l.w(this.G);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.b = new WT(null, (fl_2)this.l);
        try {
            yt_1.F.V((Object)new QA(this), (int)a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.b.C();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public fl_2 u() {
        return (fl_2)this.l;
    }

    public void w(fl_2 fl_22) {
        this.l = fl_22;
    }

    public u5_0 x() {
        return (u5_0)this.G;
    }

    public void Q(u5_0 u5_02) {
        this.G = u5_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6138861530632153997L;
        a = 0xAC2D54137AA3E865L ^ l2;
    }
}

