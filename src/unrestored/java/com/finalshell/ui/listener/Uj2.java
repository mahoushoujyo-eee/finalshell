package com.finalshell.ui.listener;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Uj2 implements ActionListener {
   public final User S;
   public static String a;

   public Uj2(User var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      StringBuffer var2 = new StringBuffer();
      var2.append(a);
      Object var3 = 498336506750065566L;
      JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((User)Ref.g(498336506750065566L, var3)), var2.toString());
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "容兏怋l;U}敀捉圄杺朋伛畻吼歂寪硗劑客呝扽伽並佶刁周欶朽劆噄z沐杭呟歕寡砭z今伱乓斉郚旌沃莆忳呟歕冢宕x;V}吼歂寪硗叛坌板朊劇寪例孩JY\u0003\t劌宐箦沱醔甘fi\u0005\u0003Qe\u001coa\u0017rI\u0000xf\u001ec\u0007H亶叺夽釡勶寷涓涕\u001c遘兡硢角沠靡飾陎\u0002\\;周欶况实\u0016\\上杞辍掕酪罂z呌亀叕参\u000b斫亠跞忠叕参\u000b忇挡呌亀\u007f呍仃叮攦厷厖\u007f仓琡朡勷噙H畻戇寡钉x;n撞佬\u001d&呚歔辣穘臚劏宠扆\u001d閐雇\u0003\u0017秾屋诤周欶丰欆\u0002\\;周欶犆怦颰舤\u000bn瀣艂\u001d旌沃吽欁\u007f经艕\u0016呚歔寨扃\u001c黣艞l朸攔挽尪服吠欳\u001f"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 127;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 127;
         var10006 = var0;
      } else {
         var6 = 127;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 127;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 79;
               break;
            case 1:
               var23 = 88;
               break;
            case 2:
               var23 = 83;
               break;
            case 3:
               var23 = 41;
               break;
            case 4:
               var23 = 78;
               break;
            case 5:
               var23 = 27;
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





