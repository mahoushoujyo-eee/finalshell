/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.io.IOException;

class VU
implements Runnable {
    final BufferedReader D;
    final CH w;

    VU(BufferedReader bufferedReader, CH cH) {
        this.D = bufferedReader;
        this.w = cH;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        ky_2[] ky_2Array = yt_1.c();
        try {
            VU vU;
            block7: {
                String string;
                while ((string = ((BufferedReader)this.D).readLine()) != null) {
                    CH cH;
                    block8: {
                        vU = this;
                        if (ky_2Array == null) break block7;
                        try {
                            block9: {
                                cH = (CH)vU.w;
                                if (ky_2Array == null) break block8;
                                break block9;
                                catch (IOException iOException) {
                                    throw VU.a(iOException);
                                }
                            }
                            if (cH == null) continue;
                        }
                        catch (IOException iOException) {
                            throw VU.a(iOException);
                        }
                        cH = (CH)this.w;
                    }
                    cH.d(string + "\n");
                    if (ky_2Array != null) continue;
                }
                vU = this;
            }
            ((BufferedReader)vU.D).close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

