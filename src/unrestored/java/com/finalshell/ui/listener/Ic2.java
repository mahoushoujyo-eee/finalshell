package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.task.CO;
import com.finalshell.task.No2;
import com.finalshell.ui.panel.CI;
import com.finalshell.ui.panel.Kz4;
import com.finalshell.ui.panel.OY;
import com.finalshell.ui.panel.SZ;
import java.awt.BorderLayout;
import java.io.File;
import java.util.List;
import javax.swing.JWindow;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class Ic2 implements CaretListener {
   public CI O;
   public SZ t;
   public final Kz4 L;
   public static String a;

   public Ic2(Kz4 var1) {
      this.L = var1;
      this.O = null;
   }

   @Override
   public void caretUpdate(CaretEvent var1) {
      int var11;
      Ic2 var14;
      String var2;
      Kz4 var9;
      label99: {
         var2 = Kz4.M();
         var9 = this.L;
         label83:
         if (var2 != null) {
            if (this.L.u) {
               var9 = this.L;
               if (var2 == null) {
                  break label83;
               }

               if (this.L.Z.isVisible()) {
                  var9 = this.L;
                  if (var2 == null) {
                     break label99;
                  }

                  if (this.L.Z.isShowing()) {
                     var9 = this.L;
                     break label99;
                  }
               }
            }

            var9 = this.L;
         }

         label90: {
            JWindow var13 = var9.d;
            if (var2 != null) {
               if (var9.d == null) {
                  return;
               }

               var14 = this;
               if (var2 == null) {
                  break label90;
               }

               var13 = this.L.d;
            }

            if (!var13.isVisible()) {
               return;
            }

            var14 = this;
         }

         var14.H();
         return;
      }

      if (var2 != null) {
         if (var9.d == null) {
            this.L.d = new JWindow(FN.L(this.L));
            this.L.d.getContentPane().setLayout(new BorderLayout());
            this.L.d.setFocusable(false);
            FN.L(this.L).addComponentListener(new CK3(this));
            this.O = new CI();
            this.O.setFocusable(false);
            this.O.setSelectionMode(0);
            this.O.d(true);
            this.O.setCellRenderer(new OY(this));
            this.O.addMouseListener(new CA(this));
            this.O.addKeyListener(new Ur_2(this));
            this.t = new SZ(this.O);
            this.t.G(0);
            this.L.d.getContentPane().add(this.t, a);
            this.L.Z.addKeyListener(new Pw4(this));
            this.L.Z.addFocusListener(new Aq2(this));
         }

         var9 = this.L;
      }

      String var3;
      label58: {
         var3 = var9.Z.getText().substring(0, this.L.Z.getCaretPosition());
         int var4 = var3.lastIndexOf(File.separator);
         int var10 = var4;
         byte var10001 = -1;
         if (var2 != null) {
            if (var4 == -1) {
               var11 = 0;
               break label58;
            }

            var10 = var4;
            var10001 = 1;
         }

         var11 = var10 + var10001;
      }

      label50: {
         int var8 = var11;
         String var5 = var3.substring(0, var8);
         File var6 = var5.trim().equals("") ? null : new File(var5);
         List var7 = this.L.q(var6, var3.substring(var8));
         List var12 = var7;
         if (var2 != null) {
            if (var7 == null) {
               break label50;
            }

            var12 = var7;
         }

         if (var12.size() > 0) {
            this.p(var7);
            if (var2 != null) {
               return;
            }
         }
      }

      this.H();
   }

   public void p(List var1) {
      FN.p(new No2(this, var1));
   }

   public void H() {
      FN.p(new CO(this));
   }

   public void L(File var1) {
      String var10000 = Kz4.M();
      String var3 = var1.getAbsolutePath();
      String var2 = var10000;
      var10000 = var3;
      if (var2 != null) {
         var10000 = var3.endsWith(File.separator) ? var3 : var3 + File.separator;
      }

      var3 = var10000;
      this.L.Z.setText(var3);
      this.L.Z.setCaretPosition(var3.length());
   }

   public static void w(Ic2 var0) {
      var0.H();
   }

   public static CI g(Ic2 var0) {
      return var0.O;
   }

   public static void i(Ic2 var0, File var1) {
      var0.L(var1);
   }

   public static SZ a(Ic2 var0) {
      return var0.t;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "r[>08v".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 2;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      } else {
         var6 = 2;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 51;
               break;
            case 1:
               var23 = 60;
               break;
            case 2:
               var23 = 82;
               break;
            case 3:
               var23 = 70;
               break;
            case 4:
               var23 = 95;
               break;
            case 5:
               var23 = 6;
               break;
            default:
               var23 = 11;
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





