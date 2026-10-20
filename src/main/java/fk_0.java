/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Hashtable;

/*
 * Renamed from Fk
 */
class fk_0
implements Runnable {
    final L9 U;
    final f3_0 d;
    final String Q;
    private static final long a;

    fk_0(L9 l9, f3_0 f3_02, String string) {
        this.U = l9;
        this.d = f3_02;
        this.Q = string;
    }

    @Override
    public void run() {
        block15: {
            int n10;
            int n11 = 0;
            ky_2[] ky_2Array = yt_1.c();
            while (true) {
                try {
                    n10 = n11;
                    if (ky_2Array == null) break block15;
                    if (n10 >= true) break;
                }
                catch (Exception exception) {
                    throw fk_0.a(exception);
                }
                try {
                    zh_0 zh_02;
                    String string;
                    try {
                        string = (String)this.U.o();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        zh_02 = (zh_0)lk_0.J(InetAddress.getByName(string).getHostAddress());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    zh_0 zh_03 = zh_02;
                    try {
                        this.U.P(zh_03);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.d.N(this.U);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((Hashtable)lk_0.W).put((String)this.Q, zh_03);
                }
                catch (Exception exception) {
                    try {
                        Thread.sleep(a);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    ++n11;
                    if (ky_2Array != null) continue;
                }
                break;
            }
            n10 = ((HashSet)lk_0.V).remove((String)this.Q) ? 1 : 0;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2269056343135973305L;
        a = 0x1F7D4EB8DBF76E4DL ^ l2;
    }
}

