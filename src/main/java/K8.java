import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class K8 implements Runnable {
   final Fc_2 w;

   K8(Fc_2 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      av_2 var10000 = com.c.f();
      Method var9 = com.c.d(270389152141252877L);
      Object[] var37 = var10000;
      Method var21 = null;

      try {
         var10000 = (Object[])var9.invoke(var21, var37);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var21 = com.c.f();
      Method var10003 = com.c.d(579658074404235868L);
      var37 = (Object[])var21;
      var21 = var10000;
      Method var11 = var10003;

      try {
         var11.invoke(var21, var37);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10000 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      var37 = var10000;
      var21 = null;

      try {
         var10000 = (Object[])var13.invoke(var21, var37);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var21 = com.c.f();
      var10003 = com.c.d(162469947047699459L);
      var37 = (Object[])var21;
      var21 = var10000;
      Method var15 = var10003;

      try {
         var10000 = (av_2)var15.invoke(var21, var37);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var21 = com.c.f();
      Method var29 = com.c.d(270389152141252877L);
      Object[] var51 = (Object[])var21;
      var37 = null;

      try {
         var21 = var29.invoke(var37, var51);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var37 = com.c.f();
      Method var10004 = com.c.d(606040881383812332L);
      Object[] var52 = var37;
      var37 = (Object[])var21;
      var21 = var10004;

      try {
         var32 = (FP)var21.invoke(var37, var52);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000.setLocationRelativeTo(var32);
      Object[] var17 = com.c.f();
      Method var18 = com.c.d(270389152141252877L);
      var37 = var17;
      var21 = null;

      try {
         var10000 = (av_2)var18.invoke(var21, var37);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      Object[] var35 = com.c.f();
      var10003 = com.c.d(625602140027665883L);
      var37 = var35;
      var21 = var10000;
      Method var20 = var10003;

      try {
         var20.invoke(var21, var37);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





