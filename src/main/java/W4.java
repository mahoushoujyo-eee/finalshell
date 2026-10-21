import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class W4 {
   public String V;
   long u;
   long S;
   long B;
   long Q;
   private static final String a;
   private static final long b;

   public W4(String var1) {
      com.c.c(308001167767280047L).set(this, var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(618950266267220159L);
      Object[] var10002 = var10001;
      W4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void v() {
      String var10000 = W2.F();
      com.c.c(308001167767280047L).set(this, ((String)com.c.c(308001167767280047L).get(this)).trim());
      String var1 = var10000;
      var10000 = (String)com.c.c(308001167767280047L).get(this);
      if (var1 != null) {
         if (var10000.equals("")) {
            return;
         }

         var10000 = (String)com.c.c(308001167767280047L).get(this);
      }

      Object[] var22 = com.c.a(var10000);
      Method var23 = com.c.d(492930666611970668L);
      Object[] var52 = var22;
      Object var41 = null;

      try {
         var10000 = (String[])var23.invoke(var41, var52);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      String[] var2 = var10000;
      String var3 = var2[0];
      var10000 = var3;
      if (var1 != null) {
         if (var3.contains(a)) {
            String var4 = var2[1];
            Object[] var26 = com.c.a(var4);
            Method var27 = com.c.d(393686057219167936L);
            var52 = var26;
            var41 = null;

            try {
               var10000 = (String[])var27.invoke(var41, var52);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            String[] var5 = var10000;
            com.c.c(591969639021653010L).setLong(this, Long.parseLong(var5[1]));
            long var6 = Long.parseLong(var5[(int)b]);
            com.c.c(627600800800634929L).setLong(this, com.c.c(591969639021653010L).getLong(this) - var6);
            String var8 = var2[2];
            Object[] var29 = com.c.a(var8);
            Method var30 = com.c.d(393686057219167936L);
            var52 = var29;
            var41 = null;

            try {
               var10000 = (String[])var30.invoke(var41, var52);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            String[] var9 = var10000;
            com.c.c(507089352300075301L).setLong(this, Long.parseLong(var9[1]));
            com.c.c(493434312974920352L).setLong(this, Long.parseLong(var9[2]));
            if (var1 != null) {
               return;
            }
         }

         var10000 = var2[1];
      }

      String var16 = var10000;
      Object[] var32 = com.c.a(var16);
      Method var33 = com.c.d(393686057219167936L);
      var52 = var32;
      var41 = null;

      try {
         var10000 = (String[])var33.invoke(var41, var52);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      String[] var17 = var10000;
      com.c.c(591969639021653010L).setLong(this, Long.parseLong(var17[1]));
      String var18 = var2[2];
      Object[] var35 = com.c.a(var18);
      Method var36 = com.c.d(393686057219167936L);
      var52 = var35;
      var41 = null;

      try {
         var10000 = (String[])var36.invoke(var41, var52);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      String[] var7 = var10000;
      com.c.c(627600800800634929L).setLong(this, Long.parseLong(var7[2]));
      String var19 = var2[3];
      Object[] var38 = com.c.a(var19);
      Method var39 = com.c.d(393686057219167936L);
      var52 = var38;
      var41 = null;

      try {
         var10000 = (String[])var39.invoke(var41, var52);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String[] var20 = var10000;
      com.c.c(507089352300075301L).setLong(this, Long.parseLong(var20[1]));
      com.c.c(493434312974920352L).setLong(this, Long.parseLong(var20[2]));
   }

   public long r() {
      return com.c.c(591969639021653010L).getLong(this);
   }

   public void o(long var1) {
      com.c.c(591969639021653010L).setLong(this, var1);
   }

   public long a() {
      return com.c.c(627600800800634929L).getLong(this);
   }

   public void i(long var1) {
      com.c.c(627600800800634929L).setLong(this, var1);
   }

   public long R() {
      return com.c.c(507089352300075301L).getLong(this);
   }

   public void a(long var1) {
      com.c.c(507089352300075301L).setLong(this, var1);
   }

   public long Z() {
      return com.c.c(493434312974920352L).getLong(this);
   }

   public void V(long var1) {
      com.c.c(493434312974920352L).setLong(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "GN\tf\u0004\u0019\u0005J]".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 81;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 81;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 119;
               break;
            case 1:
               var21 = 105;
               break;
            case 2:
               var21 = 57;
               break;
            case 3:
               var21 = 94;
               break;
            case 4:
               var21 = 57;
               break;
            case 5:
               var21 = 41;
               break;
            default:
               var21 = 54;
         }
      } else {
         var13 = 81;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 4868874321259095430L;
            long var12 = 859790081524458880L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 81;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 119;
               break;
            case 1:
               var21 = 105;
               break;
            case 2:
               var21 = 57;
               break;
            case 3:
               var21 = 94;
               break;
            case 4:
               var21 = 57;
               break;
            case 5:
               var21 = 41;
               break;
            default:
               var21 = 54;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 119;
                  break;
               case 1:
                  var21 = 105;
                  break;
               case 2:
                  var21 = 57;
                  break;
               case 3:
                  var21 = 94;
                  break;
               case 4:
                  var21 = 57;
                  break;
               case 5:
                  var21 = 41;
                  break;
               default:
                  var21 = 54;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 4868874321259095430L;
               long var11 = 859790081524458880L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 119;
                  break;
               case 1:
                  var21 = 105;
                  break;
               case 2:
                  var21 = 57;
                  break;
               case 3:
                  var21 = 94;
                  break;
               case 4:
                  var21 = 57;
                  break;
               case 5:
                  var21 = 41;
                  break;
               default:
                  var21 = 54;
            }
         }
      }
   }
}





