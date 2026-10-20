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
 * Renamed from zz
 */
class zz_0
implements Runnable {
    final String A;
    private static final long a;

    zz_0(String string) {
        this.A = string;
    }

    @Override
    public void run() {
        block9: {
            int n10;
            int n11 = 0;
            ky_2[] ky_2Array = yt_1.c();
            while (true) {
                try {
                    n10 = n11;
                    if (ky_2Array == null) break block9;
                    if (n10 >= true) break;
                }
                catch (Exception exception) {
                    throw zz_0.a(exception);
                }
                try {
                    zh_0 zh_02;
                    try {
                        zh_02 = (zh_0)lk_0.J(InetAddress.getByName((String)this.A).getHostAddress());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    zh_0 zh_03 = zh_02;
                    ((Hashtable)lk_0.W).put((String)this.A, zh_03);
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
            n10 = ((HashSet)lk_0.V).remove((String)this.A) ? 1 : 0;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7378301255278588148L;
        a = 0x6664FDE656B2F100L ^ l2;
    }
}

