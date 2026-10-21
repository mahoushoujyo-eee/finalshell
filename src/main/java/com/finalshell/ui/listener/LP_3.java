package com.finalshell.ui.listener;

import com.finalshell.core.C_C;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class LP_3 implements ActionListener {
   public final com.finalshell.ui.dialog.C5 v;
   public final SelectDownloadFolderPanel d;
   public static String a;

   public LP_3(SelectDownloadFolderPanel var1, com.finalshell.ui.dialog.C5 var2) {
      this.d = var1;
      this.v = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10002 = Registry.emptyArgs();
      long var12 = 634817973682994708L;
      Object[] var11 = var10002;
      Ref.h(634817973682994708L, var11, var12);
      Object[] var10003 = Registry.emptyArgs();
      long var14 = 240567170779145617L;
      Object[] var13 = var10003;
      Ref.h(240567170779145617L, var13, var14);
      Object[] var10004 = Registry.emptyArgs();
      long var16 = 226341449505323490L;
      Object[] var15 = var10004;
      var10004 = Ref.h(226341449505323490L, var15, var16);

      try {
         var10004 = (com.finalshell.ui.frame.U)var10004;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      com.finalshell.ui.frame.U var3 = var10004;
      SelectDownloadFolderPanel.O$arrint();
      Object var17 = 248768231919336173L;
      Ref.g(248768231919336173L, var17);
      Object var19 = 269586463206323716L;
      Object var10007 = Ref.g(269586463206323716L, var19);
      String var10008 = (String)(Registry.emptyArgs());
      long var22 = 248904686894997647L;
      Object[] var21 = var10008;
      var10008 = Ref.h(248904686894997647L, var21, var22);

      try {
         var10008 = (String)var10008;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      String var4 = var10008;
      Object var2 = var10007;
      Object var23 = 248768231919336173L;
      Ref.g(248768231919336173L, var23);
      Object[] var10009 = Registry.packArgs(var4, var3);
      long var26 = 596842460043417062L;
      Object[] var25 = var10009;
      Ref.h(596842460043417062L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      Object[] var10010 = Registry.emptyArgs();
      long var28 = 418327897845479655L;
      Object[] var27 = var10010;
      var10010 = Ref.h(418327897845479655L, var27, var28);

      try {
         var82 = (Integer)var10010;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      int var6 = var82;
      if (var2 == null) {
         if (var6 == Registry.lookupField(564170828581134815L).getInt(null)) {
            String var10011 = (String)(Registry.emptyArgs());
            long var30 = 191095475795927576L;
            Object[] var29 = var10011;
            var10011 = Ref.h(191095475795927576L, var29, var30);

            try {
               var10011 = (String)var10011;
            } catch (InvocationTargetException var72) {
               throw var72.getTargetException();
            }

            String var7 = var10011;
            Object var31 = 248768231919336173L;
            Ref.g(248768231919336173L, var31);
            Object var33 = 435031631667149019L;
            ((C_C)Ref.g(435031631667149019L, var33)).setText(a + new File(var7).getAbsolutePath());
            Object var35 = 248768231919336173L;
            Ref.g(248768231919336173L, var35);
            Object var37 = 435031631667149019L;
            ((C_C)Ref.g(435031631667149019L, var37)).setToolTipText(var7);
            Object var39 = 248768231919336173L;
            Ref.g(248768231919336173L, var39);
            Object var41 = 269586463206323716L;
            Ref.g(269586463206323716L, var41);
            Object[] var10018 = Registry.packArgs(var7);
            long var44 = 565172623409340742L;
            Object[] var43 = var10018;
            Ref.h(565172623409340742L, var43, var44);

            try {
               ;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            Object var45 = 248768231919336173L;
            Ref.g(248768231919336173L, var45);
            Object var47 = 269586463206323716L;
            Ref.g(269586463206323716L, var47);
            Object[] var10021 = Registry.emptyArgs();
            long var50 = 380488306238748207L;
            Object[] var49 = var10021;
            Ref.h(380488306238748207L, var49, var50);

            try {
               ;
            } catch (InvocationTargetException var70) {
               throw var70.getTargetException();
            }

            Object[] var10022 = Registry.packArgs(var7);
            long var52 = 586754005152705687L;
            Object[] var51 = var10022;
            Ref.h(586754005152705687L, var51, var52);

            try {
               ;
            } catch (InvocationTargetException var69) {
               throw var69.getTargetException();
            }

            Object var53 = 248768231919336173L;
            Ref.g(248768231919336173L, var53);
            Object[] var10024 = Registry.emptyArgs();
            long var56 = 528723233100399280L;
            Object[] var55 = var10024;
            Ref.h(528723233100399280L, var55, var56);

            try {
               ;
            } catch (InvocationTargetException var68) {
               throw var68.getTargetException();
            }
         }

         Object var57 = 248768231919336173L;
         Ref.g(248768231919336173L, var57);
         Object var59 = 248768231919336173L;
         Ref.g(248768231919336173L, var59);
         Object var61 = 435031631667149019L;
         Object[] var10014 = Registry.packArgs(Ref.g(435031631667149019L, var61));
         long var64 = 342946178954715412L;
         Object[] var63 = var10014;
         Ref.h(342946178954715412L, var63, var64);

         try {
            ;
         } catch (InvocationTargetException var67) {
            throw var67.getTargetException();
         }

         Object var65 = 549809328982242375L;
         ((com.finalshell.ui.dialog.C5)Ref.g(549809328982242375L, var65)).setVisible(true);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "乤轗\u001f8".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 95;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      } else {
         var6 = 95;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 48;
               break;
            case 1:
               var23 = 117;
               break;
            case 2:
               var23 = 122;
               break;
            case 3:
               var23 = 71;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 48;
               break;
            default:
               var23 = 32;
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





