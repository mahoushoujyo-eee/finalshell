package org.z;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class t {
   private static final Class E;
   private static final Method p;
   private static final Method w;
   private final Object a;

   private t(Object var1) {
      this.a = var1;
   }

   public static t c() {
      return new t(org.w.j.o(p, null, new Object[0]));
   }

   public Set W() {
      return (Set)N((Set)org.w.j.o(w, this.a, new Object[0]), new HashSet());
   }

   private static Collection N(Collection var0, Collection var1) {
      for (Object var3 : var0) {
         var1.add(new D(var3));
      }

      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u0016>eO\u001f#5\u00128=C^+!\u0010:=c^+!\u0010:UG_+1\u000e\b\u00139@WB;1\u0011\u0007\u001a6}Jp#8";
      int var5 = "\u0016>eO\u001f#5\u00128=C^+!\u0010:=c^+!\u0010:UG_+1\u000e\b\u00139@WB;1\u0011\u0007\u001a6}Jp#8".length();
      char var2 = 29;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 89;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 89;
               var10006 = var6;
            } else {
               var13 = 89;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 89;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 37;
                     break;
                  case 1:
                     var29 = 6;
                     break;
                  case 2:
                     var29 = 74;
                     break;
                  case 3:
                     var29 = 119;
                     break;
                  case 4:
                     var29 = 104;
                     break;
                  case 5:
                     var29 = 22;
                     break;
                  default:
                     var29 = 13;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            E = org.w.d.Z(var0[0]);
            p = org.w.d.z(E, var0[1], new Class[0]);
            w = org.w.d.z(E, var0[2], new Class[0]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





