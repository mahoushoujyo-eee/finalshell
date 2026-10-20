/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * Renamed from lV
 */
class lv_1
implements Runnable {
    final BufferedReader v;
    private static final String a;

    lv_1(BufferedReader bufferedReader) {
        this.v = bufferedReader;
    }

    @Override
    public void run() {
        block6: {
            ky_2[] ky_2Array = yt_1.c();
            try {
                String string;
                while ((string = ((BufferedReader)this.v).readLine()) != null) {
                    try {
                        System.out.println(a + string);
                        if (ky_2Array != null) {
                            if (ky_2Array != null) continue;
                            break;
                        }
                        break block6;
                    }
                    catch (IOException iOException) {
                        throw lv_1.a(iOException);
                    }
                }
                ((BufferedReader)this.v).close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\tC<\u0002\u001dC\u0001\u0014R~L".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 114;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 8;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 47;
                            break;
                        }
                        case 3: {
                            n17 = 30;
                            break;
                        }
                        case 4: {
                            n17 = 11;
                            break;
                        }
                        case 5: {
                            n17 = 93;
                            break;
                        }
                        default: {
                            n17 = 26;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

