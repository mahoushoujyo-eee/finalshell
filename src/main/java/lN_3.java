import com.Pc_2;
import com.pW_3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class lN_3 extends ln_4 {
   String v;
   byte[] j;
   boolean o;
   pW_3 T;
   private static int x;

   public lN_3() {
      com.c.c(493608400358118531L).setBoolean(this, false);
   }

   public String P() {
      return (String)com.c.c(233371333307467846L).get(this);
   }

   public void v(String var1) {
      com.c.c(233371333307467846L).set(this, var1);
   }

   public byte[] p() {
      return (byte[])com.c.c(618075449696964647L).get(this);
   }

   public void X(byte[] var1) {
      com.c.c(618075449696964647L).set(this, var1);

      try {
         Object[] var10001 = com.c.a(this);
         Method var5 = com.c.d(181303880124437871L);
         Object[] var8 = var10001;
         Object var7 = null;

         try {
            var10001 = (Object[])var5.invoke(var7, var8);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         com.c.c(466974556789702365L).set(this, var10001);
      } catch (Pc_2 var4) {
         var4.printStackTrace();
      }
   }

   @Override
   public ln_4 B() {
      return new lN_3();
   }

   public boolean s() {
      return com.c.c(493608400358118531L).getBoolean(this);
   }

   public void F(boolean var1) {
      com.c.c(493608400358118531L).setBoolean(this, var1);
   }

   public pW_3 h() {
      return (pW_3)com.c.c(466974556789702365L).get(this);
   }

   public void Q(pW_3 var1) {
      com.c.c(466974556789702365L).set(this, var1);
   }

   public static void O(int var0) {
      x = var0;
   }

   public static int A() {
      return x;
   }

   public static int v() {
      int var0 = A();
      return var0 == 0 ? 117 : 0;
   }

   static {
      if (A() != 0) {
         O(107);
      }
   }
}





