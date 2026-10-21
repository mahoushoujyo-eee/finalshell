package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Kb2;
import com.finalshell.ui.frame.Km4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;

public class BY implements ActionListener {
   final RouteTracePanel2 y;

   BY(RouteTracePanel2 var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var6 = 584267852523456400L;
      Ref.g(584267852523456400L, var6);
      Object var8 = 270550610354043937L;
      Ref.g(270550610354043937L, var8);
      Object[] var10003 = Registry.packArgs(true);
      long var11 = 480031414946709658L;
      Object[] var10 = var10003;
      Ref.h(480031414946709658L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var88) {
         throw var88.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 410905379772103887L;
      Object[] var14 = var10005;
      Ref.h(410905379772103887L, var14, var15);
      Object var16 = 584267852523456400L;
      Ref.g(584267852523456400L, var16);
      Object var18 = 160092931880009273L;
      Ref.g(160092931880009273L, var18);
      File var10009 = (File)(Registry.emptyArgs());
      long var21 = 272998330038223631L;
      Object[] var20 = var10009;
      var10009 = Ref.h(272998330038223631L, var20, var21);

      try {
         var10009 = (File)var10009;
      } catch (InvocationTargetException var87) {
         throw var87.getTargetException();
      }

      var10009 = Registry.packArgs(var10009.getAbsolutePath());
      long var23 = 489768706953623433L;
      Object[] var22 = var10009;
      var10009 = Ref.h(489768706953623433L, var22, var23);

      try {
         var10009 = (Lv4_2)var10009;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      Lv4_2 var3 = var10009;
      AA.z();
      Registry.emptyArgs();
      long var24 = 270389152141252877L;
      Ref.h2(270389152141252877L, var24);
      Object[] var10012 = Registry.emptyArgs();
      long var27 = 271043866899908885L;
      Object[] var26 = var10012;
      Ref.h(271043866899908885L, var26, var27);
      JFrame var10014 = (JFrame)(Registry.emptyArgs());
      long var29 = 292557478156152530L;
      Object[] var28 = var10014;
      var10014 = Registry.packArgs(Ref.h(292557478156152530L, var28, var29));
      long var31 = 285199883764466291L;
      Object[] var30 = var10014;
      var10014 = Ref.h(285199883764466291L, var30, var31);

      try {
         var10014 = (JFrame)var10014;
      } catch (InvocationTargetException var85) {
         throw var85.getTargetException();
      }

      JFrame var4 = var10014;
      Object var32 = 584267852523456400L;
      Ref.g(584267852523456400L, var32);
      Object var34 = 160092931880009273L;
      Ref.g(160092931880009273L, var34);
      Integer var10016 = (Integer)(Registry.emptyArgs());
      long var37 = 528672956857361353L;
      Object[] var36 = var10016;
      var10016 = Ref.h(528672956857361353L, var36, var37);

      try {
         var10016 = (Integer)var10016;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      Object var10017 = Registry.lookupField(590765520000496083L).getInt(null);
      if (var3 == null) {
         if (var10016 == var10017) {
            label157: {
               JFrame var100 = var4;
               if (var3 == null) {
                  if (var4 == null) {
                     break label157;
                  }

                  var100 = var4;
               }

               Km4 var5 = (Km4)var100;
               var10017 = Registry.packArgs(true);
               long var39 = 433716955203722428L;
               Object[] var38 = (Object[])var10017;
               Ref.h(433716955203722428L, var38, var39);

               try {
                  ;
               } catch (InvocationTargetException var83) {
                  throw var83.getTargetException();
               }

               if (var3 == null) {
                  return;
               }
            }

            Object var10019 = null;
            Object var10020 = null;
            Object var40 = 584267852523456400L;
            Object var10022 = Ref.g(584267852523456400L, var40);
            Object var42 = 270550610354043937L;
            Object var10023 = Ref.g(270550610354043937L, var42);
            Object[] var10024 = Registry.emptyArgs();
            long var45 = 249886410317960768L;
            Object[] var44 = var10024;
            Ref.h(249886410317960768L, var44, var45);
            var10024 = Registry.emptyArgs();
            long var46 = 513527511121793373L;
            Object var10025 = Ref.h2(513527511121793373L, var46);

            try {
               var10025 = (JDialog)var10025;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

new BY((String)var10023, var10024, (Window)var10025, var3, null);
            if (var3 == null) {
               return;
            }
         }

         var10016 = this;
         Object var48 = 584267852523456400L;
         var10017 = Ref.g(584267852523456400L, var48);
         Object var50 = 160092931880009273L;
         Ref.g(160092931880009273L, var50);
         Object[] var104 = Registry.emptyArgs();
         long var53 = 528672956857361353L;
         Object[] var52 = var104;
         var104 = Ref.h(528672956857361353L, var52, var53);

         try {
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }

         Registry.lookupField(292712586650823274L).getInt(null);
      }

      if (var10016 == var10017) {
         label159: {
            JFrame var101 = var4;
            if (var3 == null) {
               if (var4 == null) {
                  break label159;
               }

               var101 = var4;
            }

            Kb2 var89 = (Kb2)var101;
            var10017 = Registry.packArgs(true);
            long var55 = 583190785470630532L;
            Object[] var54 = (Object[])var10017;
            Ref.h(583190785470630532L, var54, var55);

            try {
               ;
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }

            if (var3 == null) {
               return;
            }
         }

         Object var56 = 584267852523456400L;
         Ref.g(584267852523456400L, var56);
         Object var58 = 160092931880009273L;
         Ref.g(160092931880009273L, var58);
         File var106 = Registry.emptyArgs();
         long var61 = 272998330038223631L;
         Object[] var60 = var106;
         var106 = Ref.h(272998330038223631L, var60, var61);

         try {
            var106 = (File)var106;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }

         var106.getParent();
         Object var62 = 584267852523456400L;
         Ref.g(584267852523456400L, var62);
         Object var64 = 270550610354043937L;
         com.finalshell.ui.dialog.KQ var111 = (com.finalshell.ui.dialog.KQ)Ref.g(270550610354043937L, var64);
         Object var66 = 584267852523456400L;
         Ref.g(584267852523456400L, var66);
         Object var68 = 270550610354043937L;
         Ref.g(270550610354043937L, var68);
         Object[] var10029 = Registry.emptyArgs();
         long var71 = 249886410317960768L;
         Object[] var70 = var10029;
         Ref.h(249886410317960768L, var70, var71);
         var10029 = Registry.emptyArgs();
         long var72 = 513527511121793373L;
         Object var10030 = Ref.h2(513527511121793373L, var72);

         try {
            var10030 = (JDialog)var10030;
         } catch (InvocationTargetException var78) {
            throw var78.getTargetException();
         }

         Object var74 = 584267852523456400L;
         Object var10033 = Ref.g(584267852523456400L, var74);
         Object var76 = 520858298081292913L;
new BY((String)var10030, var3, this, (Lv4_2)var10033, (DefaultMutableTreeNode)Ref.g(520858298081292913L, var76));


      }
   }
}





