import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class zg_2 {
   static HashMap a;

   public void D() {
      ((HashMap)com.c.c(323929397643124273L).get(null)).clear();
   }

   public static synchronized boolean d(int var0, int var1) {
      int var2 = (var0 + "_" + var1).hashCode();
      return ((HashMap)com.c.c(323929397643124273L).get(null)).containsKey(var2);
   }

   public static synchronized Uc_2 s(int var0, int var1) {
      int var2 = (var0 + "_" + var1).hashCode();
      return (Uc_2)((HashMap)com.c.c(323929397643124273L).get(null)).get(var2);
   }

   public static void K() {
   }

   public static synchronized Uc_2 u(BufferedImage var0, BufferedImage var1, RenderingHints var2, int var3, int var4) {
      int var5 = (var3 + "_" + var4).hashCode();
      Uc_2 var6 = new Uc_2();
      com.c.c(331345675446116425L).setInt(var6, var3);
      com.c.c(224601074955414455L).setInt(var6, var4);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(190504784764553274L);
      Object[] var10002 = var10001;
      Uc_2 var8 = var6;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      ((HashMap)com.c.c(323929397643124273L).get(null)).put(var5, var6);
      return var6;
   }

   public static synchronized void o(Uc_2 var0, int var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(365828054481938659L);
      Object[] var10002 = var10001;
      Uc_2 var3 = var0;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public static synchronized void G(Uc_2 var0, int var1) {
      String[] var10000 = F8.y();
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(228632970311438472L);
      Object[] var10003 = var10002;
      Uc_2 var14 = var0;
      Method var10001 = var10004;

      try {
         var10001.invoke(var14, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String[] var2 = var10000;
      Object[] var10 = com.c.f();
      Method var17 = com.c.d(502552909089695756L);
      var10002 = var10;
      Uc_2 var11 = var0;
      Method var7 = var17;

      try {
         var8 = (Integer)var7.invoke(var11, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var2 == null) {
         if (var8 != 0) {
            return;
         }

         var8 = (com.c.c(331345675446116425L).getInt(var0) + "_" + com.c.c(224601074955414455L).getInt(var0)).hashCode();
      }

      int var3 = var8;
      ((HashMap)com.c.c(323929397643124273L).get(null)).remove(var3);
      Object[] var12 = com.c.f();
      Method var18 = com.c.d(514459637192101058L);
      var10002 = var12;
      Uc_2 var13 = var0;
      Method var9 = var18;

      try {
         var9.invoke(var13, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private static void B(int var0, int var1) {
   }

   static {
      com.c.c(323929397643124273L).set(null, new HashMap());
   }
}





