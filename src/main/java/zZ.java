/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

class zZ
implements Callable {
    final BufferedReader F;
    final StringBuffer u;

    zZ(BufferedReader bufferedReader, StringBuffer stringBuffer) {
        this.F = bufferedReader;
        this.u = stringBuffer;
    }

    public String y() throws Exception {
        String string;
        ky_2[] ky_2Array = yt_1.c();
        while ((string = ((BufferedReader)this.F).readLine()) != null) {
            ((StringBuffer)this.u).append(string + "\n");
            if (ky_2Array != null) continue;
        }
        return null;
    }

    public Object call() throws Exception {
        String string;
        try {
            string = (String)this.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }
}

