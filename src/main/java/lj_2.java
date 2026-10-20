/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/*
 * Renamed from lj
 */
public class lj_2
extends ln_2 {
    String F;
    HashMap g;
    boolean w;
    public static int m;
    private static final String c;

    public lj_2() {
        int[] nArray = yb_1.Y();
        int[] nArray2 = nArray;
        this.g = new HashMap();
        this.w = true;
        for (int i2 = 0; i2 < lj_2.m; ++i2) {
            dx_2 dx_22 = new dx_2();
            String string = "#" + (i2 + 1);
            ((HashMap)this.g).put(string, dx_22);
            if (nArray2 == null) continue;
        }
    }

    public String l() {
        return (String)this.F;
    }

    public void w(String string) {
        this.F = string;
    }

    public dx_2 m(String string) {
        return (dx_2)((HashMap)this.g).get(string);
    }

    public ArrayList c() {
        String string = (String)this.F;
        Pattern pattern = Pattern.compile(c);
        Matcher matcher = pattern.matcher(string);
        int[] nArray = yb_1.Y();
        ArrayList<CS> arrayList = new ArrayList<CS>();
        while (matcher.find()) {
            String string2 = string.substring(matcher.start());
            Pattern pattern2 = Pattern.compile("]");
            Matcher matcher2 = pattern2.matcher(string2);
            if (matcher2.find()) {
                String string3 = string2.substring(0, matcher2.start() + 1);
                CS cS = new CS();
                try {
                    cS.Y(matcher.start());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    cS.F(matcher.start() + matcher2.end());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n10 = string3.indexOf(" ");
                String string4 = string3.substring(2, n10);
                try {
                    cS.j(string4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string5 = string3.substring(n10, string3.length() - 1).trim();
                try {
                    cS.Z(string5);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                arrayList.add(cS);
            }
            if (nArray == null) continue;
        }
        return arrayList;
    }

    public String u(ArrayList arrayList) {
        StringBuffer stringBuffer;
        block34: {
            int n10;
            String string;
            block31: {
                ArrayList arrayList2;
                String string2;
                try {
                    string2 = (String)this.l();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string = string2;
                try {
                    arrayList2 = (ArrayList)this.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ArrayList arrayList3 = arrayList2;
                int[] nArray = yb_1.Y();
                stringBuffer = new StringBuffer();
                Iterator iterator = arrayList3.iterator();
                block18: while (true) {
                    boolean bl = iterator.hasNext();
                    block19: while (bl) {
                        CS cS = (CS)iterator.next();
                        for (Object object : arrayList) {
                            block33: {
                                CS cS2;
                                String string3;
                                block32: {
                                    String string4;
                                    JTextField jTextField;
                                    String string5;
                                    try {
                                        string5 = (String)object.a();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    String string6 = string5;
                                    try {
                                        jTextField = (JTextField)object.b();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    string3 = jTextField.getText();
                                    cS2 = cS;
                                    if (nArray != null) break block32;
                                    try {
                                        string4 = (String)cS2.H();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    bl = string4.equals(string6);
                                    if (nArray != null) continue block19;
                                    if (!bl) break block33;
                                    cS2 = cS;
                                }
                                try {
                                    cS2.s(string3);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            if (nArray == null) continue;
                        }
                        if (nArray == null) continue block18;
                    }
                    break;
                }
                n10 = 0;
                boolean bl = false;
                for (Object object : arrayList3) {
                    int n11;
                    String string7;
                    int n12;
                    bl = true;
                    try {
                        n12 = (Integer)object.N();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringBuffer.append(string.substring(n10, n12));
                    try {
                        string7 = (String)object.G();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringBuffer.append(string7);
                    try {
                        n11 = (Integer)object.V();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = n11;
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block31;
                }
                if (bl) break block31;
                stringBuffer.append(string);
                if (nArray == null) break block34;
            }
            stringBuffer.append(string.substring(n10));
        }
        return stringBuffer.toString();
    }

    public boolean o() {
        return this.w;
    }

    public void f(boolean bl) {
        this.w = bl;
    }

    @Override
    public ln_2 B() {
        return null;
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
                char[] cArray3 = "-[\u001e\u0013<Qr\u0002".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 68;
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
                            n17 = 53;
                            break;
                        }
                        case 1: {
                            n17 = 68;
                            break;
                        }
                        case 2: {
                            n17 = 42;
                            break;
                        }
                        case 3: {
                            n17 = 116;
                            break;
                        }
                        case 4: {
                            n17 = 36;
                            break;
                        }
                        case 5: {
                            n17 = 113;
                            break;
                        }
                        default: {
                            n17 = 106;
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
        c = new String(cArray).intern();
        long l2 = 649996851623476809L;
        long l3 = 0x4F466F635623BE4CL ^ l2;
        lj_2.m = (int)l3;
    }
}

