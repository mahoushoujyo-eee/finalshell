package org.H;

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

public class C_ extends org.H.Y {
   private final List L;

   C_(short var1) {
      super(var1);
      this.L = new ArrayList();
   }

   C_(short var1, v_2[] var2) {
      super(var1);
      this.L = new ArrayList(Arrays.asList(var2));
   }

   public List A() {
      return this.L;
   }

   private static org.H.Y q(short var0, DataInputStream var1) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      v_2[] var3 = new v_2[var1.readUnsignedShort()];
      short var4 = 0;
      com.ky_4[] var2 = var10000;

      while (var4 < var3.length) {
         var3[var4] = q(var1);
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new org.H.C_(var0, var3);
   }

   private static v_2 q(DataInputStream var0) throws IOException {
      return new v_2(var0.readShort(), K(var0));
   }

   private static Map K(DataInputStream var0) throws IOException {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      int var2 = var0.readUnsignedShort();
      com.ky_4[] var1 = var10000;

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
            try {
               var7 = var3;
               if (var1 != null) {
                  break;
               }

               var3.put(var0.readShort(), org.H.Cr_2.d(var0));
               var4++;
               if (var1 == null) {
                  continue;
               }
            } catch (IOException var5) {
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
      com.ky_4[] var10000 = org.H.Cr_2.q();
      Iterator var3 = this.L.iterator();
      com.ky_4[] var2 = var10000;

      while (var3.hasNext()) {
         v_2 var4 = (v_2)var3.next();
         var4.E(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   static List j(org.H.C_ var0) {
      return var0.L;
   }

   static org.H.Y d(short var0, DataInputStream var1) throws IOException {
      return q(var0, var1);
   }

   static v_2 i(DataInputStream var0) throws IOException {
      return q(var0);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





