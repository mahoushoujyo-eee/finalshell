package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import com.finalshell.ui.panel.AE;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class KF implements Runnable {
   public final U I;
   public static String a;

   public KF(U var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      Object var1 = 496137818179803296L;
      Ref.g(496137818179803296L, var1);
      Object var3 = 496137818179803296L;
      Object[] var10003 = Registry.packArgs(Ref.g(496137818179803296L, var3));
      long var6 = 123003542455500783L;
      Object[] var5 = var10003;
      Ref.h(123003542455500783L, var5, var6);
      Object var7 = 496137818179803296L;
      Ref.g(496137818179803296L, var7);
      Object var9 = 346229218997944282L;
      JPanel var10005 = (JPanel)Ref.g(346229218997944282L, var9);
      Object var11 = 496137818179803296L;
      Object var10007 = Ref.g(496137818179803296L, var11);
      Object var13 = 132798821314429637L;
      var10007.add((AE)Ref.g(132798821314429637L, var13), a);
      Object var15 = 496137818179803296L;
      Ref.g(496137818179803296L, var15);
      Object var17 = 467883177032167383L;
      JSplitPane var10009 = (JSplitPane)Ref.g(467883177032167383L, var17);
      Object var19 = 496137818179803296L;
      Object var10011 = Ref.g(496137818179803296L, var19);
      Object var21 = 346229218997944282L;
      var10011.setRightComponent((JPanel)Ref.g(346229218997944282L, var21));
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "0H%~\u0014MY}\u0001mm\u000e\u0002\u0014?\r&x\u0013\u001a\u001akV3k\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 61;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      } else {
         var6 = 61;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 28;
               break;
            case 2:
               var23 = 124;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 65;
               break;
            case 5:
               var23 = 80;
               break;
            default:
               var23 = 94;
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





