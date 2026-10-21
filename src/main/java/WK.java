import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.Icon;

public class WK extends W2 {
   private static final String a;

   public WK() {
      Object[] var10001 = com.c.a(a);
      Method var10003 = com.c.d(241374024532053562L);
      Object[] var10002 = var10001;
      WK var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   @Override
   public void O() {
      String var10000 = W2.F();
      Method var10001 = (Method)com.c.c(254384586786323749L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(463836399714355767L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var28 = (ArrayList)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var28.clear();
      String var1 = var10000;
      var10000 = (String)com.c.c(372236004790213499L).get(this);
      if (var1 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (String)com.c.c(372236004790213499L).get(this);
      }

      Object[] var17 = com.c.a(var10000);
      Method var18 = com.c.d(492930666611970668L);
      var10002 = var17;
      var10001 = null;

      try {
         var10000 = (String[])var18.invoke(var10001, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String[] var2 = var10000;
      boolean var3 = false;
      HashSet var4 = new HashSet();
      int var5 = 0;

      while (var5 < var2.length) {
         String var6 = var2[var5].trim();
         String var7 = var6.trim();
         if (var1 != null) {
            if (!var7.contains("*") && !var4.contains(var7)) {
               L1 var8 = new L1("", var7);
               var10000 = (String)com.c.c(254384586786323749L).get(this);
               Object[] var31 = com.c.f();
               Method var44 = com.c.d(463836399714355767L);
               var10002 = var31;
               var10001 = var10000;
               Method var21 = var44;

               try {
                  var22 = (ArrayList)var21.invoke(var10001, var10002);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               var22.add(var8);
               var4.add(var7);
               bo_4 var9 = new bo_4(var7, var7, "-", null);
               Object[] var23 = com.c.a(var9);
               Method var24 = com.c.d(488188427062992088L);
               var10002 = var23;
               var10001 = null;

               try {
                  var25 = (Icon)var24.invoke(var10001, var10002);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               Icon var10 = var25;
               Object[] var35 = com.c.a(var10);
               Method var45 = com.c.d(377795955767356198L);
               var10002 = var35;
               L1 var36 = var8;
               Method var26 = var45;

               try {
                  var26.invoke(var36, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }
            }

            var5++;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "<aQITZ$8}QI,~\u0013\u00182\rM\bMgw(VM[\u001f`y2\rM\u001bM\" 2\\\u001b\\\u0018hw2\rM\u001bM\" 2_M\u0000\u001f4?`\u0005".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 121;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      } else {
         var6 = 121;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 41;
               break;
            case 1:
               var23 = 107;
               break;
            case 2:
               var23 = 8;
               break;
            case 3:
               var23 = 20;
               break;
            case 4:
               var23 = 5;
               break;
            case 5:
               var23 = 70;
               break;
            default:
               var23 = 62;
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





