/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/*
 * Renamed from t5
 */
class t5_0
implements Callable {
    final BufferedReader D;
    final StringBuffer g;

    t5_0(BufferedReader bufferedReader, StringBuffer stringBuffer) {
        this.D = bufferedReader;
        this.g = stringBuffer;
    }

    public String F() throws Exception {
        String string;
        ky_2[] ky_2Array = yt_1.c();
        while ((string = ((BufferedReader)this.D).readLine()) != null) {
            ((StringBuffer)this.g).append(string + "\n");
            if (ky_2Array != null) continue;
        }
        return null;
    }

    public Object call() throws Exception {
        String string;
        try {
            string = (String)this.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }
}

