/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

/*
 * Renamed from Fz
 */
public class fz_0
extends Reader {
    private volatile boolean j;
    private boolean G;
    private char T;
    private static volatile boolean M;
    private Charset Y;
    private CharsetDecoder x;
    private ByteBuffer L;
    private InputStream w;
    private ReadableByteChannel s;
    boolean i;
    ArrayList E;
    static final /* synthetic */ boolean F;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private void Q() throws IOException {
        try {
            if (this.j) {
                throw new IOException("Stream closed");
            }
        }
        catch (IOException iOException) {
            throw fz_0.a(iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static fz_0 a(InputStream var0, Object var1_1, String var2_2) throws UnsupportedEncodingException {
        block6: {
            var4_3 = var2_2;
            var3_4 = yt_1.c();
            try {
                v0 = var4_3;
                if (var3_4 != null) {
                    if (v0 != null) break block6;
                }
                ** GOTO lbl15
            }
            catch (IllegalCharsetNameException v1) {
                throw fz_0.a(v1);
            }
            var4_3 = Charset.defaultCharset().name();
        }
        try {
            v0 = var4_3;
lbl15:
            // 2 sources

            if (Charset.isSupported(v0)) {
                return new fz_0(var0, var1_1, Charset.forName(var4_3));
            }
        }
        catch (IllegalCharsetNameException var5_5) {
            // empty catch block
        }
        throw new UnsupportedEncodingException(var4_3);
    }

    public static fz_0 h(InputStream inputStream, Object object, Charset charset) {
        return new fz_0(inputStream, object, charset);
    }

    public static fz_0 c(InputStream inputStream, Object object, CharsetDecoder charsetDecoder) {
        return new fz_0(inputStream, object, charsetDecoder);
    }

    public static fz_0 X(ReadableByteChannel readableByteChannel, CharsetDecoder charsetDecoder, int n10) {
        return new fz_0(readableByteChannel, charsetDecoder, n10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String p() {
        fz_0 fz_02;
        block8: {
            ky_2[] ky_2Array = yt_1.c();
            try {
                try {
                    boolean bl;
                    fz_02 = this;
                    if (ky_2Array == null) break block8;
                    try {
                        bl = (Boolean)fz_02.H();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) return null;
                }
                catch (IllegalCharsetNameException illegalCharsetNameException) {
                    throw fz_0.a(illegalCharsetNameException);
                }
                fz_02 = this;
            }
            catch (IllegalCharsetNameException illegalCharsetNameException) {
                throw fz_0.a(illegalCharsetNameException);
            }
        }
        try {
            return (String)fz_02.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public int read() throws IOException {
        int n10;
        try {
            n10 = (Integer)this.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int y() throws IOException {
        var2_1 = this.lock;
        synchronized (var2_1) {
            block22: {
                block23: {
                    block21: {
                        block19: {
                            block20: {
                                var1_2 = yt_1.c();
                                try {
                                    v0 = this.G;
                                    if (var1_2 == null) break block19;
                                    if (v0 != 0) {
                                    }
                                    break block20;
                                }
                                catch (IOException v1) {
                                    throw fz_0.a(v1);
                                }
                                this.G = false;
                                return this.T;
                            }
                            v0 = 2;
                        }
                        var3_3 = new char[v0];
                        try {
                            v2 = (Integer)this.read((Object)var3_3, 0, 2);
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        var4_4 = v2;
                        try {
                            v4 = var4_4;
                            if (var1_2 == null) break block21;
                        }
                        catch (IOException v5) {
                            throw fz_0.a(v5);
                        }
                        {
                            ** switch (v4)
                        }
lbl-1000:
                        // 1 sources

                        {
                            case -1: {
                                return -1;
                            }
lbl35:
                            // 1 sources

                            case 2: {
                                this.T = var3_3[1];
                                this.G = true;
                            }
lbl40:
                            // 2 sources

                            case 1: {
                                return var3_3[0];
                            }
                        }
lbl42:
                        // 1 sources

                        v4 = (int)fz_0.F;
                    }
                    if (var1_2 == null) break block22;
                    try {
                        block24: {
                            if (v4 != 0) break block23;
                            break block24;
                            catch (IOException v6) {
                                throw fz_0.a(v6);
                            }
                        }
                        throw new AssertionError(var4_4);
                    }
                    catch (IOException v7) {
                        throw fz_0.a(v7);
                    }
                }
                v4 = -1;
            }
            return v4;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public int read(char[] var1_1, int var2_2, int var3_3) throws IOException {
        var5_4 = var2_2;
        var6_5 = var3_3;
        var4_6 = yt_1.c();
        var7_7 = this.lock;
        synchronized (var7_7) {
            block58: {
                block59: {
                    block60: {
                        block61: {
                            block62: {
                                block63: {
                                    block72: {
                                        block55: {
                                            block56: {
                                                block57: {
                                                    block70: {
                                                        block69: {
                                                            block53: {
                                                                block54: {
                                                                    block51: {
                                                                        block52: {
                                                                            block50: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block64: {
                                                                                            try {
                                                                                                this.Q();
                                                                                            }
                                                                                            catch (InvocationTargetException v0) {
                                                                                                throw v0.getTargetException();
                                                                                            }
                                                                                            v1 = var5_4;
                                                                                            if (var4_6 == null) break block64;
                                                                                            if (v1 < 0) ** GOTO lbl68
                                                                                            v1 = var5_4;
                                                                                        }
                                                                                        if (var4_6 == null) break block48;
                                                                                        try {
                                                                                            block65: {
                                                                                                if (v1 > var1_1.length) ** GOTO lbl68
                                                                                                break block65;
                                                                                                catch (IOException v2) {
                                                                                                    throw fz_0.a(v2);
                                                                                                }
                                                                                            }
                                                                                            v1 = var6_5;
                                                                                        }
                                                                                        catch (IOException v3) {
                                                                                            throw fz_0.a(v3);
                                                                                        }
                                                                                    }
                                                                                    if (var4_6 == null) break block49;
                                                                                    try {
                                                                                        block66: {
                                                                                            if (v1 < 0) ** GOTO lbl68
                                                                                            break block66;
                                                                                            catch (IOException v4) {
                                                                                                throw fz_0.a(v4);
                                                                                            }
                                                                                        }
                                                                                        v1 = var5_4 + var6_5;
                                                                                    }
                                                                                    catch (IOException v5) {
                                                                                        throw fz_0.a(v5);
                                                                                    }
                                                                                }
                                                                                v6 = var1_1.length;
                                                                                if (var4_6 == null) break block50;
                                                                                try {
                                                                                    block67: {
                                                                                        if (v1 > v6) ** GOTO lbl68
                                                                                        break block67;
                                                                                        catch (IOException v7) {
                                                                                            throw fz_0.a(v7);
                                                                                        }
                                                                                    }
                                                                                    v1 = var5_4;
                                                                                    v6 = var6_5;
                                                                                }
                                                                                catch (IOException v8) {
                                                                                    throw fz_0.a(v8);
                                                                                }
                                                                            }
                                                                            v9 = v1 + v6;
                                                                            if (var4_6 == null) break block51;
                                                                            try {
                                                                                block68: {
                                                                                    if (v9 >= 0) break block52;
                                                                                    break block68;
                                                                                    catch (IOException v10) {
                                                                                        throw fz_0.a(v10);
                                                                                    }
                                                                                }
                                                                                throw new IndexOutOfBoundsException();
                                                                            }
                                                                            catch (IOException v11) {
                                                                                throw fz_0.a(v11);
                                                                            }
                                                                        }
                                                                        v9 = var6_5;
                                                                    }
                                                                    try {
                                                                        if (var4_6 == null) break block53;
                                                                        if (v9 != 0) break block54;
                                                                    }
                                                                    catch (IOException v12) {
                                                                        throw fz_0.a(v12);
                                                                    }
                                                                    return 0;
                                                                }
                                                                v9 = 0;
                                                            }
                                                            var8_8 = v9;
                                                            try {
                                                                v13 = this.G;
                                                                if (var4_6 == null) break block55;
                                                                if (v13 == 0) break block56;
                                                            }
                                                            catch (IOException v14) {
                                                                throw fz_0.a(v14);
                                                            }
                                                            var1_1[var5_4] = this.T;
                                                            ++var5_4;
                                                            --var6_5;
                                                            this.G = false;
                                                            var8_8 = 1;
                                                            v15 = var6_5;
                                                            if (var4_6 == null) break block57;
                                                            if (v15 == 0) ** GOTO lbl125
                                                            break block69;
                                                            catch (IOException v16) {
                                                                throw fz_0.a(v16);
                                                            }
                                                        }
                                                        try {
                                                            v13 = (int)((Boolean)this.X()).booleanValue();
                                                        }
                                                        catch (InvocationTargetException v17) {
                                                            throw v17.getTargetException();
                                                        }
                                                        if (var4_6 == null) break block55;
                                                        break block70;
                                                        catch (IOException v18) {
                                                            throw fz_0.a(v18);
                                                        }
                                                    }
                                                    try {
                                                        block71: {
                                                            if (v13 != 0) break block56;
                                                            break block71;
                                                            catch (IOException v19) {
                                                                throw fz_0.a(v19);
                                                            }
                                                        }
                                                        v15 = var8_8;
                                                    }
                                                    catch (IOException v20) {
                                                        throw fz_0.a(v20);
                                                    }
                                                }
                                                return v15;
                                            }
                                            v13 = var6_5;
                                        }
                                        try {
                                            v21 = 1;
                                            if (var4_6 == null) break block58;
                                            if (v13 == v21) {
                                            }
                                            break block59;
                                        }
                                        catch (IOException v22) {
                                            throw fz_0.a(v22);
                                        }
                                        try {
                                            v23 = (Integer)this.y();
                                        }
                                        catch (InvocationTargetException v24) {
                                            throw v24.getTargetException();
                                        }
                                        var9_9 = v23;
                                        v25 = var9_9;
                                        v26 = -1;
                                        if (var4_6 == null) break block60;
                                        if (v25 != v26) break block61;
                                        break block72;
                                        catch (IOException v27) {
                                            throw fz_0.a(v27);
                                        }
                                    }
                                    try {
                                        block73: {
                                            v28 = var8_8;
                                            if (var4_6 == null) break block62;
                                            break block73;
                                            catch (IOException v29) {
                                                throw fz_0.a(v29);
                                            }
                                        }
                                        if (v28 != 0) break block63;
                                    }
                                    catch (IOException v30) {
                                        throw fz_0.a(v30);
                                    }
                                    v28 = -1;
                                    break block62;
                                }
                                v28 = var8_8;
                            }
                            return v28;
                        }
                        var1_1[var5_4] = (char)var9_9;
                        v25 = var8_8;
                        v26 = 1;
                    }
                    return v25 + v26;
                }
                v13 = var8_8;
                try {
                    v21 = (Integer)this.J((Object)var1_1, var5_4, var5_4 + var6_5);
                }
                catch (InvocationTargetException v31) {
                    throw v31.getTargetException();
                }
            }
            return v13 + v21;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public boolean ready() throws IOException {
        Object object = this.lock;
        synchronized (object) {
            boolean bl;
            block13: {
                block14: {
                    block15: {
                        ky_2[] ky_2Array;
                        block16: {
                            ky_2Array = yt_1.c();
                            try {
                                this.Q();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            bl = this.G;
                            if (ky_2Array == null) break block13;
                            if (bl) break block15;
                            break block16;
                            catch (IOException iOException) {
                                throw fz_0.a(iOException);
                            }
                        }
                        try {
                            block17: {
                                try {
                                    bl = (Boolean)this.X();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (ky_2Array == null) break block13;
                                break block17;
                                catch (IOException iOException) {
                                    throw fz_0.a(iOException);
                                }
                            }
                            if (!bl) break block14;
                        }
                        catch (IOException iOException) {
                            throw fz_0.a(iOException);
                        }
                    }
                    bl = true;
                    break block13;
                }
                bl = false;
            }
            return bl;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() throws IOException {
        Object object = this.lock;
        synchronized (object) {
            block7: {
                Object object2;
                block8: {
                    ky_2[] ky_2Array = yt_1.c();
                    try {
                        object2 = this;
                        if (ky_2Array == null) break block7;
                        if (!object2.j) break block8;
                    }
                    catch (IOException iOException) {
                        throw fz_0.a(iOException);
                    }
                    return;
                }
                try {
                    this.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.j = true;
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    private boolean H() {
        boolean bl;
        block2: {
            block3: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    bl = this.j;
                    if (ky_2Array == null) break block2;
                    if (bl) break block3;
                }
                catch (IllegalCharsetNameException illegalCharsetNameException) {
                    throw fz_0.a(illegalCharsetNameException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private static FileChannel L(FileInputStream fileInputStream) {
        try {
            if (!fz_0.M) {
                return null;
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw fz_0.a(unsatisfiedLinkError);
        }
        try {
            return fileInputStream.getChannel();
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            fz_0.M = false;
            return null;
        }
    }

    fz_0(InputStream inputStream, Object object, Charset charset) {
        this(inputStream, object, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
    }

    fz_0(InputStream inputStream, Object object, CharsetDecoder charsetDecoder) {
        fz_0 fz_02;
        block5: {
            block6: {
                ky_2[] ky_2Array = yt_1.c();
                super(object);
                ky_2[] ky_2Array2 = ky_2Array;
                try {
                    try {
                        this.G = false;
                        this.i = false;
                        this.E = new ArrayList();
                        this.Y = charsetDecoder.charset();
                        this.x = charsetDecoder;
                        fz_02 = this;
                        if (ky_2Array2 == null) break block5;
                        if ((ReadableByteChannel)fz_02.s == null) {
                        }
                        break block6;
                    }
                    catch (IllegalCharsetNameException illegalCharsetNameException) {
                        throw fz_0.a(illegalCharsetNameException);
                    }
                    this.w = inputStream;
                    this.s = null;
                    this.L = ByteBuffer.allocate(fz_0.a(14818, 6684125702607510708L));
                }
                catch (IllegalCharsetNameException illegalCharsetNameException) {
                    throw fz_0.a(illegalCharsetNameException);
                }
            }
            fz_02 = this;
        }
        ((ByteBuffer)fz_02.L).flip();
    }

    fz_0(ReadableByteChannel readableByteChannel, CharsetDecoder charsetDecoder, int n10) {
        int n11;
        fz_0 fz_02;
        block10: {
            block11: {
                ky_2[] ky_2Array;
                block8: {
                    block9: {
                        this.G = false;
                        this.i = false;
                        this.E = new ArrayList();
                        this.w = null;
                        ky_2[] ky_2Array2 = yt_1.c();
                        this.s = readableByteChannel;
                        ky_2Array = ky_2Array2;
                        try {
                            try {
                                this.x = charsetDecoder;
                                this.Y = charsetDecoder.charset();
                                fz_02 = this;
                                n11 = n10;
                                if (ky_2Array == null) break block8;
                                if (n11 >= 0) break block9;
                            }
                            catch (IllegalCharsetNameException illegalCharsetNameException) {
                                throw fz_0.a(illegalCharsetNameException);
                            }
                            n11 = fz_0.a(24698, 3912071447041492264L);
                            break block10;
                        }
                        catch (IllegalCharsetNameException illegalCharsetNameException) {
                            throw fz_0.a(illegalCharsetNameException);
                        }
                    }
                    n11 = n10;
                }
                try {
                    try {
                        if (ky_2Array == null) break block10;
                        if (n11 >= fz_0.a(30718, 8570008180280742564L)) break block11;
                    }
                    catch (IllegalCharsetNameException illegalCharsetNameException) {
                        throw fz_0.a(illegalCharsetNameException);
                    }
                    n11 = fz_0.a(16014, 8885243877555608537L);
                    break block10;
                }
                catch (IllegalCharsetNameException illegalCharsetNameException) {
                    throw fz_0.a(illegalCharsetNameException);
                }
            }
            n11 = n10;
        }
        fz_02.L = ByteBuffer.allocate(n11);
        ((ByteBuffer)this.L).flip();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int E() throws IOException {
        block67: {
            block68: {
                block54: {
                    v0 = yt_1.c();
                    ((ByteBuffer)this.L).compact();
                    var1_1 = v0;
                    try {
                        block66: {
                            block65: {
                                block63: {
                                    block64: {
                                        block61: {
                                            block62: {
                                                block59: {
                                                    block60: {
                                                        block76: {
                                                            block75: {
                                                                block74: {
                                                                    block58: {
                                                                        block57: {
                                                                            block55: {
                                                                                block69: {
                                                                                    block56: {
                                                                                        block71: {
                                                                                            block70: {
                                                                                                block51: {
                                                                                                    block53: {
                                                                                                        block52: {
                                                                                                            try {
                                                                                                                v1 = this;
                                                                                                                if (var1_1 == null) break block51;
                                                                                                                if ((ReadableByteChannel)v1.s != null) {
                                                                                                                }
                                                                                                                ** GOTO lbl29
                                                                                                            }
                                                                                                            catch (IOException v2) {
                                                                                                                throw fz_0.a(v2);
                                                                                                            }
                                                                                                            var2_2 = ((ReadableByteChannel)this.s).read((ByteBuffer)this.L);
                                                                                                            try {
                                                                                                                v3 = var2_2;
                                                                                                                if (var1_1 == null) break block52;
                                                                                                                if (v3 >= 0) break block53;
                                                                                                            }
                                                                                                            catch (IOException v4) {
                                                                                                                throw fz_0.a(v4);
                                                                                                            }
                                                                                                            v3 = var2_2;
                                                                                                        }
                                                                                                        var3_3 = v3;
                                                                                                        return var3_3;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var1_1 != null) break block54;
lbl29:
                                                                                                        // 2 sources

                                                                                                        v1 = this;
                                                                                                    }
                                                                                                    catch (IOException v5) {
                                                                                                        throw fz_0.a(v5);
                                                                                                    }
                                                                                                }
                                                                                                var2_2 = ((ByteBuffer)v1.L).limit();
                                                                                                var3_4 = ((ByteBuffer)this.L).position();
                                                                                                v6 = fz_0.F;
                                                                                                if (var1_1 == null) break block69;
                                                                                                if (v6 != 0) break block56;
                                                                                                break block70;
                                                                                                catch (IOException v7) {
                                                                                                    throw fz_0.a(v7);
                                                                                                }
                                                                                            }
                                                                                            v6 = var3_4;
                                                                                            v8 = var2_2;
                                                                                            if (var1_1 == null) break block55;
                                                                                            break block71;
                                                                                            catch (IOException v9) {
                                                                                                throw fz_0.a(v9);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block72: {
                                                                                                if (v6 <= v8) break block56;
                                                                                                break block72;
                                                                                                catch (IOException v10) {
                                                                                                    throw fz_0.a(v10);
                                                                                                }
                                                                                            }
                                                                                            throw new AssertionError();
                                                                                        }
                                                                                        catch (IOException v11) {
                                                                                            throw fz_0.a(v11);
                                                                                        }
                                                                                    }
                                                                                    v6 = var3_4;
                                                                                }
                                                                                v8 = var2_2;
                                                                            }
                                                                            if (var1_1 == null) break block57;
                                                                            try {
                                                                                block73: {
                                                                                    if (v6 > v8) break block58;
                                                                                    break block73;
                                                                                    catch (IOException v12) {
                                                                                        throw fz_0.a(v12);
                                                                                    }
                                                                                }
                                                                                v6 = var2_2;
                                                                                v8 = var3_4;
                                                                            }
                                                                            catch (IOException v13) {
                                                                                throw fz_0.a(v13);
                                                                            }
                                                                        }
                                                                        v14 = v6 - v8;
                                                                        break block74;
                                                                    }
                                                                    v14 = 0;
                                                                }
                                                                var4_5 = v14;
                                                                v15 = fz_0.F;
                                                                if (var1_1 == null) break block59;
                                                                if (v15 != 0) break block60;
                                                                break block75;
                                                                catch (IOException v16) {
                                                                    throw fz_0.a(v16);
                                                                }
                                                            }
                                                            v15 = var4_5;
                                                            if (var1_1 == null) break block59;
                                                            break block76;
                                                            catch (IOException v17) {
                                                                throw fz_0.a(v17);
                                                            }
                                                        }
                                                        try {
                                                            block77: {
                                                                if (v15 > 0) break block60;
                                                                break block77;
                                                                catch (IOException v18) {
                                                                    throw fz_0.a(v18);
                                                                }
                                                            }
                                                            throw new AssertionError();
                                                        }
                                                        catch (IOException v19) {
                                                            throw fz_0.a(v19);
                                                        }
                                                    }
                                                    v15 = ((InputStream)this.w).read(((ByteBuffer)this.L).array(), ((ByteBuffer)this.L).arrayOffset() + var3_4, var4_5);
                                                }
                                                var5_6 = v15;
                                                try {
                                                    v20 = var5_6;
                                                    if (var1_1 == null) break block61;
                                                    if (v20 >= 0) break block62;
                                                }
                                                catch (IOException v21) {
                                                    throw fz_0.a(v21);
                                                }
                                                var6_7 = var5_6;
                                                return var6_7;
                                            }
                                            v20 = var5_6;
                                        }
                                        if (var1_1 == null) break block63;
                                        try {
                                            block78: {
                                                if (v20 != 0) break block64;
                                                break block78;
                                                catch (IOException v22) {
                                                    throw fz_0.a(v22);
                                                }
                                            }
                                            throw new IOException("Underlying input stream returned zero bytes");
                                        }
                                        catch (IOException v23) {
                                            throw fz_0.a(v23);
                                        }
                                    }
                                    v20 = (int)fz_0.F;
                                }
                                try {
                                    if (var1_1 == null) break block65;
                                    if (v20 != 0) break block66;
                                }
                                catch (IOException v24) {
                                    throw fz_0.a(v24);
                                }
                                v20 = var5_6;
                            }
                            try {
                                if (v20 > var4_5) {
                                    throw new AssertionError((Object)("n = " + var5_6 + ", rem = " + var4_5));
                                }
                            }
                            catch (IOException v25) {
                                throw fz_0.a(v25);
                            }
                        }
                        ((ByteBuffer)this.L).position(var3_4 + var5_6);
                    }
                    finally {
                        ((ByteBuffer)this.L).flip();
                    }
                }
                var2_2 = ((ByteBuffer)this.L).remaining();
                try {
                    try {
                        try {
                            try {
                                v26 = fz_0.F;
                                if (var1_1 == null) break block67;
                                if (v26 != 0) break block68;
                            }
                            catch (IOException v27) {
                                throw fz_0.a(v27);
                            }
                            v26 = var2_2;
                            if (var1_1 == null) break block67;
                        }
                        catch (IOException v28) {
                            throw fz_0.a(v28);
                        }
                        if (v26 != 0) break block68;
                    }
                    catch (IOException v29) {
                        throw fz_0.a(v29);
                    }
                    throw new AssertionError(var2_2);
                }
                catch (IOException v30) {
                    throw fz_0.a(v30);
                }
            }
            v26 = var2_2;
        }
        return v26;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int J(char[] var1_1, int var2_2, int var3_3) throws IOException {
        block172: {
            block173: {
                block175: {
                    block174: {
                        block167: {
                            block164: {
                                block165: {
                                    block163: {
                                        block159: {
                                            block160: {
                                                block161: {
                                                    block162: {
                                                        block157: {
                                                            block158: {
                                                                block156: {
                                                                    block138: {
                                                                        block139: {
                                                                            block137: {
                                                                                block136: {
                                                                                    ((ArrayList)this.E).clear();
                                                                                    var3_3 -= 100;
                                                                                    var5_4 = 0;
                                                                                    var4_5 = yt_1.c();
                                                                                    var6_6 = 0;
                                                                                    try {
                                                                                        try {
                                                                                            v0 = fz_0.F;
                                                                                            if (var4_5 == null) break block136;
                                                                                            if (v0 != 0) break block137;
                                                                                        }
                                                                                        catch (IOException v1) {
                                                                                            throw fz_0.a(v1);
                                                                                        }
                                                                                        v0 = var3_3 - var2_2;
                                                                                    }
                                                                                    catch (IOException v2) {
                                                                                        throw fz_0.a(v2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v0 <= 1) {
                                                                                        throw new AssertionError();
                                                                                    }
                                                                                }
                                                                                catch (IOException v3) {
                                                                                    throw fz_0.a(v3);
                                                                                }
                                                                            }
                                                                            var7_7 = CharBuffer.wrap(var1_1, var2_2, var3_3 - var2_2);
                                                                            try {
                                                                                v4 = var7_7.position();
                                                                                if (var4_5 == null) break block138;
                                                                                if (v4 == 0) break block139;
                                                                            }
                                                                            catch (IOException v5) {
                                                                                throw fz_0.a(v5);
                                                                            }
                                                                            var7_7 = var7_7.slice();
                                                                        }
                                                                        v4 = 0;
                                                                    }
                                                                    var8_8 = v4;
                                                                    var9_9 = 0;
                                                                    var10_10 = false;
                                                                    var11_11 = var7_7.position();
                                                                    do lbl-1000:
                                                                    // 4 sources

                                                                    {
                                                                        block154: {
                                                                            block155: {
                                                                                block143: {
                                                                                    block142: {
                                                                                        block149: {
                                                                                            block150: {
                                                                                                block151: {
                                                                                                    block153: {
                                                                                                        block148: {
                                                                                                            block146: {
                                                                                                                block144: {
                                                                                                                    block140: {
                                                                                                                        block141: {
                                                                                                                            var12_12 = ((ByteBuffer)this.L).position();
                                                                                                                            var13_13 = ((CharsetDecoder)this.x).decode((ByteBuffer)this.L, var7_7, (boolean)var8_8);
                                                                                                                            var14_15 = ((ByteBuffer)this.L).position();
                                                                                                                            var15_17 = var14_15 - var12_12;
                                                                                                                            var6_6 += var15_17;
                                                                                                                            if (var10_10) {
                                                                                                                                // empty if block
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v6 = var15_17;
                                                                                                                                    if (var4_5 == null) break block140;
                                                                                                                                    if (v6 >= 0) break block141;
                                                                                                                                }
                                                                                                                                catch (IOException v7) {
                                                                                                                                    throw fz_0.a(v7);
                                                                                                                                }
                                                                                                                                System.currentTimeMillis();
                                                                                                                            }
                                                                                                                            catch (IOException v8) {
                                                                                                                                throw fz_0.a(v8);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v6 = var16_18 = var12_12;
                                                                                                                    }
                                                                                                                    while (var16_18 < var14_15) {
                                                                                                                        var17_19 = ((ByteBuffer)this.L).array()[var16_18];
                                                                                                                        try {
                                                                                                                            ((ArrayList)this.E).add((byte)var17_19);
                                                                                                                            ++var16_18;
                                                                                                                            if (var4_5 != null) {
                                                                                                                                if (var4_5 != null) continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break block142;
                                                                                                                        }
                                                                                                                        catch (IOException v9) {
                                                                                                                            throw fz_0.a(v9);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        block145: {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v10 = var13_13.isUnderflow();
                                                                                                                                            if (var4_5 == null) break block143;
                                                                                                                                            if (!v10) break block142;
                                                                                                                                        }
                                                                                                                                        catch (IOException v11) {
                                                                                                                                            throw fz_0.a(v11);
                                                                                                                                        }
                                                                                                                                        v12 = var8_8;
                                                                                                                                        if (var4_5 == null) break block144;
                                                                                                                                    }
                                                                                                                                    catch (IOException v13) {
                                                                                                                                        throw fz_0.a(v13);
                                                                                                                                    }
                                                                                                                                    if (v12 == 0) break block145;
                                                                                                                                }
                                                                                                                                catch (IOException v14) {
                                                                                                                                    throw fz_0.a(v14);
                                                                                                                                }
                                                                                                                                if (var4_5 != null) break;
                                                                                                                            }
                                                                                                                            catch (IOException v15) {
                                                                                                                                throw fz_0.a(v15);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v12 = var7_7.hasRemaining();
                                                                                                                    }
                                                                                                                    catch (IOException v16) {
                                                                                                                        throw fz_0.a(v16);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    block147: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var4_5 == null) break block146;
                                                                                                                                if (v12 != 0) break block147;
                                                                                                                            }
                                                                                                                            catch (IOException v17) {
                                                                                                                                throw fz_0.a(v17);
                                                                                                                            }
                                                                                                                            if (var4_5 != null) break;
                                                                                                                        }
                                                                                                                        catch (IOException v18) {
                                                                                                                            throw fz_0.a(v18);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v12 = var7_7.position();
                                                                                                                }
                                                                                                                catch (IOException v19) {
                                                                                                                    throw fz_0.a(v19);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var4_5 != null) {
                                                                                                                                if (v12 <= 0) ** GOTO lbl153
                                                                                                                            }
                                                                                                                            break block148;
                                                                                                                        }
                                                                                                                        catch (IOException v20) {
                                                                                                                            throw fz_0.a(v20);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v12 = (int)((Boolean)this.B()).booleanValue();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException v21) {
                                                                                                                            throw v21.getTargetException();
                                                                                                                        }
                                                                                                                        if (var4_5 == null) break block148;
                                                                                                                    }
                                                                                                                    catch (IOException v22) {
                                                                                                                        throw fz_0.a(v22);
                                                                                                                    }
                                                                                                                    if (v12 != 0) ** GOTO lbl153
                                                                                                                }
                                                                                                                catch (IOException v23) {
                                                                                                                    throw fz_0.a(v23);
                                                                                                                }
                                                                                                                if (var4_5 != null) break;
                                                                                                            }
                                                                                                            catch (IOException v24) {
                                                                                                                throw fz_0.a(v24);
                                                                                                            }
lbl153:
                                                                                                            // 3 sources

                                                                                                            try {
                                                                                                                v25 = (Integer)this.E();
                                                                                                            }
                                                                                                            catch (InvocationTargetException v26) {
                                                                                                                throw v26.getTargetException();
                                                                                                            }
                                                                                                            var16_18 = v25;
                                                                                                            var10_10 = true;
                                                                                                            v12 = var16_18;
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var4_5 == null) break block149;
                                                                                                            if (v12 >= 0) break block150;
                                                                                                        }
                                                                                                        catch (IOException v27) {
                                                                                                            throw fz_0.a(v27);
                                                                                                        }
                                                                                                        var8_8 = 1;
                                                                                                        try {
                                                                                                            block152: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var4_5 == null) break block151;
                                                                                                                                if (var7_7.position() != 0) break block152;
                                                                                                                            }
                                                                                                                            catch (IOException v28) {
                                                                                                                                throw fz_0.a(v28);
                                                                                                                            }
                                                                                                                            v29 = this;
                                                                                                                            if (var4_5 == null) break block153;
                                                                                                                        }
                                                                                                                        catch (IOException v30) {
                                                                                                                            throw fz_0.a(v30);
                                                                                                                        }
                                                                                                                        if (((ByteBuffer)v29.L).hasRemaining()) break block152;
                                                                                                                    }
                                                                                                                    catch (IOException v31) {
                                                                                                                        throw fz_0.a(v31);
                                                                                                                    }
                                                                                                                    if (var4_5 != null) break;
                                                                                                                }
                                                                                                                catch (IOException v32) {
                                                                                                                    throw fz_0.a(v32);
                                                                                                                }
                                                                                                            }
                                                                                                            v29 = this;
                                                                                                        }
                                                                                                        catch (IOException v33) {
                                                                                                            throw fz_0.a(v33);
                                                                                                        }
                                                                                                    }
                                                                                                    ((CharsetDecoder)v29.x).reset();
                                                                                                }
                                                                                                if (var4_5 != null) ** GOTO lbl-1000
                                                                                            }
                                                                                            v12 = var9_9 = var9_9 + var16_18;
                                                                                        }
                                                                                        if (var4_5 != null) ** GOTO lbl-1000
                                                                                    }
                                                                                    try {
                                                                                        v34 = var13_13;
                                                                                        if (var4_5 == null) break block154;
                                                                                        v10 = v34.isOverflow();
                                                                                    }
                                                                                    catch (IOException v35) {
                                                                                        throw fz_0.a(v35);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (!v10) break block155;
                                                                                                    v36 = fz_0.F;
                                                                                                    if (var4_5 == null) break block156;
                                                                                                }
                                                                                                catch (IOException v37) {
                                                                                                    throw fz_0.a(v37);
                                                                                                }
                                                                                                if (v36 != 0) break;
                                                                                            }
                                                                                            catch (IOException v38) {
                                                                                                throw fz_0.a(v38);
                                                                                            }
                                                                                            v36 = var7_7.position();
                                                                                            if (var4_5 == null) break block156;
                                                                                        }
                                                                                        catch (IOException v39) {
                                                                                            throw fz_0.a(v39);
                                                                                        }
                                                                                        if (v36 > 0) break;
                                                                                    }
                                                                                    catch (IOException v40) {
                                                                                        throw fz_0.a(v40);
                                                                                    }
                                                                                    throw new AssertionError();
                                                                                }
                                                                                catch (IOException v41) {
                                                                                    throw fz_0.a(v41);
                                                                                }
                                                                            }
                                                                            v34 = var13_13;
                                                                        }
                                                                        v34.throwException();
                                                                    } while (var4_5 != null);
                                                                    var12_12 = var7_7.position();
                                                                    v36 = var8_8;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_5 == null) break block157;
                                                                        if (v36 == 0) break block158;
                                                                    }
                                                                    catch (IOException v42) {
                                                                        throw fz_0.a(v42);
                                                                    }
                                                                    ((CharsetDecoder)this.x).reset();
                                                                }
                                                                catch (IOException v43) {
                                                                    throw fz_0.a(v43);
                                                                }
                                                            }
                                                            v36 = var7_7.position();
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var4_5 == null) break block159;
                                                                        if (v36 != 0) break block160;
                                                                    }
                                                                    catch (IOException v44) {
                                                                        throw fz_0.a(v44);
                                                                    }
                                                                    v36 = var8_8;
                                                                    if (var4_5 == null) break block161;
                                                                }
                                                                catch (IOException v45) {
                                                                    throw fz_0.a(v45);
                                                                }
                                                                if (v36 == 0) break block162;
                                                            }
                                                            catch (IOException v46) {
                                                                throw fz_0.a(v46);
                                                            }
                                                            return -1;
                                                        }
                                                        catch (IOException v47) {
                                                            throw fz_0.a(v47);
                                                        }
                                                    }
                                                    v36 = (int)fz_0.F;
                                                }
                                                try {
                                                    try {
                                                        if (var4_5 == null) break block159;
                                                        if (v36 != 0) break block160;
                                                    }
                                                    catch (IOException v48) {
                                                        throw fz_0.a(v48);
                                                    }
                                                    throw new AssertionError();
                                                }
                                                catch (IOException v49) {
                                                    throw fz_0.a(v49);
                                                }
                                            }
                                            var5_4 = var7_7.position();
                                            v36 = 0;
                                        }
                                        var13_14 = v36;
                                        var14_16 = ((ByteBuffer)this.L).array();
                                        var15_17 = var12_12 - var11_11;
                                        var16_18 = var3_3 - var2_2 - var15_17;
                                        var17_19 = 0;
                                        try {
                                            try {
                                                v50 = var16_18;
                                                if (var4_5 == null) break block163;
                                                if (v50 <= 0) break block164;
                                            }
                                            catch (IOException v51) {
                                                throw fz_0.a(v51);
                                            }
                                            v50 = ((ByteBuffer)this.L).remaining();
                                        }
                                        catch (IOException v52) {
                                            throw fz_0.a(v52);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_5 == null) break block165;
                                            if (v50 <= 0) break block164;
                                        }
                                        catch (IOException v53) {
                                            throw fz_0.a(v53);
                                        }
                                        v50 = Math.min(var16_18, ((ByteBuffer)this.L).remaining());
                                    }
                                    catch (IOException v54) {
                                        throw fz_0.a(v54);
                                    }
                                }
                                var17_19 = v50;
                            }
                            var18_20 = var14_16;
                            var19_22 = var18_20.length;
                            var20_23 = 0;
                            while (var20_23 < var19_22) {
                                block166: {
                                    block168: {
                                        block171: {
                                            block170: {
                                                block169: {
                                                    var21_24 = var18_20[var20_23];
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var4_5 == null) break block166;
                                                                        v55 = var13_14;
                                                                        v56 = 2;
                                                                        if (var4_5 == null) break block167;
                                                                    }
                                                                    catch (IOException v57) {
                                                                        throw fz_0.a(v57);
                                                                    }
                                                                    if (v55 < v56) break block168;
                                                                }
                                                                catch (IOException v58) {
                                                                    throw fz_0.a(v58);
                                                                }
                                                                v59 = var14_16[var13_14 - 1];
                                                                v60 = fz_0.a(22279, 4777490264669778518L);
                                                                if (var4_5 == null) break block169;
                                                            }
                                                            catch (IOException v61) {
                                                                throw fz_0.a(v61);
                                                            }
                                                            if (v59 != v60) break block168;
                                                        }
                                                        catch (IOException v62) {
                                                            throw fz_0.a(v62);
                                                        }
                                                        v59 = var14_16[var13_14 - 2];
                                                        v60 = fz_0.a(27023, 2994393337764564191L);
                                                    }
                                                    catch (IOException v63) {
                                                        throw fz_0.a(v63);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var4_5 == null) break block170;
                                                            if (v59 == v60) {
                                                            }
                                                            break block168;
                                                        }
                                                        catch (IOException v64) {
                                                            throw fz_0.a(v64);
                                                        }
                                                        this.i = true;
                                                        if (var4_5 == null) break block166;
                                                    }
                                                    catch (IOException v65) {
                                                        throw fz_0.a(v65);
                                                    }
                                                    v59 = var14_16[var13_14 + 1];
                                                    v60 = fz_0.a(32456, 8697765157444574107L);
                                                }
                                                catch (IOException v66) {
                                                    throw fz_0.a(v66);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (v59 != v60) break block168;
                                                        v67 = var14_16[var13_14 + 2];
                                                        v68 = fz_0.a(5411, 4180062081311584374L);
                                                        if (var4_5 == null) break block171;
                                                    }
                                                    catch (IOException v69) {
                                                        throw fz_0.a(v69);
                                                    }
                                                    if (v67 != v68) break block168;
                                                }
                                                catch (IOException v70) {
                                                    throw fz_0.a(v70);
                                                }
                                                v67 = var14_16[var13_14 + 3];
                                                v68 = fz_0.a(16207, 6823891315145251355L);
                                            }
                                            catch (IOException v71) {
                                                throw fz_0.a(v71);
                                            }
                                        }
                                        if (v67 == v68) {
                                            // empty if block
                                        }
                                    }
                                    ++var13_14;
                                    ++var20_23;
                                }
                                if (var4_5 != null) continue;
                            }
                            v55 = var3_3;
                            v56 = var2_2;
                        }
                        if (var9_9 > (var18_21 = v55 - v56)) {
                            // empty if block
                        }
                        var19_22 = var9_9 - ((ArrayList)this.E).size();
                        var19_22 = var17_19;
                        try {
                            v72 = this.i;
                            if (var4_5 == null) break block172;
                            if (v72 == 0) break block173;
                        }
                        catch (IOException v73) {
                            throw fz_0.a(v73);
                        }
                        var20_23 = var2_2;
                        var21_24 = 0;
                        while (var20_23 < var3_3 - var2_2) {
                            try {
                                try {
                                    v72 = var21_24;
                                    if (var4_5 == null || var4_5 == null) break block174;
                                }
                                catch (IOException v74) {
                                    throw fz_0.a(v74);
                                }
                                if (v72 >= ((ArrayList)this.E).size()) break;
                            }
                            catch (IOException v75) {
                                throw fz_0.a(v75);
                            }
                            var22_25 = ((Byte)((ArrayList)this.E).get(var21_24)).byteValue();
                            var23_26 = var1_1[var20_23];
                            var1_1[var20_23] = (char)var22_25;
                            if (var22_25 != 0) {
                                // empty if block
                            }
                            ++var20_23;
                            ++var21_24;
                            if (var4_5 != null) continue;
                        }
                        var5_4 = var6_6;
                        v72 = var19_22;
                    }
                    try {
                        if (var4_5 == null) break block172;
                        if (v72 <= 0) break block173;
                    }
                    catch (IOException v76) {
                        throw fz_0.a(v76);
                    }
                    for (var22_25 = 0; var22_25 < var19_22; ++var22_25) {
                        var23_26 = ((ByteBuffer)this.L).array()[((ByteBuffer)this.L).position() + var22_25];
                        try {
                            var1_1[var20_23 + var22_25] = var23_26;
                            if (var4_5 != null) {
                                if (var4_5 != null) continue;
                                break;
                            }
                            break block175;
                        }
                        catch (IOException v77) {
                            throw fz_0.a(v77);
                        }
                    }
                    ((ByteBuffer)this.L).position(((ByteBuffer)this.L).position() + var19_22);
                }
                var5_4 += var19_22;
            }
            v72 = var5_4;
        }
        return v72;
    }

    String D() {
        return ((Charset)this.Y).name();
    }

    /*
     * Loose catch block
     */
    private boolean B() {
        ky_2[] ky_2Array = yt_1.c();
        try {
            int n10;
            block11: {
                block13: {
                    block12: {
                        fz_0 fz_02;
                        block10: {
                            block14: {
                                block15: {
                                    fz_02 = this;
                                    if (ky_2Array == null) break block10;
                                    if ((InputStream)fz_02.w == null) break block14;
                                    break block15;
                                    catch (IOException iOException) {
                                        throw fz_0.a(iOException);
                                    }
                                }
                                try {
                                    block16: {
                                        n10 = ((InputStream)this.w).available();
                                        if (ky_2Array == null) break block11;
                                        break block16;
                                        catch (IOException iOException) {
                                            throw fz_0.a(iOException);
                                        }
                                    }
                                    if (n10 > 0) break block12;
                                }
                                catch (IOException iOException) {
                                    throw fz_0.a(iOException);
                                }
                            }
                            fz_02 = this;
                        }
                        try {
                            n10 = fz_02.s instanceof FileChannel;
                            if (ky_2Array == null) break block11;
                            if (n10 == 0) break block13;
                        }
                        catch (IOException iOException) {
                            throw fz_0.a(iOException);
                        }
                    }
                    n10 = 1;
                    break block11;
                }
                n10 = 0;
            }
            return n10 != 0;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    boolean X() {
        boolean bl;
        block9: {
            block11: {
                block10: {
                    ky_2[] ky_2Array = yt_1.c();
                    try {
                        try {
                            try {
                                bl = ((ByteBuffer)this.L).hasRemaining();
                                if (ky_2Array == null) break block9;
                                if (!bl) {
                                }
                                break block10;
                            }
                            catch (IllegalCharsetNameException illegalCharsetNameException) {
                                throw fz_0.a(illegalCharsetNameException);
                            }
                            try {
                                bl = (Boolean)this.B();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (ky_2Array == null) break block9;
                        }
                        catch (IllegalCharsetNameException illegalCharsetNameException) {
                            throw fz_0.a(illegalCharsetNameException);
                        }
                        if (!bl) break block11;
                    }
                    catch (IllegalCharsetNameException illegalCharsetNameException) {
                        throw fz_0.a(illegalCharsetNameException);
                    }
                }
                bl = true;
                break block9;
            }
            bl = false;
        }
        return bl;
    }

    void c() throws IOException {
        block8: {
            fz_0 fz_02;
            block6: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    block7: {
                        try {
                            try {
                                fz_02 = this;
                                if (ky_2Array == null) break block6;
                                if ((ReadableByteChannel)fz_02.s == null) break block7;
                            }
                            catch (IOException iOException) {
                                throw fz_0.a(iOException);
                            }
                            ((ReadableByteChannel)this.s).close();
                            if (ky_2Array != null) break block8;
                        }
                        catch (IOException iOException) {
                            throw fz_0.a(iOException);
                        }
                    }
                    fz_02 = this;
                }
                catch (IOException iOException) {
                    throw fz_0.a(iOException);
                }
            }
            ((InputStream)fz_02.w).close();
        }
    }

    public boolean O() {
        return this.i;
    }

    public void v(boolean bl) {
        this.i = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "|\u0002\u008b^\b:9\u0006|\u00ce7\u000f\u009c";
                        var12_3 = "|\u0002\u008b^\b:9\u0006|\u00ce7\u000f\u009c".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 24;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block28;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0086o\u0016\u007f\u00d7\r\u00abk|\u0080\u0010\u00bf=+\u0090H\u0004\u00c2R\u00bb3\u0096\u001f|m%\u00a1\u00ac\u008b\u00de\u0007_\u00f8\u00c2\u00bclrm\u00f1\u00a40\u0014\u00e7v(\u0004\u00a4T\u00e9\u00a4\u00da\u0005\u00b6\u00b5\u00ca\u00b9\u00b9";
                            var12_3 = "\u0086o\u0016\u007f\u00d7\r\u00abk|\u0080\u0010\u00bf=+\u0090H\u0004\u00c2R\u00bb3\u0096\u001f|m%\u00a1\u00ac\u008b\u00de\u0007_\u00f8\u00c2\u00bclrm\u00f1\u00a40\u0014\u00e7v(\u0004\u00a4T\u00e9\u00a4\u00da\u0005\u00b6\u00b5\u00ca\u00b9\u00b9".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 41;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block29;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 13;
                                    break;
                                }
                                case 1: {
                                    v15 = 74;
                                    break;
                                }
                                case 2: {
                                    v15 = 32;
                                    break;
                                }
                                case 3: {
                                    v15 = 72;
                                    break;
                                }
                                case 4: {
                                    v15 = 64;
                                    break;
                                }
                                case 5: {
                                    v15 = 67;
                                    break;
                                }
                                default: {
                                    v15 = 56;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                fz_0.a = var13;
                fz_0.b = new String[4];
                var0_7 = 513906960465056354L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "[!x'j\u00c5\u00b7J\u00c1A\u000bx\u0097^\t\u00bb\u000f\u00a92>M^\u001e\u0097\u0018yW\u00d2=\u0099\u00a0\u001e?\u0081\u00ebv\u00fb\u00e4n\u00d6s\u0083Z\u00bcjtI\u009bc\u00b7\u0097\u00efC\u0005\u00c8I";
                var5_11 = "[!x'j\u00c5\u00b7J\u00c1A\u000bx\u0097^\t\u00bb\u000f\u00a92>M^\u001e\u0097\u0018yW\u00d2=\u0099\u00a0\u001e?\u0081\u00ebv\u00fb\u00e4n\u00d6s\u0083Z\u00bcjtI\u009bc\u00b7\u0097\u00efC\u0005\u00c8I".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0005ER\u00be\u0085\u00b6\u00e2$\u00ee6\u0015l\u00d9\u00cd\u0080\u00e6";
                    var5_11 = "\u0005ER\u00be\u0085\u00b6\u00e2$\u00ee6\u0015l\u00d9\u00cd\u0080\u00e6".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        fz_0.c = var6_8;
        fz_0.d = new Integer[9];
        try {
            v22 = fz_0.class.desiredAssertionStatus() == false;
        }
        catch (IllegalCharsetNameException v23) {
            throw fz_0.a(v23);
        }
        fz_0.F = v22;
        fz_0.M = true;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xB2A) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 77;
                    break;
                }
                case 1: {
                    n14 = 132;
                    break;
                }
                case 2: {
                    n14 = 168;
                    break;
                }
                case 3: {
                    n14 = 141;
                    break;
                }
                case 4: {
                    n14 = 20;
                    break;
                }
                case 5: {
                    n14 = 96;
                    break;
                }
                case 6: {
                    n14 = 215;
                    break;
                }
                case 7: {
                    n14 = 226;
                    break;
                }
                case 8: {
                    n14 = 82;
                    break;
                }
                case 9: {
                    n14 = 138;
                    break;
                }
                case 10: {
                    n14 = 144;
                    break;
                }
                case 11: {
                    n14 = 131;
                    break;
                }
                case 12: {
                    n14 = 213;
                    break;
                }
                case 13: {
                    n14 = 162;
                    break;
                }
                case 14: {
                    n14 = 241;
                    break;
                }
                case 15: {
                    n14 = 151;
                    break;
                }
                case 16: {
                    n14 = 236;
                    break;
                }
                case 17: {
                    n14 = 190;
                    break;
                }
                case 18: {
                    n14 = 217;
                    break;
                }
                case 19: {
                    n14 = 175;
                    break;
                }
                case 20: {
                    n14 = 92;
                    break;
                }
                case 21: {
                    n14 = 50;
                    break;
                }
                case 22: {
                    n14 = 188;
                    break;
                }
                case 23: {
                    n14 = 146;
                    break;
                }
                case 24: {
                    n14 = 39;
                    break;
                }
                case 25: {
                    n14 = 35;
                    break;
                }
                case 26: {
                    n14 = 46;
                    break;
                }
                case 27: {
                    n14 = 194;
                    break;
                }
                case 28: {
                    n14 = 199;
                    break;
                }
                case 29: {
                    n14 = 19;
                    break;
                }
                case 30: {
                    n14 = 183;
                    break;
                }
                case 31: {
                    n14 = 72;
                    break;
                }
                case 32: {
                    n14 = 198;
                    break;
                }
                case 33: {
                    n14 = 230;
                    break;
                }
                case 34: {
                    n14 = 255;
                    break;
                }
                case 35: {
                    n14 = 189;
                    break;
                }
                case 36: {
                    n14 = 197;
                    break;
                }
                case 37: {
                    n14 = 123;
                    break;
                }
                case 38: {
                    n14 = 139;
                    break;
                }
                case 39: {
                    n14 = 224;
                    break;
                }
                case 40: {
                    n14 = 8;
                    break;
                }
                case 41: {
                    n14 = 164;
                    break;
                }
                case 42: {
                    n14 = 235;
                    break;
                }
                case 43: {
                    n14 = 32;
                    break;
                }
                case 44: {
                    n14 = 135;
                    break;
                }
                case 45: {
                    n14 = 38;
                    break;
                }
                case 46: {
                    n14 = 79;
                    break;
                }
                case 47: {
                    n14 = 155;
                    break;
                }
                case 48: {
                    n14 = 130;
                    break;
                }
                case 49: {
                    n14 = 89;
                    break;
                }
                case 50: {
                    n14 = 227;
                    break;
                }
                case 51: {
                    n14 = 81;
                    break;
                }
                case 52: {
                    n14 = 122;
                    break;
                }
                case 53: {
                    n14 = 218;
                    break;
                }
                case 54: {
                    n14 = 181;
                    break;
                }
                case 55: {
                    n14 = 78;
                    break;
                }
                case 56: {
                    n14 = 109;
                    break;
                }
                case 57: {
                    n14 = 231;
                    break;
                }
                case 58: {
                    n14 = 214;
                    break;
                }
                case 59: {
                    n14 = 23;
                    break;
                }
                case 60: {
                    n14 = 11;
                    break;
                }
                case 61: {
                    n14 = 87;
                    break;
                }
                case 62: {
                    n14 = 124;
                    break;
                }
                case 63: {
                    n14 = 69;
                    break;
                }
                case 64: {
                    n14 = 196;
                    break;
                }
                case 65: {
                    n14 = 172;
                    break;
                }
                case 66: {
                    n14 = 33;
                    break;
                }
                case 67: {
                    n14 = 179;
                    break;
                }
                case 68: {
                    n14 = 121;
                    break;
                }
                case 69: {
                    n14 = 247;
                    break;
                }
                case 70: {
                    n14 = 56;
                    break;
                }
                case 71: {
                    n14 = 147;
                    break;
                }
                case 72: {
                    n14 = 253;
                    break;
                }
                case 73: {
                    n14 = 5;
                    break;
                }
                case 74: {
                    n14 = 83;
                    break;
                }
                case 75: {
                    n14 = 245;
                    break;
                }
                case 76: {
                    n14 = 26;
                    break;
                }
                case 77: {
                    n14 = 118;
                    break;
                }
                case 78: {
                    n14 = 6;
                    break;
                }
                case 79: {
                    n14 = 254;
                    break;
                }
                case 80: {
                    n14 = 178;
                    break;
                }
                case 81: {
                    n14 = 97;
                    break;
                }
                case 82: {
                    n14 = 24;
                    break;
                }
                case 83: {
                    n14 = 15;
                    break;
                }
                case 84: {
                    n14 = 153;
                    break;
                }
                case 85: {
                    n14 = 103;
                    break;
                }
                case 86: {
                    n14 = 251;
                    break;
                }
                case 87: {
                    n14 = 240;
                    break;
                }
                case 88: {
                    n14 = 187;
                    break;
                }
                case 89: {
                    n14 = 95;
                    break;
                }
                case 90: {
                    n14 = 63;
                    break;
                }
                case 91: {
                    n14 = 42;
                    break;
                }
                case 92: {
                    n14 = 128;
                    break;
                }
                case 93: {
                    n14 = 173;
                    break;
                }
                case 94: {
                    n14 = 86;
                    break;
                }
                case 95: {
                    n14 = 201;
                    break;
                }
                case 96: {
                    n14 = 102;
                    break;
                }
                case 97: {
                    n14 = 133;
                    break;
                }
                case 98: {
                    n14 = 88;
                    break;
                }
                case 99: {
                    n14 = 21;
                    break;
                }
                case 100: {
                    n14 = 159;
                    break;
                }
                case 101: {
                    n14 = 13;
                    break;
                }
                case 102: {
                    n14 = 53;
                    break;
                }
                case 103: {
                    n14 = 142;
                    break;
                }
                case 104: {
                    n14 = 207;
                    break;
                }
                case 105: {
                    n14 = 40;
                    break;
                }
                case 106: {
                    n14 = 225;
                    break;
                }
                case 107: {
                    n14 = 211;
                    break;
                }
                case 108: {
                    n14 = 233;
                    break;
                }
                case 109: {
                    n14 = 108;
                    break;
                }
                case 110: {
                    n14 = 125;
                    break;
                }
                case 111: {
                    n14 = 195;
                    break;
                }
                case 112: {
                    n14 = 51;
                    break;
                }
                case 113: {
                    n14 = 41;
                    break;
                }
                case 114: {
                    n14 = 62;
                    break;
                }
                case 115: {
                    n14 = 91;
                    break;
                }
                case 116: {
                    n14 = 171;
                    break;
                }
                case 117: {
                    n14 = 250;
                    break;
                }
                case 118: {
                    n14 = 243;
                    break;
                }
                case 119: {
                    n14 = 66;
                    break;
                }
                case 120: {
                    n14 = 163;
                    break;
                }
                case 121: {
                    n14 = 34;
                    break;
                }
                case 122: {
                    n14 = 99;
                    break;
                }
                case 123: {
                    n14 = 176;
                    break;
                }
                case 124: {
                    n14 = 209;
                    break;
                }
                case 125: {
                    n14 = 84;
                    break;
                }
                case 126: {
                    n14 = 248;
                    break;
                }
                case 127: {
                    n14 = 25;
                    break;
                }
                case 128: {
                    n14 = 17;
                    break;
                }
                case 129: {
                    n14 = 120;
                    break;
                }
                case 130: {
                    n14 = 71;
                    break;
                }
                case 131: {
                    n14 = 27;
                    break;
                }
                case 132: {
                    n14 = 129;
                    break;
                }
                case 133: {
                    n14 = 2;
                    break;
                }
                case 134: {
                    n14 = 192;
                    break;
                }
                case 135: {
                    n14 = 106;
                    break;
                }
                case 136: {
                    n14 = 134;
                    break;
                }
                case 137: {
                    n14 = 114;
                    break;
                }
                case 138: {
                    n14 = 73;
                    break;
                }
                case 139: {
                    n14 = 98;
                    break;
                }
                case 140: {
                    n14 = 232;
                    break;
                }
                case 141: {
                    n14 = 18;
                    break;
                }
                case 142: {
                    n14 = 140;
                    break;
                }
                case 143: {
                    n14 = 68;
                    break;
                }
                case 144: {
                    n14 = 107;
                    break;
                }
                case 145: {
                    n14 = 220;
                    break;
                }
                case 146: {
                    n14 = 31;
                    break;
                }
                case 147: {
                    n14 = 212;
                    break;
                }
                case 148: {
                    n14 = 16;
                    break;
                }
                case 149: {
                    n14 = 152;
                    break;
                }
                case 150: {
                    n14 = 205;
                    break;
                }
                case 151: {
                    n14 = 186;
                    break;
                }
                case 152: {
                    n14 = 228;
                    break;
                }
                case 153: {
                    n14 = 160;
                    break;
                }
                case 154: {
                    n14 = 1;
                    break;
                }
                case 155: {
                    n14 = 206;
                    break;
                }
                case 156: {
                    n14 = 59;
                    break;
                }
                case 157: {
                    n14 = 4;
                    break;
                }
                case 158: {
                    n14 = 45;
                    break;
                }
                case 159: {
                    n14 = 29;
                    break;
                }
                case 160: {
                    n14 = 166;
                    break;
                }
                case 161: {
                    n14 = 58;
                    break;
                }
                case 162: {
                    n14 = 28;
                    break;
                }
                case 163: {
                    n14 = 169;
                    break;
                }
                case 164: {
                    n14 = 112;
                    break;
                }
                case 165: {
                    n14 = 65;
                    break;
                }
                case 166: {
                    n14 = 49;
                    break;
                }
                case 167: {
                    n14 = 156;
                    break;
                }
                case 168: {
                    n14 = 94;
                    break;
                }
                case 169: {
                    n14 = 76;
                    break;
                }
                case 170: {
                    n14 = 12;
                    break;
                }
                case 171: {
                    n14 = 37;
                    break;
                }
                case 172: {
                    n14 = 157;
                    break;
                }
                case 173: {
                    n14 = 234;
                    break;
                }
                case 174: {
                    n14 = 60;
                    break;
                }
                case 175: {
                    n14 = 143;
                    break;
                }
                case 176: {
                    n14 = 44;
                    break;
                }
                case 177: {
                    n14 = 48;
                    break;
                }
                case 178: {
                    n14 = 193;
                    break;
                }
                case 179: {
                    n14 = 10;
                    break;
                }
                case 180: {
                    n14 = 246;
                    break;
                }
                case 181: {
                    n14 = 52;
                    break;
                }
                case 182: {
                    n14 = 22;
                    break;
                }
                case 183: {
                    n14 = 252;
                    break;
                }
                case 184: {
                    n14 = 43;
                    break;
                }
                case 185: {
                    n14 = 180;
                    break;
                }
                case 186: {
                    n14 = 100;
                    break;
                }
                case 187: {
                    n14 = 105;
                    break;
                }
                case 188: {
                    n14 = 55;
                    break;
                }
                case 189: {
                    n14 = 115;
                    break;
                }
                case 190: {
                    n14 = 101;
                    break;
                }
                case 191: {
                    n14 = 111;
                    break;
                }
                case 192: {
                    n14 = 161;
                    break;
                }
                case 193: {
                    n14 = 0;
                    break;
                }
                case 194: {
                    n14 = 219;
                    break;
                }
                case 195: {
                    n14 = 70;
                    break;
                }
                case 196: {
                    n14 = 221;
                    break;
                }
                case 197: {
                    n14 = 64;
                    break;
                }
                case 198: {
                    n14 = 104;
                    break;
                }
                case 199: {
                    n14 = 119;
                    break;
                }
                case 200: {
                    n14 = 174;
                    break;
                }
                case 201: {
                    n14 = 7;
                    break;
                }
                case 202: {
                    n14 = 200;
                    break;
                }
                case 203: {
                    n14 = 244;
                    break;
                }
                case 204: {
                    n14 = 14;
                    break;
                }
                case 205: {
                    n14 = 67;
                    break;
                }
                case 206: {
                    n14 = 137;
                    break;
                }
                case 207: {
                    n14 = 145;
                    break;
                }
                case 208: {
                    n14 = 238;
                    break;
                }
                case 209: {
                    n14 = 237;
                    break;
                }
                case 210: {
                    n14 = 136;
                    break;
                }
                case 211: {
                    n14 = 222;
                    break;
                }
                case 212: {
                    n14 = 148;
                    break;
                }
                case 213: {
                    n14 = 167;
                    break;
                }
                case 214: {
                    n14 = 177;
                    break;
                }
                case 215: {
                    n14 = 30;
                    break;
                }
                case 216: {
                    n14 = 154;
                    break;
                }
                case 217: {
                    n14 = 170;
                    break;
                }
                case 218: {
                    n14 = 239;
                    break;
                }
                case 219: {
                    n14 = 36;
                    break;
                }
                case 220: {
                    n14 = 85;
                    break;
                }
                case 221: {
                    n14 = 229;
                    break;
                }
                case 222: {
                    n14 = 249;
                    break;
                }
                case 223: {
                    n14 = 80;
                    break;
                }
                case 224: {
                    n14 = 210;
                    break;
                }
                case 225: {
                    n14 = 61;
                    break;
                }
                case 226: {
                    n14 = 127;
                    break;
                }
                case 227: {
                    n14 = 149;
                    break;
                }
                case 228: {
                    n14 = 54;
                    break;
                }
                case 229: {
                    n14 = 93;
                    break;
                }
                case 230: {
                    n14 = 191;
                    break;
                }
                case 231: {
                    n14 = 216;
                    break;
                }
                case 232: {
                    n14 = 202;
                    break;
                }
                case 233: {
                    n14 = 184;
                    break;
                }
                case 234: {
                    n14 = 165;
                    break;
                }
                case 235: {
                    n14 = 117;
                    break;
                }
                case 236: {
                    n14 = 57;
                    break;
                }
                case 237: {
                    n14 = 204;
                    break;
                }
                case 238: {
                    n14 = 203;
                    break;
                }
                case 239: {
                    n14 = 74;
                    break;
                }
                case 240: {
                    n14 = 182;
                    break;
                }
                case 241: {
                    n14 = 110;
                    break;
                }
                case 242: {
                    n14 = 47;
                    break;
                }
                case 243: {
                    n14 = 113;
                    break;
                }
                case 244: {
                    n14 = 116;
                    break;
                }
                case 245: {
                    n14 = 158;
                    break;
                }
                case 246: {
                    n14 = 75;
                    break;
                }
                case 247: {
                    n14 = 223;
                    break;
                }
                case 248: {
                    n14 = 150;
                    break;
                }
                case 249: {
                    n14 = 208;
                    break;
                }
                case 250: {
                    n14 = 185;
                    break;
                }
                case 251: {
                    n14 = 9;
                    break;
                }
                case 252: {
                    n14 = 90;
                    break;
                }
                case 253: {
                    n14 = 242;
                    break;
                }
                case 254: {
                    n14 = 3;
                    break;
                }
                default: {
                    n14 = 126;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            fz_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2552;
        if (d[n11] == null) {
            fz_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

