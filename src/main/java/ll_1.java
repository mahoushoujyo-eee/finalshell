/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from lL
 */
public class ll_1
implements cq_0 {
    HashMap l;
    int m;
    int F;
    ArrayList s;
    ExecutorService I;
    HashSet V;
    HashMap X;
    HashMap c;
    private static final long a;

    public ll_1() {
        this.l = new HashMap();
        this.m = 0;
        this.F = (int)a;
        this.s = new ArrayList();
        this.I = Executors.newFixedThreadPool(dd_1.u);
        this.V = new HashSet();
        this.X = new HashMap();
        this.c = new HashMap();
    }

    public void g(String string, String string2, lv_2 lv_22, int n10) {
        HashMap<String, Integer> hashMap;
        String string3;
        String string4 = string.toLowerCase();
        try {
            string3 = (String)lv_22.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string5 = string3 + "_" + string2;
        boolean bl = zD.X();
        Serializable serializable = hashMap = (HashMap<String, Integer>)((HashMap)this.X).get(string4);
        if (bl) {
            if (serializable == null) {
                hashMap = new HashMap<String, Integer>();
                ((HashMap)this.X).put(string4, hashMap);
            }
            serializable = hashMap.put(string5, n10);
        }
    }

    public int u(String string, String string2, lv_2 lv_22) {
        int n10;
        block8: {
            int n11;
            HashMap<String, Integer> hashMap;
            block6: {
                block7: {
                    String string3;
                    String string4 = string.toLowerCase();
                    hashMap = (HashMap<String, Integer>)((HashMap)this.X).get(string4);
                    boolean bl = zD.X();
                    HashMap<String, Integer> hashMap2 = hashMap;
                    if (bl && hashMap2 == null) {
                        hashMap = new HashMap<String, Integer>();
                        hashMap2 = ((HashMap)this.X).put(string4, hashMap);
                    }
                    n10 = 0;
                    try {
                        string3 = (String)lv_22.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string5 = string3 + "_" + string2;
                    n11 = hashMap.containsKey(string5);
                    if (!bl) break block6;
                    if (n11 == 0) break block7;
                    n10 = (Integer)hashMap.get(string5);
                    if (bl) break block8;
                }
                n11 = hashMap.size();
            }
            n10 = n11;
            hashMap.put(string2, n10);
        }
        return n10;
    }

    public void S(String string) {
        string = new File(string).getAbsolutePath();
        ((HashSet)this.V).add(string);
    }

    public void B(String string) {
        string = new File(string).getAbsolutePath();
        ((HashSet)this.V).remove(string);
    }

    public void C(String string) {
        string = new File(string).getAbsolutePath();
        ((HashSet)this.V).remove(string);
        ((HashMap)this.c).put(string, System.currentTimeMillis());
    }

    public long B(String string) {
        long l2;
        block3: {
            String string2;
            HashMap hashMap;
            block2: {
                l2 = 0L;
                boolean bl = zD.d();
                hashMap = (HashMap)this.c;
                string2 = string;
                if (bl) break block2;
                if (!hashMap.containsKey(string2)) break block3;
                hashMap = (HashMap)this.c;
                string2 = string;
            }
            l2 = (Long)hashMap.get(string2);
        }
        return l2;
    }

    public boolean F(String string) {
        string = new File(string).getAbsolutePath();
        return ((HashSet)this.V).contains(string);
    }

    public synchronized void z(YI yI) {
        int n10;
        try {
            n10 = (Integer)yI.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.l).put(n10, yI);
        ll_1 ll_12 = this;
        ll_12.m = ll_12.m + 1;
        try {
            yI.w(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        VO vO = new VO(yI, VO.p);
        try {
            this.w(vO);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    YI N(int n10) {
        return (YI)((HashMap)this.l).get(n10);
    }

    @Override
    public synchronized void u(VO vO) {
        try {
            this.w(vO);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void w(VO vO) {
        Iterator iterator = ((ArrayList)this.s).iterator();
        boolean bl = zD.d();
        while (iterator.hasNext()) {
            cq_0 cq_02 = (cq_0)iterator.next();
            try {
                cq_02.u(vO);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!bl) continue;
        }
    }

    public void A(cq_0 cq_02) {
        ((ArrayList)this.s).add(cq_02);
    }

    public ExecutorService b() {
        return (ExecutorService)this.I;
    }

    public void a(ExecutorService executorService) {
        this.I = executorService;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6150985399780439196L;
        a = 0xF4F8FA23BC86F49FL ^ l2;
    }
}

