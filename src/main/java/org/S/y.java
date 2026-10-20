/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.s.W;

public final class y {
    private static final long a;

    private y() {
    }

    public static byte[] X(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        y.O(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void O(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n10;
        byte[] byArray = new byte[(int)a];
        String string = W.v();
        while ((n10 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n10);
            if (string != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5793394336463350730L;
        a = 0x4977E73E4CA84BCAL ^ l2;
    }
}

