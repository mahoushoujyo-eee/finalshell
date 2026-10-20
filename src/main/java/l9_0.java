/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from l9
 */
public class l9_0 {
    private static final long[] a;
    private static final Integer[] b;

    public static void main(String[] stringArray) {
        short s2;
        byte by;
        short s3 = l9_0.a(4368, 5677158845292390560L);
        try {
            by = (Byte)l9_0.b(s3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        byte by2 = by;
        try {
            s2 = (Short)l9_0.w(by2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        short s4 = s2;
    }

    public static byte b(short s2) {
        byte by = (byte)(s2 >> 0 & l9_0.a(16585, 2850341305828538744L));
        return by;
    }

    public static short w(byte by) {
        short s2 = 0;
        byte by2 = by;
        s2 = (short)(s2 + ((by2 & l9_0.a(12955, 2005873560951589672L)) << 0));
        return s2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2871667241359255863L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\r\u000f\u00a0\t\u00f4\u00d0P\u00b0\u00ee\u009f]\u00dd9F\u0081\u009f\u00d4\u00d9\u0092\u00bfb\u0086\"\u00e0";
        int n11 = "\r\u000f\u00a0\t\u00f4\u00d0P\u00b0\u00ee\u009f]\u00dd9F\u0081\u009f\u00d4\u00d9\u0092\u00bfb\u0086\"\u00e0".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x39B1;
        if (b[n11] == null) {
            l9_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

