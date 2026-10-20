/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dx_2;
import com.fv_0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.Yo
 */
public abstract class yo_0
implements fv_0 {
    protected final InputStream t;
    protected final OutputStream A;
    protected final InputStreamReader R;
    protected final Charset k;
    private final Process g;
    @Nullable
    private final List l;

    public yo_0(@NotNull Process process, @NotNull Charset charset) {
        this(process, charset, null);
    }

    public yo_0(@NotNull Process process, @NotNull Charset charset, @Nullable List list) {
        this.A = process.getOutputStream();
        this.k = charset;
        this.t = process.getInputStream();
        this.R = new InputStreamReader(this.t, charset);
        this.g = process;
        this.l = list;
    }

    @NotNull
    public Process y() {
        return this.g;
    }

    @Override
    public abstract String b();

    @Nullable
    public List P() {
        String string = dx_2.g();
        List<Object> list = this.l;
        if (string == null) {
            list = list != null ? Collections.unmodifiableList(this.l) : null;
        }
        return list;
    }

    @Override
    public int x(char[] cArray, int n10, int n11) throws IOException {
        return this.R.read(cArray, n10, n11);
    }

    @Override
    public void q(byte[] byArray) throws IOException {
        this.A.write(byArray);
        this.A.flush();
    }

    @Override
    public boolean K() {
        return this.g.isAlive();
    }

    @Override
    public void E(String string) throws IOException {
        this.q(string.getBytes(this.k));
    }

    @Override
    public void a() {
        this.g.destroy();
        try {
            this.A.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            this.t.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @Override
    public int f() throws InterruptedException {
        return this.g.waitFor();
    }

    @Override
    public boolean A() throws IOException {
        return this.R.ready();
    }
}

