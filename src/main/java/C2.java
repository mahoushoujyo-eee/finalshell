/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class C2 {
    private c3_0 J;

    public C2(InputStream inputStream, OutputStream outputStream) {
        this.J = new c3_0(inputStream, outputStream);
    }

    public void G(Path path, boolean bl) throws IOException, InterruptedException {
        this.J.R(path, bl);
    }

    public void n(Path path) throws IOException {
        this.J.a(path, false);
    }
}

