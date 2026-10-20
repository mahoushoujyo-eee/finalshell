/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class DA
implements gn_0 {
    private Map U;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DA(String[][] stringArray) {
        String string;
        block10: {
            this.U = null;
            string = d5_0.k();
            try {
                try {
                    if (string != null) break block10;
                    if (stringArray == null) {
                        throw new IllegalArgumentException();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DA.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw DA.a(illegalArgumentException);
            }
            this.U = new HashMap();
        }
        int n10 = 0;
        boolean bl = true;
        do {
            String string2;
            if (bl && !(bl = false) && string == null) continue;
            String string3 = string2 = stringArray[n10][0];
            if (string == null) {
                try {
                    if (string3 != null) {
                        string3 = this.U.put(string2.toUpperCase(), stringArray[n10][1]);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DA.a(illegalArgumentException);
                }
            }
            ++n10;
        } while (n10 < stringArray.length);
    }

    @Override
    public boolean n(String string, String string2) {
        String string3;
        block10: {
            String string4;
            block11: {
                String string5;
                String string6;
                block8: {
                    block9: {
                        string6 = d5_0.k();
                        try {
                            try {
                                string5 = string;
                                if (string6 != null) break block8;
                                if (string5 != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw DA.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw DA.a(illegalArgumentException);
                        }
                    }
                    string5 = (String)this.U.get(string.toUpperCase());
                }
                string4 = string5;
                try {
                    try {
                        string3 = string4;
                        if (string6 != null) break block10;
                        if (string3 != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DA.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DA.a(illegalArgumentException);
                }
            }
            string3 = string4;
        }
        return string3.equals(string2);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

