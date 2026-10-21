import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class QK implements ItemListener {
   final uQ_3 R;
   private static final String a;

   QK(uQ_3 var1) {
      this.R = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      boolean var4;
      label15: {
         String var10000 = zw_2.V();
         var4 = false;
         String var2 = var10000;
         boolean var5 = ((JComboBox)com.c.c(319966052179776705L).get(com.c.c(253158002186314122L).get(this))).getSelectedItem().equals(a);
         if (var2 != null) {
            if (var5) {
               var4 = false;
               if (var2 != null) {
                  break label15;
               }
            }

            var5 = true;
         }

         var4 = var5;
      }

      ((JLabel)com.c.c(329278972422819942L).get(com.c.c(253158002186314122L).get(this))).setEnabled(var4);
      ((JLabel)com.c.c(492841651621062230L).get(com.c.c(253158002186314122L).get(this))).setEnabled(var4);
      ((JTextField)com.c.c(252123593957137435L).get(com.c.c(253158002186314122L).get(this))).setEnabled(var4);
      ((JTextField)com.c.c(332149350821937177L).get(com.c.c(253158002186314122L).get(this))).setEnabled(var4);
      ((JTextField)com.c.c(252123593957137435L).get(com.c.c(253158002186314122L).get(this))).setEditable(var4);
      ((JTextField)com.c.c(332149350821937177L).get(com.c.c(253158002186314122L).get(this))).setEditable(var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ";]&\u001bm\u0012".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 77;
               break;
            case 1:
               var23 = 55;
               break;
            case 2:
               var23 = 64;
               break;
            case 3:
               var23 = 117;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 2;
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





