package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C_ extends Y_3 {
   public final List L;

   C_(short var1) {
      super(var1);
      this.L = new ArrayList();
   }

   C_(short var1, V2_3[] var2) {
      super(var1);
      this.L = new ArrayList<>(Arrays.asList(var2));
   }

   public List A() {
      return this.L;
   }

   public static Y_3 q(short var0, DataInputStream var1) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      V2_3[] var3 = new V2_3[var1.readUnsignedShort()];
      short var4 = 0;
      Ky4[] var2 = var10000;

      while (var4 < var3.length) {
         var3[var4] = q(var1);
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new C_(var0, var3);
   }

   public static V2_3 q(DataInputStream var0) throws IOException {
      return new V2_3(var0.readShort(), K(var0));
   }

   public static Map K(DataInputStream var0) throws IOException {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      int var2 = var0.readUnsignedShort();
      Ky4[] var1 = var10000;

      try {
         if (var2 == 0) {
            return Collections.emptyMap();
         }
      } catch (IOException var6) {
         throw a(var6);
      }

      HashMap var3 = new HashMap();
      int var4 = 0;

      while (true) {
         if (var4 < var2) {
      V2_3[] var7;
            try {
               var7 = var3;
               if (var1 != null) {
                  break;
               }

               var3.put(var0.readShort(), Cr2_2.d$r_2(var0));
               var4++;
               if (var1 == null) {
                  continue;
               }
            } catch (IOException var5) {
      V2_3[] var7;
               throw a(var5);
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.L.size());
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      Iterator var3 = this.L.iterator();
      Ky4[] var2 = var10000;

      while (var3.hasNext()) {
         V2_3 var4 = (V2_3)var3.next();
         var4.E(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   static List j(C_ var0) {
      return var0.L;
   }

   static Y_3 d(short var0, DataInputStream var1) throws IOException {
      return q(var0, var1);
   }

   static V2_3 i(DataInputStream var0) throws IOException {
      return q(var0);
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}






