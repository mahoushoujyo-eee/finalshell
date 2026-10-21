package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TW implements ActionListener {
   public final AM o;
   public static String a;

   public TW(AM var1) {
      this.o = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      CL var2 = new CL();
      Object var4 = 378570001390511429L;
      Ref.g(378570001390511429L, var4);
      Object var6 = 378570001390511429L;
      Object var10005 = Ref.g(378570001390511429L, var6);
      Object var8 = 417119238929760524L;
      T32 var10004 = (T32)(Registry.packArgs(this, var10005, ((ArrayList)Ref.g(417119238929760524L, var8)).size(), false, true));
      long var11 = 451133235546109527L;
      Object var10 = var10004;
      var10004 = Ref.h(451133235546109527L, var10, var11);

      try {
         var10004 = (T32)var10004;
      } catch (InvocationTargetException var20) {
         throw new RuntimeException(var20.getTargetException());
      }

      T32 var3 = var10004;
      var10005 = Registry.packArgs(var3);
      long var13 = 318870397969942063L;
      Object[] var12 = (Object[])var10005;
      Ref.h(318870397969942063L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw new RuntimeException(var19.getTargetException());
      }

      Object var14 = 378570001390511429L;
      Ref.g(378570001390511429L, var14);
      Object[] var10007 = Registry.packArgs(var3);
      long var17 = 176011466134249595L;
      Object[] var16 = var10007;
      Ref.h(176011466134249595L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw new RuntimeException(var18.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "斪栝笶頮".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 3;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      } else {
         var6 = 3;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 25;
               break;
            case 1:
               var23 = 25;
               break;
            case 2:
               var23 = 75;
               break;
            case 3:
               var23 = 88;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 47;
               break;
            default:
               var23 = 7;
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





