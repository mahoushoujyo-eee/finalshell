/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketException;

/*
 * Renamed from ti
 */
public class ti_2
extends SocketException {
    private String H;

    public ti_2(String string, String string2) {
        super(string);
        this.H = string2;
    }

    public String a() {
        return this.H;
    }
}

