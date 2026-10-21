import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ln_4 {
   String y;
   protected String O;
   int S;
   protected String a;
   long Z;
   long G;
   long s;
   long U;
   long P;
   long b;
   long L;
   private static boolean R;

   public ln_4() {
      Object[] var10001 = com.c.f();
      Method var2 = com.c.d(236040230540929068L);
      Object[] var5 = var10001;
      Object var4 = null;

      try {
         var10001 = (Object[])var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(469940910977292411L).set(this, var10001);
   }

   public abstract ln_4 B();

   public long c() {
      return com.c.c(367267596504705820L).getLong(this);
   }

   public void Z(long var1) {
      com.c.c(367267596504705820L).setLong(this, var1);
   }

   public long T() {
      return com.c.c(175353713507913948L).getLong(this);
   }

   public void x(long var1) {
      com.c.c(175353713507913948L).setLong(this, var1);
   }

   public long q() {
      return com.c.c(263023896137074983L).getLong(this);
   }

   public void G(long var1) {
      com.c.c(263023896137074983L).setLong(this, var1);
   }

   public int Y() {
      return com.c.c(276073657800783051L).getInt(this);
   }

   public void Z(int var1) {
      com.c.c(276073657800783051L).setInt(this, var1);
   }

   public long l() {
      return com.c.c(389000664659847042L).getLong(this);
   }

   public void J(long var1) {
      com.c.c(389000664659847042L).setLong(this, var1);
   }

   public String F() {
      return (String)com.c.c(350806123988960857L).get(this);
   }

   public void z(String var1) {
      com.c.c(350806123988960857L).set(this, var1);
   }

   public String g() {
      return (String)com.c.c(469940910977292411L).get(this);
   }

   public void p(String var1) {
      com.c.c(469940910977292411L).set(this, var1);
   }

   public String J() {
      return (String)com.c.c(200133482699923083L).get(this);
   }

   public void R(String var1) {
      com.c.c(200133482699923083L).set(this, var1);
   }

   public long w() {
      return com.c.c(165455792488885275L).getLong(this);
   }

   public void v(long var1) {
      com.c.c(165455792488885275L).setLong(this, var1);
   }

   @Override
   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(286931176286176762L);
      Object[] var10003 = var10002;
      ln_4 var7 = this;
      Method var10001 = var10004;

      try {
         var4 = (String)var10001.invoke(var7, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10000 = var10000.append(var4).append(" ");
      var10002 = com.c.f();
      var10004 = com.c.d(194080076253066315L);
      var10003 = var10002;
      ln_4 var9 = this;
      var10001 = var10004;

      try {
         var6 = (String)var10001.invoke(var9, var10003);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      return var10000.append(var6).toString();
   }

   public long y() {
      return com.c.c(271778103214377343L).getLong(this);
   }

   public void d(long var1) {
      com.c.c(271778103214377343L).setLong(this, var1);
   }

   public long b() {
      return com.c.c(482903438334262492L).getLong(this);
   }

   public void n(long var1) {
      com.c.c(482903438334262492L).setLong(this, var1);
   }

   public static void O(boolean var0) {
      R = var0;
   }

   public static boolean R() {
      return R;
   }

   public static boolean i() {
      boolean var0 = R();
      return !var0;
   }

   static {
      if (R()) {
         O(true);
      }
   }
}





