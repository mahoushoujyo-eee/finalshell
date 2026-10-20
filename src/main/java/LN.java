/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class LN
extends Thread {
    final Process a;

    LN(Process process) {
        this.a = process;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        InputStream inputStream = ((Process)this.a).getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ky_2[] ky_2Array = yt_1.c();
        while (true) {
            try {
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
            try {
                if (ky_2Array != null) return;
            }
            catch (IOException iOException) {
                throw LN.a(iOException);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

