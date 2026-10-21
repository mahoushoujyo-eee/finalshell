package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class W4 {
   public String V;
   public long u;
   public long S;
   public long B;
   public long Q;
   public static String a;
   public static long b;

   public W4(String var1) {
      long var3 = 308001167767280047L;
      Ref.s(308001167767280047L, var1, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 618950266267220159L;
      Object[] var4 = var10002;
      Ref.h(618950266267220159L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void v() {
      W2.F();
      Object var10 = 308001167767280047L;
      String var10003 = ((String)Ref.g(308001167767280047L, var10)).trim();
      long var13 = 308001167767280047L;
      String var12 = var10003;
      Ref.s(308001167767280047L, var12, var13);
      Object var14 = 308001167767280047L;
      var10003 = (String)Ref.g(308001167767280047L, var14);
      if (this != null) {
         if (var10003.equals("")) {
            return;
         }

         var10003 = this;
         Object var16 = 308001167767280047L;
         String var10004 = (String)Ref.g(308001167767280047L, var16);
      }

      Registry.packArgs(var10003);
      long var18 = 492930666611970668L;
      Object var42 = Ref.h2(492930666611970668L, var18);

      try {
         var42 = (String[])var42;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      String[] var2 = (String[])var42;
      String var3 = var2[0];
      var42 = var3;
      if (this != null) {
         if (var3.contains(a)) {
            String var4 = var2[1];
            Registry.packArgs(var4);
            long var20 = 393686057219167936L;
            Object var10005 = Ref.h2(393686057219167936L, var20);

            try {
               var10005 = (String[])var10005;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            String[] var5 = (String[])var10005;
            Registry.lookupField(591969639021653010L).setLong(this, Long.parseLong(var5[1]));
            long var6 = Long.parseLong(var5[(int)b]);
            Registry.lookupField(627600800800634929L).setLong(this, Registry.lookupField(591969639021653010L).getLong(this) - var6);
            String var8 = var2[2];
            Registry.packArgs(var8);
            long var22 = 393686057219167936L;
            Object var10006 = Ref.h2(393686057219167936L, var22);

            try {
               var10006 = (String[])var10006;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }

            String[] var9 = (String[])var10006;
            Registry.lookupField(507089352300075301L).setLong(this, Long.parseLong(var9[1]));
            Registry.lookupField(493434312974920352L).setLong(this, Long.parseLong(var9[2]));
            if (this != null) {
               return;
            }
         }

         var42 = var2[1];
      }

      String var36 = (String)var42;
      Registry.packArgs(var36);
      long var24 = 393686057219167936L;
      Object var46 = Ref.h2(393686057219167936L, var24);

      try {
         var46 = (String[])var46;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      String[] var37 = (String[])var46;
      Registry.lookupField(591969639021653010L).setLong(this, Long.parseLong(var37[1]));
      String var38 = var2[2];
      Registry.packArgs(var38);
      long var26 = 393686057219167936L;
      Object var49 = Ref.h2(393686057219167936L, var26);

      try {
         var49 = (String[])var49;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      String[] var7 = (String[])var49;
      Registry.lookupField(627600800800634929L).setLong(this, Long.parseLong(var7[2]));
      String var39 = var2[3];
      Registry.packArgs(var39);
      long var28 = 393686057219167936L;
      Object var10007 = Ref.h2(393686057219167936L, var28);

      try {
         var10007 = (String[])var10007;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      String[] var40 = (String[])var10007;
      Registry.lookupField(507089352300075301L).setLong(this, Long.parseLong(var40[1]));
      Registry.lookupField(493434312974920352L).setLong(this, Long.parseLong(var40[2]));
   }

   public long r() {
      return Registry.lookupField(591969639021653010L).getLong(this);
   }

   public void o(long var1) {
      Registry.lookupField(591969639021653010L).setLong(this, var1);
   }

   public long a() {
      return Registry.lookupField(627600800800634929L).getLong(this);
   }

   public void i(long var1) {
      Registry.lookupField(627600800800634929L).setLong(this, var1);
   }

   public long R() {
      return Registry.lookupField(507089352300075301L).getLong(this);
   }

   public void a(long var1) {
      Registry.lookupField(507089352300075301L).setLong(this, var1);
   }

   public long Z() {
      return Registry.lookupField(493434312974920352L).getLong(this);
   }

   public void V(long var1) {
      Registry.lookupField(493434312974920352L).setLong(this, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





