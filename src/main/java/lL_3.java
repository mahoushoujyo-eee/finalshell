import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lL_3 implements Cq_2 {
   HashMap l;
   int m;
   int F;
   ArrayList s;
   ExecutorService I;
   HashSet V;
   HashMap X;
   HashMap c;
   private static final long a;

   public lL_3() {
      com.c.c(386849566821741858L).set(this, new HashMap());
      com.c.c(256164222342390016L).setInt(this, 0);
      int var10001 = (int)a;
      com.c.c(279108313700036577L).setInt(this, var10001);
      com.c.c(550567548032100594L).set(this, new ArrayList());
      com.c.c(609930306026547909L).set(this, Executors.newFixedThreadPool(com.c.c(611678237881470112L).getInt(null)));
      com.c.c(294127198955704615L).set(this, new HashSet());
      com.c.c(614370709562827652L).set(this, new HashMap());
      com.c.c(495522543738164163L).set(this, new HashMap());
   }

   public void g(String var1, String var2, lv_4 var3, int var4) {
      String var6 = var1.toLowerCase();
      boolean var10000 = zD.X();
      StringBuilder var10001 = new StringBuilder();
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(292557478156152530L);
      Object[] var10004 = var10003;
      lv_4 var11 = var3;
      Method var10002 = var10005;

      try {
         var10 = (String)var10002.invoke(var11, var10004);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      String var7 = var10001.append(var10).append("_").append(var2).toString();
      boolean var5 = var10000;
      HashMap var8 = (HashMap)((HashMap)com.c.c(614370709562827652L).get(this)).get(var6);
      if (var5) {
         if (var8 == null) {
            var8 = new HashMap();
            ((HashMap)com.c.c(614370709562827652L).get(this)).put(var6, var8);
         }

         var8.put(var7, var4);
      }
   }

   public int u(String var1, String var2, lv_4 var3) {
      String var5 = var1.toLowerCase();
      int var10000 = zD.X();
      HashMap var6 = (HashMap)((HashMap)com.c.c(614370709562827652L).get(this)).get(var5);
      boolean var4 = (boolean)var10000;
      if (var4 && var6 == null) {
         var6 = new HashMap();
         ((HashMap)com.c.c(614370709562827652L).get(this)).put(var5, var6);
      }

      int var7 = 0;
      StringBuilder var11 = new StringBuilder();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(292557478156152530L);
      Object[] var10003 = var10002;
      lv_4 var14 = var3;
      Method var10001 = var10004;

      try {
         var13 = (String)var10001.invoke(var14, var10003);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      String var8 = var11.append(var13).append("_").append(var2).toString();
      var10000 = var6.containsKey(var8);
      if (var4) {
         if (var10000 != 0) {
            var7 = (Integer)var6.get(var8);
            if (var4) {
               return var7;
            }
         }

         var10000 = var6.size();
      }

      var7 = var10000;
      var6.put(var2, var7);
      return var7;
   }

   public void S(String var1) {
      var1 = new File(var1).getAbsolutePath();
      ((HashSet)com.c.c(294127198955704615L).get(this)).add(var1);
   }

   public void B(String var1) {
      var1 = new File(var1).getAbsolutePath();
      ((HashSet)com.c.c(294127198955704615L).get(this)).remove(var1);
   }

   public void C(String var1) {
      var1 = new File(var1).getAbsolutePath();
      ((HashSet)com.c.c(294127198955704615L).get(this)).remove(var1);
      ((HashMap)com.c.c(495522543738164163L).get(this)).put(var1, System.currentTimeMillis());
   }

   public long B$long(String var1) {
      boolean var10000 = zD.d();
      long var3 = 0L;
      boolean var2 = var10000;
      HashMap var5 = (HashMap)com.c.c(495522543738164163L).get(this);
      String var10001 = var1;
      if (!var2) {
         if (!var5.containsKey(var1)) {
            return var3;
         }

         var5 = (HashMap)com.c.c(495522543738164163L).get(this);
         var10001 = var1;
      }

      return (Long)var5.get(var10001);
   }

   public boolean F(String var1) {
      var1 = new File(var1).getAbsolutePath();
      return ((HashSet)com.c.c(294127198955704615L).get(this)).contains(var1);
   }

   public synchronized void z(YI var1) {
      HashMap var10000 = (HashMap)com.c.c(386849566821741858L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(305126359001981386L);
      Object[] var10003 = var10002;
      YI var13 = var1;
      Method var10001 = var10004;

      try {
         var8 = (Integer)var10001.invoke(var13, var10003);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10000.put(var8, var1);
      com.c.c(256164222342390016L).setInt(this, com.c.c(256164222342390016L).getInt(this) + 1);
      Object[] var9 = com.c.a(this);
      Method var16 = com.c.d(541437196102236947L);
      var10002 = var9;
      YI var10 = var1;
      Method var6 = var16;

      try {
         var6.invoke(var10, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      VO var2 = new VO(var1, com.c.c(355995585155017665L).getInt(null));
      Object[] var11 = com.c.a(var2);
      Method var17 = com.c.d(575065562045324617L);
      var10002 = var11;
      lL_3 var12 = this;
      Method var7 = var17;

      try {
         var7.invoke(var12, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   YI N(int var1) {
      return (YI)((HashMap)com.c.c(386849566821741858L).get(this)).get(var1);
   }

   @Override
   public synchronized void u(VO var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(575065562045324617L);
      Object[] var10002 = var10001;
      lL_3 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   void w(VO var1) {
      boolean var10000 = zD.d();
      Iterator var3 = ((ArrayList)com.c.c(550567548032100594L).get(this)).iterator();
      boolean var2 = var10000;

      while (var3.hasNext()) {
         Cq_2 var4 = (Cq_2)var3.next();
         Object[] var10001 = com.c.a(var1);
         Method var10003 = com.c.d(297776913386603291L);
         Object[] var10002 = var10001;
         Cq_2 var7 = var4;
         Method var6 = var10003;

         try {
            var6.invoke(var7, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (var2) {
            break;
         }
      }
   }

   public void A(Cq_2 var1) {
      ((ArrayList)com.c.c(550567548032100594L).get(this)).add(var1);
   }

   public ExecutorService b() {
      return (ExecutorService)com.c.c(609930306026547909L).get(this);
   }

   public void a(ExecutorService var1) {
      com.c.c(609930306026547909L).set(this, var1);
   }

   static {
      long var0 = 6150985399780439196L;
      long var10002 = -794610302837132129L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





