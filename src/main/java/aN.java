/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.zip.GZIPOutputStream;

public class aN
implements or_0 {
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public byte[] k(QI qI, byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        DataOutputStream dataOutputStream = new DataOutputStream(gZIPOutputStream);
        long l2 = qI.o();
        byte[] byArray2 = null;
        byte[] byArray3 = this.p();
        byte[] byArray4 = this.p();
        byte[] byArray5 = this.p();
        byte[] byArray6 = this.p();
        try {
            byte[] byArray7 = to_2.R(byArray, byArray4);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeByte(byArray3.length);
            dataOutputStream.write(byArray3);
            dataOutputStream.write(byArray7);
            dataOutputStream.writeByte(byArray5.length);
            dataOutputStream.write(byArray5);
            dataOutputStream.write(byArray4);
            dataOutputStream.write(byArray6);
            byArray2 = byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return byArray2;
    }

    /*
     * Unable to fully structure code
     */
    byte[] p() {
        var2_1 = aN.a(4408, 2080477985942892031L) + new Random().nextInt(aN.a(9523, 5087991631801833973L));
        var3_2 = new byte[var2_1];
        var4_3 = 0;
        var1_4 = UD.L();
        if (var1_4 != null) ** GOTO lbl11
        block0: while (true) {
            v0 = var3_2;
            do {
                v0[var4_3] = (byte)new Random().nextInt(aN.a(31322, 775056067389228702L));
                ++var4_3;
lbl11:
                // 2 sources

                if (var4_3 < var2_1) continue block0;
                v0 = var3_2;
            } while (var1_4 == null);
            break;
        }
        return v0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7850605246592262192L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00b6Id\u00be+Fy\r_\u00a4\u00bb\u009e1\u00d6M\u00c5\u00db\u00b4\u0015?\u00abL&\u00d1";
        int n11 = "\u00b6Id\u00be+Fy\r_\u00a4\u00bb\u009e1\u00d6M\u00c5\u00db\u00b4\u0015?\u00abL&\u00d1".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CC6;
        if (b[n11] == null) {
            aN.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

