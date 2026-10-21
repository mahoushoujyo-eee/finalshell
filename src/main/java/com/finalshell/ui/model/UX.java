package com.finalshell.ui.model;

import com.finalshell.core.Cl4_2;
import com.finalshell.core.LE3;
import com.finalshell.core.NE;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@XStreamAlias("SettingsGroup")
@XStreamConverter(LE3.class)
public class UX implements Serializable {
   public String R;
   public String v;
   public Map u;
   public static String a;

   public UX() {
      this(null);
   }

   public UX(String var1) {
      this.R = NE.E(a);
      this.v = var1;
   }

   public UX(String var1, String var2) {
      this.R = var1;
      this.v = var2;
   }

   public String t() {
      return this.R;
   }

   public void N(String var1) {
      this.R = var1;
   }

   public String J() {
      return this.v;
   }

   public void a(String var1) {
      this.v = var1;
   }

   public Map c() {
      String var1 = Cl4_2.I();
      Map var10000 = this.u;
      if (var1 == null) {
         if (this.u == null) {
            this.u = new HashMap();
         }

         var10000 = this.u;
      }

      return var10000;
   }

   public void O(Map var1) {
      this.u = var1;
   }

   public Object O(String var1) {
      return this.c().get(var1);
   }

   public Object D(String var1) {
      return this.c().remove(var1);
   }

   public Object J(String var1, Object var2) {
      return this.c().put(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "En".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      } else {
         var6 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 33;
               break;
            case 1:
               var23 = 30;
               break;
            case 2:
               var23 = 2;
               break;
            case 3:
               var23 = 113;
               break;
            case 4:
               var23 = 106;
               break;
            case 5:
               var23 = 100;
               break;
            default:
               var23 = 29;
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





