import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TW implements ActionListener {
   final aM o;
   private static final String a;

   TW(aM var1) {
      this.o = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      CL var2 = new CL();
      Method var10000 = (Method)com.c.c(378570001390511429L).get(this);
      Object[] var10001 = com.c.a(var2, a, ((ArrayList)com.c.c(417119238929760524L).get(com.c.c(378570001390511429L).get(this))).size(), false, true);
      Method var10003 = com.c.d(451133235546109527L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var8 = (t3_2)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      t3_2 var3 = var8;
      var10001 = com.c.a(var3);
      var10003 = com.c.d(318870397969942063L);
      var10002 = var10001;
      CL var14 = var2;
      var10000 = var10003;

      try {
         var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10000 = (Method)com.c.c(378570001390511429L).get(this);
      var10001 = com.c.a(var3);
      var10003 = com.c.d(176011466134249595L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "斪栝笶頮".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 3;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      } else {
         var6 = 3;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 25;
               break;
            case 1:
               var23 = 25;
               break;
            case 2:
               var23 = 75;
               break;
            case 3:
               var23 = 88;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 47;
               break;
            default:
               var23 = 7;
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





