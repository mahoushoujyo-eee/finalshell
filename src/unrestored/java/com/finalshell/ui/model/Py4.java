package com.finalshell.ui.model;

import com.finalshell.core.Cz2;
import com.finalshell.core.Yt2;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

public class Py4 implements Comparator, Serializable {
   public int I(File var1, File var2) {
      int var3;
      int var10000;
      var3 = Yt2.C();
      var10000 = (Cz2.z(var1)) ? 1 : 0;
      label63:
      if (var3 != 0) {
         if (var10000 != 0) {
            var10000 = (Cz2.z(var2)) ? 1 : 0;
            if (var3 == 0) {
               break label63;
            }

            if (var10000 == 0) {
               return -1;
            }
         }

         var10000 = (Cz2.z(var1)) ? 1 : 0;
      }

      label56:
      if (var3 != 0) {
         if (var10000 == 0) {
            var10000 = (Cz2.z(var2)) ? 1 : 0;
            if (var3 == 0) {
               break label56;
            }

            if (var10000 != 0) {
               return 1;
            }
         }

         var10000 = (Cz2.v(var1)) ? 1 : 0;
      }

      label49:
      if (var3 != 0) {
         if (var10000 != 0) {
            var10000 = (Cz2.v(var2)) ? 1 : 0;
            if (var3 == 0) {
               break label49;
            }

            if (var10000 == 0) {
               return -1;
            }
         }

         var10000 = (Cz2.v(var1)) ? 1 : 0;
      }

      label42:
      if (var3 != 0) {
         if (var10000 == 0) {
            var10000 = (Cz2.v(var2)) ? 1 : 0;
            if (var3 == 0) {
               break label42;
            }

            if (var10000 != 0) {
               return 1;
            }
         }

         var10000 = var1.getName().compareToIgnoreCase(var2.getName());
      }

      if (Ky4.F$arrString() != null) {
         Yt2.A(++var3);
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.I((File)var1, (File)var2);
   }
}





