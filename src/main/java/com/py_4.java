package com;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

public class py_4 implements Comparator, Serializable {
   public int I(File var1, File var2) {
      int var3;
      int var10000;
      var3 = com.Yt_2.C();
      var10000 = com.Cz_2.z(var1);
      label63:
      if (var3 != 0) {
         if (var10000 != 0) {
            var10000 = com.Cz_2.z(var2);
            if (var3 == 0) {
               break label63;
            }

            if (var10000 == 0) {
               return -1;
            }
         }

         var10000 = com.Cz_2.z(var1);
      }

      label56:
      if (var3 != 0) {
         if (var10000 == 0) {
            var10000 = com.Cz_2.z(var2);
            if (var3 == 0) {
               break label56;
            }

            if (var10000 != 0) {
               return 1;
            }
         }

         var10000 = com.Cz_2.v(var1);
      }

      label49:
      if (var3 != 0) {
         if (var10000 != 0) {
            var10000 = com.Cz_2.v(var2);
            if (var3 == 0) {
               break label49;
            }

            if (var10000 == 0) {
               return -1;
            }
         }

         var10000 = com.Cz_2.v(var1);
      }

      label42:
      if (var3 != 0) {
         if (var10000 == 0) {
            var10000 = com.Cz_2.v(var2);
            if (var3 == 0) {
               break label42;
            }

            if (var10000 != 0) {
               return 1;
            }
         }

         var10000 = var1.getName().compareToIgnoreCase(var2.getName());
      }

      if (com.ky_4.F() != null) {
         com.Yt_2.A(++var3);
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.I((File)var1, (File)var2);
   }
}





