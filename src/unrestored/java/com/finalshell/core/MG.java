package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class MG {
   public static void main(String[] var0) throws Exception {
      Ky4[] var10000 = YT3_2.c();
      SortedMap var2 = Charset.availableCharsets();
      Set var3 = var2.keySet();
      Ky4[] var1 = var10000;

      for (String var5 : var3) {
         Charset var6 = (Charset)var2.get(var5);
         System.out.println(var6.name());
         Set var7 = var6.aliases();
         if (var1 == null) {
            break;
         }
      }
   }
}





