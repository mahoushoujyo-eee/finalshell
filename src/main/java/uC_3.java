import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uC_3 implements UG {
   final aJ Z;

   uC_3(aJ var1) {
      this.Z = var1;
   }

   @Override
   public void G(File var1) {
      lv_4 var2 = new lv_4();
      Object[] var10001 = com.c.a(var1.getAbsolutePath());
      Method var10003 = com.c.d(574053907803002361L);
      Object[] var10002 = var10001;
      lv_4 var17 = var2;
      Method var10000 = var10003;

      try {
         var10000.invoke(var17, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      try {
         var10001 = com.c.f();
         var10003 = com.c.d(540969864624467425L);
         var10002 = var10001;
         lv_4 var19 = var2;
         var10000 = var10003;

         try {
            var10000.invoke(var19, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         Object[] var11 = com.c.f();
         var10000 = com.c.d(270389152141252877L);
         var10002 = var11;
         var10001 = null;

         try {
            var13 = var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(410905379772103887L);
         var10002 = var10001;
         var10001 = (Object[])var13;
         var10000 = var10003;

         try {
            var15 = var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001 = com.c.a(var1);
         var10003 = com.c.d(426039508296790275L);
         var10002 = var10001;
         var10001 = (Object[])var15;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   @Override
   public void U(File var1) {
      try {
         Object[] var10000 = com.c.f();
         Method var7 = com.c.d(270389152141252877L);
         Object[] var17 = var10000;
         Object var12 = null;

         try {
            var10000 = (Object[])var7.invoke(var12, var17);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var12 = com.c.f();
         Method var10003 = com.c.d(410905379772103887L);
         var17 = (Object[])var12;
         var12 = var10000;
         Method var9 = var10003;

         try {
            var10000 = (Object[])var9.invoke(var12, var17);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var12 = com.c.a(var1);
         var10003 = com.c.d(559611838312321344L);
         var17 = (Object[])var12;
         var12 = var10000;
         Method var11 = var10003;

         try {
            var11.invoke(var12, var17);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   @Override
   public void D(File var1) {
      Method var10000 = (Method)com.c.c(296068972390436422L).get(this);
      Object[] var10001 = com.c.a(var1.getAbsolutePath(), 0);
      Method var10003 = com.c.d(295612812222941676L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void d(File var1) {
   }

   @Override
   public void j(File var1) {
   }
}





