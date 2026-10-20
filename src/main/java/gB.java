/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.io.IOException;

class gB
implements Runnable {
    final BufferedReader a;
    final CH i;

    gB(BufferedReader bufferedReader, CH cH) {
        this.a = bufferedReader;
        this.i = cH;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        ky_2[] ky_2Array = yt_1.c();
        try {
            gB gB2;
            block7: {
                String string;
                while ((string = ((BufferedReader)this.a).readLine()) != null) {
                    CH cH;
                    block8: {
                        gB2 = this;
                        if (ky_2Array == null) break block7;
                        try {
                            block9: {
                                cH = (CH)gB2.i;
                                if (ky_2Array == null) break block8;
                                break block9;
                                catch (IOException iOException) {
                                    throw gB.a(iOException);
                                }
                            }
                            if (cH == null) continue;
                        }
                        catch (IOException iOException) {
                            throw gB.a(iOException);
                        }
                        cH = (CH)this.i;
                    }
                    cH.d(string + "\n");
                    if (ky_2Array != null) continue;
                }
                gB2 = this;
            }
            ((BufferedReader)gB2.a).close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

