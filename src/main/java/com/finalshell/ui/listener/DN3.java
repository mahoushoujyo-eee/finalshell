package com.finalshell.ui.listener;

import com.finalshell.core.Ne4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportMenuPanel;
import com.finalshell.ui.panel.PrivateKeyPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;

public class DN3 implements ActionListener {
   public final PrivateKeyPanel S;
   public static String a;

   public DN3(PrivateKeyPanel var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var44;
      ImportMenuPanel.j();
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var8);
      Object var10003 = Registry.emptyArgs();
      long var11 = 306266403902896148L;
      Object var10 = var10003;
      Ref.h(306266403902896148L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object var2 = var10002;
      var10003 = Registry.emptyArgs();
      long var13 = 499444795808443762L;
      Object var12 = var10003;
      var10003 = Ref.h(499444795808443762L, var12, var13);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Object var4;
      label85: {
         label80: {
            var4 = var10003;
            var10003 = (Object[])var4;
            if (var2 != null) {
               var10003 = Registry.packArgs(var4);
               long var14 = 330094358428833085L;
               Object var10004 = Ref.h2(330094358428833085L, var14);

               try {
                  var44 = (Boolean)var10004;
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }

               if (!var44) {
                  break label80;
               }

               var10004 = (String)Registry.lookupField(149082991182987426L).get(null);
            }

            var4 = var10003;
            if (var2 != null) {
               break label85;
            }
         }

         File var5 = new File((String)var4);
         String var43 = var5.getParent();
         if (var2 != null) {
            if (var43 == null) {
               break label85;
            }

            var43 = var5.getParent();
         }

         var4 = var43;
      }

      JFileChooser var38 = new JFileChooser((String)var4);
      var38.setDialogTitle(a);
      var38.setFileSelectionMode(0);
      var38.setMultiSelectionEnabled(false);
      Object var16 = 586331377038781344L;
      int var6 = this.showOpenDialog((PrivateKeyPanel)Ref.g(586331377038781344L, var16));
      if (var6 == 0) {
         File var7 = var38.getSelectedFile();
         Object[] var10005 = Registry.packArgs(var7.getAbsolutePath());
         long var19 = 279878592174441822L;
         Object[] var18 = var10005;
         Ref.h(279878592174441822L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         Object var20 = 586331377038781344L;
         Ref.g(586331377038781344L, var20);
         Object var22 = 305865902009348731L;
         ((Ne4)Ref.g(305865902009348731L, var22)).setText(var7.getAbsolutePath());
         Object var24 = 586331377038781344L;
         Ref.g(586331377038781344L, var24);
         Object[] var10009 = Registry.packArgs(false);
         long var27 = 379642641301702996L;
         Object[] var26 = var10009;
         Ref.h(379642641301702996L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         Registry.emptyArgs();
         long var28 = 270389152141252877L;
         Ref.h2(270389152141252877L, var28);
         Object[] var10011 = Registry.emptyArgs();
         long var31 = 578864097947885485L;
         Object[] var30 = var10011;
         Ref.h(578864097947885485L, var30, var31);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "逑拪秅铆旀享".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 103;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 103;
         var10006 = var0;
      } else {
         var6 = 103;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 103;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 127;
               break;
            case 1:
               var23 = 100;
               break;
            case 2:
               var23 = 99;
               break;
            case 3:
               var23 = 4;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 44;
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





