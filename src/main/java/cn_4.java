import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public class cn_4 {
   String n;
   String O;
   boolean g;
   boolean t;
   boolean L;
   int A;
   zh_2 r;
   KV U;
   HashSet N;

   public cn_4() {
      com.c.c(514516057646380455L).set(this, new HashSet());
   }

   public void V(String var1) {
      ((HashSet)com.c.c(514516057646380455L).get(this)).add(var1);
   }

   public int G() {
      return ((HashSet)com.c.c(514516057646380455L).get(this)).size();
   }

   public String B() {
      return (String)com.c.c(630347306118036886L).get(this);
   }

   public void a(String var1) {
      int[] var2 = YQ.m();
      cn_4 var10000 = this;
      String var10001 = var1;
      if (var2 != null) {
         com.c.c(630347306118036886L).set(this, var1);
         if (var1 == null) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      Object[] var5 = com.c.a(var10001);
      Method var10003 = com.c.d(419278803587653136L);
      Object[] var10002 = var5;
      cn_4 var6 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public String c() {
      return (String)com.c.c(600495477565496970L).get(this);
   }

   public void Q(String var1) {
      com.c.c(600495477565496970L).set(this, var1);
   }

   public boolean E() {
      return com.c.c(430453442639568160L).getBoolean(this);
   }

   public void x(boolean var1) {
      com.c.c(430453442639568160L).setBoolean(this, var1);
   }

   public boolean B$boolean() {
      return com.c.c(155088746315920746L).getBoolean(this);
   }

   public void e(boolean var1) {
      com.c.c(155088746315920746L).setBoolean(this, var1);
   }

   public int Y() {
      return com.c.c(192203579081304091L).getInt(this);
   }

   public void n(int var1) {
      com.c.c(192203579081304091L).setInt(this, var1);
   }

   public zh_2 W() {
      return (zh_2)com.c.c(261313468987900257L).get(this);
   }

   public void n(zh_2 var1) {
      com.c.c(261313468987900257L).set(this, var1);
   }

   public boolean a() {
      return com.c.c(409389968211315794L).getBoolean(this);
   }

   public void L(boolean var1) {
      com.c.c(409389968211315794L).setBoolean(this, var1);
   }

   public KV C() {
      return (KV)com.c.c(386569180623392168L).get(this);
   }

   public void y(KV var1) {
      com.c.c(386569180623392168L).set(this, var1);
   }
}





