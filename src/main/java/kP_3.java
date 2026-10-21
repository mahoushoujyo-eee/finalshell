import java.awt.Container;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

class kP_3 implements Runnable {
   final String s;
   final ly_4 X;
   private static final String a;

   kP_3(ly_4 var1, String var2) {
      this.X = var1;
      this.s = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(212042562452272939L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         zD var16 = (zD)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var2 = null;
      var10000 = (Method)com.c.c(515525013030853953L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)));
      var10001 = com.c.f();
      var10003 = com.c.d(498856411508641826L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object[] var20 = com.c.a(var10000);
      var10000 = com.c.d(159824902428932603L);
      var10002 = var20;
      var10001 = null;

      try {
         var22 = (String)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      String var3 = var22;
      StringBuilder var23 = new StringBuilder();
      var10001 = (Object[])com.c.c(515525013030853953L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)));
      var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var52 = var10002;
      var10002 = var10001;
      Method var34 = var10004;

      try {
         var10001 = (String)var34.invoke(var10002, var52);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      String var4 = var23.append((String)var10001).append(var3).append((String)com.c.c(583261171697996206L).get(this)).toString();

      try {
         var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)));
         var10001 = com.c.f();
         var10003 = com.c.d(346382751221538814L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000 = (Method)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         Container var38 = ((a3)com.c.c(305402254993059552L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)))).getParent();
         var10002 = (Object[])com.c.c(515525013030853953L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this)));
         Object[] var54 = com.c.f();
         Method var10005 = com.c.d(498856411508641826L);
         Object[] var57 = var54;
         var10003 = var10002;
         Method var48 = var10005;

         try {
            var10002 = (Object[])var48.invoke(var10003, var57);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var10001 = com.c.a(var38, var10002, com.c.c(583261171697996206L).get(this), true, true);
         var10003 = com.c.d(184332907359967333L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } catch (Exception var10) {
         var10.printStackTrace();
         var2 = a + var10;
      }

      try {
         if (var2 != null) {
            JOptionPane.showMessageDialog((a3)com.c.c(305402254993059552L).get(com.c.c(357358512404315725L).get(com.c.c(124351971510883468L).get(this))), var2);
         }
      } catch (Exception var6) {
         throw a(var6);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "刽廐奙赙\"\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 111;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      } else {
         var6 = 111;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 73;
               break;
            case 1:
               var23 = 69;
               break;
            case 2:
               var23 = 7;
               break;
            case 3:
               var23 = 19;
               break;
            case 4:
               var23 = 108;
               break;
            case 5:
               var23 = 105;
               break;
            default:
               var23 = 22;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





