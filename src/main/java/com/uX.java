/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NE;
import com.cl_2;
import com.le_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@XStreamAlias(value="SettingsGroup")
@XStreamConverter(value=le_1.class)
public class uX
implements Serializable {
    private String R;
    private String v;
    private Map u;
    private static final String a;

    public uX() {
        this(null);
    }

    public uX(String string) {
        this.R = NE.E(a);
        this.v = string;
    }

    public uX(String string, String string2) {
        this.R = string;
        this.v = string2;
    }

    public String t() {
        return this.R;
    }

    public void N(String string) {
        this.R = string;
    }

    public String J() {
        return this.v;
    }

    public void a(String string) {
        this.v = string;
    }

    public Map c() {
        String string = cl_2.I();
        Map map = this.u;
        if (string == null) {
            if (map == null) {
                this.u = new HashMap();
            }
            map = this.u;
        }
        return map;
    }

    public void O(Map map) {
        this.u = map;
    }

    public Object O(String string) {
        return this.c().get(string);
    }

    public Object D(String string) {
        return this.c().remove(string);
    }

    public Object J(String string, Object object) {
        return this.c().put(string, object);
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
                char[] cArray3 = "En".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 55;
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
                            n17 = 33;
                            break;
                        }
                        case 1: {
                            n17 = 30;
                            break;
                        }
                        case 2: {
                            n17 = 2;
                            break;
                        }
                        case 3: {
                            n17 = 113;
                            break;
                        }
                        case 4: {
                            n17 = 106;
                            break;
                        }
                        case 5: {
                            n17 = 100;
                            break;
                        }
                        default: {
                            n17 = 29;
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

