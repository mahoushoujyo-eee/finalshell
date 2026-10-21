package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.HashSet;
import java.util.Set;

public class KV3 implements YA {
   public final Lr2 O;

   public KV3(Lr2 var1) {
      this.O = var1;
   }

   public boolean s(String var1) {
      String[] var10000 = Lr2.Q();
      String[] var3 = var1.split(" ");
      String[] var2 = var10000;
      HashSet var4 = new HashSet();
      int var5 = 2;

      while (true) {
         if (var5 < var3.length) {
            String var6 = var3[var5].trim();
            if (var2 == null) {
               if (var2 != null) {
                  break;
               }

               if (!var6.equals("")) {
                  var4.add(var6);
                  Object var7 = (Set)Lr2.h(this.O).get(var6);
                  if (var2 == null) {
                     if (var7 == null) {
                        var7 = new HashSet();
                     }

                     var7.add(var3[0]);
                     Lr2.h(this.O).put(var6, var7);
                  }
               }

               var5++;
            }

            if (var2 == null) {
               continue;
            }

            Ky4.K(new String[2]);
         }

         Lr2.i(this.O).put(var3[0], var4);
         break;
      }

      var3 = null;
      return false;
   }

   @Override
   public boolean w(Object var1) {
      return this.s((String)var1);
   }
}





