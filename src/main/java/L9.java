import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public class L9 {
   String J;
   String i;
   boolean a;
   boolean N;
   boolean s;
   int L;
   zh_2 z;
   KV c;
   HashSet v;
   private static int[] k;

   public L9() {
      com.c.c(196959233489421900L).set(this, new HashSet());
   }

   public void c(String var1) {
      ((HashSet)com.c.c(196959233489421900L).get(this)).add(var1);
   }

   public int C() {
      return ((HashSet)com.c.c(196959233489421900L).get(this)).size();
   }

   public String o() {
      return (String)com.c.c(320742864705291608L).get(this);
   }

   public void u(String var1) {
      int[] var2 = X();
      L9 var10000 = this;
      String var10001 = var1;
      if (var2 == null) {
         com.c.c(320742864705291608L).set(this, var1);
         if (var1 == null) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      Object[] var5 = com.c.a(var10001);
      Method var10003 = com.c.d(378849519055405264L);
      Object[] var10002 = var5;
      L9 var6 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public String K() {
      return (String)com.c.c(131287010932144231L).get(this);
   }

   public void V(String var1) {
      com.c.c(131287010932144231L).set(this, var1);
   }

   public boolean y() {
      return com.c.c(289896148011038420L).getBoolean(this);
   }

   public void V(boolean var1) {
      com.c.c(289896148011038420L).setBoolean(this, var1);
   }

   public boolean s() {
      return com.c.c(635527125572129349L).getBoolean(this);
   }

   public void g(boolean var1) {
      com.c.c(635527125572129349L).setBoolean(this, var1);
   }

   public int O() {
      return com.c.c(159321665489106190L).getInt(this);
   }

   public void l(int var1) {
      com.c.c(159321665489106190L).setInt(this, var1);
   }

   public zh_2 F() {
      return (zh_2)com.c.c(570637810374567417L).get(this);
   }

   public void P(zh_2 var1) {
      com.c.c(570637810374567417L).set(this, var1);
   }

   public boolean i() {
      return com.c.c(466904403992138213L).getBoolean(this);
   }

   public void y(boolean var1) {
      com.c.c(466904403992138213L).setBoolean(this, var1);
   }

   public KV r() {
      return (KV)com.c.c(419207569098345878L).get(this);
   }

   public void E(KV var1) {
      com.c.c(419207569098345878L).set(this, var1);
   }

   public static void A(int[] var0) {
      k = var0;
   }

   public static int[] X() {
      return k;
   }

   static {
      if (X() != null) {
         A(new int[3]);
      }
   }
}





