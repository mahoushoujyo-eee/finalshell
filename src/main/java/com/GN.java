/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.io.PrintWriter;
import java.io.StringWriter;

public interface GN {
    public boolean K(int var1);

    public void t(int var1, String var2);

    default public void c(int n10, String string, Throwable throwable) {
        try {
            if (!this.K(n10)) {
                return;
            }
        }
        catch (Throwable throwable2) {
            throw GN.a(throwable2);
        }
        if (throwable != null) {
            StringWriter stringWriter = new StringWriter();
            try (PrintWriter printWriter = new PrintWriter(stringWriter, true);){
                throwable.printStackTrace(printWriter);
            }
            string = string + System.lineSeparator() + stringWriter.toString();
        }
        this.t(n10, string);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

