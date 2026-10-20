/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import javax.swing.plaf.UIResource;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dz
 */
class dz_2
implements Transferable,
UIResource {
    protected String y;
    protected String Y;
    private static DataFlavor[] p;
    private static DataFlavor[] B;
    private static DataFlavor[] d;

    public dz_2(String string, String string2) {
        this.y = string;
        this.Y = string2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public DataFlavor[] getTransferDataFlavors() {
        block23: {
            block22: {
                try {
                    v0 = (DataFlavor[])this.M();
                }
                catch (InvocationTargetException v1) {
                    throw v1.getTargetException();
                }
                var2_1 = v0;
                var1_2 = aA.z();
                v2 = var2_1;
                if (var1_2 != null) ** GOTO lbl13
                if (v2 != null) {
                    v2 = var2_1;
lbl13:
                    // 2 sources

                    v3 = v2.length;
                } else {
                    v3 = 0;
                }
                var3_3 = v3;
                try {
                    v4 = ((Boolean)this.F()).booleanValue();
                }
                catch (InvocationTargetException v5) {
                    throw v5.getTargetException();
                }
                if (var1_2 == null) {
                    v4 = v4 != 0 ? ((DataFlavor[])dz_2.p).length : 0;
                }
                var4_4 = v4;
                try {
                    v6 = ((Boolean)this.P()).booleanValue();
                }
                catch (InvocationTargetException v7) {
                    throw v7.getTargetException();
                }
                if (var1_2 == null) {
                    v6 = v6 != 0 ? ((DataFlavor[])dz_2.d).length : 0;
                }
                var5_5 = v6;
                try {
                    v8 = ((Boolean)this.P()).booleanValue();
                }
                catch (InvocationTargetException v9) {
                    throw v9.getTargetException();
                }
                if (var1_2 == null) {
                    v8 = v8 != 0 ? ((DataFlavor[])dz_2.B).length : 0;
                }
                var6_6 = v8;
                var7_7 = var3_3 + var4_4 + var5_5 + var6_6;
                var8_8 = new DataFlavor[var7_7];
                var9_9 = 0;
                v10 = var3_3;
                if (var1_2 == null) {
                    if (v10 > 0) {
                        System.arraycopy(var2_1, 0, var8_8, var9_9, var3_3);
                        var9_9 += var3_3;
                    }
                    v10 = var4_4;
                }
                if (var1_2 == null) {
                    if (v10 > 0) {
                        System.arraycopy((DataFlavor[])dz_2.p, 0, var8_8, var9_9, var4_4);
                        var9_9 += var4_4;
                    }
                    v10 = var5_5;
                }
                if (var1_2 == null) {
                    if (v10 > 0) {
                        System.arraycopy((DataFlavor[])dz_2.d, 0, var8_8, var9_9, var5_5);
                        var9_9 += var5_5;
                    }
                    v10 = var6_6;
                }
                if (var1_2 != null) break block22;
                if (v10 <= 0) break block23;
                System.arraycopy((DataFlavor[])dz_2.B, 0, var8_8, var9_9, var6_6);
                v10 = var9_9 + var6_6;
            }
            var9_9 = v10;
        }
        return var8_8;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        boolean bl;
        block5: {
            DataFlavor[] dataFlavorArray;
            try {
                dataFlavorArray = (DataFlavor[])this.getTransferDataFlavors();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            DataFlavor[] dataFlavorArray2 = dataFlavorArray;
            String string = aA.z();
            for (int i2 = 0; i2 < dataFlavorArray2.length; ++i2) {
                bl = dataFlavorArray2[i2].equals(dataFlavor);
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (!bl) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block5;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Object getTransferData(DataFlavor var1_1) throws UnsupportedFlavorException, IOException {
        block73: {
            block82: {
                block83: {
                    block81: {
                        block74: {
                            block79: {
                                block80: {
                                    block77: {
                                        block78: {
                                            block75: {
                                                block76: {
                                                    block66: {
                                                        block71: {
                                                            block72: {
                                                                block69: {
                                                                    block70: {
                                                                        block67: {
                                                                            block68: {
                                                                                block64: {
                                                                                    block65: {
                                                                                        try {
                                                                                            v0 = (DataFlavor[])this.M();
                                                                                        }
                                                                                        catch (InvocationTargetException v1) {
                                                                                            throw v1.getTargetException();
                                                                                        }
                                                                                        var3_2 = v0;
                                                                                        var2_3 = aA.z();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v2 = (Boolean)this.N(var1_1);
                                                                                                }
                                                                                                catch (InvocationTargetException v3) {
                                                                                                    throw v3.getTargetException();
                                                                                                }
                                                                                                if (var2_3 != null) break block64;
                                                                                                if (v2) {
                                                                                                }
                                                                                                break block65;
                                                                                            }
                                                                                            catch (UnsupportedFlavorException v4) {
                                                                                                throw dz_2.a(v4);
                                                                                            }
                                                                                            try {
                                                                                                v5 = this.T(var1_1);
                                                                                            }
                                                                                            catch (InvocationTargetException v6) {
                                                                                                throw v6.getTargetException();
                                                                                            }
                                                                                            return v5;
                                                                                        }
                                                                                        catch (UnsupportedFlavorException v7) {
                                                                                            throw dz_2.a(v7);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v2 = (Boolean)this.T(var1_1);
                                                                                    }
                                                                                    catch (InvocationTargetException v8) {
                                                                                        throw v8.getTargetException();
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var2_3 != null) break block66;
                                                                                    if (v2) {
                                                                                    }
                                                                                    ** GOTO lbl100
                                                                                }
                                                                                catch (UnsupportedFlavorException v9) {
                                                                                    throw dz_2.a(v9);
                                                                                }
                                                                                try {
                                                                                    v10 = (String)this.y();
                                                                                }
                                                                                catch (InvocationTargetException v11) {
                                                                                    throw v11.getTargetException();
                                                                                }
                                                                                var4_4 = v10;
                                                                                try {
                                                                                    v12 = var4_4;
                                                                                    if (var2_3 != null) break block67;
                                                                                    if (v12 != null) break block68;
                                                                                }
                                                                                catch (UnsupportedFlavorException v13) {
                                                                                    throw dz_2.a(v13);
                                                                                }
                                                                                v12 = "";
                                                                                break block67;
                                                                            }
                                                                            v12 = var4_4;
                                                                        }
                                                                        var4_4 = v12;
                                                                        try {
                                                                            try {
                                                                                v14 = String.class.equals(var1_1.getRepresentationClass());
                                                                                if (var2_3 != null) break block69;
                                                                                if (!v14) break block70;
                                                                            }
                                                                            catch (UnsupportedFlavorException v15) {
                                                                                throw dz_2.a(v15);
                                                                            }
                                                                            return var4_4;
                                                                        }
                                                                        catch (UnsupportedFlavorException v16) {
                                                                            throw dz_2.a(v16);
                                                                        }
                                                                    }
                                                                    v14 = Reader.class.equals(var1_1.getRepresentationClass());
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var2_3 != null) break block71;
                                                                        if (!v14) break block72;
                                                                    }
                                                                    catch (UnsupportedFlavorException v17) {
                                                                        throw dz_2.a(v17);
                                                                    }
                                                                    return new StringReader(var4_4);
                                                                }
                                                                catch (UnsupportedFlavorException v18) {
                                                                    throw dz_2.a(v18);
                                                                }
                                                            }
                                                            v14 = InputStream.class.equals(var1_1.getRepresentationClass());
                                                        }
                                                        try {
                                                            if (v14) {
                                                                return new StringBufferInputStream(var4_4);
                                                            }
                                                        }
                                                        catch (UnsupportedFlavorException v19) {
                                                            throw dz_2.a(v19);
                                                        }
                                                        try {
                                                            if (var2_3 == null) break block73;
lbl100:
                                                            // 2 sources

                                                            try {
                                                                v2 = (Boolean)this.i(var1_1);
                                                            }
                                                            catch (InvocationTargetException v20) {
                                                                throw v20.getTargetException();
                                                            }
                                                        }
                                                        catch (UnsupportedFlavorException v21) {
                                                            throw dz_2.a(v21);
                                                        }
                                                    }
                                                    try {
                                                        if (var2_3 != null) break block74;
                                                        if (v2) {
                                                        }
                                                        ** GOTO lbl170
                                                    }
                                                    catch (UnsupportedFlavorException v22) {
                                                        throw dz_2.a(v22);
                                                    }
                                                    try {
                                                        v23 = (String)this.Z();
                                                    }
                                                    catch (InvocationTargetException v24) {
                                                        throw v24.getTargetException();
                                                    }
                                                    var4_4 = v23;
                                                    try {
                                                        v25 = var4_4;
                                                        if (var2_3 != null) break block75;
                                                        if (v25 != null) break block76;
                                                    }
                                                    catch (UnsupportedFlavorException v26) {
                                                        throw dz_2.a(v26);
                                                    }
                                                    v25 = "";
                                                    break block75;
                                                }
                                                v25 = var4_4;
                                            }
                                            var4_4 = v25;
                                            try {
                                                try {
                                                    v27 = String.class.equals(var1_1.getRepresentationClass());
                                                    if (var2_3 != null) break block77;
                                                    if (!v27) break block78;
                                                }
                                                catch (UnsupportedFlavorException v28) {
                                                    throw dz_2.a(v28);
                                                }
                                                return var4_4;
                                            }
                                            catch (UnsupportedFlavorException v29) {
                                                throw dz_2.a(v29);
                                            }
                                        }
                                        v27 = Reader.class.equals(var1_1.getRepresentationClass());
                                    }
                                    try {
                                        try {
                                            if (var2_3 != null) break block79;
                                            if (!v27) break block80;
                                        }
                                        catch (UnsupportedFlavorException v30) {
                                            throw dz_2.a(v30);
                                        }
                                        return new StringReader(var4_4);
                                    }
                                    catch (UnsupportedFlavorException v31) {
                                        throw dz_2.a(v31);
                                    }
                                }
                                v27 = InputStream.class.equals(var1_1.getRepresentationClass());
                            }
                            try {
                                if (v27) {
                                    return new StringBufferInputStream(var4_4);
                                }
                            }
                            catch (UnsupportedFlavorException v32) {
                                throw dz_2.a(v32);
                            }
                            try {
                                try {
                                    if (var2_3 == null) break block73;
lbl170:
                                    // 2 sources

                                    v33 = this;
                                    if (var2_3 == null) {
                                    }
                                    break block81;
                                }
                                catch (UnsupportedFlavorException v34) {
                                    throw dz_2.a(v34);
                                }
                                try {
                                    v2 = (Boolean)v33.t(var1_1);
                                }
                                catch (InvocationTargetException v35) {
                                    throw v35.getTargetException();
                                }
                            }
                            catch (UnsupportedFlavorException v36) {
                                throw dz_2.a(v36);
                            }
                        }
                        if (!v2) break block73;
                        v33 = this;
                    }
                    try {
                        v37 = (String)v33.Z();
                    }
                    catch (InvocationTargetException v38) {
                        throw v38.getTargetException();
                    }
                    var4_4 = v37;
                    try {
                        v39 = var4_4;
                        if (var2_3 != null) break block82;
                        if (v39 != null) break block83;
                    }
                    catch (UnsupportedFlavorException v40) {
                        throw dz_2.a(v40);
                    }
                    v39 = "";
                    break block82;
                }
                v39 = var4_4;
            }
            var4_4 = v39;
            return var4_4;
        }
        throw new UnsupportedFlavorException(var1_1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean N(DataFlavor dataFlavor) {
        DataFlavor[] dataFlavorArray;
        try {
            dataFlavorArray = (DataFlavor[])this.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        DataFlavor[] dataFlavorArray2 = dataFlavorArray;
        String string = aA.z();
        DataFlavor[] dataFlavorArray3 = dataFlavorArray2;
        if (string == null) {
            if (dataFlavorArray3 == null) return false;
            dataFlavorArray3 = dataFlavorArray2;
        }
        int n10 = dataFlavorArray3.length;
        int n11 = n10;
        int n12 = 0;
        do {
            if (n12 >= n11) return false;
            boolean bl = dataFlavorArray2[n12].equals(dataFlavor);
            if (string != null) return bl;
            if (string != null) boolean bl2;
            return bl2;
            if (bl) {
                return true;
            }
            ++n12;
        } while (string == null);
        return false;
    }

    protected DataFlavor[] M() {
        return null;
    }

    protected Object T(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        return null;
    }

    protected boolean T(DataFlavor dataFlavor) {
        boolean bl;
        block3: {
            DataFlavor[] dataFlavorArray = (DataFlavor[])dz_2.p;
            String string = aA.z();
            for (int i2 = 0; i2 < dataFlavorArray.length; ++i2) {
                bl = dataFlavorArray[i2].equals(dataFlavor);
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (!bl) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block3;
            }
            bl = false;
        }
        return bl;
    }

    protected boolean F() {
        return (String)this.Y != null;
    }

    protected String y() {
        return (String)this.Y;
    }

    protected boolean i(DataFlavor dataFlavor) {
        boolean bl;
        block3: {
            DataFlavor[] dataFlavorArray = (DataFlavor[])dz_2.d;
            String string = aA.z();
            for (int i2 = 0; i2 < dataFlavorArray.length; ++i2) {
                bl = dataFlavorArray[i2].equals(dataFlavor);
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (!bl) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block3;
            }
            bl = false;
        }
        return bl;
    }

    protected boolean P() {
        return (String)this.y != null;
    }

    protected String Z() {
        return (String)this.y;
    }

    protected boolean t(DataFlavor dataFlavor) {
        boolean bl;
        block3: {
            DataFlavor[] dataFlavorArray = (DataFlavor[])dz_2.B;
            String string = aA.z();
            for (int i2 = 0; i2 < dataFlavorArray.length; ++i2) {
                bl = dataFlavorArray[i2].equals(dataFlavor);
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (!bl) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block3;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                var0 = new String[7];
                var4_1 = 0;
                var3_2 = "|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA";
                var5_3 = "|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA".length();
                var2_4 = 31;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 122;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block21;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "~KodlmekGy+ uhx]rd~hgcMxt&&jfOdc~wh|O9y,3@d^bd\u0010i{oOz!~KodlmekGy+ qhy]*z\"kh$Bv~$3Z~\\~~$";
                    var5_3 = "~KodlmekGy+ uhx]rd~hgcMxt&&jfOdc~wh|O9y,3@d^bd\u0010i{oOz!~KodlmekGy+ qhy]*z\"kh$Bv~$3Z~\\~~$".length();
                    var2_4 = 52;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 120;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block22;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 114;
                            break;
                        }
                        case 1: {
                            v15 = 86;
                            break;
                        }
                        case 2: {
                            v15 = 111;
                            break;
                        }
                        case 3: {
                            v15 = 104;
                            break;
                        }
                        case 4: {
                            v15 = 59;
                            break;
                        }
                        case 5: {
                            v15 = 101;
                            break;
                        }
                        default: {
                            v15 = 113;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        try {
            dz_2.p = new DataFlavor[3];
            ((DataFlavor[])c.c((long)371162706378214403L).get(null))[0] = new DataFlavor(var0[1]);
            ((DataFlavor[])c.c((long)371162706378214403L).get(null))[1] = new DataFlavor(var0[3]);
            ((DataFlavor[])c.c((long)371162706378214403L).get(null))[2] = new DataFlavor(var0[4]);
            dz_2.d = new DataFlavor[3];
            ((DataFlavor[])c.c((long)507666187908136268L).get(null))[0] = new DataFlavor(var0[6]);
            ((DataFlavor[])c.c((long)507666187908136268L).get(null))[1] = new DataFlavor(var0[0]);
            ((DataFlavor[])c.c((long)507666187908136268L).get(null))[2] = new DataFlavor(var0[5]);
            dz_2.B = new DataFlavor[2];
            ((DataFlavor[])c.c((long)551288916370793759L).get(null))[0] = new DataFlavor(var0[2]);
            ((DataFlavor[])c.c((long)551288916370793759L).get(null))[1] = DataFlavor.stringFlavor;
        }
        catch (ClassNotFoundException var7_7) {
            // empty catch block
        }
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

